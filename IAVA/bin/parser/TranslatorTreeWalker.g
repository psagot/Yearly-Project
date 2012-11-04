tree grammar TranslatorTreeWalker;

 
options {
  backtrack = true; 
  memoize = true;
  language = Java;
  tokenVocab = Iava;
  ASTLabelType = CommonTree;
}

@treeparser::header {
  package parser;
} 

@members{
  private static final String  header = "import static standardLib.StdLib.*;" +
                                      "\n@SuppressWarnings(\"all\")\n" +
                                      "\n\npublic class __javawrap__ {\n\n" +
                                      "public static void main(String __args[])"
                                      +"{\ntry {\n";
  private String functions = "";
  private String structures = "";
  
  ///returns the default assignment value of a primitive type:
  private static String defaultInitializer(String s) {
    if (s.equals("boolean")) return "false";
    if (s.equals("char")) return "0";
    if (s.equals("long")) return "0";
    if (s.equals("double")) return "0.0";
    if (s.equals("String")) return "\"\"";  
    if (s.contains("[]")) return "null";
    
    return null;
  }
}
                      

///Main rule - root of the tree
compilationUnit returns [String str]
    : {
        $str = header;
      }
    ^(START_PROG (funcOrVar {$str= $str + $funcOrVar.str;})*)
      {
        $str += "\n} catch (Exception e) {\nshowException(e);\n}\n}\n";
        $str += functions + "\n" + structures + "\n}\n";
      }
    | EOF {
        $str= header + "\n} catch (Exception e) {\nshowException(e);\n}\n}\n}\n";
        
        }
    ;
     
///When declaring a global variable, a struct or a function:
funcOrVar returns [String str]
   
    : ^(FUNC_DECL typeSpec id=IDENT parameterDeclarationList? compoundStatement) 
        {
         String func = "";
         String tmp = $parameterDeclarationList.str;
         if (tmp == null) tmp="";
         func += "static " + $typeSpec.str + " " + "_"+$id.getText() + "(" 
                 + tmp + ")\n{\n" +  $typeSpec.str + " _$ = " + 
                 (!$typeSpec.is_struct?defaultInitializer($typeSpec.str):"new "+ $typeSpec.str +"()" ) + ";"
                 + $compoundStatement.str.substring(1,$compoundStatement.str.length()-2) +"return _$;\n}\n" ;
         functions += "\n" + func;
         $str = "";
         }
    
    | ^(STRUCT_DECL id=IDENT structMembersList) 
        { 
          String new_struct = "static public class " + "_"+$id.getText() + "{\n" ;
          new_struct += $structMembersList.str + "}\n\n";
          structures += new_struct;
          $str = "";
        }
    | ^(GLOBAL_STATEMENT statement)
        {
          $str = $statement.str.replace("if (true) return _$;\n", "if (true) return;\n");
        }
    ;
    
    
typeSpec returns [String str, boolean is_struct]
    : { $is_struct = false;}
      builtInType { $str = $builtInType.str; }
    | builtInType { $str = $builtInType.str; } (LBRACK  RBRACK { $str = $str + "[]"; } )+  
    | structUsage 
      { $str = $structUsage.str;
        $is_struct = true;
      }  
    ;

///Declaring a new local variable:
declaration returns [String str]
  : ^(VAR_DECL typeSpec variableDefinitions)   
     {
      if ($typeSpec.is_struct || $typeSpec.str =="String"){
        $str = $typeSpec.str + " " +  
                $variableDefinitions.str.replaceAll("__default__", "new " + $typeSpec.str + "()")
                  .replaceAll("__type__", $typeSpec.str);
                 
      } else {
        $str = $typeSpec.str + " " +  
                $variableDefinitions.str.replaceAll("__default__",defaultInitializer($typeSpec.str))
                  .replaceAll("__type__", $typeSpec.str);
      }
      if (!$variableDefinitions.inits.equals(""))
        $str = $str + ";\n" + $variableDefinitions.inits;
        if($str.indexOf(";\ninitArray(")!=-1)
          $str = $str.substring(0,($str.indexOf(";\ninitArray(")));
     }    
  ;

//A primitive type name.
builtInType returns [String str]
  : 'void'    { $str = "Object"; }
  | 'boolean' { $str = "boolean"; }
  | 'char'    { $str = "char"; }
  | 'integer' { $str = "long"; } 
  | 'real'    { $str = "double"; }
  | 'string'  { $str = "String"; }
  ;

// When declaring \ accessing arrays:
// int[] - When passing arrays to functions
///int[5], int[N] - When declaring \ accessing arrays
arrayBrackets returns [String str, boolean fixedSize]
  : {$str = ""; }  (LBRACK  RBRACK             { $str = $str + "[]"; $fixedSize = false; }                 )*          
  | {$str = ""; }  (LBRACK e=expression RBRACK { $str = $str + "[(int)(" + $e.str +  ")]"; $fixedSize = true; }  )* 
  ;

///A list of variable names (can include [])    
variableDefinitions returns [String str, String inits]
  : var1=variableDeclarator { $str = $var1.str; $inits = $var1.init; }
    ( COMMA
      var2=variableDeclarator { $str = $str+ ", " + $var2.str; $inits = $inits + $var2.init; }
    )*
  ;   

///A single name of a variable (can include [N] and initialization)
variableDeclarator returns [String str, String init]
  : IDENT a=arrayBrackets vi=varInitializer 
    {
      $init = "";
      if (!($vi.str.equals(""))) {      //User has initialized already        
        if ($a.str.equals(""))          //Non-array init: do nothing
            $str = "_" + $IDENT.getText() + $a.str + $vi.str;
        
        else {  ///Array init: change "char[2] = {1,2}" to "char[] = {1,2}"
            $str = "_" + $IDENT.getText() + $a.str.replaceAll("[^\\[\\]]", "") + $vi.str;
        }  
      }
      
      else if ($a.str.equals("")) {   //Initialize non-array to default value:
        $str = "_" + $IDENT.getText() + " = __default__";   ///__default__ replaced with default value later
      }  
      
      else {                          //Initialize an array:
        int numBrackets = $a.str.split("\\[").length - 1;
        $str = "_" + $IDENT.getText();
        for (int i=0; i<numBrackets; i++)
          $str = $str + "[]";
        
        if ($a.fixedSize) {
             //$str = $str + " = new __type__" + $a.str + ";\ninitArray(" + "_"+$IDENT.getText() + ")";          ///__type__ replaced with type later
             $str = $str + " = new __type__" + $a.str;          ///__type__ replaced with type later
             $init = "initArray(" + "_"+$IDENT.getText() + ");\n";
        }
        else 
             $str = $str + " = null";          ///example: integer b[] should be replaced with integer b[] = null;
      }
    }
  ;  
  
varInitializer returns [String str]
  : 
  { $str = ""; }
  ( ASSIGN i=initializer { $str = " = " + $i.str; })? 
  ;

// Initialize a primitive variable or an array.
// The two 'things' that can initialize an array element are an expression
// and another (nested) array initializer.
initializer returns [String str]
  : e=expression         { $str = $e.str;  }  
  | ai=arrayInitializer  { $str = $ai.str; } 
  ;
  
// This is an initializer used to set up an array, e.g. int a[2] = {1,2};
arrayInitializer returns [String str]
  : ^(ARRAY_INITIALIZER 
  { $str = "{"; }
  (
    i=initializer   { if ($str.equals("{")) 
                          $str = $str + $i.str;  
                      else
                          $str = $str + ", " + $i.str; }
  )*
  { $str = $str + "}"; }
  )  
  
  ;

////////////////////////////////////
///////////// Structs //////////////
////////////////////////////////////

///The fields of a struct:
structMembersList returns [String str]
  : {$str = "";} 
  (structMember {$str += $structMember.str +";\n";})+  
  ;
  
///A single field of a struct  
structMember returns [String str]
  : typeSpec IDENT a=arrayBrackets  
      {
         if ($a.str.equals(""))   ///Initialize a non-array type (primitive or struct)
            $str = $typeSpec.str + " " + "_"+$IDENT.getText() /*+ " = " + defaultInitializer($typeSpec.str)*/;
      
         else {                   ///Initialize an array
            int numBrackets = $a.str.split("\\[").length - 1;
            $str = $typeSpec.str + " _" + $IDENT.getText();
            for (int i=0; i<numBrackets; i++)
              $str = $str + "[]";
        
            if ($a.fixedSize)
              $str = $str + " = new " + $typeSpec.str + $a.str;                
         }
      }
  ;

///Instantiating a variable for a struct that's already defined, e.g. struct a;
structUsage returns [String str]
  :  'struct' id=IDENT (LBRACK  RBRACK)*
      {  
      $str = "_"+$id.getText();
      }  
  ;

////////////////////////////////////
//////// Formal Parameters /////////
////////////////////////////////////


// A list of formal parameters
parameterDeclarationList returns [String str]
  : ( p1 = parameterDeclaration  { $str = $p1.str ; }
    ( COMMA p2 = parameterDeclaration { $str += ", " + $p2.str ;})* )?
  ;

// A single formal parameter.
parameterDeclaration returns [String str]
  : ^(PARAM_DECL typeSpec IDENT ab=arrayBrackets) 
      { 
        $str = $typeSpec.str + " " + "_"+$IDENT.getText() + $ab.str;
      }        
  ;  



////////////////////////////////////
/////////// Statements /////////////
////////////////////////////////////

///A new block starting: { statements... }
compoundStatement returns [String str]
 : ^(BLOCK_SCOPE {$str = "{\n";}
 
  (  statement  {$str += $statement.str; })*

  )  {$str += "}\n";}
 ;
 

///A single statement
statement returns [String str, boolean is_comp]
  @init { boolean defaultUsed = false; }
  : {$is_comp = false;}compoundStatement 
        {
        $str = $compoundStatement.str;
        $is_comp = true; 
        }
  | declaration       ///Declaring a new local var
                      {$str = $declaration.str + ";\n";}
  | ^(EXPRESSION expression)  {$str = $expression.str + ";\n";}
  | ^(IF e=expression ifStat=statement { 
                if($ifStat.is_comp)
                    $str = "if (" + $e.str + ")\n" + $ifStat.str;
                else
                    $str = "if (" + $e.str + ")\n{\n" + $ifStat.str +"}\n"; 
                }
        ( elseStat=statement { 
                if($elseStat.is_comp)
                    $str = $str + "else \n" + $elseStat.str; 
                else
                     $str = $str + "else \n{\n" + $elseStat.str + "}\n"; 
                } 
         )? 
        )

  | ^(FOR forInit forCond forIter s=statement)
          {
            $str = "for (" + $forInit.str + " ; " + $forCond.str + " ; " + $forIter.str + ")\n";
            if($s.is_comp) {
                $str = $str + "{\nif(false)break;\n" +$s.str.subSequence(2, $s.str.length());  
            }else {
                $str = $str + "{\nif(false)break;\n" +$s.str + "}\n";
            }
          }
  | ^(WHILE e=expression st=statement) 
          {
            if($st.is_comp) {
                $str = "while (" + $e.str + ")\n{\nif(false)break;\n" + 
                    $st.str.subSequence(2, $st.str.length());
            }else {
                $str = "while (" + $e.str + ")\n{\nif(false)break;\n" + $st.str +"}\n" ;
            }
          }
  | ^(DO st=statement e=expression)
          {
            if($st.is_comp) {
                $str = "do {\nif(false)break;\n" + 
                    $st.str.subSequence(2, $st.str.length()) + 
                    "while (" + $e.str + ");";
            }else{
                $str = "do {\nif(false)break;\n" + $st.str + "}\n" + "while (" + $e.str + ");";            
            }
          } 
  | BREAK    { $str = "if (true) break;\n"; }
  | CONTINUE { $str = "continue;\n"; }
  | RETURN { $str = "if (true) return _$;\n"; }
  | ^(SWITCH e=expression { $str = ""; } 
        (cg=casesGroup 
        {   
            if (!defaultUsed) {    ///Haven't used default yet, keep on translating
               if ($str.equals(""))
                    $str = $str + $cg.str.replaceAll("___replace___", $e.str); 
               else
                    $str = $str + $cg.str.replace("if (", "else if(").replaceAll("___replace___", $e.str); 
                    
               if (!$cg.str.contains("___replace___")) defaultUsed = true;  ///default used   
            }
        }
        )*)          
  | EMPTY { $str = ";"; }
  ;

///First part of for loop, e.g. for (x=0; ...)
forInit returns [String str]
  : ^(FOR_INIT declaration)     { $str = $declaration.str; }    
  | ^(FOR_INIT expressionList)  { $str = $expressionList.str; }
  | FOR_INIT  { $str = ""; }
  ;

///Second part of for loop, e.g. i<j
forCond returns [String str]
  : ^(FOR_CONDITION { $str = "";} (expression {$str=$expression.str;})?)     
  ;

///Third part of for loop, e.g. i++
forIter returns [String str]
  : ^(FOR_ITER { $str = "";} (expressionList{$str=$expressionList.str;})?)   
  ;

///The body of a switch statement
casesGroup returns [String str]
  @init { $str = ""; }
  :   (aCase 
      { 
          if ($aCase.str.equals("default"))  //translate default to else
              $str = $str + "\nelse\n";          
          else                                //translate case to if
              $str = $str + "\nif (___replace___ == " + $aCase.str + ")\n";         
      }
      )  { $str = $str + "{\n"; }
      
      (statement 
         { $str = $str + $statement.str; }     
      )* { $str = $str + "\n}";  }
  ;

///A single case in switch, e.g. case 5: x=7;
aCase returns [String str]
  : ^(CASE e=expression)  { $str = $e.str; }
  | DEFAULT               { $str = "default";}
  ;

////////////////////////////////////
////////// Expressions /////////////
////////////////////////////////////

///The root of an expression
expression returns [String str]
    :   ^(EXPR expr) { $str = $expr.str; }
    ;

// First stage - check the expr1/2/3 are matching in their types.
// Second stage - forward the type to $type (current types are not correctly true).
expr returns [String str]
    :   ^(ASSIGN expr1=expr expr2=expr)         { $str = $expr1.str + $ASSIGN.getText() + $expr2.str;   }
    |   ^(PLUS_ASSIGN expr1=expr expr2=expr)    { $str = $expr1.str + $PLUS_ASSIGN.getText() + $expr2.str;  }
    |   ^(MINUS_ASSIGN expr1=expr expr2=expr)   { $str = $expr1.str + $MINUS_ASSIGN.getText() + $expr2.str;   }
    |   ^(STAR_ASSIGN expr1=expr expr2=expr)    { $str = $expr1.str + $STAR_ASSIGN.getText() + $expr2.str;   }
    |   ^(DIV_ASSIGN expr1=expr expr2=expr)     { $str = $expr1.str + $DIV_ASSIGN.getText() + $expr2.str;   }
    |   ^(BAND_ASSIGN expr1=expr expr2=expr)    { $str = $expr1.str + $BAND_ASSIGN.getText() + $expr2.str;   }
    |   ^(BOR_ASSIGN expr1=expr expr2=expr)     { $str = $expr1.str + $BOR_ASSIGN.getText() + $expr2.str;   }
    |   ^(BXOR_ASSIGN expr1=expr expr2=expr)    { $str = $expr1.str + $BXOR_ASSIGN.getText() + $expr2.str;   }
    |   ^(MOD_ASSIGN expr1=expr expr2=expr)     { $str = $expr1.str + $MOD_ASSIGN.getText() + $expr2.str;   }
    |   ^(QUESTION e1=expr e2=expr COLON e=expr){ $str = $e1.str + " ? " + $e2.str + " : " + $e.str;   } 
    |   ^(LOR expr1=expr expr2=expr)            { $str = $expr1.str + $LOR.getText() + $expr2.str;   }
    |   ^(LAND expr1=expr expr2=expr)           { $str = $expr1.str + $LAND.getText() + $expr2.str;   }
    |   ^(BOR expr1=expr expr2=expr)            { $str = $expr1.str + $BOR.getText() + $expr2.str;   }
    |   ^(BXOR expr1=expr expr2=expr)           { $str = $expr1.str + $BXOR.getText() + $expr2.str;   }
    |   ^(BAND expr1=expr expr2=expr)           { $str = $expr1.str + $BAND.getText() + $expr2.str;   }
    |   ^(EQUAL expr1=expr expr2=expr)          { $str = $expr1.str + $EQUAL.getText() + $expr2.str;   }
    |   ^(NOT_EQUAL expr1=expr expr2=expr)      { $str = $expr1.str + $NOT_EQUAL.getText() + $expr2.str;   }
    |   ^(LE expr1=expr expr2=expr)             { $str = $expr1.str + $LE.getText() + $expr2.str;   }
    |   ^(GE expr1=expr expr2=expr)             { $str = $expr1.str + $GE.getText() + $expr2.str;   }
    |   ^(GT expr1=expr expr2=expr)             { $str = $expr1.str + $GT.getText() + $expr2.str;   }
    |   ^(LT expr1=expr expr2=expr)             { $str = $expr1.str + $LT.getText() + $expr2.str;   }
    |   ^(PLUS expr1=expr expr2=expr)           { $str = $expr1.str + $PLUS.getText() + $expr2.str;   }
    |   ^(MINUS expr1=expr expr2=expr)          { $str = $expr1.str + $MINUS.getText() + $expr2.str;   }
    |   ^(STAR expr1=expr expr2=expr)           { $str = $expr1.str + $STAR.getText() + $expr2.str;   }
    |   ^(DIV expr1=expr expr2=expr)            { $str = $expr1.str + $DIV.getText() + $expr2.str;   }
    |   ^(MOD expr1=expr expr2=expr)            { $str = $expr1.str + $MOD.getText() + $expr2.str;   }
    |   ^(UNARY_PLUS e=expr)                    { $str = "+" + $e.str;}
    |   ^(UNARY_MINUS e=expr)                   { $str = "-" + $e.str;}
    |   ^(PRE_INC e=expr)                       { $str = "--" + $e.str;}
    |   ^(PRE_DEC e=expr)                       { $str = "--" + $e.str;}
    |   ^(POST_INC e=expr)                      { $str = $e.str + "++";   }
    |   ^(POST_DEC e=expr)                      { $str = $e.str + "--";   }
    |   ^(NOT e=expr)                           { $str = "~" + $e.str;}
    |   ^(LOGICAL_NOT e=expr)                   { $str = "!" + $e.str;}
    |   primaryExpression                       { $str = $primaryExpression.str;  }
    ;

///The basis of an expression: e.g. 5, 7.0, a, a[4], max(), null, a.b    
primaryExpression returns [String str]
    : ^(METHOD_CALL id=IDENT argList)       ///Method call  
        { 
            $str = "_"+$id.getText() + "(" + $argList.str + ")";
        }               
    | ^(STRUCT_ACCESS structVar=primaryExpression structField=IDENT)   
        {
            $str = $structVar.str + "." + "_" + $structField.getText();
        }               
    | ^(ARRAY_ELEMENT_ACCESS var=primaryExpression idx=expression)  ///Accessing array   
        { 
            $str = $var.str + "[(int)(" + $idx.str + ")]"; 
        }
    | constant              { $str = $constant.str; }
    | 'true'                { $str = "true"; }
    | 'false'               { $str = "false"; }
    | 'null'                { $str = "null"; }
    | IDENT                 { $str = "_"+$IDENT.getText(); }
    | LPAREN e=expr RPAREN  { $str = "(" + $e.str + ")"; }
    ;    


///A list of expression
expressionList returns [String str]
  : e1=expression { $str = $e1.str; } (e2=expression { $str = $str + ", " + $e2.str; })*    
  ;

///A list of actual parameters when calling a function   
argList returns [String str]
  :  expressionList { $str = $expressionList.str; }
    | EMPTY { $str = ""; }
  ; 
    
constant returns [String str]
  : NUM_INT         { $str = $NUM_INT.getText(); }
  | CHAR_LITERAL    { $str = $CHAR_LITERAL.getText(); }
  | STRING_LITERAL  { $str = $STRING_LITERAL.getText(); } 
  | NUM_DOUBLE      { $str = $NUM_DOUBLE.getText(); } 
  ;    