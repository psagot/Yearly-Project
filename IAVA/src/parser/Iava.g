/** 
 * The official IAVA grammar file.
 * Defines the various IAVA rules and its legal syntax.
 */
 grammar Iava;
 
options {
    backtrack = true; 
    output = AST;
    ASTLabelType = CommonTree;
}

tokens {

	//Tokens added for the tree construction:
	START_PROG; FUNC_OR_VAR;FUNC_DECL;	VAR_DECL; STRUCT_DECL; PARAM_DECL; GLOBAL_STATEMENT;
	METHOD_CALL; IF; FOR; WHILE; DO; BREAK; CONTINUE; RETURN; SWITCH; EXPRESSION;
	ARRAY_ELEMENT_ACCESS; STRUCT_ACCESS; EMPTY; 	BLOCK_SCOPE; CASE; DEFAULT;
	FOR_INIT; FOR_CONDITION; FOR_ITER; ARRAY_INITIALIZER; ARRAY_TO_STRUCT; STRUCT_ACCESS;
	
	//Expressions tokens:
	EXPR; ASSIGN; PLUS_ASSIGN; MINUS_ASSIGN; STAR_ASSIGN; DIV_ASSIGN; MOD_ASSIGN;
	QUESTION; LOGICAL_OR; LOGICAL_AND; OR; XOR; AND; EQUAL; NOT_EQUAL; LESS_OR_EQUAL;
	GREATER_OR_EQUAL; GREATER_THAN; LESS_THAN; PLUS; MINUS; STAR; DIV; MOD;
	UNARY_PLUS; UNARY_MINUS; PRE_INC; PRE_DEC; POST_INC; POST_DEC; NOT; LOGICAL_NOT;
}

@header {
  package parser;
  import utils.ErrorReporter;
}
    
@lexer::header {
  package parser;
  import utils.ErrorReporter;
} 

@lexer::members {

    ErrorReporter er;
  
    void setErrorReporter(ErrorReporter _er) {
        er = _er;
    }
  
    public void enableErrorMessageCollection(boolean pNewState) {
        er.enableErrorMessageCollection(pNewState);
    }
 
    @Override   
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);

        if (msg.equals("mismatched character '<EOF>' expecting '\\n'"))
          return;
        er.displayRecognitionError(hdr, msg);
    }
  
    @Override
    public void emitErrorMessage(String pMessage) {
        er.emitErrorMessage(pMessage);
    }
  
    /**
     *  Returns collected error messages.
     */
    public List<String> getMessages() {
        return er.getMessages();
    }
    
    /**
     *  Tells if parsing a Iava source has caused any error messages.
     */
    public boolean hasErrors() {
        return er.hasErrors();
    }
}

@members {
    public static final CommonToken IGNORE_TOKEN = new CommonToken(null,0,99,0,0);
    
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
    
    @Override
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        er.displayRecognitionError(hdr, msg);
    }
    
    public List<String> getMessages() {
        return er.getMessages();
    }
    
    public boolean hasErrors() {
        return er.hasErrors();
    }   
}


// Compilation Unit:  This is the start rule for this parser
compilationUnit
	:	
		  {
	        System.out.println("Compilation started!"); 
	    }
	  //Allows definition of structs, variables (global) and functions:
		funcOrVar* -> ^(START_PROG funcOrVar*)
		|EOF
	;
	

// method or variable declaration
funcOrVar
  :    
     // A method declaration
      typeSpec // The method's return type 
      ( id=IDENT  // The method's name

        // parse the formal parameter declarations.
        LPAREN pd=parameterDeclarationList RPAREN

        // Method body: LCURLY statements... RCURLY
        cs=compoundStatement  
      ) 
      -> ^(FUNC_DECL typeSpec $id parameterDeclarationList? compoundStatement)

  | 'struct' IDENT LCURLY structMembersList RCURLY SEMI
    -> ^(STRUCT_DECL IDENT structMembersList) 
    
  | statement -> ^(GLOBAL_STATEMENT statement)
  ;

// A type specification is a type name with possible brackets afterwards
// (which would make it an array type).
typeSpec
  : structUsage         ///A struct type (defined by the user)
  | builtInTypeSpec     ///A primitive type
  ;

structUsage
  :  'struct' IDENT (LBRACK  RBRACK)*  
  ;
  
structMembersList
  : (structMember SEMI)+ -> (structMember)+
  ;
  
structMember
  : typeSpec IDENT arrayBrackets
  ;
  
// A builtin type specification is a builtin type with possible brackets
// afterwards (which would make it an array type).
builtInTypeSpec
	:	builtInType                    ///Primitive
	| builtInType (LBRACK RBRACK)+   ///Array
	;

// The primitive types.
builtInType
	:	'void'
	|	'boolean'
	|	'char'
	|	'integer'
	|	'real'
	| 'string'
	;

/** A declaration is the creation of a reference or primitive-type variable
 *  Create a separate Type/Var tree for each var in the var list.
 */
declaration
  : typeSpec variableDefinitions -> ^(VAR_DECL typeSpec variableDefinitions)
  ;

variableDefinitions
	:	variableDeclarator
		(	COMMA
			variableDeclarator
		)*
	;

// Declaration of a single variable.  This can be a struct/primitive variable,
// global or local. It can also include possible initialization.
variableDeclarator
	:	IDENT arrayBrackets varInitializer	
	;

arrayBrackets
	:	(LBRACK  RBRACK)*           ///int[] - When passing arrays to functions
	|	(LBRACK expression RBRACK)* ///int[5], int[N] - When declaring \ accessing arrays
	;

varInitializer
	:	( ASSIGN initializer )?
	;

// This is an initializer used to set up an array.
arrayInitializer
	:	LCURLY 
			(	initializer (COMMA initializer)* )?
		RCURLY
		->  ^(ARRAY_INITIALIZER[$LCURLY, "ARRAY_INITIALIZER"] initializer*)
	;


// Initialize a primitive variable or an array.
// The two 'things' that can initialize an array element are an expression
// and another (nested) array initializer.
initializer
	:	expression
	|	arrayInitializer
	;

// A list of formal parameters
parameterDeclarationList
	:	( parameterDeclaration ( COMMA parameterDeclaration )* )?
	;

// A formal parameter.
parameterDeclaration
	:	
	  typeSpec IDENT arrayBrackets? -> ^(PARAM_DECL typeSpec IDENT arrayBrackets?)
	;

////////////////////////////////////
/////////// Statements /////////////
////////////////////////////////////

compoundStatement
	:	LCURLY 
			// include the (possibly-empty) list of statements
			statement*
		RCURLY
		->  ^(BLOCK_SCOPE[$LCURLY, "BLOCK_SCOPE"] statement*)		
	;

statement
	// A list of statements in curly braces -- start a new scope
	:	compoundStatement

	// A variable declaration
	|	declaration SEMI!

	// An expression statement.  
	|	expression SEMI -> ^(EXPRESSION[$SEMI, "EXPRESSION"] expression)

	// If-else statement
	|	IF^ LPAREN! expression RPAREN! statement
		( 
		: ELSE! statement                                            
		)?		

	// For statement
	|	'for'
			LPAREN
				forInit SEMI   // initializer
				forCond	SEMI   // condition test
				forIter        // updater
			RPAREN
			statement        // statement to loop over
    ->  ^(FOR forInit forCond forIter statement) 

	// While statement
	|	'while' LPAREN expression RPAREN statement
	  ->  ^(WHILE expression statement) 

	// do-while statement
	|	'do' statement 'while' LPAREN expression RPAREN SEMI
    ->  ^(DO statement expression)
    
	// get out of a loop (or switch)
	|	'break' SEMI
    -> BREAK[$SEMI, "BREAK"]

	// do next iteration of a loop
	|	'continue'  SEMI
    -> CONTINUE[$SEMI, "CONTINUE"]
    
	// Return statement - exits the function
	|	'return' SEMI
    -> RETURN

	// switch/case statement
	|	'switch' LPAREN expression RPAREN LCURLY
			( casesGroup )*
		RCURLY
		-> ^(SWITCH expression (casesGroup)*)

	// empty statement
	|	SEMI -> EMPTY
	;

casesGroup
	:	(	options {k=1;}
			:
			aCase
		)
		statement*	
	;

aCase
	: 'case' expression COLON -> ^(CASE expression)
	| 'default' COLON -> DEFAULT
	;

// The initializer for a for loop
forInit
		: declaration    -> ^(FOR_INIT declaration)
		| expressionList -> ^(FOR_INIT expressionList)
		|                -> ^(FOR_INIT )
	;

forCond
	:	(expression)?    ->  ^(FOR_CONDITION expression?)
		
	;

forIter
	:	(expressionList)? ->  ^(FOR_ITER expressionList?)		
	;

////////////////////////////////////
////////// Expressions /////////////
////////////////////////////////////

// expressions
// Note that most of these expressions follow the pattern
//   thisLevelExpression :
//       nextHigherPrecedenceExpression
//           (OPERATOR nextHigherPrecedenceExpression)*
// which is a standard recursive definition for a parsing an expression.
// The operators in IAVA have the following precedences:
//    lowest  (13)  = *= /= %= += -= <<= >>= >>>= &= = |=
//            (12)  ?:
//            (11)  ||
//            (10)  &&
//            ( 9)  |
//            ( 8)  
//            ( 7)  &
//            ( 6)  == =
//            ( 5)  < <= > >=
//            ( 4)  << >>
//            ( 3)  +(binary) -(binary)
//            ( 2)  * / %
//            ( 1)  ++ -- +(unary) -(unary)  ~    (type)
//                  []   () (method call)  . (dot -- identifier qualification)

// the mother of all expressions
expression
	:	assignmentExpression
	  ->  ^(EXPR assignmentExpression)		
	;

// This is a list of expressions.
expressionList
	:	expression (COMMA! expression)*		
	;

// assignment expression (level 13)
assignmentExpression
	:	conditionalExpression
		(	(	ASSIGN^
            |   PLUS_ASSIGN^
            |   MINUS_ASSIGN^
            |   STAR_ASSIGN^
            |   DIV_ASSIGN^
            |   MOD_ASSIGN^
            |   SR_ASSIGN^
            |   BSR_ASSIGN^
            |   SL_ASSIGN^
            |   BAND_ASSIGN^
            |   BXOR_ASSIGN^
            |   BOR_ASSIGN^
            )
			assignmentExpression
		)?
	;

// conditional test (level 12)
conditionalExpression
	:	logicalOrExpression
		( QUESTION^ assignmentExpression COLON conditionalExpression )?
	;

// logical or (||)  (level 11)
logicalOrExpression
	:	logicalAndExpression (LOR^ logicalAndExpression)*
	;

// logical and (&&)  (level 10)
logicalAndExpression
	:	inclusiveOrExpression (LAND^ inclusiveOrExpression)*
	;

// bitwise or non-short-circuiting or (|)  (level 9)
inclusiveOrExpression
	:	exclusiveOrExpression (BOR^ exclusiveOrExpression)*
	;

// exclusive or ()  (level 8)
exclusiveOrExpression
	:	andExpression (BXOR^ andExpression)*
	;

// bitwise or non-short-circuiting and (&)  (level 7)
andExpression
	:	equalityExpression (BAND^ equalityExpression)*
	;

// equality/inequality (==/=) (level 6)
equalityExpression
	:	relationalExpression ((NOT_EQUAL | EQUAL)^ relationalExpression)*
	;

// boolean relational expressions (level 5)
relationalExpression
	:	shiftExpression
		(	(	(	LT
				|	GT
				|	LE
				|	GE
				)^
				shiftExpression
			)*
		)
	;

// bit shift expressions (level 4)
shiftExpression
	:	additiveExpression ((SL | SR | BSR)^ additiveExpression)*
	;

// binary addition/subtraction (level 3)
additiveExpression
	:	multiplicativeExpression ((PLUS | MINUS)^ multiplicativeExpression)*
	;

// multiplication/division/modulo (level 2)
multiplicativeExpression
	:	unaryExpression ((STAR | DIV | MOD )^ unaryExpression)*
	;

unaryExpression
	:	INC unaryExpression -> ^(PRE_INC[$INC, "PRE_INC"] unaryExpression)
	|	DEC unaryExpression -> ^(PRE_DEC[$DEC, "PRE_DEC"] unaryExpression)  
	|	MINUS  unaryExpression ->  ^(UNARY_MINUS[$MINUS, "UNARY_MINUS"] unaryExpression)
	|	PLUS   unaryExpression ->  ^(UNARY_PLUS[$PLUS, "UNARY_PLUS"] unaryExpression)
	|	unaryExpressionNotPlusMinus
	;

unaryExpressionNotPlusMinus
	:	BNOT unaryExpression       ->  ^(NOT unaryExpression)
	|	LNOT unaryExpression       ->  ^(LOGICAL_NOT unaryExpression)

  |	postfixExpression
	;

// qualified names, array expressions, method invocation, post inc/dec
postfixExpression
	: ( primaryExpression ->  primaryExpression )  ///Includes funcation call and struct access.
		(   DOT IDENT -> ^(STRUCT_ACCESS $postfixExpression IDENT)
      ///Array expression
		  | LBRACK  expression RBRACK ->  ^(ARRAY_ELEMENT_ACCESS $postfixExpression expression)
		)*
    
		(   // possibly add on a post-increment or post-decrement.
        // allows INC/DEC on too much, but semantics can check
			INC -> ^(POST_INC[$INC, "POST_INC"] $postfixExpression)
	 	|	DEC -> ^(POST_DEC[$DEC, "POST_DEC"] $postfixExpression)
		)?		
		
 	;

// the basic element of an expression
primaryExpression
	:	identPrimary 
	| IDENT
  | constant
	|	'true'
	|	'false'
	|	'null'
	|	LPAREN assignmentExpression RPAREN
	;

// Match a, a.b.c refs, a.b.c(...) refs, a.b.c[] etc.
identPrimary
	:	id=IDENT                

		(
				options {greedy=true;}
		:   ( LPAREN  argList RPAREN ) 
		)
		-> ^(METHOD_CALL $id argList)
    ;

argList
	:		expressionList
		|	/*nothing*/     -> EMPTY		
	;

constant
	:	NUM_INT
	|	CHAR_LITERAL
	|	STRING_LITERAL
	|	NUM_DOUBLE
	;

//----------------------------------------------------------------------------
// The Iava scanner
//----------------------------------------------------------------------------

// OPERATORS

QUESTION		:	'?'		;


LPAREN			:	'('		;


RPAREN			:	')'		;


LBRACK			:	'['		;


RBRACK			:	']'		;


LCURLY			:	'{'		;


RCURLY			:	'}'		;


COLON			:	':'		;


COMMA			:	','		;

DOT				:	'.'		;

ASSIGN			:	'='		;


EQUAL			:	'=='	;


LNOT			:	'!'		;


BNOT			:	'~'		;


NOT_EQUAL		:	'!='	;


DIV				:	'/'		;


DIV_ASSIGN		:	'/='	;


PLUS			:	'+'		;


PLUS_ASSIGN		:	'+='	;


INC				:	'++'	;


MINUS			:	'-'		;


MINUS_ASSIGN	:	'-='	;


DEC				:	'--'	;


STAR			:	'*'		;


STAR_ASSIGN		:	'*='	;


MOD				:	'%'		;


MOD_ASSIGN		:	'%='	;


SR				:	'>>'	;


SR_ASSIGN		:	'>>='	;


BSR				:	'>>>'	;


BSR_ASSIGN		:	'>>>='	;


GE				:	'>='	;


GT				:	'>'		;


SL				:	'<<'	;


SL_ASSIGN		:	'<<='	;


LE				:	'<='	;


LT				:	'<'		;


BXOR			:	'^'		;


BXOR_ASSIGN		:	'^='	;


BOR				:	'|'		;


BOR_ASSIGN		:	'|='	;


LOR				:	'||'	;


BAND			:	'&'		;


BAND_ASSIGN		:	'&='	;


LAND			:	'&&'	;


IF        : 'if'  ;


ELSE      : 'else'  ;


SEMI			:	';'		;


// Whitespace -- ignored
WS	:	(	' '
		|	'\t'
		|	'\f'
			// handle newlines
		|	(	'\r\n'  // Evil DOS
			|	'\n'    // Unix (the right way)
			)
		)+
		{ $channel=HIDDEN; }
	;

// Single-line comments
SL_COMMENT
	:	'//' (options {greedy=false;} : .)* ('\r')? '\n'
		{$channel=HIDDEN; }
	;

// multiple-line comments
ML_COMMENT
	:	'/*'
		( options {greedy=false;} : . )*
		'*/'
		{$channel=HIDDEN; }
	;

IDENT
	:	('a'..'z'|'A'..'Z'|'$') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'$')*
	;

// From the iava language spec
NUM_INT
    : DECIMAL_LITERAL 
    | HEX_LITERAL
    | OCTAL_LITERAL
    ;

fragment
DECIMAL_LITERAL: '1'..'9' ('0'..'9')* ('l'|'L')? ;

fragment
HEX_LITERAL: '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+ ('l'|'L')? ;

fragment
OCTAL_LITERAL: '0' ('0'..'7')* ('l'|'L')? ;

NUM_DOUBLE
    :     DIGITS '.' (DIGITS)?
    |     '.' DIGITS
    ;

fragment
DIGITS : ('0'..'9')+ ;

CHAR_LITERAL
    :
      '\''
      ( ~('\''|'\\')
      | ESCAPE_SEQUENCE
      )
      '\''
    ;

STRING_LITERAL
    :
      '\"'
      ( ~('\"'|'\\')
      | ESCAPE_SEQUENCE
      )*
      '\"'
        ;

fragment
ESCAPE_SEQUENCE
    :	'\\' 'b'
    |   '\\' 't'
    |   '\\' 'n'
    |   '\\' 'f'
    |   '\\' 'r'
    |   '\\' '\"'
    |   '\\' '\''
    |   '\\' '\\'
    |	'\\' '0'..'3' OCTAL_DIGIT OCTAL_DIGIT
    |   '\\' OCTAL_DIGIT OCTAL_DIGIT
    |   '\\' OCTAL_DIGIT
	|	UNICODE_CHAR
	;

fragment
UNICODE_CHAR
	:	'\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
	;

fragment
HEX_DIGIT
	:	'0'..'9'|'a'..'f'|'A'..'F'
	;

fragment
OCTAL_DIGIT
	:	'0'..'7'
	;
