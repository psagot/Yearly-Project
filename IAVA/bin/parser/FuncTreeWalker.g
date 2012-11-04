tree grammar FuncTreeWalker;  


options {
  backtrack = true; 
  memoize = true;
  language = Java;
  tokenVocab = Iava;
  ASTLabelType = CommonTree;
}

@treeparser::header {
  package parser;
  import utils.FullType;
  import utils.FullType.Type;
  import utils.SymbolTable;
  import utils.FuncSymbolTable;
  import standardLib.StdLib;
  import java.util.ArrayList;
  import utils.ErrorReporter;
}
  
@members {  

  private String fileName = this.getClass().getName();
  SymbolTable st;
  FuncSymbolTable fst;
  
  private int counter  = 0; //used for calculating array type (number of [])
  private FullType prevType; //used for checking all the initializer are the same type.

  //used for array initialization 
  int arrInitCurrNesting = 0;
  int arrInitPrevNesting = 0;
  
  ErrorReporter er;
  
  void setErrorReporter(ErrorReporter _er) {
      er = _er;
  }
  
  public void enableErrorMessageCollection(boolean pNewState) {
      er.enableErrorMessageCollection(pNewState);
  }
    
  @Override
  public void emitErrorMessage(String pMessage) {
      er.emitErrorMessage(pMessage);
  }
  
  public List<String> getMessages() {
      return er.getMessages();
  }
    
  public boolean hasErrors() {
      return er.hasErrors();
  }
  
  public void newError(String fileName,String msg, int line, int position){
     er.newError(fileName,msg, line, position);
  }
    
  private ArrayList<FullType> caseTypes; // for switch case
  
  /**
   * sets the symbolTabls and the funcSymbolTabls
   * @param symbolT: the symbol table.
   */
  public void setTables(SymbolTable symbolT, FuncSymbolTable funcST) {
     st = symbolT;
     fst = funcST;
  }
  
}
   
///Main rule - root of the tree
compilationUnit
    : {
        StdLib.genFuncSymbolTable(fst);   ///Add StdLib functions to function symbol table
      }
    ^(START_PROG funcOrVar*)
    | EOF
    ;
     
///When declaring a global variable, a struct or a function:
funcOrVar   
    : ^(FUNC_DECL typeSpec id=IDENT parameterDeclarationList? {
          ArrayList<FullType> types = new ArrayList<FullType>();
          for(NameType nameType : $parameterDeclarationList.nametypes) {
            types.add(nameType.type);
          }
          
          if(fst.addFunc($id.getText(), $typeSpec.type, types) == -1) {
            newError(fileName, fst.getLastErrMsg(), $FUNC_DECL.line, $FUNC_DECL.pos);
          }     
        } compoundStatement)
    | ^(STRUCT_DECL id=IDENT structMembersList) 
        { 
          ///Add new struct to symtab (and check that does not exist).
          ArrayList<FullType> fieldsType = new ArrayList<FullType>();
          ArrayList<String> fieldsName = new ArrayList<String>();
          
          for(NameType nameType : $structMembersList.nametypes) {
            fieldsType.add(nameType.type);
            fieldsName.add(nameType.name);
          }
          
          if (st.addStructType(id.getText(), fieldsType, fieldsName) != 0) {
            newError(fileName, st.getLastErrMsg(), $STRUCT_DECL.line, $STRUCT_DECL.pos);
          }
        }
    | ^(GLOBAL_STATEMENT statement)
    ;
    
    
typeSpec returns [FullType type]
    : builtInType { $type = $builtInType.type; }
    | builtInType {counter = 0;} 
      (LBRACK  RBRACK 
          {
            counter++;
          } 
      )+  
          {
              $type = new FullType(Type.ARRAY, $builtInType.type,counter);
          }  ///define type as nested array (one or more) of $builtInType.type
    | structUsage { $type = $structUsage.type; }  
    ;

///Declaring a new local variable:
declaration
  : ^(VAR_DECL typeSpec variableDefinitions)   
  ;

//A primitive type name.
builtInType returns [FullType type]
  : 'void'    { $type = new FullType(Type.VOID); }
  | 'boolean' { $type = new FullType(Type.BOOLEAN); }
  | 'char'    { $type = new FullType(Type.CHAR); }
  | 'integer' { $type = new FullType(Type.INTEGER); } 
  | 'real'    { $type = new FullType(Type.REAL); }
  | 'string'  { $type = new FullType(Type.STRING); }
  ;  

// When declaring \ accessing arrays:
// int[] - When passing arrays to functions
///int[5], int[N] - When declaring \ accessing arrays
arrayBrackets returns [boolean used, int dimension, boolean fixedSize]
  :   {$used = false; $dimension=0;} 
    (LBRACK  RBRACK 
        {$used = true; $dimension=$dimension+1; $fixedSize=false; }
    )*          
  |   {$used = false; $dimension=0;} 
    (LBRACK expression RBRACK  
      {
        $used = true;
        $fixedSize = true;
        $dimension++;
      } 
    )* 
  ;

///A list of variable names (can include [])    
variableDefinitions returns [ArrayList<NameType> nametypes]
  : var1=variableDeclarator 
      { 
        $nametypes = new ArrayList<NameType>();
        if($var1.needBrackets)
            $nametypes.add(new NameType($var1.name, $var1.type, true));
        else   {
            $nametypes.add(new NameType($var1.name,$var1.type));
        }
      }
    ( COMMA
      var2=variableDeclarator 
      { 
        if($var2.needBrackets)
              $nametypes.add(new NameType($var2.name, $var2.type, true));
        else
              $nametypes.add(new NameType($var2.name,$var2.type)); 
            
      }
    )*
  ;   

///A single name of a variable (can include [N] and initialization)
variableDeclarator returns [String name,FullType type,boolean needBrackets]
  : IDENT a=arrayBrackets varInitializer 
    {       
      $needBrackets = false;
      $name = $IDENT.getText(); 
      if($a.used) {     
          if($varInitializer.used)      
              $type = $varInitializer.type;
          else
            $type = new FullType(Type.ARRAY,new FullType (Type.UNSET),$a.dimension);
      }
      else {
          if($varInitializer.used){
              if($varInitializer.dimension > 0)
                  $needBrackets = true;

             $type = $varInitializer.type;
          }
          else{
              $type = new FullType(Type.UNSET);
          }
      }
   }
   // Return the type of varInitializer to see that it matches the new variable's type
  ;  
  
varInitializer returns [FullType type, boolean used,int dimension]
  :   {
        $used = false;
        arrInitCurrNesting = 0;
        arrInitPrevNesting = 0;
        prevType = new FullType(Type.UNSET);
      }
   ( ASSIGN i=initializer { $used = true;})? 
      {
        $dimension = $i.dimension;
        $type = $initializer.type;
      } 
  ;

// Initialize a primitive variable or an array.
// The two 'things' that can initialize an array element are an expression
// and another (nested) array initializer.
initializer returns [FullType type,int dimension]
  : expression    
      {
          if (arrInitCurrNesting > 0) {
             $type = new FullType(Type.ARRAY,$expression.type,arrInitCurrNesting);
             $dimension = arrInitCurrNesting;
             arrInitPrevNesting = arrInitCurrNesting;
          }
          else {
             $dimension = 0; 
             $type = $expression.type;
         }
      }  
                   
    | {
          ++arrInitCurrNesting;
      }
    arrayInitializer  
      {
          --arrInitCurrNesting;
          $dimension = $arrayInitializer.dimension;
          $type = $arrayInitializer.type;
      
      } 

  ;
  
// This is an initializer used to set up an array, e.g. int a[2] = {1,2};
arrayInitializer returns [FullType type,int dimension]
  : ^(ARRAY_INITIALIZER 
    ( initializer 
        {
          prevType =  $initializer.type;
          $dimension = $initializer.dimension;
        }
    )*)   
        { $type = prevType; }
  ;

////////////////////////////////////
///////////// Structs //////////////
////////////////////////////////////

///The fields of a struct:
structMembersList returns [ArrayList<NameType> nametypes]
  : {$nametypes = new ArrayList<NameType>();}
    (structMember
      {
        if($structMember.type.getInnerType() == Type.VOID) {
            $nametypes.add(new NameType($structMember.name, new FullType(Type.ERROR)));
        }
        else
            $nametypes.add(new NameType($structMember.name, $structMember.type));
      }
    )+   /// Return the list of types and names
  ;
  
///A single field of a struct  
structMember returns [String name,FullType type]
  : typeSpec IDENT arrayBrackets    // Return the type and name
    {
      $type = $typeSpec.type;
      $name = $IDENT.getText();
      if ($arrayBrackets.used) {
          $type = new FullType(Type.ARRAY, $typeSpec.type);
      }
    }
  ;

///Instantiating a variable for a struct that's already defined, e.g. struct A;
structUsage returns [FullType type]
  :  'struct' id=IDENT (LBRACK  RBRACK)*
      { $type = new FullType(Type.STRUCT, $id.getText()); }  
  ;

////////////////////////////////////
//////// Formal Parameters /////////
////////////////////////////////////


///A list of formal parameters
parameterDeclarationList returns [ArrayList<NameType> nametypes]
  :     {$nametypes = new ArrayList<NameType>();}
    ( p1 = parameterDeclaration  
        { $nametypes.add(new NameType($p1.name, $p1.type));}
    ( COMMA p2 = parameterDeclaration 
        {$nametypes.add(new NameType($p2.name, $p2.type));}
    )* )?
    // Return the list of types and nemes
  ;

///A single formal parameter.
parameterDeclaration returns [String name,FullType type]
  : ^(PARAM_DECL typeSpec IDENT arrayBrackets) 
      { 
        $type = $typeSpec.type;
        $name = $IDENT.getText();
        if ($arrayBrackets.used) {
          $type = new FullType(Type.ARRAY, $typeSpec.type);
        }
      }        
  ;  



////////////////////////////////////
/////////// Statements /////////////
////////////////////////////////////

///A new block starting: { statements... }
compoundStatement
 : ^(BLOCK_SCOPE (statement)*)
 ;

///A single statement
statement
  : compoundStatement
  | declaration       ///Declaring a new local var
  | ^(EXPRESSION expression)        
  | ^(IF expression ifStat=statement ( elseStat=statement {} )? ) 
  | ^(FOR forInit forCond forIter statement)
  | ^(WHILE expression statement) 
  | ^(DO statement expression)
  | BREAK
  | CONTINUE
  | RETURN
  | ^(SWITCH expression (casesGroup)*)
  | EMPTY
  ;

///First part of for loop, e.g. for (x=0; ...)
forInit
  : ^(FOR_INIT declaration)
  | ^(FOR_INIT expressionList)
  | FOR_INIT
  ;

///Second part of for loop, e.g. i<j
forCond
  : ^(FOR_CONDITION expression?)     
  ;

///Third part of for loop, e.g. i++
forIter
  : ^(FOR_ITER expressionList?)   
  ;

///The body of a switch statement
casesGroup
  : aCase statement*
  ;

///A single case in switch, e.g. case 5: x=7;
aCase
  : ^(CASE expression)
  | DEFAULT
  ;

////////////////////////////////////
////////// Expressions /////////////
////////////////////////////////////

///The root of an expression
expression returns [FullType type]
    :   ^(EXPR expr)
    ;

// First stage - check the expr1/2/3 are matching in their types.
// Second stage - forward the type to $type (current types are not correctly true).
expr returns [FullType type]
    :   ^(ASSIGN expr1=expr expr2=expr) 
    |   ^(PLUS_ASSIGN expr1=expr expr2=expr)
    |   ^(MINUS_ASSIGN expr1=expr expr2=expr)     
    |   ^(STAR_ASSIGN expr1=expr expr2=expr)      
    |   ^(DIV_ASSIGN expr1=expr expr2=expr)       
    |   ^(BAND_ASSIGN expr1=expr expr2=expr)     
    |   ^(BOR_ASSIGN expr1=expr expr2=expr)
    |   ^(BXOR_ASSIGN expr1=expr expr2=expr)
    |   ^(MOD_ASSIGN expr1=expr expr2=expr)
    |   ^(QUESTION cond=expr expr1=expr COLON expr2=expr)
    |   ^(LOR expr1=expr expr2=expr)
    |   ^(LAND expr1=expr expr2=expr)
    |   ^(BOR expr1=expr expr2=expr)
    |   ^(BXOR expr1=expr expr2=expr)
    |   ^(BAND expr1=expr expr2=expr)
    |   ^(EQUAL expr1=expr expr2=expr)
    |   ^(NOT_EQUAL expr1=expr expr2=expr)
    |   ^(LE expr1=expr expr2=expr)
    |   ^(GE expr1=expr expr2=expr)
    |   ^(GT expr1=expr expr2=expr) 
    |   ^(LT expr1=expr expr2=expr)  
    |   ^(PLUS expr1=expr expr2=expr) 
    |   ^(MINUS expr1=expr expr2=expr)
    |   ^(STAR expr1=expr expr2=expr) 
    |   ^(DIV expr1=expr expr2=expr)
    |   ^(MOD expr1=expr expr2=expr)  
    |   ^(UNARY_PLUS e=expr) 
    |   ^(UNARY_MINUS e=expr) 
    |   ^(PRE_INC e=expr)  
    |   ^(PRE_DEC e=expr)
    |   ^(POST_INC e=expr)
    |   ^(POST_DEC e=expr)
    |   ^(NOT e=expr) 
    |   ^(LOGICAL_NOT e=expr) 
    |   primaryExpression                
    ;

///The basis of an expression: e.g. 5, 7.0, a, a[4], max(), null, a.b    
primaryExpression returns [FullType type]
    : ^(METHOD_CALL id=IDENT argList) 
    | ^(STRUCT_ACCESS structVar=primaryExpression structField=IDENT)  
    | ^(ARRAY_ELEMENT_ACCESS var=primaryExpression idx=expression) 
    | constant
    | 'true' 
    | 'false'   
    | 'null'  
    | IDENT                 
    | LPAREN e=expr RPAREN 
    ;    


///A list of expression
expressionList returns [ArrayList<FullType> types]
  : e1=expression (e2=expression)*    
  ;

///A list of actual parameters when calling a function   
argList returns [ArrayList<FullType> types]
  :  expressionList
    | EMPTY
  ; 
    
constant returns [FullType type] 
  : NUM_INT 
  | CHAR_LITERAL  
  | STRING_LITERAL 
  | NUM_DOUBLE   
  ;    