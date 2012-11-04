// $ANTLR 3.4 C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g 2012-06-22 10:58:30

  package parser;
  import utils.FullType;
  import utils.FullType.Type;
  import utils.SymbolTable;
  import utils.FuncSymbolTable;
  import standardLib.StdLib;
  import java.util.ArrayList;
  import utils.ErrorReporter;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class IavaTreeWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARRAY_ELEMENT_ACCESS", "ARRAY_INITIALIZER", "ARRAY_TO_STRUCT", "ASSIGN", "BAND", "BAND_ASSIGN", "BLOCK_SCOPE", "BNOT", "BOR", "BOR_ASSIGN", "BREAK", "BSR", "BSR_ASSIGN", "BXOR", "BXOR_ASSIGN", "CASE", "CHAR_LITERAL", "COLON", "COMMA", "CONTINUE", "DEC", "DECIMAL_LITERAL", "DEFAULT", "DIGITS", "DIV", "DIV_ASSIGN", "DO", "DOT", "ELSE", "EMPTY", "EQUAL", "ESCAPE_SEQUENCE", "EXPR", "EXPRESSION", "FOR", "FOR_CONDITION", "FOR_INIT", "FOR_ITER", "FUNC_DECL", "FUNC_OR_VAR", "GE", "GLOBAL_STATEMENT", "GREATER_OR_EQUAL", "GREATER_THAN", "GT", "HEX_DIGIT", "HEX_LITERAL", "IDENT", "IF", "INC", "LAND", "LBRACK", "LCURLY", "LE", "LESS_OR_EQUAL", "LESS_THAN", "LNOT", "LOGICAL_AND", "LOGICAL_NOT", "LOGICAL_OR", "LOR", "LPAREN", "LT", "METHOD_CALL", "MINUS", "MINUS_ASSIGN", "ML_COMMENT", "MOD", "MOD_ASSIGN", "NOT", "NOT_EQUAL", "NUM_DOUBLE", "NUM_INT", "OCTAL_DIGIT", "OCTAL_LITERAL", "OR", "PARAM_DECL", "PLUS", "PLUS_ASSIGN", "POST_DEC", "POST_INC", "PRE_DEC", "PRE_INC", "QUESTION", "RBRACK", "RCURLY", "RETURN", "RPAREN", "SEMI", "SL", "SL_ASSIGN", "SL_COMMENT", "SR", "SR_ASSIGN", "STAR", "START_PROG", "STAR_ASSIGN", "STRING_LITERAL", "STRUCT_ACCESS", "STRUCT_DECL", "SWITCH", "UNARY_MINUS", "UNARY_PLUS", "UNICODE_CHAR", "VAR_DECL", "WHILE", "WS", "XOR", "'boolean'", "'break'", "'case'", "'char'", "'continue'", "'default'", "'do'", "'false'", "'for'", "'integer'", "'null'", "'real'", "'return'", "'string'", "'struct'", "'switch'", "'true'", "'void'", "'while'"
    };

    public static final int EOF=-1;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int AND=4;
    public static final int ARRAY_ELEMENT_ACCESS=5;
    public static final int ARRAY_INITIALIZER=6;
    public static final int ARRAY_TO_STRUCT=7;
    public static final int ASSIGN=8;
    public static final int BAND=9;
    public static final int BAND_ASSIGN=10;
    public static final int BLOCK_SCOPE=11;
    public static final int BNOT=12;
    public static final int BOR=13;
    public static final int BOR_ASSIGN=14;
    public static final int BREAK=15;
    public static final int BSR=16;
    public static final int BSR_ASSIGN=17;
    public static final int BXOR=18;
    public static final int BXOR_ASSIGN=19;
    public static final int CASE=20;
    public static final int CHAR_LITERAL=21;
    public static final int COLON=22;
    public static final int COMMA=23;
    public static final int CONTINUE=24;
    public static final int DEC=25;
    public static final int DECIMAL_LITERAL=26;
    public static final int DEFAULT=27;
    public static final int DIGITS=28;
    public static final int DIV=29;
    public static final int DIV_ASSIGN=30;
    public static final int DO=31;
    public static final int DOT=32;
    public static final int ELSE=33;
    public static final int EMPTY=34;
    public static final int EQUAL=35;
    public static final int ESCAPE_SEQUENCE=36;
    public static final int EXPR=37;
    public static final int EXPRESSION=38;
    public static final int FOR=39;
    public static final int FOR_CONDITION=40;
    public static final int FOR_INIT=41;
    public static final int FOR_ITER=42;
    public static final int FUNC_DECL=43;
    public static final int FUNC_OR_VAR=44;
    public static final int GE=45;
    public static final int GLOBAL_STATEMENT=46;
    public static final int GREATER_OR_EQUAL=47;
    public static final int GREATER_THAN=48;
    public static final int GT=49;
    public static final int HEX_DIGIT=50;
    public static final int HEX_LITERAL=51;
    public static final int IDENT=52;
    public static final int IF=53;
    public static final int INC=54;
    public static final int LAND=55;
    public static final int LBRACK=56;
    public static final int LCURLY=57;
    public static final int LE=58;
    public static final int LESS_OR_EQUAL=59;
    public static final int LESS_THAN=60;
    public static final int LNOT=61;
    public static final int LOGICAL_AND=62;
    public static final int LOGICAL_NOT=63;
    public static final int LOGICAL_OR=64;
    public static final int LOR=65;
    public static final int LPAREN=66;
    public static final int LT=67;
    public static final int METHOD_CALL=68;
    public static final int MINUS=69;
    public static final int MINUS_ASSIGN=70;
    public static final int ML_COMMENT=71;
    public static final int MOD=72;
    public static final int MOD_ASSIGN=73;
    public static final int NOT=74;
    public static final int NOT_EQUAL=75;
    public static final int NUM_DOUBLE=76;
    public static final int NUM_INT=77;
    public static final int OCTAL_DIGIT=78;
    public static final int OCTAL_LITERAL=79;
    public static final int OR=80;
    public static final int PARAM_DECL=81;
    public static final int PLUS=82;
    public static final int PLUS_ASSIGN=83;
    public static final int POST_DEC=84;
    public static final int POST_INC=85;
    public static final int PRE_DEC=86;
    public static final int PRE_INC=87;
    public static final int QUESTION=88;
    public static final int RBRACK=89;
    public static final int RCURLY=90;
    public static final int RETURN=91;
    public static final int RPAREN=92;
    public static final int SEMI=93;
    public static final int SL=94;
    public static final int SL_ASSIGN=95;
    public static final int SL_COMMENT=96;
    public static final int SR=97;
    public static final int SR_ASSIGN=98;
    public static final int STAR=99;
    public static final int START_PROG=100;
    public static final int STAR_ASSIGN=101;
    public static final int STRING_LITERAL=102;
    public static final int STRUCT_ACCESS=103;
    public static final int STRUCT_DECL=104;
    public static final int SWITCH=105;
    public static final int UNARY_MINUS=106;
    public static final int UNARY_PLUS=107;
    public static final int UNICODE_CHAR=108;
    public static final int VAR_DECL=109;
    public static final int WHILE=110;
    public static final int WS=111;
    public static final int XOR=112;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public IavaTreeWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public IavaTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[120+1];
         

    }

    public String[] getTokenNames() { return IavaTreeWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g"; }

      

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




    // $ANTLR start "compilationUnit"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:173:1: compilationUnit : ( ^( START_PROG ( funcOrVar )* ) | EOF );
    public final void compilationUnit() throws RecognitionException {
        int compilationUnit_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:174:5: ( ^( START_PROG ( funcOrVar )* ) | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==START_PROG) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:174:7: ^( START_PROG ( funcOrVar )* )
                    {
                    if ( state.backtracking==0 ) {
                            st.startFunc();
                            st.startBlock();
                          }

                    match(input,START_PROG,FOLLOW_START_PROG_in_compilationUnit103); if (state.failed) return ;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return ;
                        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:178:18: ( funcOrVar )*
                        loop1:
                        do {
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==FUNC_DECL||LA1_0==GLOBAL_STATEMENT||LA1_0==STRUCT_DECL) ) {
                                alt1=1;
                            }


                            switch (alt1) {
                        	case 1 :
                        	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:178:18: funcOrVar
                        	    {
                        	    pushFollow(FOLLOW_funcOrVar_in_compilationUnit105);
                        	    funcOrVar();

                        	    state._fsp--;
                        	    if (state.failed) return ;

                        	    }
                        	    break;

                        	default :
                        	    break loop1;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return ;
                    }


                    if ( state.backtracking==0 ) {
                            st.endBlock();
                            st.endFunc();
                            if (hasErrors())
                                System.out.println("Compilation ended with errors!"); 
                            else
                                System.out.println("Compilation ended successfully!"); 
                          }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:187:7: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_compilationUnit123); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "compilationUnit"



    // $ANTLR start "funcOrVar"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:191:1: funcOrVar : ( ^( FUNC_DECL typeSpec id= IDENT ( parameterDeclarationList )? compoundStatement ) | ^( STRUCT_DECL id= IDENT structMembersList ) | ^( GLOBAL_STATEMENT statement ) );
    public final void funcOrVar() throws RecognitionException {
        int funcOrVar_StartIndex = input.index();

        CommonTree id=null;
        CommonTree FUNC_DECL3=null;
        CommonTree STRUCT_DECL4=null;
        FullType typeSpec1 =null;

        ArrayList<NameType> parameterDeclarationList2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:192:5: ( ^( FUNC_DECL typeSpec id= IDENT ( parameterDeclarationList )? compoundStatement ) | ^( STRUCT_DECL id= IDENT structMembersList ) | ^( GLOBAL_STATEMENT statement ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case FUNC_DECL:
                {
                alt4=1;
                }
                break;
            case STRUCT_DECL:
                {
                alt4=2;
                }
                break;
            case GLOBAL_STATEMENT:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:192:7: ^( FUNC_DECL typeSpec id= IDENT ( parameterDeclarationList )? compoundStatement )
                    {
                    FUNC_DECL3=(CommonTree)match(input,FUNC_DECL,FOLLOW_FUNC_DECL_in_funcOrVar147); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_typeSpec_in_funcOrVar149);
                    typeSpec1=typeSpec();

                    state._fsp--;
                    if (state.failed) return ;

                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_funcOrVar153); if (state.failed) return ;

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:192:37: ( parameterDeclarationList )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==PARAM_DECL) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==BLOCK_SCOPE) ) {
                        int LA3_2 = input.LA(2);

                        if ( (synpred3_IavaTreeWalker()) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:192:37: parameterDeclarationList
                            {
                            pushFollow(FOLLOW_parameterDeclarationList_in_funcOrVar155);
                            parameterDeclarationList2=parameterDeclarationList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                              st.startFunc();
                              st.addLocalVar("$", typeSpec1);
                              // Add to st all the vars in parameterDeclarationList
                              for(NameType nameType : parameterDeclarationList2) {
                                if(nameType.type.getInnerType() == Type.VOID){
                                      newError(fileName,"Error: can't declare void type variable ",(FUNC_DECL3!=null?FUNC_DECL3.getLine():0),(FUNC_DECL3!=null?FUNC_DECL3.getCharPositionInLine():0));
                                      if(st.addLocalVar(nameType.name, new FullType(Type.ERROR)) != 0) 
                                        newError(fileName, st.getLastErrMsg(), (FUNC_DECL3!=null?FUNC_DECL3.getLine():0), (FUNC_DECL3!=null?FUNC_DECL3.getCharPositionInLine():0));
                                      
                                      continue;
                                }
                                
                                if(st.addLocalVar(nameType.name, nameType.type) != 0) {
                                   newError(fileName, st.getLastErrMsg(), (FUNC_DECL3!=null?FUNC_DECL3.getLine():0), (FUNC_DECL3!=null?FUNC_DECL3.getCharPositionInLine():0));
                                }
                              }
                            }

                    pushFollow(FOLLOW_compoundStatement_in_funcOrVar160);
                    compoundStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { 
                              st.endFunc();
                            }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:212:7: ^( STRUCT_DECL id= IDENT structMembersList )
                    {
                    STRUCT_DECL4=(CommonTree)match(input,STRUCT_DECL,FOLLOW_STRUCT_DECL_in_funcOrVar172); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_funcOrVar176); if (state.failed) return ;

                    if ( state.backtracking==0 ) {structVoid = false;}

                    pushFollow(FOLLOW_structMembersList_in_funcOrVar180);
                    structMembersList();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                if(structVoid){
                                    newError(fileName,"Error: can't use void type as struct member", (STRUCT_DECL4!=null?STRUCT_DECL4.getLine():0), (STRUCT_DECL4!=null?STRUCT_DECL4.getCharPositionInLine():0));
                                }
                            }

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:218:7: ^( GLOBAL_STATEMENT statement )
                    {
                    match(input,GLOBAL_STATEMENT,FOLLOW_GLOBAL_STATEMENT_in_funcOrVar197); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_funcOrVar199);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, funcOrVar_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "funcOrVar"



    // $ANTLR start "typeSpec"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:221:1: typeSpec returns [FullType type] : ( builtInType | builtInType ( LBRACK RBRACK )+ | structUsage );
    public final FullType typeSpec() throws RecognitionException {
        FullType type = null;

        int typeSpec_StartIndex = input.index();

        FullType builtInType5 =null;

        FullType builtInType6 =null;

        FullType structUsage7 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:222:5: ( builtInType | builtInType ( LBRACK RBRACK )+ | structUsage )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 130:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==IDENT) ) {
                    alt6=1;
                }
                else if ( (LA6_1==LBRACK) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case 113:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==IDENT) ) {
                    alt6=1;
                }
                else if ( (LA6_2==LBRACK) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case 116:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==IDENT) ) {
                    alt6=1;
                }
                else if ( (LA6_3==LBRACK) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;

                }
                }
                break;
            case 122:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==IDENT) ) {
                    alt6=1;
                }
                else if ( (LA6_4==LBRACK) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;

                }
                }
                break;
            case 124:
                {
                int LA6_5 = input.LA(2);

                if ( (LA6_5==IDENT) ) {
                    alt6=1;
                }
                else if ( (LA6_5==LBRACK) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;

                }
                }
                break;
            case 126:
                {
                int LA6_6 = input.LA(2);

                if ( (LA6_6==IDENT) ) {
                    alt6=1;
                }
                else if ( (LA6_6==LBRACK) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 6, input);

                    throw nvae;

                }
                }
                break;
            case 127:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:222:7: builtInType
                    {
                    pushFollow(FOLLOW_builtInType_in_typeSpec225);
                    builtInType5=builtInType();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = builtInType5; }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:223:7: builtInType ( LBRACK RBRACK )+
                    {
                    pushFollow(FOLLOW_builtInType_in_typeSpec235);
                    builtInType6=builtInType();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) {counter = 0;}

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:224:7: ( LBRACK RBRACK )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==LBRACK) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:224:8: LBRACK RBRACK
                    	    {
                    	    match(input,LBRACK,FOLLOW_LBRACK_in_typeSpec247); if (state.failed) return type;

                    	    match(input,RBRACK,FOLLOW_RBRACK_in_typeSpec250); if (state.failed) return type;

                    	    if ( state.backtracking==0 ) {
                    	                counter++;
                    	              }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return type;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    if ( state.backtracking==0 ) {
                                  type = new FullType(Type.ARRAY, builtInType6,counter);
                              }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:232:7: structUsage
                    {
                    pushFollow(FOLLOW_structUsage_in_typeSpec297);
                    structUsage7=structUsage();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = structUsage7; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, typeSpec_StartIndex); }

        }
        return type;
    }
    // $ANTLR end "typeSpec"



    // $ANTLR start "declaration"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:236:1: declaration : ^( VAR_DECL typeSpec variableDefinitions ) ;
    public final void declaration() throws RecognitionException {
        int declaration_StartIndex = input.index();

        CommonTree VAR_DECL10=null;
        ArrayList<NameType> variableDefinitions8 =null;

        FullType typeSpec9 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:237:3: ( ^( VAR_DECL typeSpec variableDefinitions ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:237:5: ^( VAR_DECL typeSpec variableDefinitions )
            {
            VAR_DECL10=(CommonTree)match(input,VAR_DECL,FOLLOW_VAR_DECL_in_declaration318); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_typeSpec_in_declaration320);
            typeSpec9=typeSpec();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_variableDefinitions_in_declaration322);
            variableDefinitions8=variableDefinitions();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==0 ) { 
                   for (NameType nameType : variableDefinitions8){
                      
                      if(typeSpec9.getInnerType() == Type.VOID)
                           newError(fileName,"Error: can't declare void type variable" ,(VAR_DECL10!=null?VAR_DECL10.getLine():0), (VAR_DECL10!=null?VAR_DECL10.getCharPositionInLine():0));
                      
                      if (nameType.type.getType() == Type.ARRAY && 
                          typeSpec9.getType() == Type.ARRAY && 
                          nameType.haveBrackets)
                           newError(fileName, "Error: The declaration of array " + nameType.name + " is invalid", (VAR_DECL10!=null?VAR_DECL10.getLine():0), (VAR_DECL10!=null?VAR_DECL10.getCharPositionInLine():0));
                           
                      if(nameType.type.getType() == Type.NULL && (typeSpec9.getType() == Type.ARRAY || typeSpec9.getType() == Type.STRUCT) )
                          nameType.type = typeSpec9;

                      if(nameType.type.getInnerType().equals(Type.UNSET)  && !typeSpec9.getType().equals(Type.ARRAY) ){
                           nameType.type.updateInnerType(typeSpec9.getInnerType(), typeSpec9.getStructName());
                      }
                      if(nameType.type.getInnerType().equals(Type.UNSET)  && typeSpec9.getType().equals(Type.ARRAY) ){
                           nameType.type = typeSpec9;
                      }
                      if(!typeSpec9.getType().equals(Type.ARRAY)){
                          if(!typeSpec9.getType().equals(nameType.type.getInnerType()) && !typeSpec9.getType().equals(Type.ERROR) && !nameType.type.getType().equals(Type.ERROR)){
                              newError(fileName, "Error: The difinition type (on the left) doesn't match the initialization type", (VAR_DECL10!=null?VAR_DECL10.getLine():0), (VAR_DECL10!=null?VAR_DECL10.getCharPositionInLine():0));
                              nameType.type = new FullType(Type.ERROR);
                          }
                          if(nameType.needBrackets)
                               newError(fileName,"Error: array initialization should have array brackets ",
                                (VAR_DECL10!=null?VAR_DECL10.getLine():0),(VAR_DECL10!=null?VAR_DECL10.getCharPositionInLine():0));
                      }
                      else{
            		          if(!typeSpec9.equals(nameType.type) && !typeSpec9.getType().equals(Type.ERROR) && !nameType.type.getType().equals(Type.ERROR)){
            		              newError(fileName, "Error: The difinition type(on the left) doesn't match the initialization type", (VAR_DECL10!=null?VAR_DECL10.getLine():0), (VAR_DECL10!=null?VAR_DECL10.getCharPositionInLine():0));
            		              nameType.type = new FullType(Type.ERROR);
            		          }
            		          nameType.type.updateInnerType(typeSpec9.getInnerType(), typeSpec9.getStructName());
            		      }
                      if (st.addLocalVar(nameType.name, nameType.type) == -1 ) {// Add as local var to symtab.
                         newError(fileName, st.getLastErrMsg(), (VAR_DECL10!=null?VAR_DECL10.getLine():0), (VAR_DECL10!=null?VAR_DECL10.getCharPositionInLine():0));
                      }
                  }
                 }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, declaration_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "builtInType"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:282:1: builtInType returns [FullType type] : ( 'void' | 'boolean' | 'char' | 'integer' | 'real' | 'string' );
    public final FullType builtInType() throws RecognitionException {
        FullType type = null;

        int builtInType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:283:3: ( 'void' | 'boolean' | 'char' | 'integer' | 'real' | 'string' )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt7=1;
                }
                break;
            case 113:
                {
                alt7=2;
                }
                break;
            case 116:
                {
                alt7=3;
                }
                break;
            case 122:
                {
                alt7=4;
                }
                break;
            case 124:
                {
                alt7=5;
                }
                break;
            case 126:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:283:5: 'void'
                    {
                    match(input,130,FOLLOW_130_in_builtInType353); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.VOID); }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:284:5: 'boolean'
                    {
                    match(input,113,FOLLOW_113_in_builtInType364); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.BOOLEAN); }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:285:5: 'char'
                    {
                    match(input,116,FOLLOW_116_in_builtInType372); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.CHAR); }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:286:5: 'integer'
                    {
                    match(input,122,FOLLOW_122_in_builtInType383); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.INTEGER); }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:287:5: 'real'
                    {
                    match(input,124,FOLLOW_124_in_builtInType392); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.REAL); }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:288:5: 'string'
                    {
                    match(input,126,FOLLOW_126_in_builtInType403); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.STRING); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, builtInType_StartIndex); }

        }
        return type;
    }
    // $ANTLR end "builtInType"


    public static class arrayBrackets_return extends TreeRuleReturnScope {
        public boolean used;
        public int dimension;
        public boolean fixedSize;
    };


    // $ANTLR start "arrayBrackets"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:294:1: arrayBrackets returns [boolean used, int dimension, boolean fixedSize] : ( ( LBRACK RBRACK )* | ( LBRACK expression RBRACK )* );
    public final IavaTreeWalker.arrayBrackets_return arrayBrackets() throws RecognitionException {
        IavaTreeWalker.arrayBrackets_return retval = new IavaTreeWalker.arrayBrackets_return();
        retval.start = input.LT(1);

        int arrayBrackets_StartIndex = input.index();

        CommonTree LBRACK12=null;
        IavaTreeWalker.expression_return expression11 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:295:3: ( ( LBRACK RBRACK )* | ( LBRACK expression RBRACK )* )
            int alt10=2;
            switch ( input.LA(1) ) {
            case LBRACK:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RBRACK) ) {
                    alt10=1;
                }
                else if ( (LA10_1==EXPR) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
                }
                break;
            case ASSIGN:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred15_IavaTreeWalker()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }
                }
                break;
            case COMMA:
                {
                int LA10_3 = input.LA(2);

                if ( (synpred15_IavaTreeWalker()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;

                }
                }
                break;
            case UP:
                {
                int LA10_4 = input.LA(2);

                if ( (synpred15_IavaTreeWalker()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;

                }
                }
                break;
            case EOF:
                {
                int LA10_5 = input.LA(2);

                if ( (synpred15_IavaTreeWalker()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 5, input);

                    throw nvae;

                }
                }
                break;
            case 130:
                {
                int LA10_6 = input.LA(2);

                if ( (synpred15_IavaTreeWalker()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 6, input);

                    throw nvae;

                }
                }
                break;
            case 113:
                {
                int LA10_7 = input.LA(2);

                if ( (synpred15_IavaTreeWalker()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 7, input);

                    throw nvae;

                }
                }
                break;
            case 116:
                {
                int LA10_8 = input.LA(2);

                if ( (synpred15_IavaTreeWalker()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 8, input);

                    throw nvae;

                }
                }
                break;
            case 122:
                {
                int LA10_9 = input.LA(2);

                if ( (synpred15_IavaTreeWalker()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 9, input);

                    throw nvae;

                }
                }
                break;
            case 124:
                {
                int LA10_10 = input.LA(2);

                if ( (synpred15_IavaTreeWalker()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 10, input);

                    throw nvae;

                }
                }
                break;
            case 126:
                {
                int LA10_11 = input.LA(2);

                if ( (synpred15_IavaTreeWalker()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 11, input);

                    throw nvae;

                }
                }
                break;
            case 127:
                {
                int LA10_12 = input.LA(2);

                if ( (synpred15_IavaTreeWalker()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 12, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:295:5: ( LBRACK RBRACK )*
                    {
                    if ( state.backtracking==0 ) {retval.used = false; retval.dimension =0;}

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:296:5: ( LBRACK RBRACK )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==LBRACK) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:296:6: LBRACK RBRACK
                    	    {
                    	    match(input,LBRACK,FOLLOW_LBRACK_in_arrayBrackets436); if (state.failed) return retval;

                    	    match(input,RBRACK,FOLLOW_RBRACK_in_arrayBrackets439); if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) {retval.used = true; retval.dimension =retval.dimension+1; retval.fixedSize =false; }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:299:5: ( LBRACK expression RBRACK )*
                    {
                    if ( state.backtracking==0 ) {retval.used = false; retval.dimension =0;}

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:300:5: ( LBRACK expression RBRACK )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==LBRACK) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:300:6: LBRACK expression RBRACK
                    	    {
                    	    LBRACK12=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_arrayBrackets481); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_arrayBrackets483);
                    	    expression11=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    match(input,RBRACK,FOLLOW_RBRACK_in_arrayBrackets485); if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) {
                    	    		    if(!(expression11!=null?expression11.type:null).equals(new FullType(Type.INTEGER))){
                    	    		       newError(fileName,"Error: array index should be integer ",(LBRACK12!=null?LBRACK12.getLine():0),(LBRACK12!=null?LBRACK12.getCharPositionInLine():0));
                    	    		    }
                    	    		    retval.used = true;
                    	    		    retval.fixedSize = true;
                    	    		    retval.dimension++;
                    	    		  }

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, arrayBrackets_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayBrackets"



    // $ANTLR start "variableDefinitions"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:313:1: variableDefinitions returns [ArrayList<NameType> nametypes] : var1= variableDeclarator ( COMMA var2= variableDeclarator )* ;
    public final ArrayList<NameType> variableDefinitions() throws RecognitionException {
        ArrayList<NameType> nametypes = null;

        int variableDefinitions_StartIndex = input.index();

        IavaTreeWalker.variableDeclarator_return var1 =null;

        IavaTreeWalker.variableDeclarator_return var2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return nametypes; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:314:3: (var1= variableDeclarator ( COMMA var2= variableDeclarator )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:314:5: var1= variableDeclarator ( COMMA var2= variableDeclarator )*
            {
            pushFollow(FOLLOW_variableDeclarator_in_variableDefinitions520);
            var1=variableDeclarator();

            state._fsp--;
            if (state.failed) return nametypes;

            if ( state.backtracking==0 ) { 
                    nametypes = new ArrayList<NameType>();
                    NameType nt;
                    if((var1!=null?var1.needBrackets:false))
                        nt = new NameType((var1!=null?var1.name:null), (var1!=null?var1.type:null), true);
                    else 
                        nt = new NameType((var1!=null?var1.name:null),(var1!=null?var1.type:null));
                    nt.setBrackets((var1!=null?var1.haveBrackets:false));
                    nametypes.add(nt);
                  }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:325:5: ( COMMA var2= variableDeclarator )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:325:7: COMMA var2= variableDeclarator
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_variableDefinitions537); if (state.failed) return nametypes;

            	    pushFollow(FOLLOW_variableDeclarator_in_variableDefinitions547);
            	    var2=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return nametypes;

            	    if ( state.backtracking==0 ) { 
            	            NameType nt;
            	            if((var2!=null?var2.needBrackets:false))
            	                nt = new NameType((var2!=null?var2.name:null), (var2!=null?var2.type:null), true);
            	            else
            	                nt = new NameType((var2!=null?var2.name:null),(var2!=null?var2.type:null));
            	            nt.setBrackets((var2!=null?var2.haveBrackets:false));
            	            nametypes.add(nt);
            	          }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, variableDefinitions_StartIndex); }

        }
        return nametypes;
    }
    // $ANTLR end "variableDefinitions"


    public static class variableDeclarator_return extends TreeRuleReturnScope {
        public String name;
        public FullType type;
        public boolean needBrackets;
        public boolean haveBrackets;
    };


    // $ANTLR start "variableDeclarator"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:340:1: variableDeclarator returns [String name,FullType type,boolean needBrackets, boolean haveBrackets] : IDENT a= arrayBrackets varInitializer ;
    public final IavaTreeWalker.variableDeclarator_return variableDeclarator() throws RecognitionException {
        IavaTreeWalker.variableDeclarator_return retval = new IavaTreeWalker.variableDeclarator_return();
        retval.start = input.LT(1);

        int variableDeclarator_StartIndex = input.index();

        CommonTree IDENT13=null;
        IavaTreeWalker.arrayBrackets_return a =null;

        IavaTreeWalker.varInitializer_return varInitializer14 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:341:3: ( IDENT a= arrayBrackets varInitializer )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:341:5: IDENT a= arrayBrackets varInitializer
            {
            IDENT13=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variableDeclarator584); if (state.failed) return retval;

            pushFollow(FOLLOW_arrayBrackets_in_variableDeclarator588);
            a=arrayBrackets();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_varInitializer_in_variableDeclarator590);
            varInitializer14=varInitializer();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { 
                  retval.haveBrackets = (a!=null?a.used:false);      
                  retval.needBrackets = false;
                  retval.name = IDENT13.getText(); 
                  if((a!=null?a.used:false)) {     
                      if((varInitializer14!=null?varInitializer14.used:false) && (varInitializer14!=null?varInitializer14.type:null).getType() != Type.NULL) {        
                          if((a!=null?a.dimension:0) != (varInitializer14!=null?varInitializer14.dimension:0))
                              newError(fileName,"Error: dimension brackets don't match the initialization ", 
                                       (IDENT13!=null?IDENT13.getLine():0),(IDENT13!=null?IDENT13.getCharPositionInLine():0));
                                
                          retval.type = (varInitializer14!=null?varInitializer14.type:null);
                              
                          if((a!=null?a.fixedSize:false))
                              newError(fileName,"Error: cannot initialize fixed size array ", 
                                       (IDENT13!=null?IDENT13.getLine():0),(IDENT13!=null?IDENT13.getCharPositionInLine():0)); 
                      }
                      else{
                        retval.type = new FullType(Type.ARRAY,new FullType (Type.UNSET),(a!=null?a.dimension:0));
                      }
                  }
                  else {
                     if((varInitializer14!=null?varInitializer14.used:false)) {
                         if((varInitializer14!=null?varInitializer14.dimension:0) > 0)
                             retval.needBrackets = true;

                         retval.type = (varInitializer14!=null?varInitializer14.type:null);
                     }
                     else {
                         retval.type = new FullType(Type.UNSET);
                     }
                  }
               }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, variableDeclarator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"


    public static class varInitializer_return extends TreeRuleReturnScope {
        public FullType type;
        public boolean used;
        public int dimension;
    };


    // $ANTLR start "varInitializer"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:377:1: varInitializer returns [FullType type, boolean used, int dimension] : ( ASSIGN i= initializer )? ;
    public final IavaTreeWalker.varInitializer_return varInitializer() throws RecognitionException {
        IavaTreeWalker.varInitializer_return retval = new IavaTreeWalker.varInitializer_return();
        retval.start = input.LT(1);

        int varInitializer_StartIndex = input.index();

        CommonTree ASSIGN15=null;
        IavaTreeWalker.initializer_return i =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:378:3: ( ( ASSIGN i= initializer )? )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:378:7: ( ASSIGN i= initializer )?
            {
            if ( state.backtracking==0 ) {
                    retval.used = false;
                    arrInitCurrNesting = 0;
                    arrInitPrevNesting = 0;
                    dimError=false;
                    differentTypeError = false;
                    prevType = new FullType(Type.UNSET);
                  }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:386:4: ( ASSIGN i= initializer )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ASSIGN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:386:6: ASSIGN i= initializer
                    {
                    ASSIGN15=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_varInitializer631); if (state.failed) return retval;

                    pushFollow(FOLLOW_initializer_in_varInitializer635);
                    i=initializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.used = true;}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                    if(dimError){
                        newError(fileName,"Error: Not all the initializers are in the same dimension ",
                                (ASSIGN15!=null?ASSIGN15.getLine():0),(ASSIGN15!=null?ASSIGN15.getCharPositionInLine():0));
                    }
               
                    retval.dimension = (i!=null?i.dimension:0);
                    retval.type = (i!=null?i.type:null);
                  }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, varInitializer_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varInitializer"


    public static class initializer_return extends TreeRuleReturnScope {
        public FullType type;
        public int dimension;
    };


    // $ANTLR start "initializer"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:401:1: initializer returns [FullType type,int dimension] : ( expression | arrayInitializer );
    public final IavaTreeWalker.initializer_return initializer() throws RecognitionException {
        IavaTreeWalker.initializer_return retval = new IavaTreeWalker.initializer_return();
        retval.start = input.LT(1);

        int initializer_StartIndex = input.index();

        IavaTreeWalker.expression_return expression16 =null;

        IavaTreeWalker.arrayInitializer_return arrayInitializer17 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:402:3: ( expression | arrayInitializer )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EXPR) ) {
                alt13=1;
            }
            else if ( (LA13_0==ARRAY_INITIALIZER) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:402:5: expression
                    {
                    pushFollow(FOLLOW_expression_in_initializer669);
                    expression16=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                              if (arrInitCurrNesting > 0) {
                                 if(arrInitPrevNesting >0){
                                     if(arrInitCurrNesting != arrInitPrevNesting){
                                        dimError = true;
                                     }
                                 }
                                 retval.type = new FullType(Type.ARRAY,(expression16!=null?expression16.type:null),arrInitCurrNesting);
                                 retval.dimension = arrInitCurrNesting;
                                 arrInitPrevNesting = arrInitCurrNesting;
                              }
                              else {
                                 retval.dimension = 0; 
                                 retval.type = (expression16!=null?expression16.type:null);
                                 if((expression16!=null?expression16.type:null).getType().equals(Type.ARRAY)) {
                                     FullType t = (expression16!=null?expression16.type:null);
                                     while(t.getArrayType() != null) {
                                        retval.dimension++;
                                        t = t.getArrayType();    
                                    }
                                 } 
                             }
                          }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:427:6: arrayInitializer
                    {
                    if ( state.backtracking==0 ) {
                    	        ++arrInitCurrNesting;
                    	    }

                    pushFollow(FOLLOW_arrayInitializer_in_initializer716);
                    arrayInitializer17=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                              --arrInitCurrNesting;
                              retval.dimension = (arrayInitializer17!=null?arrayInitializer17.dimension:0);
                              retval.type = (arrayInitializer17!=null?arrayInitializer17.type:null);
                          
                          }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, initializer_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initializer"


    public static class arrayInitializer_return extends TreeRuleReturnScope {
        public FullType type;
        public int dimension;
    };


    // $ANTLR start "arrayInitializer"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:441:1: arrayInitializer returns [FullType type,int dimension] : ^( ARRAY_INITIALIZER ( initializer )* ) ;
    public final IavaTreeWalker.arrayInitializer_return arrayInitializer() throws RecognitionException {
        IavaTreeWalker.arrayInitializer_return retval = new IavaTreeWalker.arrayInitializer_return();
        retval.start = input.LT(1);

        int arrayInitializer_StartIndex = input.index();

        CommonTree ARRAY_INITIALIZER19=null;
        IavaTreeWalker.initializer_return initializer18 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:442:3: ( ^( ARRAY_INITIALIZER ( initializer )* ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:442:5: ^( ARRAY_INITIALIZER ( initializer )* )
            {
            ARRAY_INITIALIZER19=(CommonTree)match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer749); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:443:5: ( initializer )*
                loop14:
                do {
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ARRAY_INITIALIZER||LA14_0==EXPR) ) {
                        alt14=1;
                    }


                    switch (alt14) {
                	case 1 :
                	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:443:7: initializer
                	    {
                	    pushFollow(FOLLOW_initializer_in_arrayInitializer758);
                	    initializer18=initializer();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    if ( state.backtracking==0 ) {
                	    		      if(!prevType.getType().equals(Type.UNSET)){
                	    		        if(!(initializer18!=null?initializer18.type:null).getInnerType().equals(prevType.getInnerType())){
                	    		           if(!differentTypeError)
                	    				           newError(fileName,"Error: Not all the initializers are in the same type ",
                	    				                    (ARRAY_INITIALIZER19!=null?ARRAY_INITIALIZER19.getLine():0),(ARRAY_INITIALIZER19!=null?ARRAY_INITIALIZER19.getCharPositionInLine():0));
                	    		           differentTypeError = true;
                	    		                    
                	    		        }
                	    		      }
                	    		      prevType =  (initializer18!=null?initializer18.type:null);
                	    		      retval.dimension = (initializer18!=null?initializer18.dimension:0);
                	    		    }

                	    }
                	    break;

                	default :
                	    break loop14;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }


            if ( state.backtracking==0 ) { retval.type = prevType; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, arrayInitializer_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayInitializer"



    // $ANTLR start "structMembersList"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:467:1: structMembersList returns [ArrayList<NameType> nametypes] : ( structMember )+ ;
    public final ArrayList<NameType> structMembersList() throws RecognitionException {
        ArrayList<NameType> nametypes = null;

        int structMembersList_StartIndex = input.index();

        IavaTreeWalker.structMember_return structMember20 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return nametypes; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:468:3: ( ( structMember )+ )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:468:5: ( structMember )+
            {
            if ( state.backtracking==0 ) {nametypes = new ArrayList<NameType>();}

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:469:5: ( structMember )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==113||LA15_0==116||LA15_0==122||LA15_0==124||(LA15_0 >= 126 && LA15_0 <= 127)||LA15_0==130) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:469:6: structMember
            	    {
            	    pushFollow(FOLLOW_structMember_in_structMembersList822);
            	    structMember20=structMember();

            	    state._fsp--;
            	    if (state.failed) return nametypes;

            	    if ( state.backtracking==0 ) {
            	            if((structMember20!=null?structMember20.type:null).getInnerType() == Type.VOID) {
            	                nametypes.add(new NameType((structMember20!=null?structMember20.name:null), new FullType(Type.ERROR)));
            	                structVoid = true;
            	            }
            	            else
            	                nametypes.add(new NameType((structMember20!=null?structMember20.name:null), (structMember20!=null?structMember20.type:null)));
            	          }

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return nametypes;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, structMembersList_StartIndex); }

        }
        return nametypes;
    }
    // $ANTLR end "structMembersList"


    public static class structMember_return extends TreeRuleReturnScope {
        public String name;
        public FullType type;
    };


    // $ANTLR start "structMember"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:482:1: structMember returns [String name,FullType type] : typeSpec IDENT arrayBrackets ;
    public final IavaTreeWalker.structMember_return structMember() throws RecognitionException {
        IavaTreeWalker.structMember_return retval = new IavaTreeWalker.structMember_return();
        retval.start = input.LT(1);

        int structMember_StartIndex = input.index();

        CommonTree IDENT22=null;
        FullType typeSpec21 =null;

        IavaTreeWalker.arrayBrackets_return arrayBrackets23 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:483:3: ( typeSpec IDENT arrayBrackets )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:483:5: typeSpec IDENT arrayBrackets
            {
            pushFollow(FOLLOW_typeSpec_in_structMember860);
            typeSpec21=typeSpec();

            state._fsp--;
            if (state.failed) return retval;

            IDENT22=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_structMember862); if (state.failed) return retval;

            pushFollow(FOLLOW_arrayBrackets_in_structMember864);
            arrayBrackets23=arrayBrackets();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                  retval.type = typeSpec21;
                  retval.name = IDENT22.getText();
                  if ((arrayBrackets23!=null?arrayBrackets23.used:false)) {
                      retval.type = new FullType(Type.ARRAY, typeSpec21);
                  }
                }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, structMember_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "structMember"



    // $ANTLR start "structUsage"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:494:1: structUsage returns [FullType type] : 'struct' id= IDENT ( LBRACK RBRACK )* ;
    public final FullType structUsage() throws RecognitionException {
        FullType type = null;

        int structUsage_StartIndex = input.index();

        CommonTree id=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:495:3: ( 'struct' id= IDENT ( LBRACK RBRACK )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:495:6: 'struct' id= IDENT ( LBRACK RBRACK )*
            {
            match(input,127,FOLLOW_127_in_structUsage893); if (state.failed) return type;

            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_structUsage897); if (state.failed) return type;

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:495:24: ( LBRACK RBRACK )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LBRACK) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:495:25: LBRACK RBRACK
            	    {
            	    match(input,LBRACK,FOLLOW_LBRACK_in_structUsage900); if (state.failed) return type;

            	    match(input,RBRACK,FOLLOW_RBRACK_in_structUsage903); if (state.failed) return type;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            if ( state.backtracking==0 ) { type = new FullType(Type.STRUCT, id.getText()); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, structUsage_StartIndex); }

        }
        return type;
    }
    // $ANTLR end "structUsage"



    // $ANTLR start "parameterDeclarationList"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:505:1: parameterDeclarationList returns [ArrayList<NameType> nametypes] : (p1= parameterDeclaration ( COMMA p2= parameterDeclaration )* )? ;
    public final ArrayList<NameType> parameterDeclarationList() throws RecognitionException {
        ArrayList<NameType> nametypes = null;

        int parameterDeclarationList_StartIndex = input.index();

        IavaTreeWalker.parameterDeclaration_return p1 =null;

        IavaTreeWalker.parameterDeclaration_return p2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return nametypes; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:506:3: ( (p1= parameterDeclaration ( COMMA p2= parameterDeclaration )* )? )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:506:9: (p1= parameterDeclaration ( COMMA p2= parameterDeclaration )* )?
            {
            if ( state.backtracking==0 ) {nametypes = new ArrayList<NameType>();}

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:507:5: (p1= parameterDeclaration ( COMMA p2= parameterDeclaration )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==PARAM_DECL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:507:7: p1= parameterDeclaration ( COMMA p2= parameterDeclaration )*
                    {
                    pushFollow(FOLLOW_parameterDeclaration_in_parameterDeclarationList954);
                    p1=parameterDeclaration();

                    state._fsp--;
                    if (state.failed) return nametypes;

                    if ( state.backtracking==0 ) { 
                              nametypes.add(new NameType((p1!=null?p1.name:null), (p1!=null?p1.type:null)));
                            }

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:511:5: ( COMMA p2= parameterDeclaration )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:511:7: COMMA p2= parameterDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_parameterDeclarationList974); if (state.failed) return nametypes;

                    	    pushFollow(FOLLOW_parameterDeclaration_in_parameterDeclarationList980);
                    	    p2=parameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return nametypes;

                    	    if ( state.backtracking==0 ) {
                    	              nametypes.add(new NameType((p2!=null?p2.name:null), (p2!=null?p2.type:null)));
                    	            }

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parameterDeclarationList_StartIndex); }

        }
        return nametypes;
    }
    // $ANTLR end "parameterDeclarationList"


    public static class parameterDeclaration_return extends TreeRuleReturnScope {
        public String name;
        public FullType type;
    };


    // $ANTLR start "parameterDeclaration"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:520:1: parameterDeclaration returns [String name,FullType type] : ^( PARAM_DECL typeSpec IDENT arrayBrackets ) ;
    public final IavaTreeWalker.parameterDeclaration_return parameterDeclaration() throws RecognitionException {
        IavaTreeWalker.parameterDeclaration_return retval = new IavaTreeWalker.parameterDeclaration_return();
        retval.start = input.LT(1);

        int parameterDeclaration_StartIndex = input.index();

        CommonTree IDENT25=null;
        CommonTree PARAM_DECL27=null;
        FullType typeSpec24 =null;

        IavaTreeWalker.arrayBrackets_return arrayBrackets26 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:521:3: ( ^( PARAM_DECL typeSpec IDENT arrayBrackets ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:521:5: ^( PARAM_DECL typeSpec IDENT arrayBrackets )
            {
            PARAM_DECL27=(CommonTree)match(input,PARAM_DECL,FOLLOW_PARAM_DECL_in_parameterDeclaration1025); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_typeSpec_in_parameterDeclaration1027);
            typeSpec24=typeSpec();

            state._fsp--;
            if (state.failed) return retval;

            IDENT25=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_parameterDeclaration1029); if (state.failed) return retval;

            pushFollow(FOLLOW_arrayBrackets_in_parameterDeclaration1031);
            arrayBrackets26=arrayBrackets();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            if ( state.backtracking==0 ) { 
                    retval.type = typeSpec24;
                    retval.name = IDENT25.getText();
                    if ((arrayBrackets26!=null?arrayBrackets26.used:false)) {
                      retval.type = new FullType(Type.ARRAY, retval.type, (arrayBrackets26!=null?arrayBrackets26.dimension:0));
                    }
                    
                    if ((arrayBrackets26!=null?arrayBrackets26.used:false) && typeSpec24.getType() == Type.ARRAY)
                      newError(fileName, "Error: The declaration of array " + IDENT25.getText() + 
                               " is invalid", (PARAM_DECL27!=null?PARAM_DECL27.getLine():0), (PARAM_DECL27!=null?PARAM_DECL27.getCharPositionInLine():0));
                  }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parameterDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parameterDeclaration"



    // $ANTLR start "compoundStatement"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:543:1: compoundStatement : ^( BLOCK_SCOPE ( statement )* ) ;
    public final void compoundStatement() throws RecognitionException {
        int compoundStatement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:544:2: ( ^( BLOCK_SCOPE ( statement )* ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:544:4: ^( BLOCK_SCOPE ( statement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_compoundStatement1076); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:545:3: ( statement )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==BLOCK_SCOPE||LA19_0==BREAK||LA19_0==CONTINUE||LA19_0==DO||LA19_0==EMPTY||(LA19_0 >= EXPRESSION && LA19_0 <= FOR)||LA19_0==IF||LA19_0==RETURN||LA19_0==SWITCH||(LA19_0 >= VAR_DECL && LA19_0 <= WHILE)) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:545:4: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_compoundStatement1081);
                	    statement();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop19;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, compoundStatement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "compoundStatement"



    // $ANTLR start "statement"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:550:1: statement : ( compoundStatement | declaration | ^( EXPRESSION expression ) | ^( IF expression ifStat= statement (elseStat= statement )? ) | ^( FOR forInit forCond forIter statement ) | ^( WHILE expression statement ) | ^( DO statement expression ) | BREAK | CONTINUE | RETURN | ^( SWITCH expression ( casesGroup )* ) | EMPTY );
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();

        CommonTree EXPRESSION29=null;
        CommonTree IF30=null;
        CommonTree FOR32=null;
        CommonTree WHILE33=null;
        CommonTree DO35=null;
        CommonTree BREAK37=null;
        CommonTree CONTINUE38=null;
        CommonTree SWITCH40=null;
        IavaTreeWalker.expression_return expression28 =null;

        IavaTreeWalker.expression_return expression31 =null;

        IavaTreeWalker.expression_return expression34 =null;

        IavaTreeWalker.expression_return expression36 =null;

        IavaTreeWalker.expression_return expression39 =null;

        FullType casesGroup41 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:551:3: ( compoundStatement | declaration | ^( EXPRESSION expression ) | ^( IF expression ifStat= statement (elseStat= statement )? ) | ^( FOR forInit forCond forIter statement ) | ^( WHILE expression statement ) | ^( DO statement expression ) | BREAK | CONTINUE | RETURN | ^( SWITCH expression ( casesGroup )* ) | EMPTY )
            int alt22=12;
            switch ( input.LA(1) ) {
            case BLOCK_SCOPE:
                {
                alt22=1;
                }
                break;
            case VAR_DECL:
                {
                alt22=2;
                }
                break;
            case EXPRESSION:
                {
                alt22=3;
                }
                break;
            case IF:
                {
                alt22=4;
                }
                break;
            case FOR:
                {
                alt22=5;
                }
                break;
            case WHILE:
                {
                alt22=6;
                }
                break;
            case DO:
                {
                alt22=7;
                }
                break;
            case BREAK:
                {
                alt22=8;
                }
                break;
            case CONTINUE:
                {
                alt22=9;
                }
                break;
            case RETURN:
                {
                alt22=10;
                }
                break;
            case SWITCH:
                {
                alt22=11;
                }
                break;
            case EMPTY:
                {
                alt22=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:551:5: compoundStatement
                    {
                    pushFollow(FOLLOW_compoundStatement_in_statement1101);
                    compoundStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:552:5: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_statement1107);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:553:5: ^( EXPRESSION expression )
                    {
                    EXPRESSION29=(CommonTree)match(input,EXPRESSION,FOLLOW_EXPRESSION_in_statement1121); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement1123);
                    expression28=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) {
                    			      if (!(expression28!=null?expression28.assignOrFunc:false))
                    			         newError(fileName,"Error: the expression is illegal",
                    			                  (EXPRESSION29!=null?EXPRESSION29.getLine():0),(EXPRESSION29!=null?EXPRESSION29.getCharPositionInLine():0));
                    		    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:559:5: ^( IF expression ifStat= statement (elseStat= statement )? )
                    {
                    IF30=(CommonTree)match(input,IF,FOLLOW_IF_in_statement1147); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                if (st.startBlock() == -1) {
                                    newError(fileName, st.getLastErrMsg(), (IF30!=null?IF30.getLine():0), (IF30!=null?IF30.getCharPositionInLine():0));
                                }
                            }

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement1167);
                    expression31=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_statement1171);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:565:35: (elseStat= statement )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==BLOCK_SCOPE||LA20_0==BREAK||LA20_0==CONTINUE||LA20_0==DO||LA20_0==EMPTY||(LA20_0 >= EXPRESSION && LA20_0 <= FOR)||LA20_0==IF||LA20_0==RETURN||LA20_0==SWITCH||(LA20_0 >= VAR_DECL && LA20_0 <= WHILE)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:565:37: elseStat= statement
                            {
                            pushFollow(FOLLOW_statement_in_statement1177);
                            statement();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) {
                                if(!(expression31!=null?expression31.type:null).getType().equals(Type.BOOLEAN))
                                    newError(fileName,"Error: IF condition must be boolean",(IF30!=null?IF30.getLine():0),(IF30!=null?IF30.getCharPositionInLine():0));
                                if (st.endBlock() == -1) {
                                    newError(fileName, st.getLastErrMsg(), (IF30!=null?IF30.getLine():0), (IF30!=null?IF30.getCharPositionInLine():0));
                                }
                            }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:574:5: ^( FOR forInit forCond forIter statement )
                    {
                    FOR32=(CommonTree)match(input,FOR,FOLLOW_FOR_in_statement1201); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                if (st.startBlock() == -1) {
                                    newError(fileName, st.getLastErrMsg(), (FOR32!=null?FOR32.getLine():0), (FOR32!=null?FOR32.getCharPositionInLine():0));
                                }
                                insideLoop = true;
                            }

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_forInit_in_statement1221);
                    forInit();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_forCond_in_statement1223);
                    forCond();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_forIter_in_statement1225);
                    forIter();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_statement1227);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) {
                                if (st.endBlock() == -1) {
                                    newError(fileName, st.getLastErrMsg(), (FOR32!=null?FOR32.getLine():0), (FOR32!=null?FOR32.getCharPositionInLine():0));
                                }
                                insideLoop = false;
                            }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:589:5: ^( WHILE expression statement )
                    {
                    WHILE33=(CommonTree)match(input,WHILE,FOLLOW_WHILE_in_statement1247); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                if (st.startBlock() == -1) {
                                    newError(fileName, st.getLastErrMsg(), (WHILE33!=null?WHILE33.getLine():0), (WHILE33!=null?WHILE33.getCharPositionInLine():0));
                                }
                                insideLoop = true;
                            }

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement1266);
                    expression34=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_statement1268);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) {
                                if(!(expression34!=null?expression34.type:null).getType().equals(Type.BOOLEAN))
                                    newError(fileName,"Error: WHILE condition must be boolean",(WHILE33!=null?WHILE33.getLine():0),(WHILE33!=null?WHILE33.getCharPositionInLine():0));
                                if (st.endBlock() == -1) {
                                    newError(fileName, st.getLastErrMsg(), (WHILE33!=null?WHILE33.getLine():0), (WHILE33!=null?WHILE33.getCharPositionInLine():0));
                                }
                                insideLoop = false;
                            }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:605:5: ^( DO statement expression )
                    {
                    DO35=(CommonTree)match(input,DO,FOLLOW_DO_in_statement1287); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                                if (st.startBlock() == -1) {
                                    newError(fileName, st.getLastErrMsg(), (DO35!=null?DO35.getLine():0), (DO35!=null?DO35.getCharPositionInLine():0));
                                }
                                insideLoop = true;
                            }

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_statement1306);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_statement1308);
                    expression36=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) {
                                if(!(expression36!=null?expression36.type:null).getType().equals(Type.BOOLEAN))
                                    newError(fileName,"Error: DO condition must be boolean",(DO35!=null?DO35.getLine():0),(DO35!=null?DO35.getCharPositionInLine():0));
                                if (st.endBlock() == -1) {
                                    newError(fileName, st.getLastErrMsg(), (DO35!=null?DO35.getLine():0), (DO35!=null?DO35.getCharPositionInLine():0));
                                }
                                insideLoop = false;
                            }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:621:5: BREAK
                    {
                    BREAK37=(CommonTree)match(input,BREAK,FOLLOW_BREAK_in_statement1326); if (state.failed) return ;

                    if ( state.backtracking==0 ) { 
                                if (insideSwitch) {
                                    newError(fileName, "break statment inside switch case is forbidden", 
                                             (BREAK37!=null?BREAK37.getLine():0), (BREAK37!=null?BREAK37.getCharPositionInLine():0));
                                } 
                                if (!insideLoop) {
                                    newError(fileName, "break statment outside loop is forbidden", 
                                             (BREAK37!=null?BREAK37.getLine():0), (BREAK37!=null?BREAK37.getCharPositionInLine():0));
                                }
                            }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:632:5: CONTINUE
                    {
                    CONTINUE38=(CommonTree)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1345); if (state.failed) return ;

                    if ( state.backtracking==0 ) {  
                                if (!insideLoop) {
                                    newError(fileName, "continue statment outside loop is forbidden", 
                                             (CONTINUE38!=null?CONTINUE38.getLine():0), (CONTINUE38!=null?CONTINUE38.getCharPositionInLine():0));
                                }
                            }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:639:5: RETURN
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement1361); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:640:5: ^( SWITCH expression ( casesGroup )* )
                    {
                    SWITCH40=(CommonTree)match(input,SWITCH,FOLLOW_SWITCH_in_statement1368); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement1370);
                    expression39=expression();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { 
                                  insideSwitch = true;
                                  if((!isPrimitiveType((expression39!=null?expression39.type:null))) || 
                                     ((expression39!=null?expression39.type:null).getType() == Type.STRING)) {
                                      newError(fileName,"Error: Switch works only with primitive types except string",
                                               (SWITCH40!=null?SWITCH40.getLine():0),(SWITCH40!=null?SWITCH40.getCharPositionInLine():0));
                                  }
                               }

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:649:9: ( casesGroup )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==CASE||LA21_0==DEFAULT) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:649:10: casesGroup
                    	    {
                    	    pushFollow(FOLLOW_casesGroup_in_statement1394);
                    	    casesGroup41=casesGroup();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    if ( state.backtracking==0 ) {
                    	                  if (casesGroup41.getType() != Type.UNSET) // if not default:
                    	                      checkSameTypes((expression39!=null?expression39.type:null),casesGroup41,"Error: can't compare ",
                    	                                     (SWITCH40!=null?SWITCH40.getLine():0),(SWITCH40!=null?SWITCH40.getCharPositionInLine():0));
                    	              }

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { insideSwitch = false; }

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 12 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:658:5: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_statement1445); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, statement_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "forInit"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:662:1: forInit : ( ^( FOR_INIT declaration ) | ^( FOR_INIT expressionList ) | FOR_INIT );
    public final void forInit() throws RecognitionException {
        int forInit_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:663:3: ( ^( FOR_INIT declaration ) | ^( FOR_INIT expressionList ) | FOR_INIT )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==FOR_INIT) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==DOWN) ) {
                    int LA23_2 = input.LA(3);

                    if ( (LA23_2==VAR_DECL) ) {
                        alt23=1;
                    }
                    else if ( (LA23_2==EXPR) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA23_1==FOR_CONDITION) ) {
                    alt23=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:663:5: ^( FOR_INIT declaration )
                    {
                    match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit1460); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_declaration_in_forInit1462);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:664:5: ^( FOR_INIT expressionList )
                    {
                    match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit1470); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressionList_in_forInit1472);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:665:5: FOR_INIT
                    {
                    match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit1479); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, forInit_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "forInit"



    // $ANTLR start "forCond"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:669:1: forCond : ^( FOR_CONDITION ( expression )? ) ;
    public final void forCond() throws RecognitionException {
        int forCond_StartIndex = input.index();

        CommonTree FOR_CONDITION43=null;
        IavaTreeWalker.expression_return expression42 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:670:3: ( ^( FOR_CONDITION ( expression )? ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:670:5: ^( FOR_CONDITION ( expression )? )
            {
            FOR_CONDITION43=(CommonTree)match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCond1494); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:670:21: ( expression )?
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==EXPR) ) {
                    alt24=1;
                }
                switch (alt24) {
                    case 1 :
                        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:670:21: expression
                        {
                        pushFollow(FOLLOW_expression_in_forCond1496);
                        expression42=expression();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            if ( state.backtracking==0 ) {
                        if ((expression42!=null?expression42.type:null) != null)
                          if(!(expression42!=null?expression42.type:null).getType().equals(Type.BOOLEAN))
                            newError(fileName,"Error: FOR condition must be boolean",(FOR_CONDITION43!=null?FOR_CONDITION43.getLine():0),(FOR_CONDITION43!=null?FOR_CONDITION43.getCharPositionInLine():0));
                      }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, forCond_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "forCond"



    // $ANTLR start "forIter"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:679:1: forIter : ^( FOR_ITER ( expressionList )? ) ;
    public final void forIter() throws RecognitionException {
        int forIter_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:680:3: ( ^( FOR_ITER ( expressionList )? ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:680:5: ^( FOR_ITER ( expressionList )? )
            {
            match(input,FOR_ITER,FOLLOW_FOR_ITER_in_forIter1530); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:680:16: ( expressionList )?
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==EXPR) ) {
                    alt25=1;
                }
                switch (alt25) {
                    case 1 :
                        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:680:16: expressionList
                        {
                        pushFollow(FOLLOW_expressionList_in_forIter1532);
                        expressionList();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, forIter_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "forIter"



    // $ANTLR start "casesGroup"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:684:1: casesGroup returns [FullType type] : ( aCase ) ( statement )* ;
    public final FullType casesGroup() throws RecognitionException {
        FullType type = null;

        int casesGroup_StartIndex = input.index();

        FullType aCase44 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:685:3: ( ( aCase ) ( statement )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:686:5: ( aCase ) ( statement )*
            {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:686:5: ( aCase )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:686:6: aCase
            {
            pushFollow(FOLLOW_aCase_in_casesGroup1565);
            aCase44=aCase();

            state._fsp--;
            if (state.failed) return type;

            if ( state.backtracking==0 ) { 
                      st.startBlock();
                      type = aCase44; 
                    }

            }


            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:691:7: ( statement )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==BLOCK_SCOPE||LA26_0==BREAK||LA26_0==CONTINUE||LA26_0==DO||LA26_0==EMPTY||(LA26_0 >= EXPRESSION && LA26_0 <= FOR)||LA26_0==IF||LA26_0==RETURN||LA26_0==SWITCH||(LA26_0 >= VAR_DECL && LA26_0 <= WHILE)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:691:7: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casesGroup1583);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return type;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            if ( state.backtracking==0 ) {
                      st.endBlock();
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, casesGroup_StartIndex); }

        }
        return type;
    }
    // $ANTLR end "casesGroup"



    // $ANTLR start "aCase"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:698:1: aCase returns [FullType type] : ( ^( CASE expression ) | DEFAULT );
    public final FullType aCase() throws RecognitionException {
        FullType type = null;

        int aCase_StartIndex = input.index();

        IavaTreeWalker.expression_return expression45 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:699:3: ( ^( CASE expression ) | DEFAULT )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==CASE) ) {
                alt27=1;
            }
            else if ( (LA27_0==DEFAULT) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:699:5: ^( CASE expression )
                    {
                    match(input,CASE,FOLLOW_CASE_in_aCase1613); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expression_in_aCase1615);
                    expression45=expression();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    if ( state.backtracking==0 ) { type = (expression45!=null?expression45.type:null); }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:700:5: DEFAULT
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_aCase1624); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.UNSET); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, aCase_StartIndex); }

        }
        return type;
    }
    // $ANTLR end "aCase"


    public static class expression_return extends TreeRuleReturnScope {
        public FullType type;
        public boolean assignOrFunc;
    };


    // $ANTLR start "expression"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:708:1: expression returns [FullType type, boolean assignOrFunc] : ^( EXPR expr ) ;
    public final IavaTreeWalker.expression_return expression() throws RecognitionException {
        IavaTreeWalker.expression_return retval = new IavaTreeWalker.expression_return();
        retval.start = input.LT(1);

        int expression_StartIndex = input.index();

        IavaTreeWalker.expr_return expr46 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:709:5: ( ^( EXPR expr ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:709:7: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression1651); if (state.failed) return retval;

            if ( state.backtracking==0 ) {assignError = false; }

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_expression1655);
            expr46=expr();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            if ( state.backtracking==0 ) { 
                          retval.type = (expr46!=null?expr46.type:null); 
                          retval.assignOrFunc = (expr46!=null?expr46.assignOrFunc:false); 
                      }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class expr_return extends TreeRuleReturnScope {
        public FullType type;
        public boolean assignOrFunc;
    };


    // $ANTLR start "expr"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:718:1: expr returns [FullType type, boolean assignOrFunc] : ( ( ^( ASSIGN expr1= expr expr2= expr ) | ^( PLUS_ASSIGN expr1= expr expr2= expr ) | ^( MINUS_ASSIGN expr1= expr expr2= expr ) | ^( STAR_ASSIGN expr1= expr expr2= expr ) | ^( DIV_ASSIGN expr1= expr expr2= expr ) | ^( BAND_ASSIGN expr1= expr expr2= expr ) | ^( BOR_ASSIGN expr1= expr expr2= expr ) | ^( BXOR_ASSIGN expr1= expr expr2= expr ) | ^( MOD_ASSIGN expr1= expr expr2= expr ) | ^( QUESTION cond= expr expr1= expr COLON expr2= expr ) | ^( LOR expr1= expr expr2= expr ) | ^( LAND expr1= expr expr2= expr ) | ^( BOR expr1= expr expr2= expr ) | ^( BXOR expr1= expr expr2= expr ) | ^( BAND expr1= expr expr2= expr ) | ^( EQUAL expr1= expr expr2= expr ) | ^( NOT_EQUAL expr1= expr expr2= expr ) | ^( LE expr1= expr expr2= expr ) | ^( GE expr1= expr expr2= expr ) | ^( GT expr1= expr expr2= expr ) | ^( LT expr1= expr expr2= expr ) | ^( PLUS expr1= expr expr2= expr ) | ^( MINUS expr1= expr expr2= expr ) | ^( STAR expr1= expr expr2= expr ) | ^( DIV expr1= expr expr2= expr ) | ^( MOD expr1= expr expr2= expr ) | ^( UNARY_PLUS e= expr ) | ^( UNARY_MINUS e= expr ) | ^( PRE_INC e= expr ) | ^( PRE_DEC e= expr ) | ^( POST_INC e= expr ) | ^( POST_DEC e= expr ) | ^( NOT e= expr ) | ^( LOGICAL_NOT e= expr ) ) | primaryExpression );
    public final IavaTreeWalker.expr_return expr() throws RecognitionException {
        IavaTreeWalker.expr_return retval = new IavaTreeWalker.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        CommonTree ASSIGN47=null;
        CommonTree PLUS_ASSIGN48=null;
        CommonTree MINUS_ASSIGN49=null;
        CommonTree STAR_ASSIGN50=null;
        CommonTree DIV_ASSIGN51=null;
        CommonTree BAND_ASSIGN52=null;
        CommonTree BOR_ASSIGN53=null;
        CommonTree BXOR_ASSIGN54=null;
        CommonTree MOD_ASSIGN55=null;
        CommonTree QUESTION56=null;
        CommonTree LOR57=null;
        CommonTree LAND58=null;
        CommonTree BOR59=null;
        CommonTree BXOR60=null;
        CommonTree BAND61=null;
        CommonTree EQUAL62=null;
        CommonTree NOT_EQUAL63=null;
        CommonTree LE64=null;
        CommonTree GE65=null;
        CommonTree GT66=null;
        CommonTree LT67=null;
        CommonTree PLUS68=null;
        CommonTree MINUS69=null;
        CommonTree STAR70=null;
        CommonTree DIV71=null;
        CommonTree MOD72=null;
        CommonTree UNARY_PLUS73=null;
        CommonTree UNARY_MINUS74=null;
        CommonTree PRE_INC75=null;
        CommonTree PRE_DEC76=null;
        CommonTree POST_INC77=null;
        CommonTree POST_DEC78=null;
        CommonTree NOT79=null;
        CommonTree LOGICAL_NOT80=null;
        IavaTreeWalker.expr_return expr1 =null;

        IavaTreeWalker.expr_return expr2 =null;

        IavaTreeWalker.expr_return cond =null;

        IavaTreeWalker.expr_return e =null;

        IavaTreeWalker.primaryExpression_return primaryExpression81 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:719:5: ( ( ^( ASSIGN expr1= expr expr2= expr ) | ^( PLUS_ASSIGN expr1= expr expr2= expr ) | ^( MINUS_ASSIGN expr1= expr expr2= expr ) | ^( STAR_ASSIGN expr1= expr expr2= expr ) | ^( DIV_ASSIGN expr1= expr expr2= expr ) | ^( BAND_ASSIGN expr1= expr expr2= expr ) | ^( BOR_ASSIGN expr1= expr expr2= expr ) | ^( BXOR_ASSIGN expr1= expr expr2= expr ) | ^( MOD_ASSIGN expr1= expr expr2= expr ) | ^( QUESTION cond= expr expr1= expr COLON expr2= expr ) | ^( LOR expr1= expr expr2= expr ) | ^( LAND expr1= expr expr2= expr ) | ^( BOR expr1= expr expr2= expr ) | ^( BXOR expr1= expr expr2= expr ) | ^( BAND expr1= expr expr2= expr ) | ^( EQUAL expr1= expr expr2= expr ) | ^( NOT_EQUAL expr1= expr expr2= expr ) | ^( LE expr1= expr expr2= expr ) | ^( GE expr1= expr expr2= expr ) | ^( GT expr1= expr expr2= expr ) | ^( LT expr1= expr expr2= expr ) | ^( PLUS expr1= expr expr2= expr ) | ^( MINUS expr1= expr expr2= expr ) | ^( STAR expr1= expr expr2= expr ) | ^( DIV expr1= expr expr2= expr ) | ^( MOD expr1= expr expr2= expr ) | ^( UNARY_PLUS e= expr ) | ^( UNARY_MINUS e= expr ) | ^( PRE_INC e= expr ) | ^( PRE_DEC e= expr ) | ^( POST_INC e= expr ) | ^( POST_DEC e= expr ) | ^( NOT e= expr ) | ^( LOGICAL_NOT e= expr ) ) | primaryExpression )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0 >= ASSIGN && LA29_0 <= BAND_ASSIGN)||(LA29_0 >= BOR && LA29_0 <= BOR_ASSIGN)||(LA29_0 >= BXOR && LA29_0 <= BXOR_ASSIGN)||(LA29_0 >= DIV && LA29_0 <= DIV_ASSIGN)||LA29_0==EQUAL||LA29_0==GE||LA29_0==GT||LA29_0==LAND||LA29_0==LE||LA29_0==LOGICAL_NOT||LA29_0==LOR||LA29_0==LT||(LA29_0 >= MINUS && LA29_0 <= MINUS_ASSIGN)||(LA29_0 >= MOD && LA29_0 <= NOT_EQUAL)||(LA29_0 >= PLUS && LA29_0 <= QUESTION)||LA29_0==STAR||LA29_0==STAR_ASSIGN||(LA29_0 >= UNARY_MINUS && LA29_0 <= UNARY_PLUS)) ) {
                alt29=1;
            }
            else if ( (LA29_0==ARRAY_ELEMENT_ACCESS||LA29_0==CHAR_LITERAL||LA29_0==IDENT||LA29_0==LPAREN||LA29_0==METHOD_CALL||(LA29_0 >= NUM_DOUBLE && LA29_0 <= NUM_INT)||(LA29_0 >= STRING_LITERAL && LA29_0 <= STRUCT_ACCESS)||LA29_0==120||LA29_0==123||LA29_0==129) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:719:7: ( ^( ASSIGN expr1= expr expr2= expr ) | ^( PLUS_ASSIGN expr1= expr expr2= expr ) | ^( MINUS_ASSIGN expr1= expr expr2= expr ) | ^( STAR_ASSIGN expr1= expr expr2= expr ) | ^( DIV_ASSIGN expr1= expr expr2= expr ) | ^( BAND_ASSIGN expr1= expr expr2= expr ) | ^( BOR_ASSIGN expr1= expr expr2= expr ) | ^( BXOR_ASSIGN expr1= expr expr2= expr ) | ^( MOD_ASSIGN expr1= expr expr2= expr ) | ^( QUESTION cond= expr expr1= expr COLON expr2= expr ) | ^( LOR expr1= expr expr2= expr ) | ^( LAND expr1= expr expr2= expr ) | ^( BOR expr1= expr expr2= expr ) | ^( BXOR expr1= expr expr2= expr ) | ^( BAND expr1= expr expr2= expr ) | ^( EQUAL expr1= expr expr2= expr ) | ^( NOT_EQUAL expr1= expr expr2= expr ) | ^( LE expr1= expr expr2= expr ) | ^( GE expr1= expr expr2= expr ) | ^( GT expr1= expr expr2= expr ) | ^( LT expr1= expr expr2= expr ) | ^( PLUS expr1= expr expr2= expr ) | ^( MINUS expr1= expr expr2= expr ) | ^( STAR expr1= expr expr2= expr ) | ^( DIV expr1= expr expr2= expr ) | ^( MOD expr1= expr expr2= expr ) | ^( UNARY_PLUS e= expr ) | ^( UNARY_MINUS e= expr ) | ^( PRE_INC e= expr ) | ^( PRE_DEC e= expr ) | ^( POST_INC e= expr ) | ^( POST_DEC e= expr ) | ^( NOT e= expr ) | ^( LOGICAL_NOT e= expr ) )
                    {
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:719:7: ( ^( ASSIGN expr1= expr expr2= expr ) | ^( PLUS_ASSIGN expr1= expr expr2= expr ) | ^( MINUS_ASSIGN expr1= expr expr2= expr ) | ^( STAR_ASSIGN expr1= expr expr2= expr ) | ^( DIV_ASSIGN expr1= expr expr2= expr ) | ^( BAND_ASSIGN expr1= expr expr2= expr ) | ^( BOR_ASSIGN expr1= expr expr2= expr ) | ^( BXOR_ASSIGN expr1= expr expr2= expr ) | ^( MOD_ASSIGN expr1= expr expr2= expr ) | ^( QUESTION cond= expr expr1= expr COLON expr2= expr ) | ^( LOR expr1= expr expr2= expr ) | ^( LAND expr1= expr expr2= expr ) | ^( BOR expr1= expr expr2= expr ) | ^( BXOR expr1= expr expr2= expr ) | ^( BAND expr1= expr expr2= expr ) | ^( EQUAL expr1= expr expr2= expr ) | ^( NOT_EQUAL expr1= expr expr2= expr ) | ^( LE expr1= expr expr2= expr ) | ^( GE expr1= expr expr2= expr ) | ^( GT expr1= expr expr2= expr ) | ^( LT expr1= expr expr2= expr ) | ^( PLUS expr1= expr expr2= expr ) | ^( MINUS expr1= expr expr2= expr ) | ^( STAR expr1= expr expr2= expr ) | ^( DIV expr1= expr expr2= expr ) | ^( MOD expr1= expr expr2= expr ) | ^( UNARY_PLUS e= expr ) | ^( UNARY_MINUS e= expr ) | ^( PRE_INC e= expr ) | ^( PRE_DEC e= expr ) | ^( POST_INC e= expr ) | ^( POST_DEC e= expr ) | ^( NOT e= expr ) | ^( LOGICAL_NOT e= expr ) )
                    int alt28=34;
                    switch ( input.LA(1) ) {
                    case ASSIGN:
                        {
                        alt28=1;
                        }
                        break;
                    case PLUS_ASSIGN:
                        {
                        alt28=2;
                        }
                        break;
                    case MINUS_ASSIGN:
                        {
                        alt28=3;
                        }
                        break;
                    case STAR_ASSIGN:
                        {
                        alt28=4;
                        }
                        break;
                    case DIV_ASSIGN:
                        {
                        alt28=5;
                        }
                        break;
                    case BAND_ASSIGN:
                        {
                        alt28=6;
                        }
                        break;
                    case BOR_ASSIGN:
                        {
                        alt28=7;
                        }
                        break;
                    case BXOR_ASSIGN:
                        {
                        alt28=8;
                        }
                        break;
                    case MOD_ASSIGN:
                        {
                        alt28=9;
                        }
                        break;
                    case QUESTION:
                        {
                        alt28=10;
                        }
                        break;
                    case LOR:
                        {
                        alt28=11;
                        }
                        break;
                    case LAND:
                        {
                        alt28=12;
                        }
                        break;
                    case BOR:
                        {
                        alt28=13;
                        }
                        break;
                    case BXOR:
                        {
                        alt28=14;
                        }
                        break;
                    case BAND:
                        {
                        alt28=15;
                        }
                        break;
                    case EQUAL:
                        {
                        alt28=16;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt28=17;
                        }
                        break;
                    case LE:
                        {
                        alt28=18;
                        }
                        break;
                    case GE:
                        {
                        alt28=19;
                        }
                        break;
                    case GT:
                        {
                        alt28=20;
                        }
                        break;
                    case LT:
                        {
                        alt28=21;
                        }
                        break;
                    case PLUS:
                        {
                        alt28=22;
                        }
                        break;
                    case MINUS:
                        {
                        alt28=23;
                        }
                        break;
                    case STAR:
                        {
                        alt28=24;
                        }
                        break;
                    case DIV:
                        {
                        alt28=25;
                        }
                        break;
                    case MOD:
                        {
                        alt28=26;
                        }
                        break;
                    case UNARY_PLUS:
                        {
                        alt28=27;
                        }
                        break;
                    case UNARY_MINUS:
                        {
                        alt28=28;
                        }
                        break;
                    case PRE_INC:
                        {
                        alt28=29;
                        }
                        break;
                    case PRE_DEC:
                        {
                        alt28=30;
                        }
                        break;
                    case POST_INC:
                        {
                        alt28=31;
                        }
                        break;
                    case POST_DEC:
                        {
                        alt28=32;
                        }
                        break;
                    case NOT:
                        {
                        alt28=33;
                        }
                        break;
                    case LOGICAL_NOT:
                        {
                        alt28=34;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;

                    }

                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:720:7: ^( ASSIGN expr1= expr expr2= expr )
                            {
                            ASSIGN47=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr1701); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr1705);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr1709);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        if(!checkNullAssign((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null)))
                            		            checkSameTypes((expr2!=null?expr2.type:null),(expr1!=null?expr1.type:null),"Error: can't assign ",(ASSIGN47!=null?ASSIGN47.getLine():0),(ASSIGN47!=null?ASSIGN47.getCharPositionInLine():0));
                            		        checkIsVar((expr1!=null?expr1.type:null), "Error: left hand side is not a variable", (ASSIGN47!=null?ASSIGN47.getLine():0),(ASSIGN47!=null?ASSIGN47.getCharPositionInLine():0));
                            		        retval.type = assignError==false?(expr1!=null?expr1.type:null):new FullType(Type.ERROR); 
                            		        retval.assignOrFunc = true;
                            		    }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:728:7: ^( PLUS_ASSIGN expr1= expr expr2= expr )
                            {
                            PLUS_ASSIGN48=(CommonTree)match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_expr1728); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr1732);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr1736);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        if(!checkNullAssign((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null)))
                            		             checkSameTypes((expr2!=null?expr2.type:null),(expr1!=null?expr1.type:null),"Error: can't add ",(PLUS_ASSIGN48!=null?PLUS_ASSIGN48.getLine():0),(PLUS_ASSIGN48!=null?PLUS_ASSIGN48.getCharPositionInLine():0));
                            		        checkArithmeticType((expr1!=null?expr1.type:null),(PLUS_ASSIGN48!=null?PLUS_ASSIGN48.getLine():0),(PLUS_ASSIGN48!=null?PLUS_ASSIGN48.getCharPositionInLine():0));
                            		        checkIsVar((expr1!=null?expr1.type:null), "Error: left hand side is not a variable", (PLUS_ASSIGN48!=null?PLUS_ASSIGN48.getLine():0),(PLUS_ASSIGN48!=null?PLUS_ASSIGN48.getCharPositionInLine():0));
                            		        retval.type = assignError==false?(expr1!=null?expr1.type:null):new FullType(Type.ERROR); 
                            		        retval.assignOrFunc = true; 
                            		    }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:737:9: ^( MINUS_ASSIGN expr1= expr expr2= expr )
                            {
                            MINUS_ASSIGN49=(CommonTree)match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_expr1756); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr1760);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr1764);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) {         
                            		        if(!checkNullAssign((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null)))
                            		            checkSameTypes((expr2!=null?expr2.type:null),(expr1!=null?expr1.type:null),"Error: can't Subtracte ",
                            		                           (MINUS_ASSIGN49!=null?MINUS_ASSIGN49.getLine():0),(MINUS_ASSIGN49!=null?MINUS_ASSIGN49.getCharPositionInLine():0)); 
                            		        checkArithmeticType((expr1!=null?expr1.type:null),(MINUS_ASSIGN49!=null?MINUS_ASSIGN49.getLine():0),(MINUS_ASSIGN49!=null?MINUS_ASSIGN49.getCharPositionInLine():0));
                            		        checkIsVar((expr1!=null?expr1.type:null), "Error: left hand side is not a variable", (MINUS_ASSIGN49!=null?MINUS_ASSIGN49.getLine():0),(MINUS_ASSIGN49!=null?MINUS_ASSIGN49.getCharPositionInLine():0));              
                            		        retval.type = assignError==false?(expr1!=null?expr1.type:null):new FullType(Type.ERROR); 
                            		        retval.assignOrFunc = true; 
                            		    }

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:747:7: ^( STAR_ASSIGN expr1= expr expr2= expr )
                            {
                            STAR_ASSIGN50=(CommonTree)match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_expr1787); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr1791);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr1795);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        if(!checkNullAssign((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null)))
                            		            checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't multiply ",
                            		                           (STAR_ASSIGN50!=null?STAR_ASSIGN50.getLine():0),(STAR_ASSIGN50!=null?STAR_ASSIGN50.getCharPositionInLine():0)); 
                            		        checkArithmeticType((expr1!=null?expr1.type:null),(STAR_ASSIGN50!=null?STAR_ASSIGN50.getLine():0),(STAR_ASSIGN50!=null?STAR_ASSIGN50.getCharPositionInLine():0));
                            		        checkIsVar((expr1!=null?expr1.type:null), "Error: left hand side is not a variable", (STAR_ASSIGN50!=null?STAR_ASSIGN50.getLine():0),(STAR_ASSIGN50!=null?STAR_ASSIGN50.getCharPositionInLine():0));
                            		        retval.type = assignError==false?(expr1!=null?expr1.type:null):new FullType(Type.ERROR);  
                            		        retval.assignOrFunc = true;
                            		    }

                            }
                            break;
                        case 5 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:757:9: ^( DIV_ASSIGN expr1= expr expr2= expr )
                            {
                            DIV_ASSIGN51=(CommonTree)match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_expr1821); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr1825);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr1829);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        if(!checkNullAssign((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null)))
                            		            checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't divide ",
                            		                           (DIV_ASSIGN51!=null?DIV_ASSIGN51.getLine():0),(DIV_ASSIGN51!=null?DIV_ASSIGN51.getCharPositionInLine():0)); 
                            		        checkArithmeticType((expr1!=null?expr1.type:null),(DIV_ASSIGN51!=null?DIV_ASSIGN51.getLine():0),(DIV_ASSIGN51!=null?DIV_ASSIGN51.getCharPositionInLine():0));
                            		        checkIsVar((expr1!=null?expr1.type:null), "Error: left hand side is not a variable", (DIV_ASSIGN51!=null?DIV_ASSIGN51.getLine():0),(DIV_ASSIGN51!=null?DIV_ASSIGN51.getCharPositionInLine():0));
                            		        retval.type = assignError==false?new FullType(Type.REAL):new FullType(Type.ERROR); 
                            		        retval.assignOrFunc = true; 
                            		    }

                            }
                            break;
                        case 6 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:767:7: ^( BAND_ASSIGN expr1= expr expr2= expr )
                            {
                            BAND_ASSIGN52=(CommonTree)match(input,BAND_ASSIGN,FOLLOW_BAND_ASSIGN_in_expr1854); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr1858);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr1862);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't preform and ",
                            		                       (BAND_ASSIGN52!=null?BAND_ASSIGN52.getLine():0),(BAND_ASSIGN52!=null?BAND_ASSIGN52.getCharPositionInLine():0)); 
                            		        checkIsVar((expr1!=null?expr1.type:null), "Error: left hand side is not a variable", (BAND_ASSIGN52!=null?BAND_ASSIGN52.getLine():0),(BAND_ASSIGN52!=null?BAND_ASSIGN52.getCharPositionInLine():0));
                            		        retval.type = assignError==false?(expr1!=null?expr1.type:null):new FullType(Type.ERROR);  
                            		        retval.assignOrFunc = true;
                            	      }

                            }
                            break;
                        case 7 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:775:7: ^( BOR_ASSIGN expr1= expr expr2= expr )
                            {
                            BOR_ASSIGN53=(CommonTree)match(input,BOR_ASSIGN,FOLLOW_BOR_ASSIGN_in_expr1886); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr1890);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr1894);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't preform or ",
                            		                       (BOR_ASSIGN53!=null?BOR_ASSIGN53.getLine():0),(BOR_ASSIGN53!=null?BOR_ASSIGN53.getCharPositionInLine():0)); 
                            		        checkIsVar((expr1!=null?expr1.type:null), "Error: left hand side is not a variable", (BOR_ASSIGN53!=null?BOR_ASSIGN53.getLine():0),(BOR_ASSIGN53!=null?BOR_ASSIGN53.getCharPositionInLine():0));
                            		        retval.type = (expr1!=null?expr1.type:null);
                            		        retval.assignOrFunc = true;
                            	      }

                            }
                            break;
                        case 8 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:783:7: ^( BXOR_ASSIGN expr1= expr expr2= expr )
                            {
                            BXOR_ASSIGN54=(CommonTree)match(input,BXOR_ASSIGN,FOLLOW_BXOR_ASSIGN_in_expr1914); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr1918);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr1922);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't preform xor ",
                            		                       (BXOR_ASSIGN54!=null?BXOR_ASSIGN54.getLine():0),(BXOR_ASSIGN54!=null?BXOR_ASSIGN54.getCharPositionInLine():0)); 
                            		        checkIsVar((expr1!=null?expr1.type:null), "Error: left hand side is not a variable", (BXOR_ASSIGN54!=null?BXOR_ASSIGN54.getLine():0),(BXOR_ASSIGN54!=null?BXOR_ASSIGN54.getCharPositionInLine():0));
                            		        retval.type = (expr1!=null?expr1.type:null);
                            		        retval.assignOrFunc = true;
                            	      }

                            }
                            break;
                        case 9 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:791:7: ^( MOD_ASSIGN expr1= expr expr2= expr )
                            {
                            MOD_ASSIGN55=(CommonTree)match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_expr1947); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr1951);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr1955);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        if((expr1!=null?expr1.type:null).getType() != Type.INTEGER ||  (expr2!=null?expr2.type:null).getType() != Type.INTEGER) {
                            			          String msg = "Error: can't preform mod " + (expr2!=null?expr2.type:null).getType() + " to " + (expr1!=null?expr1.type:null).getType();          
                            			          newError(fileName,msg,(MOD_ASSIGN55!=null?MOD_ASSIGN55.getLine():0),(MOD_ASSIGN55!=null?MOD_ASSIGN55.getCharPositionInLine():0));  
                            		        } 
                            		        checkIsVar((expr1!=null?expr1.type:null), "Error: left hand side is not a variable", (MOD_ASSIGN55!=null?MOD_ASSIGN55.getLine():0),(MOD_ASSIGN55!=null?MOD_ASSIGN55.getCharPositionInLine():0));
                            		        retval.type = assignError==false?(expr1!=null?expr1.type:null):new FullType(Type.ERROR);  
                            		        retval.assignOrFunc = true;
                            	      }

                            }
                            break;
                        case 10 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:801:7: ^( QUESTION cond= expr expr1= expr COLON expr2= expr )
                            {
                            QUESTION56=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_expr1982); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr1986);
                            cond=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr1990);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input,COLON,FOLLOW_COLON_in_expr1992); if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr1996);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't preform  ",
                            		                       (QUESTION56!=null?QUESTION56.getLine():0),(QUESTION56!=null?QUESTION56.getCharPositionInLine():0));
                            		        if(!((cond!=null?cond.type:null).getType() == Type.BOOLEAN)) {
                            			          String msg = "Error: condition must be of boolean type";          
                            			          newError(fileName,msg,(QUESTION56!=null?QUESTION56.getLine():0),(QUESTION56!=null?QUESTION56.getCharPositionInLine():0));  
                            		        } 
                            		        retval.type = (expr1!=null?expr1.type:null); 
                            	      }

                            }
                            break;
                        case 11 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:811:7: ^( LOR expr1= expr expr2= expr )
                            {
                            LOR57=(CommonTree)match(input,LOR,FOLLOW_LOR_in_expr2018); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2022);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2026);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        if(!((expr1!=null?expr1.type:null).getType() == Type.BOOLEAN && (expr2!=null?expr2.type:null).getType() == Type.BOOLEAN)){
                            			          String msg = "Error: can't preform or " + (expr2!=null?expr2.type:null).getType() + " to " + (expr1!=null?expr1.type:null).getType();          
                            			          newError(fileName,msg,(LOR57!=null?LOR57.getLine():0),(LOR57!=null?LOR57.getCharPositionInLine():0));  
                            		        } 
                            		        retval.type = (expr1!=null?expr1.type:null);
                            	      }

                            }
                            break;
                        case 12 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:819:7: ^( LAND expr1= expr expr2= expr )
                            {
                            LAND58=(CommonTree)match(input,LAND,FOLLOW_LAND_in_expr2060); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2064);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2068);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        if(!((expr1!=null?expr1.type:null).getType() == Type.BOOLEAN && (expr2!=null?expr2.type:null).getType() == Type.BOOLEAN)){
                            			          String msg = "Error: can't preform and " + (expr2!=null?expr2.type:null).getType() + " to " + (expr1!=null?expr1.type:null).getType();          
                            			          newError(fileName,msg,(LAND58!=null?LAND58.getLine():0),(LAND58!=null?LAND58.getCharPositionInLine():0));
                                        } 
                                        retval.type = (expr1!=null?expr1.type:null);
                                    }

                            }
                            break;
                        case 13 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:827:7: ^( BOR expr1= expr expr2= expr )
                            {
                            BOR59=(CommonTree)match(input,BOR,FOLLOW_BOR_in_expr2106); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2110);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2114);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        if((expr1!=null?expr1.type:null).getType() != (expr2!=null?expr2.type:null).getType()){
                            			          String msg = "Error: can't preform or " + (expr2!=null?expr2.type:null).getType() + " to " + (expr1!=null?expr1.type:null).getType();          
                            			          newError(fileName,msg,(BOR59!=null?BOR59.getLine():0),(BOR59!=null?BOR59.getCharPositionInLine():0));
                            		        } 
                            	          retval.type = (expr1!=null?expr1.type:null);
                            	      }

                            }
                            break;
                        case 14 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:835:7: ^( BXOR expr1= expr expr2= expr )
                            {
                            BXOR60=(CommonTree)match(input,BXOR,FOLLOW_BXOR_in_expr2153); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2157);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2161);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        if((expr1!=null?expr1.type:null).getType() != (expr2!=null?expr2.type:null).getType()){
                            			          String msg = "Error: can't preform xor " + (expr2!=null?expr2.type:null).getType() + " to " + (expr1!=null?expr1.type:null).getType();          
                            			          newError(fileName,msg,(BXOR60!=null?BXOR60.getLine():0),(BXOR60!=null?BXOR60.getCharPositionInLine():0));
                            		        } 
                            		        retval.type = (expr1!=null?expr1.type:null);
                            	      }

                            }
                            break;
                        case 15 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:843:7: ^( BAND expr1= expr expr2= expr )
                            {
                            BAND61=(CommonTree)match(input,BAND,FOLLOW_BAND_in_expr2195); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2199);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2203);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        if((expr1!=null?expr1.type:null).getType() != (expr2!=null?expr2.type:null).getType()){
                            			          String msg = "Error: can't preform and " + (expr2!=null?expr2.type:null).getType() + " to " + (expr1!=null?expr1.type:null).getType();          
                            			          newError(fileName,msg,(BAND61!=null?BAND61.getLine():0),(BAND61!=null?BAND61.getCharPositionInLine():0));
                            		        } 
                            		        retval.type = (expr1!=null?expr1.type:null);
                            	      }

                            }
                            break;
                        case 16 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:851:7: ^( EQUAL expr1= expr expr2= expr )
                            {
                            EQUAL62=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_expr2238); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2242);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2246);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            	          if(!checkNullAssign((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null)))
                            	              checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't compare  ", (EQUAL62!=null?EQUAL62.getLine():0),(EQUAL62!=null?EQUAL62.getCharPositionInLine():0)); 
                            		        if((expr1!=null?expr1.type:null).getType()==Type.STRING)
                            		            newError(fileName,"Error, do not use == for strings, use stdlib's strCmp instead",(EQUAL62!=null?EQUAL62.getLine():0),(EQUAL62!=null?EQUAL62.getCharPositionInLine():0));
                            		        retval.type = new FullType(Type.BOOLEAN); 
                            		    }

                            }
                            break;
                        case 17 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:859:7: ^( NOT_EQUAL expr1= expr expr2= expr )
                            {
                            NOT_EQUAL63=(CommonTree)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr2279); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2283);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2287);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            	          if(!checkNullAssign((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null)))
                            	              checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't compare  ", (NOT_EQUAL63!=null?NOT_EQUAL63.getLine():0),(NOT_EQUAL63!=null?NOT_EQUAL63.getCharPositionInLine():0)); 
                            	          retval.type = new FullType(Type.BOOLEAN);
                            		    }

                            }
                            break;
                        case 18 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:865:7: ^( LE expr1= expr expr2= expr )
                            {
                            LE64=(CommonTree)match(input,LE,FOLLOW_LE_in_expr2319); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2323);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2327);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            	          checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't compare  ", (LE64!=null?LE64.getLine():0),(LE64!=null?LE64.getCharPositionInLine():0)); 
                            	          checkArithmeticType((expr1!=null?expr1.type:null),(LE64!=null?LE64.getLine():0),(LE64!=null?LE64.getCharPositionInLine():0));
                            	          retval.type = new FullType(Type.BOOLEAN);
                            		    }

                            }
                            break;
                        case 19 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:871:7: ^( GE expr1= expr expr2= expr )
                            {
                            GE65=(CommonTree)match(input,GE,FOLLOW_GE_in_expr2364); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2368);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2372);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            	          checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't compare  ",
                            	          (GE65!=null?GE65.getLine():0),(GE65!=null?GE65.getCharPositionInLine():0));
                            	          checkArithmeticType((expr1!=null?expr1.type:null),(GE65!=null?GE65.getLine():0),(GE65!=null?GE65.getCharPositionInLine():0));
                            	          retval.type = new FullType(Type.BOOLEAN);
                                    }

                            }
                            break;
                        case 20 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:878:7: ^( GT expr1= expr expr2= expr )
                            {
                            GT66=(CommonTree)match(input,GT,FOLLOW_GT_in_expr2411); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2415);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2419);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            	          checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't compare  ",
                            	          (GT66!=null?GT66.getLine():0),(GT66!=null?GT66.getCharPositionInLine():0)); 
                            	          checkArithmeticType((expr1!=null?expr1.type:null),(GT66!=null?GT66.getLine():0),(GT66!=null?GT66.getCharPositionInLine():0));
                            	          retval.type = new FullType(Type.BOOLEAN);     
                                    }

                            }
                            break;
                        case 21 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:885:7: ^( LT expr1= expr expr2= expr )
                            {
                            LT67=(CommonTree)match(input,LT,FOLLOW_LT_in_expr2458); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2462);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2466);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            	          checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't compare  ",
                            	          (LT67!=null?LT67.getLine():0),(LT67!=null?LT67.getCharPositionInLine():0)); 
                            	          checkArithmeticType((expr1!=null?expr1.type:null),(LT67!=null?LT67.getLine():0),(LT67!=null?LT67.getCharPositionInLine():0));
                            	          retval.type = new FullType(Type.BOOLEAN);
                                      
                                    }

                            }
                            break;
                        case 22 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:893:7: ^( PLUS expr1= expr expr2= expr )
                            {
                            PLUS68=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr2501); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2505);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2509);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            	          if (!((expr1!=null?expr1.type:null).getType() == Type.STRING || 
                            	              (expr2!=null?expr2.type:null).getType() == Type.STRING)) {
                            		             checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't add  ",
                            		             (PLUS68!=null?PLUS68.getLine():0),(PLUS68!=null?PLUS68.getCharPositionInLine():0)); 
                            	           }
                            	           if(!((expr1!=null?expr1.type:null).getType() == Type.INTEGER ||
                            	             (expr1!=null?expr1.type:null).getType() == Type.REAL ||
                            	             (expr1!=null?expr1.type:null).getType() == Type.STRING) ) {
                            			            String msg = " Error: " + (expr1!=null?expr1.type:null).getType() + " is not an arithmetic type or a string ";          
                            			            newError(fileName,msg,(PLUS68!=null?PLUS68.getLine():0),(PLUS68!=null?PLUS68.getCharPositionInLine():0));
                            	           } 
                            	           retval.type = (expr1!=null?expr1.type:null);
                                    }

                            }
                            break;
                        case 23 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:908:7: ^( MINUS expr1= expr expr2= expr )
                            {
                            MINUS69=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr2542); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2546);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2550);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            	          checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't subtract  ",
                            	          (MINUS69!=null?MINUS69.getLine():0),(MINUS69!=null?MINUS69.getCharPositionInLine():0)); 
                            	          checkArithmeticType((expr1!=null?expr1.type:null),(MINUS69!=null?MINUS69.getLine():0),(MINUS69!=null?MINUS69.getCharPositionInLine():0));
                            	          retval.type = (expr1!=null?expr1.type:null);
                                    }

                            }
                            break;
                        case 24 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:915:7: ^( STAR expr1= expr expr2= expr )
                            {
                            STAR70=(CommonTree)match(input,STAR,FOLLOW_STAR_in_expr2587); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2591);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2595);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            	          checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't multiply  ",
                            	          (STAR70!=null?STAR70.getLine():0),(STAR70!=null?STAR70.getCharPositionInLine():0));
                            	          checkArithmeticType((expr1!=null?expr1.type:null),(STAR70!=null?STAR70.getLine():0),(STAR70!=null?STAR70.getCharPositionInLine():0)); 
                            	          retval.type = (expr1!=null?expr1.type:null);
                                    }

                            }
                            break;
                        case 25 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:922:7: ^( DIV expr1= expr expr2= expr )
                            {
                            DIV71=(CommonTree)match(input,DIV,FOLLOW_DIV_in_expr2628); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2632);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2636);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            	          checkSameTypes((expr1!=null?expr1.type:null),(expr2!=null?expr2.type:null),"Error: can't divide  ",
                            	          (DIV71!=null?DIV71.getLine():0),(DIV71!=null?DIV71.getCharPositionInLine():0)); 
                            	          checkArithmeticType((expr1!=null?expr1.type:null),(DIV71!=null?DIV71.getLine():0),(DIV71!=null?DIV71.getCharPositionInLine():0)); 
                            	          retval.type = (expr1!=null?expr1.type:null);
                                    }

                            }
                            break;
                        case 26 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:929:7: ^( MOD expr1= expr expr2= expr )
                            {
                            MOD72=(CommonTree)match(input,MOD,FOLLOW_MOD_in_expr2669); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2673);
                            expr1=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            pushFollow(FOLLOW_expr_in_expr2677);
                            expr2=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            	          if(!(expr1!=null?expr1.type:null).getType().equals(Type.INTEGER) || 
                            	             !(expr2!=null?expr2.type:null).getType().equals(Type.INTEGER)) {
                            	               String msg = "Error: can't preform and " + (expr2!=null?expr2.type:null).getType() + " to " + (expr1!=null?expr1.type:null).getType();          
                            	               newError(fileName,msg,(MOD72!=null?MOD72.getLine():0),(MOD72!=null?MOD72.getCharPositionInLine():0));
                            	          }
                                        retval.type = new FullType(Type.INTEGER);
                                     }

                            }
                            break;
                        case 27 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:938:7: ^( UNARY_PLUS e= expr )
                            {
                            UNARY_PLUS73=(CommonTree)match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr2718); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2722);
                            e=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        checkArithmeticType((e!=null?e.type:null),(UNARY_PLUS73!=null?UNARY_PLUS73.getLine():0),(UNARY_PLUS73!=null?UNARY_PLUS73.getCharPositionInLine():0));
                            		        retval.type = (e!=null?e.type:null); 
                                    }

                            }
                            break;
                        case 28 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:943:7: ^( UNARY_MINUS e= expr )
                            {
                            UNARY_MINUS74=(CommonTree)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr2755); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2759);
                            e=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        checkArithmeticType((e!=null?e.type:null),(UNARY_MINUS74!=null?UNARY_MINUS74.getLine():0),(UNARY_MINUS74!=null?UNARY_MINUS74.getCharPositionInLine():0));
                            		        retval.type = (e!=null?e.type:null); 
                                    }

                            }
                            break;
                        case 29 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:948:7: ^( PRE_INC e= expr )
                            {
                            PRE_INC75=(CommonTree)match(input,PRE_INC,FOLLOW_PRE_INC_in_expr2791); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2795);
                            e=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        checkArithmeticType((e!=null?e.type:null),(PRE_INC75!=null?PRE_INC75.getLine():0),(PRE_INC75!=null?PRE_INC75.getCharPositionInLine():0));
                            		        checkIsVar((e!=null?e.type:null), "Error: left hand side is not a variable", (PRE_INC75!=null?PRE_INC75.getLine():0),(PRE_INC75!=null?PRE_INC75.getCharPositionInLine():0));
                            		        retval.type = (e!=null?e.type:null); 
                            		        retval.assignOrFunc = true;
                                    }

                            }
                            break;
                        case 30 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:955:7: ^( PRE_DEC e= expr )
                            {
                            PRE_DEC76=(CommonTree)match(input,PRE_DEC,FOLLOW_PRE_DEC_in_expr2836); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2840);
                            e=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        checkArithmeticType((e!=null?e.type:null),(PRE_DEC76!=null?PRE_DEC76.getLine():0),(PRE_DEC76!=null?PRE_DEC76.getCharPositionInLine():0));
                            		        checkIsVar((e!=null?e.type:null), "Error: left hand side is not a variable", (PRE_DEC76!=null?PRE_DEC76.getLine():0),(PRE_DEC76!=null?PRE_DEC76.getCharPositionInLine():0));
                            		        retval.type = (e!=null?e.type:null); 
                            		        retval.assignOrFunc = true;
                                    }

                            }
                            break;
                        case 31 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:962:7: ^( POST_INC e= expr )
                            {
                            POST_INC77=(CommonTree)match(input,POST_INC,FOLLOW_POST_INC_in_expr2877); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2881);
                            e=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        checkArithmeticType((e!=null?e.type:null),(POST_INC77!=null?POST_INC77.getLine():0),(POST_INC77!=null?POST_INC77.getCharPositionInLine():0));
                            		        checkIsVar((e!=null?e.type:null), "Error: left hand side is not a variable", (POST_INC77!=null?POST_INC77.getLine():0),(POST_INC77!=null?POST_INC77.getCharPositionInLine():0));
                            		        retval.type = (e!=null?e.type:null); 
                            		        retval.assignOrFunc = true;
                                    }

                            }
                            break;
                        case 32 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:969:7: ^( POST_DEC e= expr )
                            {
                            POST_DEC78=(CommonTree)match(input,POST_DEC,FOLLOW_POST_DEC_in_expr2917); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2921);
                            e=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        checkArithmeticType((e!=null?e.type:null),(POST_DEC78!=null?POST_DEC78.getLine():0),(POST_DEC78!=null?POST_DEC78.getCharPositionInLine():0) );
                            		        checkIsVar((e!=null?e.type:null), "Error: left hand side is not a variable", (PRE_DEC76!=null?PRE_DEC76.getLine():0),(PRE_DEC76!=null?PRE_DEC76.getCharPositionInLine():0));
                            		        retval.type = (e!=null?e.type:null); 
                            		        retval.assignOrFunc = true;
                                    }

                            }
                            break;
                        case 33 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:976:7: ^( NOT e= expr )
                            {
                            NOT79=(CommonTree)match(input,NOT,FOLLOW_NOT_in_expr2964); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr2968);
                            e=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        if(!(e!=null?e.type:null).getType().equals(Type.BOOLEAN)){
                            		            String msg = "Error: " + (e!=null?e.type:null).getType() +" is not a boolean type";          
                            		            newError(fileName,msg,(NOT79!=null?NOT79.getLine():0),(NOT79!=null?NOT79.getCharPositionInLine():0));
                                        }
                                        retval.type = new FullType(Type.BOOLEAN); 
                                    }

                            }
                            break;
                        case 34 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:984:7: ^( LOGICAL_NOT e= expr )
                            {
                            LOGICAL_NOT80=(CommonTree)match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr3014); if (state.failed) return retval;

                            match(input, Token.DOWN, null); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr3018);
                            e=expr();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input, Token.UP, null); if (state.failed) return retval;


                            if ( state.backtracking==0 ) { 
                            		        if(!(e!=null?e.type:null).getType().equals(Type.BOOLEAN)){
                            		            String msg = "Error: " + (e!=null?e.type:null).getType() +" is not a boolean type";          
                            		            newError(fileName,msg,(LOGICAL_NOT80!=null?LOGICAL_NOT80.getLine():0),(LOGICAL_NOT80!=null?LOGICAL_NOT80.getCharPositionInLine():0));
                            		        }
                            		        retval.type = new FullType(Type.BOOLEAN); 
                                    }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {   retval.type.setVar(false);  }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:995:9: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr3079);
                    primaryExpression81=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { 
                    	          retval.type = (primaryExpression81!=null?primaryExpression81.type:null); 
                    	          retval.assignOrFunc = (primaryExpression81!=null?primaryExpression81.assignOrFunc:false);
                            }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class primaryExpression_return extends TreeRuleReturnScope {
        public FullType type;
        public String name;
        public boolean assignOrFunc;
    };


    // $ANTLR start "primaryExpression"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1003:1: primaryExpression returns [FullType type,String name, boolean assignOrFunc] : ( ^( METHOD_CALL id= IDENT argList ) | ^( STRUCT_ACCESS structVar= primaryExpression structField= IDENT ) | ^( ARRAY_ELEMENT_ACCESS var= primaryExpression idx= expression ) | constant | 'true' | 'false' | 'null' | IDENT | LPAREN e= expr RPAREN );
    public final IavaTreeWalker.primaryExpression_return primaryExpression() throws RecognitionException {
        IavaTreeWalker.primaryExpression_return retval = new IavaTreeWalker.primaryExpression_return();
        retval.start = input.LT(1);

        int primaryExpression_StartIndex = input.index();

        CommonTree id=null;
        CommonTree structField=null;
        CommonTree METHOD_CALL83=null;
        CommonTree ARRAY_ELEMENT_ACCESS84=null;
        CommonTree IDENT86=null;
        IavaTreeWalker.primaryExpression_return structVar =null;

        IavaTreeWalker.primaryExpression_return var =null;

        IavaTreeWalker.expression_return idx =null;

        IavaTreeWalker.expr_return e =null;

        ArrayList<FullType> argList82 =null;

        FullType constant85 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1004:5: ( ^( METHOD_CALL id= IDENT argList ) | ^( STRUCT_ACCESS structVar= primaryExpression structField= IDENT ) | ^( ARRAY_ELEMENT_ACCESS var= primaryExpression idx= expression ) | constant | 'true' | 'false' | 'null' | IDENT | LPAREN e= expr RPAREN )
            int alt30=9;
            switch ( input.LA(1) ) {
            case METHOD_CALL:
                {
                alt30=1;
                }
                break;
            case STRUCT_ACCESS:
                {
                alt30=2;
                }
                break;
            case ARRAY_ELEMENT_ACCESS:
                {
                alt30=3;
                }
                break;
            case CHAR_LITERAL:
            case NUM_DOUBLE:
            case NUM_INT:
            case STRING_LITERAL:
                {
                alt30=4;
                }
                break;
            case 129:
                {
                alt30=5;
                }
                break;
            case 120:
                {
                alt30=6;
                }
                break;
            case 123:
                {
                alt30=7;
                }
                break;
            case IDENT:
                {
                alt30=8;
                }
                break;
            case LPAREN:
                {
                alt30=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1004:7: ^( METHOD_CALL id= IDENT argList )
                    {
                    METHOD_CALL83=(CommonTree)match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression3128); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3132); if (state.failed) return retval;

                    pushFollow(FOLLOW_argList_in_primaryExpression3134);
                    argList82=argList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { 
                    		          if(fst.isFuncCallOK(id.getText(),argList82)) {
                    			            if(argList82 == null) {
                    			               // No formal parameters
                    			            }
                    			            retval.type = fst.getFuncReturnType(id.getText(), argList82);
                    		          } else {
                    			            newError(fileName, fst.getLastErrMsg(), (METHOD_CALL83!=null?METHOD_CALL83.getLine():0), (METHOD_CALL83!=null?METHOD_CALL83.getCharPositionInLine():0));
                    			            retval.type = new FullType(Type.ERROR);
                    		          }
                    		          retval.assignOrFunc = true;
                    	        }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1018:9: ^( STRUCT_ACCESS structVar= primaryExpression structField= IDENT )
                    {
                    match(input,STRUCT_ACCESS,FOLLOW_STRUCT_ACCESS_in_primaryExpression3169); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression3173);
                    structVar=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    structField=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3177); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) {
                                 currentType = (structVar!=null?structVar.type:null); 
                                 if (currentType == null || currentType.getType() != Type.STRUCT) {
                    	               newError(fileName, "Variable " + (structVar!=null?structVar.name:null) + " is not a struct", 
                    	                        (structField!=null?structField.getLine():0), (structField!=null?structField.getCharPositionInLine():0));
                    	               currentType = new FullType(Type.ERROR);
                    	               retval.type = new FullType(Type.ERROR);
                                 }

                                 currentField = structField.getText();
                                 FullType ft = st.typeOfStructField(currentType, currentField);
                                 if (ft == null) {          
                    	               newError(fileName, st.getLastErrMsg(), (structField!=null?structField.getLine():0), (structField!=null?structField.getCharPositionInLine():0));
                    	               ft = new FullType(Type.ERROR);
                    	               retval.type = new FullType(Type.ERROR);
                                 }
                                 else {
                    	               retval.type = ft;
                    	               retval.type.setVar(true);
                                 }
                                 currentType = ft;
                                 retval.name = currentField;
                             }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1042:7: ^( ARRAY_ELEMENT_ACCESS var= primaryExpression idx= expression )
                    {
                    ARRAY_ELEMENT_ACCESS84=(CommonTree)match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression3204); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression3208);
                    var=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_primaryExpression3212);
                    idx=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { 
                    	          if(!(idx!=null?idx.type:null).getType().equals(Type.INTEGER))
                    	              newError(fileName,"Error: Array index should be of integer type.",(ARRAY_ELEMENT_ACCESS84!=null?ARRAY_ELEMENT_ACCESS84.getLine():0),(ARRAY_ELEMENT_ACCESS84!=null?ARRAY_ELEMENT_ACCESS84.getCharPositionInLine():0));
                    	          retval.name = (var!=null?var.name:null);
                    	          if(!(var!=null?var.type:null).getType().equals(Type.ARRAY)){
                    	              newError(fileName,"Error: variable " + (var!=null?var.name:null) + " of type " + (var!=null?var.type:null)+ " is not an array",(ARRAY_ELEMENT_ACCESS84!=null?ARRAY_ELEMENT_ACCESS84.getLine():0),(ARRAY_ELEMENT_ACCESS84!=null?ARRAY_ELEMENT_ACCESS84.getCharPositionInLine():0));
                    	              retval.type = (var!=null?var.type:null);
                    	              retval.type.setVar(true);
                    	          }
                    	          else {
                    	              retval.type = (var!=null?var.type:null).getArrayType();
                    	              retval.type.setVar(true);
                    	          }
                    	          // verify that var is an array and return relevant type
                            }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1058:7: constant
                    {
                    pushFollow(FOLLOW_constant_in_primaryExpression3232);
                    constant85=constant();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.type = constant85; }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1059:7: 'true'
                    {
                    match(input,129,FOLLOW_129_in_primaryExpression3255); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.type = new FullType(Type.BOOLEAN); }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1060:7: 'false'
                    {
                    match(input,120,FOLLOW_120_in_primaryExpression3280); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.type = new FullType(Type.BOOLEAN); }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1061:7: 'null'
                    {
                    match(input,123,FOLLOW_123_in_primaryExpression3304); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.type = new FullType(Type.NULL); }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1062:7: IDENT
                    {
                    IDENT86=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3329); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                    			     if ( st.typeOfVar(IDENT86.getText()) == null) {
                    	              newError(fileName, st.getLastErrMsg(), (IDENT86!=null?IDENT86.getLine():0), (IDENT86!=null?IDENT86.getCharPositionInLine():0));
                    	              retval.type = new FullType(Type.ERROR);
                    			     } 
                    			     else {
                    			          retval.type = st.typeOfVar(IDENT86.getText()); 
                    			          retval.type.setVar(true);  
                    			          retval.name = new String(IDENT86.getText());
                    			     }
                    	      }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1074:7: LPAREN e= expr RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3363); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_primaryExpression3367);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3369); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.type = (e!=null?e.type:null); retval.type.setVar(false); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, primaryExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primaryExpression"



    // $ANTLR start "expressionList"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1079:1: expressionList returns [ArrayList<FullType> types] :e1= expression (e2= expression )* ;
    public final ArrayList<FullType> expressionList() throws RecognitionException {
        ArrayList<FullType> types = null;

        int expressionList_StartIndex = input.index();

        IavaTreeWalker.expression_return e1 =null;

        IavaTreeWalker.expression_return e2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return types; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1080:3: (e1= expression (e2= expression )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1080:21: e1= expression (e2= expression )*
            {
            if ( state.backtracking==0 ) {types = new ArrayList(); /* exNOTplist::new */}

            pushFollow(FOLLOW_expression_in_expressionList3423);
            e1=expression();

            state._fsp--;
            if (state.failed) return types;

            if ( state.backtracking==0 ) {types.add((e1!=null?e1.type:null));/* explist::add1 */}

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1082:5: (e2= expression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==EXPR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1082:6: e2= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList3437);
            	    e2=expression();

            	    state._fsp--;
            	    if (state.failed) return types;

            	    if ( state.backtracking==0 ) {types.add((e2!=null?e2.type:null)); /* explist::add2 */}

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, expressionList_StartIndex); }

        }
        return types;
    }
    // $ANTLR end "expressionList"



    // $ANTLR start "argList"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1086:1: argList returns [ArrayList<FullType> types] : ( expressionList | EMPTY );
    public final ArrayList<FullType> argList() throws RecognitionException {
        ArrayList<FullType> types = null;

        int argList_StartIndex = input.index();

        ArrayList<FullType> expressionList87 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return types; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1087:3: ( expressionList | EMPTY )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==EXPR) ) {
                alt32=1;
            }
            else if ( (LA32_0==EMPTY) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return types;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1087:6: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_argList3466);
                    expressionList87=expressionList();

                    state._fsp--;
                    if (state.failed) return types;

                    if ( state.backtracking==0 ) { types = expressionList87; /* argList::other */ }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1088:7: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_argList3476); if (state.failed) return types;

                    if ( state.backtracking==0 ) { types = new ArrayList();/* argList::EMPTY */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, argList_StartIndex); }

        }
        return types;
    }
    // $ANTLR end "argList"



    // $ANTLR start "constant"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1091:1: constant returns [FullType type] : ( NUM_INT | CHAR_LITERAL | STRING_LITERAL | NUM_DOUBLE );
    public final FullType constant() throws RecognitionException {
        FullType type = null;

        int constant_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1092:3: ( NUM_INT | CHAR_LITERAL | STRING_LITERAL | NUM_DOUBLE )
            int alt33=4;
            switch ( input.LA(1) ) {
            case NUM_INT:
                {
                alt33=1;
                }
                break;
            case CHAR_LITERAL:
                {
                alt33=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt33=3;
                }
                break;
            case NUM_DOUBLE:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1092:5: NUM_INT
                    {
                    match(input,NUM_INT,FOLLOW_NUM_INT_in_constant3509); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.INTEGER); }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1093:5: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_constant3525); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.CHAR); }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1094:5: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant3536); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.STRING); }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:1095:5: NUM_DOUBLE
                    {
                    match(input,NUM_DOUBLE,FOLLOW_NUM_DOUBLE_in_constant3546); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.REAL); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, constant_StartIndex); }

        }
        return type;
    }
    // $ANTLR end "constant"

    // $ANTLR start synpred3_IavaTreeWalker
    public final void synpred3_IavaTreeWalker_fragment() throws RecognitionException {
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:192:37: ( parameterDeclarationList )
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:192:37: parameterDeclarationList
        {
        pushFollow(FOLLOW_parameterDeclarationList_in_synpred3_IavaTreeWalker155);
        parameterDeclarationList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_IavaTreeWalker

    // $ANTLR start synpred15_IavaTreeWalker
    public final void synpred15_IavaTreeWalker_fragment() throws RecognitionException {
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:295:5: ( ( LBRACK RBRACK )* )
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:295:5: ( LBRACK RBRACK )*
        {
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:296:5: ( LBRACK RBRACK )*
        loop37:
        do {
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LBRACK) ) {
                alt37=1;
            }


            switch (alt37) {
        	case 1 :
        	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\IavaTreeWalker.g:296:6: LBRACK RBRACK
        	    {
        	    match(input,LBRACK,FOLLOW_LBRACK_in_synpred15_IavaTreeWalker436); if (state.failed) return ;

        	    match(input,RBRACK,FOLLOW_RBRACK_in_synpred15_IavaTreeWalker439); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop37;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred15_IavaTreeWalker

    // Delegated rules

    public final boolean synpred15_IavaTreeWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_IavaTreeWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_IavaTreeWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_IavaTreeWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_START_PROG_in_compilationUnit103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_funcOrVar_in_compilationUnit105 = new BitSet(new long[]{0x0000480000000008L,0x0000010000000000L});
    public static final BitSet FOLLOW_EOF_in_compilationUnit123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_DECL_in_funcOrVar147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeSpec_in_funcOrVar149 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_funcOrVar153 = new BitSet(new long[]{0x0000000000000800L,0x0000000000020000L});
    public static final BitSet FOLLOW_parameterDeclarationList_in_funcOrVar155 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_compoundStatement_in_funcOrVar160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRUCT_DECL_in_funcOrVar172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_funcOrVar176 = new BitSet(new long[]{0x0000000000000000L,0xD412000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_structMembersList_in_funcOrVar180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GLOBAL_STATEMENT_in_funcOrVar197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_funcOrVar199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_builtInType_in_typeSpec225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInType_in_typeSpec235 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LBRACK_in_typeSpec247 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_typeSpec250 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_structUsage_in_typeSpec297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECL_in_declaration318 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeSpec_in_declaration320 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_variableDefinitions_in_declaration322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_130_in_builtInType353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_builtInType364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_builtInType372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_builtInType383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_builtInType392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_builtInType403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayBrackets436 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayBrackets439 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayBrackets481 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expression_in_arrayBrackets483 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayBrackets485 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDefinitions520 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_variableDefinitions537 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDefinitions547 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclarator584 = new BitSet(new long[]{0x0100000000000100L});
    public static final BitSet FOLLOW_arrayBrackets_in_variableDeclarator588 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_varInitializer_in_variableDeclarator590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_varInitializer631 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_initializer_in_varInitializer635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_initializer669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_initializer716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer749 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_initializer_in_arrayInitializer758 = new BitSet(new long[]{0x0000002000000048L});
    public static final BitSet FOLLOW_structMember_in_structMembersList822 = new BitSet(new long[]{0x0000000000000002L,0xD412000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeSpec_in_structMember860 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_structMember862 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_arrayBrackets_in_structMember864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_structUsage893 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_structUsage897 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_structUsage900 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_structUsage903 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_parameterDeclaration_in_parameterDeclarationList954 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_parameterDeclarationList974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parameterDeclaration_in_parameterDeclarationList980 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_PARAM_DECL_in_parameterDeclaration1025 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeSpec_in_parameterDeclaration1027 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_parameterDeclaration1029 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_arrayBrackets_in_parameterDeclaration1031 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_compoundStatement1076 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_compoundStatement1081 = new BitSet(new long[]{0x002000C481008808L,0x0000620008000000L});
    public static final BitSet FOLLOW_compoundStatement_in_statement1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_statement1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_statement1121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement1147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1167 = new BitSet(new long[]{0x002000C481008800L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_statement1171 = new BitSet(new long[]{0x002000C481008808L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_statement1177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement1201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement1221 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_forCond_in_statement1223 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_forIter_in_statement1225 = new BitSet(new long[]{0x002000C481008800L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_statement1227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement1247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1266 = new BitSet(new long[]{0x002000C481008800L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_statement1268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement1287 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1306 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expression_in_statement1308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1370 = new BitSet(new long[]{0x0000000008100008L});
    public static final BitSet FOLLOW_casesGroup_in_statement1394 = new BitSet(new long[]{0x0000000008100008L});
    public static final BitSet FOLLOW_EMPTY_in_statement1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit1460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_forInit1462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit1470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_forInit1472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_CONDITION_in_forCond1494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCond1496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_ITER_in_forIter1530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_forIter1532 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_aCase_in_casesGroup1565 = new BitSet(new long[]{0x002000C481008802L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_casesGroup1583 = new BitSet(new long[]{0x002000C481008802L,0x0000620008000000L});
    public static final BitSet FOLLOW_CASE_in_aCase1613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_aCase1615 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFAULT_in_aCase1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPR_in_expression1651 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression1655 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr1701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1705 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1709 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_expr1728 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1732 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1736 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_expr1756 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1760 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1764 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_expr1787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1791 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_expr1821 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1825 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1829 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_ASSIGN_in_expr1854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1858 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1862 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_ASSIGN_in_expr1886 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1890 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1894 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BXOR_ASSIGN_in_expr1914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1918 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1922 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_expr1947 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1951 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1955 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_in_expr1982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1986 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1990 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_expr1992 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1996 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOR_in_expr2018 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2022 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2026 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAND_in_expr2060 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2064 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2068 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_in_expr2106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2110 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BXOR_in_expr2153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2157 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_in_expr2195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2199 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr2238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2242 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr2279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2283 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_expr2319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2323 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_expr2364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2368 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2372 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_expr2411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2415 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expr2458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2462 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2466 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr2501 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2505 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr2542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2546 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2550 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr2587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2591 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2595 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr2628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2632 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2636 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr2669 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2673 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr2718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr2755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_expr2791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_expr2836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2840 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_expr2877 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2881 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_expr2917 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr2964 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2968 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr3014 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression3128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3132 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_argList_in_primaryExpression3134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRUCT_ACCESS_in_primaryExpression3169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3173 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression3204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3208 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression3212 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_primaryExpression3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_primaryExpression3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_primaryExpression3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_primaryExpression3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3363 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_primaryExpression3367 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList3423 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList3437 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_expressionList_in_argList3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_argList3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_INT_in_constant3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_constant3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_constant3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_DOUBLE_in_constant3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameterDeclarationList_in_synpred3_IavaTreeWalker155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_synpred15_IavaTreeWalker436 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_synpred15_IavaTreeWalker439 = new BitSet(new long[]{0x0100000000000002L});

}