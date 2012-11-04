tree grammar IavaTreeWalker;

 
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
  
  FullType currentType; // used for structs
  String currentField; // used for structs

  private int counter  = 0; //used for calculating array type (number of [])
  private FullType prevType; //used for checking all the initializer are the same type.
  
  boolean insideSwitch = false; // used to indicate if we are inside switch case or not
  boolean insideLoop = false; // used to indicate if we are inside loop (for, while, do while) or not
  
  //used for array initialization 
  int arrInitCurrNesting = 0;
  int arrInitPrevNesting = 0;
  boolean dimError = false;
  boolean differentTypeError = false;
     
     
  boolean structVoid = false; // used to know if there was a void struct member.  
  boolean assignError; //used to solve the repetive error;  
  
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
   
  /**
   * sets the symbolTabls and the funcSymbolTabls
   * @param symbolT: the symbol table.
   */
  public void setTables(SymbolTable symbolT, FuncSymbolTable funcST) {
     st = symbolT;
     fst = funcST;
  }
  
  boolean isPrimitiveType(FullType t1){
      if(t1.getType().equals(Type.VOID)
            ||(t1.getType().equals(Type.BOOLEAN))
            ||(t1.getType().equals(Type.CHAR))
            ||(t1.getType().equals(Type.INTEGER))
            ||(t1.getType().equals(Type.REAL))
            ||(t1.getType().equals(Type.STRING))
         )
          return true;
     return false;
  }
  
  /**
   * checkes if we can do some arhitmetic with type.
   * @param type: the type we want to check.
   */
  public void checkArithmeticType(FullType type,int line, int position){
     if(type.getType() == Type.INTEGER     ||
        type.getType() == Type.REAL)
        return;
     else{
        String msg = "Error: " + type.getType() +" is not an arithmetic type";          
        newError(fileName,msg,line,position);
        assignError = true;
     }
  }
   
  /**
   *  Checkes the t1 and t2 are of the same type, if they aren't adds new error at the 
   *  given position
   *  @param t1 type 1
   *  @param t2 type 2
   *  @param _msg the message of the error
   *  @param line, position the position of the error.
   */
  public void checkSameTypes(FullType t1, FullType t2, String _msg, int line,int position){
      if(t1.getType() == Type.ERROR || t2.getType() == Type.ERROR ){
          return;
      }
     
      if (t1 == null && t2 == null) {
         String msg = _msg + "null" + " to " + "null";
         newError(fileName,msg,line,position);
         assignError = true;
      }
      else if (t1 == null) {
         String msg = _msg + "null" + " to " + t2;
         newError(fileName,msg,line,position);
         assignError = true;
      }
      else if (t1 == null && t2 == null) {
         String msg = _msg + t1 + " to " + "null";
         newError(fileName,msg,line,position);
         assignError = true;
      }
      else if(!t1.equals(t2)) {
         String msg = _msg + t1 + " to " + t2;
         newError(fileName,msg,line,position);
         assignError = true;
      } 
  }
   /**
   *  checks if t1 is Struct or array and t2 is NULL type.
   *  @param t1 type 1
   *  @param t2 type 2
   */
  public boolean checkNullAssign(FullType t1, FullType t2){
      if((t1.getType() == Type.ARRAY || t1.getType() == Type.STRUCT) && t2.getType() == Type.NULL)
          return  true;
      return false;
  }
    
  /**
   *  Checkes that t is not const 
   *  given position
   *  @param t type
   *  @param _msg the message of the error
   *  @param line, position the position of the error.
   */
  public void checkIsVar(FullType t, String _msg, int line,int position){
      if(!t.isVar()) {
         String msg = _msg;
         newError(fileName,msg,line,position);
      } 
  }

}

///Main rule - root of the tree
compilationUnit
    : {
        st.startFunc();
        st.startBlock();
      }
    ^(START_PROG funcOrVar*)
      {
        st.endBlock();
        st.endFunc();
        if (hasErrors())
            System.out.println("Compilation ended with errors!"); 
        else
            System.out.println("Compilation ended successfully!"); 
      }
    | EOF
    ;
     
///When declaring a global variable, a struct or a function:
funcOrVar
    : ^(FUNC_DECL typeSpec id=IDENT parameterDeclarationList? {
          st.startFunc();
          st.addLocalVar("$", $typeSpec.type);
          // Add to st all the vars in parameterDeclarationList
          for(NameType nameType : $parameterDeclarationList.nametypes) {
            if(nameType.type.getInnerType() == Type.VOID){
                  newError(fileName,"Error: can't declare void type variable ",$FUNC_DECL.line,$FUNC_DECL.pos);
                  if(st.addLocalVar(nameType.name, new FullType(Type.ERROR)) != 0) 
                    newError(fileName, st.getLastErrMsg(), $FUNC_DECL.line, $FUNC_DECL.pos);
                  
                  continue;
            }
            
            if(st.addLocalVar(nameType.name, nameType.type) != 0) {
               newError(fileName, st.getLastErrMsg(), $FUNC_DECL.line, $FUNC_DECL.pos);
            }
          }
        } compoundStatement) { 
          st.endFunc();
        }
    | ^(STRUCT_DECL id=IDENT {structVoid = false;} structMembersList{
            if(structVoid){
                newError(fileName,"Error: can't use void type as struct member", $STRUCT_DECL.line, $STRUCT_DECL.pos);
            }
        }
    ) 
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
  : ^(VAR_DECL typeSpec variableDefinitions)   { 
       for (NameType nameType : $variableDefinitions.nametypes){
          
          if($typeSpec.type.getInnerType() == Type.VOID)
               newError(fileName,"Error: can't declare void type variable" ,$VAR_DECL.line, $VAR_DECL.pos);
          
          if (nameType.type.getType() == Type.ARRAY && 
              $typeSpec.type.getType() == Type.ARRAY && 
              nameType.haveBrackets)
               newError(fileName, "Error: The declaration of array " + nameType.name + " is invalid", $VAR_DECL.line, $VAR_DECL.pos);
               
          if(nameType.type.getType() == Type.NULL && ($typeSpec.type.getType() == Type.ARRAY || $typeSpec.type.getType() == Type.STRUCT) )
              nameType.type = $typeSpec.type;

          if(nameType.type.getInnerType().equals(Type.UNSET)  && !$typeSpec.type.getType().equals(Type.ARRAY) ){
               nameType.type.updateInnerType($typeSpec.type.getInnerType(), $typeSpec.type.getStructName());
          }
          if(nameType.type.getInnerType().equals(Type.UNSET)  && $typeSpec.type.getType().equals(Type.ARRAY) ){
               nameType.type = $typeSpec.type;
          }
          if(!$typeSpec.type.getType().equals(Type.ARRAY)){
              if(!$typeSpec.type.getType().equals(nameType.type.getInnerType()) && !$typeSpec.type.getType().equals(Type.ERROR) && !nameType.type.getType().equals(Type.ERROR)){
                  newError(fileName, "Error: The difinition type (on the left) doesn't match the initialization type", $VAR_DECL.line, $VAR_DECL.pos);
                  nameType.type = new FullType(Type.ERROR);
              }
              if(nameType.needBrackets)
                   newError(fileName,"Error: array initialization should have array brackets ",
                    $VAR_DECL.line,$VAR_DECL.pos);
          }
          else{
		          if(!$typeSpec.type.equals(nameType.type) && !$typeSpec.type.getType().equals(Type.ERROR) && !nameType.type.getType().equals(Type.ERROR)){
		              newError(fileName, "Error: The difinition type(on the left) doesn't match the initialization type", $VAR_DECL.line, $VAR_DECL.pos);
		              nameType.type = new FullType(Type.ERROR);
		          }
		          nameType.type.updateInnerType($typeSpec.type.getInnerType(), $typeSpec.type.getStructName());
		      }
          if (st.addLocalVar(nameType.name, nameType.type) == -1 ) {// Add as local var to symtab.
             newError(fileName, st.getLastErrMsg(), $VAR_DECL.line, $VAR_DECL.pos);
          }
      }
     }    
   
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
// a[] - When passing arrays to functions
///a[5], a[N] - When declaring \ accessing arrays
arrayBrackets returns [boolean used, int dimension, boolean fixedSize]
  : {$used = false; $dimension=0;} 
    (LBRACK  RBRACK 
        {$used = true; $dimension=$dimension+1; $fixedSize=false; }
    )*          
  | {$used = false; $dimension=0;} 
    (LBRACK expression RBRACK  
		  {
		    if(!$expression.type.equals(new FullType(Type.INTEGER))){
		       newError(fileName,"Error: array index should be integer ",$LBRACK.line,$LBRACK.pos);
		    }
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
        NameType nt;
        if($var1.needBrackets)
            nt = new NameType($var1.name, $var1.type, true);
        else 
            nt = new NameType($var1.name,$var1.type);
        nt.setBrackets($var1.haveBrackets);
        $nametypes.add(nt);
      }
    ( COMMA
      var2=variableDeclarator 
      { 
        NameType nt;
        if($var2.needBrackets)
            nt = new NameType($var2.name, $var2.type, true);
        else
            nt = new NameType($var2.name,$var2.type);
        nt.setBrackets($var2.haveBrackets);
        $nametypes.add(nt);
      }
    )*
  ;   

///A single name of a variable (can include [N] and initialization)
variableDeclarator returns [String name,FullType type,boolean needBrackets, boolean haveBrackets]
  : IDENT a=arrayBrackets varInitializer 
    { 
      $haveBrackets = $a.used;      
      $needBrackets = false;
      $name = $IDENT.getText(); 
      if($a.used) {     
          if($varInitializer.used && $varInitializer.type.getType() != Type.NULL) {        
              if($a.dimension != $varInitializer.dimension)
                  newError(fileName,"Error: dimension brackets don't match the initialization ", 
                           $IDENT.line,$IDENT.pos);
                    
              $type = $varInitializer.type;
                  
              if($a.fixedSize)
                  newError(fileName,"Error: cannot initialize fixed size array ", 
                           $IDENT.line,$IDENT.pos); 
          }
          else{
            $type = new FullType(Type.ARRAY,new FullType (Type.UNSET),$a.dimension);
          }
      }
      else {
         if($varInitializer.used) {
             if($varInitializer.dimension > 0)
                 $needBrackets = true;

             $type = $varInitializer.type;
         }
         else {
             $type = new FullType(Type.UNSET);
         }
      }
   }
   /// Return the type of varInitializer to see that it matches the new variable's type
  ;  
  
varInitializer returns [FullType type, boolean used, int dimension]
  :   {
        $used = false;
        arrInitCurrNesting = 0;
        arrInitPrevNesting = 0;
        dimError=false;
        differentTypeError = false;
        prevType = new FullType(Type.UNSET);
      }
   ( ASSIGN i=initializer { $used = true;})? 
      {
        if(dimError){
            newError(fileName,"Error: Not all the initializers are in the same dimension ",
                    $ASSIGN.line,$ASSIGN.pos);
        }
   
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
             if(arrInitPrevNesting >0){
                 if(arrInitCurrNesting != arrInitPrevNesting){
                    dimError = true;
                 }
             }
             $type = new FullType(Type.ARRAY,$expression.type,arrInitCurrNesting);
             $dimension = arrInitCurrNesting;
             arrInitPrevNesting = arrInitCurrNesting;
          }
          else {
             $dimension = 0; 
             $type = $expression.type;
             if($expression.type.getType().equals(Type.ARRAY)) {
                 FullType t = $expression.type;
                 while(t.getArrayType() != null) {
                    $dimension++;
                    t = t.getArrayType();    
                }
             } 
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
		      if(!prevType.getType().equals(Type.UNSET)){
		        if(!$initializer.type.getInnerType().equals(prevType.getInnerType())){
		           if(!differentTypeError)
				           newError(fileName,"Error: Not all the initializers are in the same type ",
				                    $ARRAY_INITIALIZER.line,$ARRAY_INITIALIZER.pos);
		           differentTypeError = true;
		                    
		        }
		      }
		      prevType =  $initializer.type;
		      $dimension = $initializer.dimension;
		    }
    )*)   
        { $type = prevType; }
    /// See that all initializers are of the same type, and return the type to verify that it matches the var.
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
            structVoid = true;
        }
        else
            $nametypes.add(new NameType($structMember.name, $structMember.type));
      }
    )+   /// Return the list of types and names
  ;
  
///A single field of a struct  
structMember returns [String name,FullType type]
  : typeSpec IDENT arrayBrackets    /// Return the type and name
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


// A list of formal parameters
parameterDeclarationList returns [ArrayList<NameType> nametypes]
  :     {$nametypes = new ArrayList<NameType>();}
    ( p1 = parameterDeclaration  
        { 
          $nametypes.add(new NameType($p1.name, $p1.type));
        }
    ( COMMA p2 = parameterDeclaration 
        {
          $nametypes.add(new NameType($p2.name, $p2.type));
        }
    )* )?
    /// Return the list of types and nemes
  ;

// A single formal parameter.
parameterDeclaration returns [String name,FullType type]
  : ^(PARAM_DECL typeSpec IDENT arrayBrackets) 
      { 
        $type = $typeSpec.type;
        $name = $IDENT.getText();
        if ($arrayBrackets.used) {
          $type = new FullType(Type.ARRAY, $type, $arrayBrackets.dimension);
        }
        
        if ($arrayBrackets.used && $typeSpec.type.getType() == Type.ARRAY)
          newError(fileName, "Error: The declaration of array " + $IDENT.getText() + 
                   " is invalid", $PARAM_DECL.line, $PARAM_DECL.pos);
      }        
    /// Return the type + name as of a local variable.    
  ;  



////////////////////////////////////
/////////// Statements /////////////
////////////////////////////////////

///A new block starting: { statements... }
compoundStatement
 : ^(BLOCK_SCOPE
  (statement)*)  
 ;
 

///A single statement
statement
  : compoundStatement
  | declaration       ///Declaring a new local var
  | ^(EXPRESSION expression) 
		    {
			      if (!$expression.assignOrFunc)
			         newError(fileName,"Error: the expression is illegal",
			                  $EXPRESSION.line,$EXPRESSION.pos);
		    }       
  | ^(IF 
        {
            if (st.startBlock() == -1) {
                newError(fileName, st.getLastErrMsg(), $IF.line, $IF.pos);
            }
        } 
      expression ifStat=statement ( elseStat=statement )? ) 
        {
            if(!$expression.type.getType().equals(Type.BOOLEAN))
                newError(fileName,"Error: IF condition must be boolean",$IF.line,$IF.pos);
            if (st.endBlock() == -1) {
                newError(fileName, st.getLastErrMsg(), $IF.line, $IF.pos);
            }
        }

  | ^(FOR 
        {
            if (st.startBlock() == -1) {
                newError(fileName, st.getLastErrMsg(), $FOR.line, $FOR.pos);
            }
            insideLoop = true;
        } 
      forInit forCond forIter statement )
        {
            if (st.endBlock() == -1) {
                newError(fileName, st.getLastErrMsg(), $FOR.line, $FOR.pos);
            }
            insideLoop = false;
        }

  | ^(WHILE 
        {
            if (st.startBlock() == -1) {
                newError(fileName, st.getLastErrMsg(), $WHILE.line, $WHILE.pos);
            }
            insideLoop = true;
        }
      expression statement) 
        {
            if(!$expression.type.getType().equals(Type.BOOLEAN))
                newError(fileName,"Error: WHILE condition must be boolean",$WHILE.line,$WHILE.pos);
            if (st.endBlock() == -1) {
                newError(fileName, st.getLastErrMsg(), $WHILE.line, $WHILE.pos);
            }
            insideLoop = false;
        }
  | ^(DO 
        {
            if (st.startBlock() == -1) {
                newError(fileName, st.getLastErrMsg(), $DO.line, $DO.pos);
            }
            insideLoop = true;
        }
      statement expression)
        {
            if(!$expression.type.getType().equals(Type.BOOLEAN))
                newError(fileName,"Error: DO condition must be boolean",$DO.line,$DO.pos);
            if (st.endBlock() == -1) {
                newError(fileName, st.getLastErrMsg(), $DO.line, $DO.pos);
            }
            insideLoop = false;
        } 
  | BREAK   
        { 
            if (insideSwitch) {
                newError(fileName, "break statment inside switch case is forbidden", 
                         $BREAK.line, $BREAK.pos);
            } 
            if (!insideLoop) {
                newError(fileName, "break statment outside loop is forbidden", 
                         $BREAK.line, $BREAK.pos);
            }
        }
  | CONTINUE
        {  
            if (!insideLoop) {
                newError(fileName, "continue statment outside loop is forbidden", 
                         $CONTINUE.line, $CONTINUE.pos);
            }
        }
  | RETURN
  | ^(SWITCH expression 
          { 
              insideSwitch = true;
              if((!isPrimitiveType($expression.type)) || 
                 ($expression.type.getType() == Type.STRING)) {
                  newError(fileName,"Error: Switch works only with primitive types except string",
                           $SWITCH.line,$SWITCH.pos);
              }
           }
        (casesGroup
          {
              if ($casesGroup.type.getType() != Type.UNSET) // if not default:
                  checkSameTypes($expression.type,$casesGroup.type,"Error: can't compare ",
                                 $SWITCH.line,$SWITCH.pos);
          } /// Check expression and caseGroup are the same types.
        )*
          { insideSwitch = false; }
      ) 
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
          {
            if ($expression.type != null)
              if(!$expression.type.getType().equals(Type.BOOLEAN))
                newError(fileName,"Error: FOR condition must be boolean",$FOR_CONDITION.line,$FOR_CONDITION.pos);
          }
  ;

///Third part of for loop, e.g. i++
forIter
  : ^(FOR_ITER expressionList?)   
  ;

///The body of a switch statement
casesGroup returns [FullType type]
  :     
    (aCase
        { 
          st.startBlock();
          $type = $aCase.type; 
        }
    ) statement*
        {
          st.endBlock();
        }
  ;

///A single case in switch, e.g. case 5: x=7;
aCase returns [FullType type]
  : ^(CASE expression) { $type = $expression.type; }
  | DEFAULT { $type = new FullType(Type.UNSET); }
  ;

////////////////////////////////////
////////// Expressions /////////////
////////////////////////////////////

///The root of an expression
expression returns [FullType type, boolean assignOrFunc]
    : ^(EXPR {assignError = false; } expr) 
          { 
              $type = $expr.type; 
              $assignOrFunc = $expr.assignOrFunc; 
          }
    ;

// First stage - check the expr1/2/3 are matching in their types.
// Second stage - forward the type to $type (current types are not correctly true).
expr returns [FullType type, boolean assignOrFunc]
    : (
      ^(ASSIGN expr1=expr expr2=expr) 
		    { 
		        if(!checkNullAssign($expr1.type,$expr2.type))
		            checkSameTypes($expr2.type,$expr1.type,"Error: can't assign ",$ASSIGN.line,$ASSIGN.pos);
		        checkIsVar($expr1.type, "Error: left hand side is not a variable", $ASSIGN.line,$ASSIGN.pos);
		        $type = assignError==false?$expr1.type:new FullType(Type.ERROR); 
		        $assignOrFunc = true;
		    }
    | ^(PLUS_ASSIGN expr1=expr expr2=expr)
		    { 
		        if(!checkNullAssign($expr1.type,$expr2.type))
		             checkSameTypes($expr2.type,$expr1.type,"Error: can't add ",$PLUS_ASSIGN.line,$PLUS_ASSIGN.pos);
		        checkArithmeticType($expr1.type,$PLUS_ASSIGN.line,$PLUS_ASSIGN.pos);
		        checkIsVar($expr1.type, "Error: left hand side is not a variable", $PLUS_ASSIGN.line,$PLUS_ASSIGN.pos);
		        $type = assignError==false?$expr1.type:new FullType(Type.ERROR); 
		        $assignOrFunc = true; 
		    }
    |   ^(MINUS_ASSIGN expr1=expr expr2=expr)     
		    {         
		        if(!checkNullAssign($expr1.type,$expr2.type))
		            checkSameTypes($expr2.type,$expr1.type,"Error: can't Subtracte ",
		                           $MINUS_ASSIGN.line,$MINUS_ASSIGN.pos); 
		        checkArithmeticType($expr1.type,$MINUS_ASSIGN.line,$MINUS_ASSIGN.pos);
		        checkIsVar($expr1.type, "Error: left hand side is not a variable", $MINUS_ASSIGN.line,$MINUS_ASSIGN.pos);              
		        $type = assignError==false?$expr1.type:new FullType(Type.ERROR); 
		        $assignOrFunc = true; 
		    }
    | ^(STAR_ASSIGN expr1=expr expr2=expr)      
		    { 
		        if(!checkNullAssign($expr1.type,$expr2.type))
		            checkSameTypes($expr1.type,$expr2.type,"Error: can't multiply ",
		                           $STAR_ASSIGN.line,$STAR_ASSIGN.pos); 
		        checkArithmeticType($expr1.type,$STAR_ASSIGN.line,$STAR_ASSIGN.pos);
		        checkIsVar($expr1.type, "Error: left hand side is not a variable", $STAR_ASSIGN.line,$STAR_ASSIGN.pos);
		        $type = assignError==false?$expr1.type:new FullType(Type.ERROR);  
		        $assignOrFunc = true;
		    }
    |   ^(DIV_ASSIGN expr1=expr expr2=expr)       
		    { 
		        if(!checkNullAssign($expr1.type,$expr2.type))
		            checkSameTypes($expr1.type,$expr2.type,"Error: can't divide ",
		                           $DIV_ASSIGN.line,$DIV_ASSIGN.pos); 
		        checkArithmeticType($expr1.type,$DIV_ASSIGN.line,$DIV_ASSIGN.pos);
		        checkIsVar($expr1.type, "Error: left hand side is not a variable", $DIV_ASSIGN.line,$DIV_ASSIGN.pos);
		        $type = assignError==false?new FullType(Type.REAL):new FullType(Type.ERROR); 
		        $assignOrFunc = true; 
		    }
    | ^(BAND_ASSIGN expr1=expr expr2=expr)     
	      { 
		        checkSameTypes($expr1.type,$expr2.type,"Error: can't preform and ",
		                       $BAND_ASSIGN.line,$BAND_ASSIGN.pos); 
		        checkIsVar($expr1.type, "Error: left hand side is not a variable", $BAND_ASSIGN.line,$BAND_ASSIGN.pos);
		        $type = assignError==false?$expr1.type:new FullType(Type.ERROR);  
		        $assignOrFunc = true;
	      }
    | ^(BOR_ASSIGN expr1=expr expr2=expr) 
	      { 
		        checkSameTypes($expr1.type,$expr2.type,"Error: can't preform or ",
		                       $BOR_ASSIGN.line,$BOR_ASSIGN.pos); 
		        checkIsVar($expr1.type, "Error: left hand side is not a variable", $BOR_ASSIGN.line,$BOR_ASSIGN.pos);
		        $type = $expr1.type;
		        $assignOrFunc = true;
	      }
    | ^(BXOR_ASSIGN expr1=expr expr2=expr)      
	      { 
		        checkSameTypes($expr1.type,$expr2.type,"Error: can't preform xor ",
		                       $BXOR_ASSIGN.line,$BXOR_ASSIGN.pos); 
		        checkIsVar($expr1.type, "Error: left hand side is not a variable", $BXOR_ASSIGN.line,$BXOR_ASSIGN.pos);
		        $type = $expr1.type;
		        $assignOrFunc = true;
	      }
    | ^(MOD_ASSIGN expr1=expr expr2=expr)        
	      { 
		        if($expr1.type.getType() != Type.INTEGER ||  $expr2.type.getType() != Type.INTEGER) {
			          String msg = "Error: can't preform mod " + $expr2.type.getType() + " to " + $expr1.type.getType();          
			          newError(fileName,msg,$MOD_ASSIGN.line,$MOD_ASSIGN.pos);  
		        } 
		        checkIsVar($expr1.type, "Error: left hand side is not a variable", $MOD_ASSIGN.line,$MOD_ASSIGN.pos);
		        $type = assignError==false?$expr1.type:new FullType(Type.ERROR);  
		        $assignOrFunc = true;
	      }
    | ^(QUESTION cond=expr expr1=expr COLON expr2=expr)   
	      { 
		        checkSameTypes($expr1.type,$expr2.type,"Error: can't preform  ",
		                       $QUESTION.line,$QUESTION.pos);
		        if(!($cond.type.getType() == Type.BOOLEAN)) {
			          String msg = "Error: condition must be of boolean type";          
			          newError(fileName,msg,$QUESTION.line,$QUESTION.pos);  
		        } 
		        $type = $expr1.type; 
	      }
    | ^(LOR expr1=expr expr2=expr)               
	      { 
		        if(!($expr1.type.getType() == Type.BOOLEAN && $expr2.type.getType() == Type.BOOLEAN)){
			          String msg = "Error: can't preform or " + $expr2.type.getType() + " to " + $expr1.type.getType();          
			          newError(fileName,msg,$LOR.line,$LOR.pos);  
		        } 
		        $type = $expr1.type;
	      }
    | ^(LAND expr1=expr expr2=expr)                  
        { 
		        if(!($expr1.type.getType() == Type.BOOLEAN && $expr2.type.getType() == Type.BOOLEAN)){
			          String msg = "Error: can't preform and " + $expr2.type.getType() + " to " + $expr1.type.getType();          
			          newError(fileName,msg,$LAND.line,$LAND.pos);
            } 
            $type = $expr1.type;
        }
    | ^(BOR expr1=expr expr2=expr)                    
	      { 
		        if($expr1.type.getType() != $expr2.type.getType()){
			          String msg = "Error: can't preform or " + $expr2.type.getType() + " to " + $expr1.type.getType();          
			          newError(fileName,msg,$BOR.line,$BOR.pos);
		        } 
	          $type = $expr1.type;
	      }
    | ^(BXOR expr1=expr expr2=expr)               
	      { 
		        if($expr1.type.getType() != $expr2.type.getType()){
			          String msg = "Error: can't preform xor " + $expr2.type.getType() + " to " + $expr1.type.getType();          
			          newError(fileName,msg,$BXOR.line,$BXOR.pos);
		        } 
		        $type = $expr1.type;
	      }
    | ^(BAND expr1=expr expr2=expr)                
	      { 
		        if($expr1.type.getType() != $expr2.type.getType()){
			          String msg = "Error: can't preform and " + $expr2.type.getType() + " to " + $expr1.type.getType();          
			          newError(fileName,msg,$BAND.line,$BAND.pos);
		        } 
		        $type = $expr1.type;
	      }
    | ^(EQUAL expr1=expr expr2=expr)               
		    { 
	          if(!checkNullAssign($expr1.type,$expr2.type))
	              checkSameTypes($expr1.type,$expr2.type,"Error: can't compare  ", $EQUAL.line,$EQUAL.pos); 
		        if($expr1.type.getType()==Type.STRING)
		            newError(fileName,"Error, do not use == for strings, use stdlib's strCmp instead",$EQUAL.line,$EQUAL.pos);
		        $type = new FullType(Type.BOOLEAN); 
		    }
    | ^(NOT_EQUAL expr1=expr expr2=expr)              
		    { 
	          if(!checkNullAssign($expr1.type,$expr2.type))
	              checkSameTypes($expr1.type,$expr2.type,"Error: can't compare  ", $NOT_EQUAL.line,$NOT_EQUAL.pos); 
	          $type = new FullType(Type.BOOLEAN);
		    }
    | ^(LE expr1=expr expr2=expr)                   
		    { 
	          checkSameTypes($expr1.type,$expr2.type,"Error: can't compare  ", $LE.line,$LE.pos); 
	          checkArithmeticType($expr1.type,$LE.line,$LE.pos);
	          $type = new FullType(Type.BOOLEAN);
		    }
    | ^(GE expr1=expr expr2=expr)                   
        { 
	          checkSameTypes($expr1.type,$expr2.type,"Error: can't compare  ",
	          $GE.line,$GE.pos);
	          checkArithmeticType($expr1.type,$GE.line,$GE.pos);
	          $type = new FullType(Type.BOOLEAN);
        }
    | ^(GT expr1=expr expr2=expr)                   
        { 
	          checkSameTypes($expr1.type,$expr2.type,"Error: can't compare  ",
	          $GT.line,$GT.pos); 
	          checkArithmeticType($expr1.type,$GT.line,$GT.pos);
	          $type = new FullType(Type.BOOLEAN);     
        }
    | ^(LT expr1=expr expr2=expr)               
        { 
	          checkSameTypes($expr1.type,$expr2.type,"Error: can't compare  ",
	          $LT.line,$LT.pos); 
	          checkArithmeticType($expr1.type,$LT.line,$LT.pos);
	          $type = new FullType(Type.BOOLEAN);
          
        }
    | ^(PLUS expr1=expr expr2=expr)             
        { 
	          if (!($expr1.type.getType() == Type.STRING || 
	              $expr2.type.getType() == Type.STRING)) {
		             checkSameTypes($expr1.type,$expr2.type,"Error: can't add  ",
		             $PLUS.line,$PLUS.pos); 
	           }
	           if(!($expr1.type.getType() == Type.INTEGER ||
	             $expr1.type.getType() == Type.REAL ||
	             $expr1.type.getType() == Type.STRING) ) {
			            String msg = " Error: " + $expr1.type.getType() + " is not an arithmetic type or a string ";          
			            newError(fileName,msg,$PLUS.line,$PLUS.pos);
	           } 
	           $type = $expr1.type;
        }
    | ^(MINUS expr1=expr expr2=expr)                 
        { 
	          checkSameTypes($expr1.type,$expr2.type,"Error: can't subtract  ",
	          $MINUS.line,$MINUS.pos); 
	          checkArithmeticType($expr1.type,$MINUS.line,$MINUS.pos);
	          $type = $expr1.type;
        }
    | ^(STAR expr1=expr expr2=expr)             
        { 
	          checkSameTypes($expr1.type,$expr2.type,"Error: can't multiply  ",
	          $STAR.line,$STAR.pos);
	          checkArithmeticType($expr1.type,$STAR.line,$STAR.pos); 
	          $type = $expr1.type;
        }
    | ^(DIV expr1=expr expr2=expr)             
        { 
	          checkSameTypes($expr1.type,$expr2.type,"Error: can't divide  ",
	          $DIV.line,$DIV.pos); 
	          checkArithmeticType($expr1.type,$DIV.line,$DIV.pos); 
	          $type = $expr1.type;
        }
    | ^(MOD expr1=expr expr2=expr)                     
        { 
	          if(!$expr1.type.getType().equals(Type.INTEGER) || 
	             !$expr2.type.getType().equals(Type.INTEGER)) {
	               String msg = "Error: can't preform and " + $expr2.type.getType() + " to " + $expr1.type.getType();          
	               newError(fileName,msg,$MOD.line,$MOD.pos);
	          }
            $type = new FullType(Type.INTEGER);
         }
    | ^(UNARY_PLUS e=expr)             
        { 
		        checkArithmeticType($e.type,$UNARY_PLUS.line,$UNARY_PLUS.pos);
		        $type = $e.type; 
        }
    | ^(UNARY_MINUS e=expr)            
        { 
		        checkArithmeticType($e.type,$UNARY_MINUS.line,$UNARY_MINUS.pos);
		        $type = $e.type; 
        }
    | ^(PRE_INC e=expr)                     
        { 
		        checkArithmeticType($e.type,$PRE_INC.line,$PRE_INC.pos);
		        checkIsVar($e.type, "Error: left hand side is not a variable", $PRE_INC.line,$PRE_INC.pos);
		        $type = $e.type; 
		        $assignOrFunc = true;
        }
    | ^(PRE_DEC e=expr)                 
        { 
		        checkArithmeticType($e.type,$PRE_DEC.line,$PRE_DEC.pos);
		        checkIsVar($e.type, "Error: left hand side is not a variable", $PRE_DEC.line,$PRE_DEC.pos);
		        $type = $e.type; 
		        $assignOrFunc = true;
        }
    | ^(POST_INC e=expr)                
        { 
		        checkArithmeticType($e.type,$POST_INC.line,$POST_INC.pos);
		        checkIsVar($e.type, "Error: left hand side is not a variable", $POST_INC.line,$POST_INC.pos);
		        $type = $e.type; 
		        $assignOrFunc = true;
        }
    | ^(POST_DEC e=expr)                       
        { 
		        checkArithmeticType($e.type,$POST_DEC.line,$POST_DEC.pos );
		        checkIsVar($e.type, "Error: left hand side is not a variable", $PRE_DEC.line,$PRE_DEC.pos);
		        $type = $e.type; 
		        $assignOrFunc = true;
        }
    | ^(NOT e=expr)                          
        { 
		        if(!$e.type.getType().equals(Type.BOOLEAN)){
		            String msg = "Error: " + $e.type.getType() +" is not a boolean type";          
		            newError(fileName,msg,$NOT.line,$NOT.pos);
            }
            $type = new FullType(Type.BOOLEAN); 
        }
    | ^(LOGICAL_NOT e=expr)             
        { 
		        if(!$e.type.getType().equals(Type.BOOLEAN)){
		            String msg = "Error: " + $e.type.getType() +" is not a boolean type";          
		            newError(fileName,msg,$LOGICAL_NOT.line,$LOGICAL_NOT.pos);
		        }
		        $type = new FullType(Type.BOOLEAN); 
        } 
        
      ) {   $type.setVar(false);  }
      
    |   primaryExpression                
        { 
	          $type = $primaryExpression.type; 
	          $assignOrFunc = $primaryExpression.assignOrFunc;
        }
    ;

///The basis of an expression: e.g. 5, 7.0, a, a[4], max(), null, a.b    
primaryExpression returns [FullType type,String name, boolean assignOrFunc]
    : ^(METHOD_CALL id=IDENT argList) 
	        { 
		          if(fst.isFuncCallOK($IDENT.getText(),$argList.types)) {
			            if($argList.types == null) {
			               // No formal parameters
			            }
			            $type = fst.getFuncReturnType(id.getText(), $argList.types);
		          } else {
			            newError(fileName, fst.getLastErrMsg(), $METHOD_CALL.line, $METHOD_CALL.pos);
			            $type = new FullType(Type.ERROR);
		          }
		          $assignOrFunc = true;
	        }    
      
      | ^(STRUCT_ACCESS structVar=primaryExpression structField=IDENT)
         {
             currentType = $structVar.type; 
             if (currentType == null || currentType.getType() != Type.STRUCT) {
	               newError(fileName, "Variable " + $structVar.name + " is not a struct", 
	                        $structField.line, $structField.pos);
	               currentType = new FullType(Type.ERROR);
	               $type = new FullType(Type.ERROR);
             }

             currentField = $structField.getText();
             FullType ft = st.typeOfStructField(currentType, currentField);
             if (ft == null) {          
	               newError(fileName, st.getLastErrMsg(), $structField.line, $structField.pos);
	               ft = new FullType(Type.ERROR);
	               $type = new FullType(Type.ERROR);
             }
             else {
	               $type = ft;
	               $type.setVar(true);
             }
             currentType = ft;
             $name = currentField;
         }      
    | ^(ARRAY_ELEMENT_ACCESS var=primaryExpression idx=expression) 
        { 
	          if(!$expression.type.getType().equals(Type.INTEGER))
	              newError(fileName,"Error: Array index should be of integer type.",$ARRAY_ELEMENT_ACCESS.line,$ARRAY_ELEMENT_ACCESS.pos);
	          $name = $var.name;
	          if(!$var.type.getType().equals(Type.ARRAY)){
	              newError(fileName,"Error: variable " + $var.name + " of type " + $var.type+ " is not an array",$ARRAY_ELEMENT_ACCESS.line,$ARRAY_ELEMENT_ACCESS.pos);
	              $type = $var.type;
	              $type.setVar(true);
	          }
	          else {
	              $type = $var.type.getArrayType();
	              $type.setVar(true);
	          }
	          // verify that var is an array and return relevant type
        }
    | constant              { $type = $constant.type; }
    | 'true'                { $type = new FullType(Type.BOOLEAN); }
    | 'false'               { $type = new FullType(Type.BOOLEAN); }
    | 'null'                { $type = new FullType(Type.NULL); }
    | IDENT                 
	      {
			     if ( st.typeOfVar($IDENT.getText()) == null) {
	              newError(fileName, st.getLastErrMsg(), $IDENT.line, $IDENT.pos);
	              $type = new FullType(Type.ERROR);
			     } 
			     else {
			          $type = st.typeOfVar($IDENT.getText()); 
			          $type.setVar(true);  
			          $name = new String($IDENT.getText());
			     }
	      }
    | LPAREN e=expr RPAREN  { $type = $e.type; $type.setVar(false); }
    ;    

 
///A list of expression
expressionList returns [ArrayList<FullType> types]
  :                 {$types = new ArrayList(); /* exNOTplist::new */} 
    e1=expression   {$types.add($e1.type);/* explist::add1 */} 
    (e2=expression  {$types.add($e2.type); /* explist::add2 */} )*    
  ;

///A list of actual parameters when calling a function   
argList returns [ArrayList<FullType> types]
  :  expressionList { $types = $expressionList.types; /* argList::other */ }
    | EMPTY         { $types = new ArrayList();/* argList::EMPTY */ }
  ; 
    
constant returns [FullType type] 
  : NUM_INT         { $type = new FullType(Type.INTEGER); }
  | CHAR_LITERAL    { $type = new FullType(Type.CHAR); }
  | STRING_LITERAL  { $type = new FullType(Type.STRING); } 
  | NUM_DOUBLE      { $type = new FullType(Type.REAL); } 
  ;    