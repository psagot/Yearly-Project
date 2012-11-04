// $ANTLR 3.4 C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g 2012-06-22 10:58:33

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
public class FuncTreeWalker extends TreeParser {
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


    public FuncTreeWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public FuncTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[120+1];
         

    }

    public String[] getTokenNames() { return FuncTreeWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g"; }

      

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
      



    // $ANTLR start "compilationUnit"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:77:1: compilationUnit : ( ^( START_PROG ( funcOrVar )* ) | EOF );
    public final void compilationUnit() throws RecognitionException {
        int compilationUnit_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:78:5: ( ^( START_PROG ( funcOrVar )* ) | EOF )
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
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:78:7: ^( START_PROG ( funcOrVar )* )
                    {
                    if ( state.backtracking==0 ) {
                            StdLib.genFuncSymbolTable(fst);   ///Add StdLib functions to function symbol table
                          }

                    match(input,START_PROG,FOLLOW_START_PROG_in_compilationUnit98); if (state.failed) return ;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return ;
                        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:81:18: ( funcOrVar )*
                        loop1:
                        do {
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==FUNC_DECL||LA1_0==GLOBAL_STATEMENT||LA1_0==STRUCT_DECL) ) {
                                alt1=1;
                            }


                            switch (alt1) {
                        	case 1 :
                        	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:81:18: funcOrVar
                        	    {
                        	    pushFollow(FOLLOW_funcOrVar_in_compilationUnit100);
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


                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:82:7: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_compilationUnit110); if (state.failed) return ;

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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:86:1: funcOrVar : ( ^( FUNC_DECL typeSpec id= IDENT ( parameterDeclarationList )? compoundStatement ) | ^( STRUCT_DECL id= IDENT structMembersList ) | ^( GLOBAL_STATEMENT statement ) );
    public final void funcOrVar() throws RecognitionException {
        int funcOrVar_StartIndex = input.index();

        CommonTree id=null;
        CommonTree FUNC_DECL3=null;
        CommonTree STRUCT_DECL5=null;
        ArrayList<NameType> parameterDeclarationList1 =null;

        FullType typeSpec2 =null;

        ArrayList<NameType> structMembersList4 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:87:5: ( ^( FUNC_DECL typeSpec id= IDENT ( parameterDeclarationList )? compoundStatement ) | ^( STRUCT_DECL id= IDENT structMembersList ) | ^( GLOBAL_STATEMENT statement ) )
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
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:87:7: ^( FUNC_DECL typeSpec id= IDENT ( parameterDeclarationList )? compoundStatement )
                    {
                    FUNC_DECL3=(CommonTree)match(input,FUNC_DECL,FOLLOW_FUNC_DECL_in_funcOrVar137); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_typeSpec_in_funcOrVar139);
                    typeSpec2=typeSpec();

                    state._fsp--;
                    if (state.failed) return ;

                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_funcOrVar143); if (state.failed) return ;

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:87:37: ( parameterDeclarationList )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==PARAM_DECL) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==BLOCK_SCOPE) ) {
                        int LA3_2 = input.LA(2);

                        if ( (synpred3_FuncTreeWalker()) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:87:37: parameterDeclarationList
                            {
                            pushFollow(FOLLOW_parameterDeclarationList_in_funcOrVar145);
                            parameterDeclarationList1=parameterDeclarationList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                              ArrayList<FullType> types = new ArrayList<FullType>();
                              for(NameType nameType : parameterDeclarationList1) {
                                types.add(nameType.type);
                              }
                              
                              if(fst.addFunc(id.getText(), typeSpec2, types) == -1) {
                                newError(fileName, fst.getLastErrMsg(), (FUNC_DECL3!=null?FUNC_DECL3.getLine():0), (FUNC_DECL3!=null?FUNC_DECL3.getCharPositionInLine():0));
                              }     
                            }

                    pushFollow(FOLLOW_compoundStatement_in_funcOrVar150);
                    compoundStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:97:7: ^( STRUCT_DECL id= IDENT structMembersList )
                    {
                    STRUCT_DECL5=(CommonTree)match(input,STRUCT_DECL,FOLLOW_STRUCT_DECL_in_funcOrVar160); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_funcOrVar164); if (state.failed) return ;

                    pushFollow(FOLLOW_structMembersList_in_funcOrVar166);
                    structMembersList4=structMembersList();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    if ( state.backtracking==0 ) { 
                              ///Add new struct to symtab (and check that does not exist).
                              ArrayList<FullType> fieldsType = new ArrayList<FullType>();
                              ArrayList<String> fieldsName = new ArrayList<String>();
                              
                              for(NameType nameType : structMembersList4) {
                                fieldsType.add(nameType.type);
                                fieldsName.add(nameType.name);
                              }
                              
                              if (st.addStructType(id.getText(), fieldsType, fieldsName) != 0) {
                                newError(fileName, st.getLastErrMsg(), (STRUCT_DECL5!=null?STRUCT_DECL5.getLine():0), (STRUCT_DECL5!=null?STRUCT_DECL5.getCharPositionInLine():0));
                              }
                            }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:112:7: ^( GLOBAL_STATEMENT statement )
                    {
                    match(input,GLOBAL_STATEMENT,FOLLOW_GLOBAL_STATEMENT_in_funcOrVar187); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_funcOrVar189);
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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:116:1: typeSpec returns [FullType type] : ( builtInType | builtInType ( LBRACK RBRACK )+ | structUsage );
    public final FullType typeSpec() throws RecognitionException {
        FullType type = null;

        int typeSpec_StartIndex = input.index();

        FullType builtInType6 =null;

        FullType builtInType7 =null;

        FullType structUsage8 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:117:5: ( builtInType | builtInType ( LBRACK RBRACK )+ | structUsage )
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
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:117:7: builtInType
                    {
                    pushFollow(FOLLOW_builtInType_in_typeSpec220);
                    builtInType6=builtInType();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = builtInType6; }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:118:7: builtInType ( LBRACK RBRACK )+
                    {
                    pushFollow(FOLLOW_builtInType_in_typeSpec230);
                    builtInType7=builtInType();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) {counter = 0;}

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:119:7: ( LBRACK RBRACK )+
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
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:119:8: LBRACK RBRACK
                    	    {
                    	    match(input,LBRACK,FOLLOW_LBRACK_in_typeSpec242); if (state.failed) return type;

                    	    match(input,RBRACK,FOLLOW_RBRACK_in_typeSpec245); if (state.failed) return type;

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
                                  type = new FullType(Type.ARRAY, builtInType7,counter);
                              }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:127:7: structUsage
                    {
                    pushFollow(FOLLOW_structUsage_in_typeSpec292);
                    structUsage8=structUsage();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = structUsage8; }

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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:131:1: declaration : ^( VAR_DECL typeSpec variableDefinitions ) ;
    public final void declaration() throws RecognitionException {
        int declaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:132:3: ( ^( VAR_DECL typeSpec variableDefinitions ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:132:5: ^( VAR_DECL typeSpec variableDefinitions )
            {
            match(input,VAR_DECL,FOLLOW_VAR_DECL_in_declaration313); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_typeSpec_in_declaration315);
            typeSpec();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_variableDefinitions_in_declaration317);
            variableDefinitions();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:136:1: builtInType returns [FullType type] : ( 'void' | 'boolean' | 'char' | 'integer' | 'real' | 'string' );
    public final FullType builtInType() throws RecognitionException {
        FullType type = null;

        int builtInType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:137:3: ( 'void' | 'boolean' | 'char' | 'integer' | 'real' | 'string' )
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
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:137:5: 'void'
                    {
                    match(input,130,FOLLOW_130_in_builtInType339); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.VOID); }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:138:5: 'boolean'
                    {
                    match(input,113,FOLLOW_113_in_builtInType350); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.BOOLEAN); }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:139:5: 'char'
                    {
                    match(input,116,FOLLOW_116_in_builtInType358); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.CHAR); }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:140:5: 'integer'
                    {
                    match(input,122,FOLLOW_122_in_builtInType369); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.INTEGER); }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:141:5: 'real'
                    {
                    match(input,124,FOLLOW_124_in_builtInType378); if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = new FullType(Type.REAL); }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:142:5: 'string'
                    {
                    match(input,126,FOLLOW_126_in_builtInType389); if (state.failed) return type;

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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:148:1: arrayBrackets returns [boolean used, int dimension, boolean fixedSize] : ( ( LBRACK RBRACK )* | ( LBRACK expression RBRACK )* );
    public final FuncTreeWalker.arrayBrackets_return arrayBrackets() throws RecognitionException {
        FuncTreeWalker.arrayBrackets_return retval = new FuncTreeWalker.arrayBrackets_return();
        retval.start = input.LT(1);

        int arrayBrackets_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:149:3: ( ( LBRACK RBRACK )* | ( LBRACK expression RBRACK )* )
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

                if ( (synpred15_FuncTreeWalker()) ) {
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

                if ( (synpred15_FuncTreeWalker()) ) {
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

                if ( (synpred15_FuncTreeWalker()) ) {
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

                if ( (synpred15_FuncTreeWalker()) ) {
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

                if ( (synpred15_FuncTreeWalker()) ) {
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

                if ( (synpred15_FuncTreeWalker()) ) {
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

                if ( (synpred15_FuncTreeWalker()) ) {
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

                if ( (synpred15_FuncTreeWalker()) ) {
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

                if ( (synpred15_FuncTreeWalker()) ) {
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

                if ( (synpred15_FuncTreeWalker()) ) {
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

                if ( (synpred15_FuncTreeWalker()) ) {
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
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:149:7: ( LBRACK RBRACK )*
                    {
                    if ( state.backtracking==0 ) {retval.used = false; retval.dimension =0;}

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:150:5: ( LBRACK RBRACK )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==LBRACK) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:150:6: LBRACK RBRACK
                    	    {
                    	    match(input,LBRACK,FOLLOW_LBRACK_in_arrayBrackets424); if (state.failed) return retval;

                    	    match(input,RBRACK,FOLLOW_RBRACK_in_arrayBrackets427); if (state.failed) return retval;

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
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:153:7: ( LBRACK expression RBRACK )*
                    {
                    if ( state.backtracking==0 ) {retval.used = false; retval.dimension =0;}

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:154:5: ( LBRACK expression RBRACK )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==LBRACK) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:154:6: LBRACK expression RBRACK
                    	    {
                    	    match(input,LBRACK,FOLLOW_LBRACK_in_arrayBrackets471); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_arrayBrackets473);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    match(input,RBRACK,FOLLOW_RBRACK_in_arrayBrackets475); if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) {
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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:164:1: variableDefinitions returns [ArrayList<NameType> nametypes] : var1= variableDeclarator ( COMMA var2= variableDeclarator )* ;
    public final ArrayList<NameType> variableDefinitions() throws RecognitionException {
        ArrayList<NameType> nametypes = null;

        int variableDefinitions_StartIndex = input.index();

        FuncTreeWalker.variableDeclarator_return var1 =null;

        FuncTreeWalker.variableDeclarator_return var2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return nametypes; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:165:3: (var1= variableDeclarator ( COMMA var2= variableDeclarator )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:165:5: var1= variableDeclarator ( COMMA var2= variableDeclarator )*
            {
            pushFollow(FOLLOW_variableDeclarator_in_variableDefinitions514);
            var1=variableDeclarator();

            state._fsp--;
            if (state.failed) return nametypes;

            if ( state.backtracking==0 ) { 
                    nametypes = new ArrayList<NameType>();
                    if((var1!=null?var1.needBrackets:false))
                        nametypes.add(new NameType((var1!=null?var1.name:null), (var1!=null?var1.type:null), true));
                    else   {
                        nametypes.add(new NameType((var1!=null?var1.name:null),(var1!=null?var1.type:null)));
                    }
                  }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:174:5: ( COMMA var2= variableDeclarator )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:174:7: COMMA var2= variableDeclarator
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_variableDefinitions531); if (state.failed) return nametypes;

            	    pushFollow(FOLLOW_variableDeclarator_in_variableDefinitions541);
            	    var2=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return nametypes;

            	    if ( state.backtracking==0 ) { 
            	            if((var2!=null?var2.needBrackets:false))
            	                  nametypes.add(new NameType((var2!=null?var2.name:null), (var2!=null?var2.type:null), true));
            	            else
            	                  nametypes.add(new NameType((var2!=null?var2.name:null),(var2!=null?var2.type:null))); 
            	                
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
    };


    // $ANTLR start "variableDeclarator"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:187:1: variableDeclarator returns [String name,FullType type,boolean needBrackets] : IDENT a= arrayBrackets varInitializer ;
    public final FuncTreeWalker.variableDeclarator_return variableDeclarator() throws RecognitionException {
        FuncTreeWalker.variableDeclarator_return retval = new FuncTreeWalker.variableDeclarator_return();
        retval.start = input.LT(1);

        int variableDeclarator_StartIndex = input.index();

        CommonTree IDENT9=null;
        FuncTreeWalker.arrayBrackets_return a =null;

        FuncTreeWalker.varInitializer_return varInitializer10 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:188:3: ( IDENT a= arrayBrackets varInitializer )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:188:5: IDENT a= arrayBrackets varInitializer
            {
            IDENT9=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variableDeclarator578); if (state.failed) return retval;

            pushFollow(FOLLOW_arrayBrackets_in_variableDeclarator582);
            a=arrayBrackets();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_varInitializer_in_variableDeclarator584);
            varInitializer10=varInitializer();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {       
                  retval.needBrackets = false;
                  retval.name = IDENT9.getText(); 
                  if((a!=null?a.used:false)) {     
                      if((varInitializer10!=null?varInitializer10.used:false))      
                          retval.type = (varInitializer10!=null?varInitializer10.type:null);
                      else
                        retval.type = new FullType(Type.ARRAY,new FullType (Type.UNSET),(a!=null?a.dimension:0));
                  }
                  else {
                      if((varInitializer10!=null?varInitializer10.used:false)){
                          if((varInitializer10!=null?varInitializer10.dimension:0) > 0)
                              retval.needBrackets = true;

                         retval.type = (varInitializer10!=null?varInitializer10.type:null);
                      }
                      else{
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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:213:1: varInitializer returns [FullType type, boolean used,int dimension] : ( ASSIGN i= initializer )? ;
    public final FuncTreeWalker.varInitializer_return varInitializer() throws RecognitionException {
        FuncTreeWalker.varInitializer_return retval = new FuncTreeWalker.varInitializer_return();
        retval.start = input.LT(1);

        int varInitializer_StartIndex = input.index();

        FuncTreeWalker.initializer_return i =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:214:3: ( ( ASSIGN i= initializer )? )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:214:7: ( ASSIGN i= initializer )?
            {
            if ( state.backtracking==0 ) {
                    retval.used = false;
                    arrInitCurrNesting = 0;
                    arrInitPrevNesting = 0;
                    prevType = new FullType(Type.UNSET);
                  }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:220:4: ( ASSIGN i= initializer )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ASSIGN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:220:6: ASSIGN i= initializer
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_varInitializer625); if (state.failed) return retval;

                    pushFollow(FOLLOW_initializer_in_varInitializer629);
                    i=initializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.used = true;}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:230:1: initializer returns [FullType type,int dimension] : ( expression | arrayInitializer );
    public final FuncTreeWalker.initializer_return initializer() throws RecognitionException {
        FuncTreeWalker.initializer_return retval = new FuncTreeWalker.initializer_return();
        retval.start = input.LT(1);

        int initializer_StartIndex = input.index();

        FullType expression11 =null;

        FuncTreeWalker.arrayInitializer_return arrayInitializer12 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:231:3: ( expression | arrayInitializer )
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
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:231:5: expression
                    {
                    pushFollow(FOLLOW_expression_in_initializer663);
                    expression11=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                              if (arrInitCurrNesting > 0) {
                                 retval.type = new FullType(Type.ARRAY,expression11,arrInitCurrNesting);
                                 retval.dimension = arrInitCurrNesting;
                                 arrInitPrevNesting = arrInitCurrNesting;
                              }
                              else {
                                 retval.dimension = 0; 
                                 retval.type = expression11;
                             }
                          }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:244:7: arrayInitializer
                    {
                    if ( state.backtracking==0 ) {
                              ++arrInitCurrNesting;
                          }

                    pushFollow(FOLLOW_arrayInitializer_in_initializer711);
                    arrayInitializer12=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                              --arrInitCurrNesting;
                              retval.dimension = (arrayInitializer12!=null?arrayInitializer12.dimension:0);
                              retval.type = (arrayInitializer12!=null?arrayInitializer12.type:null);
                          
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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:258:1: arrayInitializer returns [FullType type,int dimension] : ^( ARRAY_INITIALIZER ( initializer )* ) ;
    public final FuncTreeWalker.arrayInitializer_return arrayInitializer() throws RecognitionException {
        FuncTreeWalker.arrayInitializer_return retval = new FuncTreeWalker.arrayInitializer_return();
        retval.start = input.LT(1);

        int arrayInitializer_StartIndex = input.index();

        FuncTreeWalker.initializer_return initializer13 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:259:3: ( ^( ARRAY_INITIALIZER ( initializer )* ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:259:5: ^( ARRAY_INITIALIZER ( initializer )* )
            {
            match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer744); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:260:5: ( initializer )*
                loop14:
                do {
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ARRAY_INITIALIZER||LA14_0==EXPR) ) {
                        alt14=1;
                    }


                    switch (alt14) {
                	case 1 :
                	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:260:7: initializer
                	    {
                	    pushFollow(FOLLOW_initializer_in_arrayInitializer753);
                	    initializer13=initializer();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    if ( state.backtracking==0 ) {
                	              prevType =  (initializer13!=null?initializer13.type:null);
                	              retval.dimension = (initializer13!=null?initializer13.dimension:0);
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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:274:1: structMembersList returns [ArrayList<NameType> nametypes] : ( structMember )+ ;
    public final ArrayList<NameType> structMembersList() throws RecognitionException {
        ArrayList<NameType> nametypes = null;

        int structMembersList_StartIndex = input.index();

        FuncTreeWalker.structMember_return structMember14 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return nametypes; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:275:3: ( ( structMember )+ )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:275:5: ( structMember )+
            {
            if ( state.backtracking==0 ) {nametypes = new ArrayList<NameType>();}

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:276:5: ( structMember )+
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
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:276:6: structMember
            	    {
            	    pushFollow(FOLLOW_structMember_in_structMembersList814);
            	    structMember14=structMember();

            	    state._fsp--;
            	    if (state.failed) return nametypes;

            	    if ( state.backtracking==0 ) {
            	            if((structMember14!=null?structMember14.type:null).getInnerType() == Type.VOID) {
            	                nametypes.add(new NameType((structMember14!=null?structMember14.name:null), new FullType(Type.ERROR)));
            	            }
            	            else
            	                nametypes.add(new NameType((structMember14!=null?structMember14.name:null), (structMember14!=null?structMember14.type:null)));
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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:288:1: structMember returns [String name,FullType type] : typeSpec IDENT arrayBrackets ;
    public final FuncTreeWalker.structMember_return structMember() throws RecognitionException {
        FuncTreeWalker.structMember_return retval = new FuncTreeWalker.structMember_return();
        retval.start = input.LT(1);

        int structMember_StartIndex = input.index();

        CommonTree IDENT16=null;
        FullType typeSpec15 =null;

        FuncTreeWalker.arrayBrackets_return arrayBrackets17 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:289:3: ( typeSpec IDENT arrayBrackets )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:289:5: typeSpec IDENT arrayBrackets
            {
            pushFollow(FOLLOW_typeSpec_in_structMember852);
            typeSpec15=typeSpec();

            state._fsp--;
            if (state.failed) return retval;

            IDENT16=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_structMember854); if (state.failed) return retval;

            pushFollow(FOLLOW_arrayBrackets_in_structMember856);
            arrayBrackets17=arrayBrackets();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                  retval.type = typeSpec15;
                  retval.name = IDENT16.getText();
                  if ((arrayBrackets17!=null?arrayBrackets17.used:false)) {
                      retval.type = new FullType(Type.ARRAY, typeSpec15);
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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:300:1: structUsage returns [FullType type] : 'struct' id= IDENT ( LBRACK RBRACK )* ;
    public final FullType structUsage() throws RecognitionException {
        FullType type = null;

        int structUsage_StartIndex = input.index();

        CommonTree id=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:301:3: ( 'struct' id= IDENT ( LBRACK RBRACK )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:301:6: 'struct' id= IDENT ( LBRACK RBRACK )*
            {
            match(input,127,FOLLOW_127_in_structUsage885); if (state.failed) return type;

            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_structUsage889); if (state.failed) return type;

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:301:24: ( LBRACK RBRACK )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LBRACK) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:301:25: LBRACK RBRACK
            	    {
            	    match(input,LBRACK,FOLLOW_LBRACK_in_structUsage892); if (state.failed) return type;

            	    match(input,RBRACK,FOLLOW_RBRACK_in_structUsage895); if (state.failed) return type;

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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:311:1: parameterDeclarationList returns [ArrayList<NameType> nametypes] : (p1= parameterDeclaration ( COMMA p2= parameterDeclaration )* )? ;
    public final ArrayList<NameType> parameterDeclarationList() throws RecognitionException {
        ArrayList<NameType> nametypes = null;

        int parameterDeclarationList_StartIndex = input.index();

        FuncTreeWalker.parameterDeclaration_return p1 =null;

        FuncTreeWalker.parameterDeclaration_return p2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return nametypes; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:312:3: ( (p1= parameterDeclaration ( COMMA p2= parameterDeclaration )* )? )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:312:9: (p1= parameterDeclaration ( COMMA p2= parameterDeclaration )* )?
            {
            if ( state.backtracking==0 ) {nametypes = new ArrayList<NameType>();}

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:313:5: (p1= parameterDeclaration ( COMMA p2= parameterDeclaration )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==PARAM_DECL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:313:7: p1= parameterDeclaration ( COMMA p2= parameterDeclaration )*
                    {
                    pushFollow(FOLLOW_parameterDeclaration_in_parameterDeclarationList946);
                    p1=parameterDeclaration();

                    state._fsp--;
                    if (state.failed) return nametypes;

                    if ( state.backtracking==0 ) { nametypes.add(new NameType((p1!=null?p1.name:null), (p1!=null?p1.type:null)));}

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:315:5: ( COMMA p2= parameterDeclaration )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:315:7: COMMA p2= parameterDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_parameterDeclarationList966); if (state.failed) return nametypes;

                    	    pushFollow(FOLLOW_parameterDeclaration_in_parameterDeclarationList972);
                    	    p2=parameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return nametypes;

                    	    if ( state.backtracking==0 ) {nametypes.add(new NameType((p2!=null?p2.name:null), (p2!=null?p2.type:null)));}

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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:322:1: parameterDeclaration returns [String name,FullType type] : ^( PARAM_DECL typeSpec IDENT arrayBrackets ) ;
    public final FuncTreeWalker.parameterDeclaration_return parameterDeclaration() throws RecognitionException {
        FuncTreeWalker.parameterDeclaration_return retval = new FuncTreeWalker.parameterDeclaration_return();
        retval.start = input.LT(1);

        int parameterDeclaration_StartIndex = input.index();

        CommonTree IDENT19=null;
        FullType typeSpec18 =null;

        FuncTreeWalker.arrayBrackets_return arrayBrackets20 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:323:3: ( ^( PARAM_DECL typeSpec IDENT arrayBrackets ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:323:5: ^( PARAM_DECL typeSpec IDENT arrayBrackets )
            {
            match(input,PARAM_DECL,FOLLOW_PARAM_DECL_in_parameterDeclaration1017); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_typeSpec_in_parameterDeclaration1019);
            typeSpec18=typeSpec();

            state._fsp--;
            if (state.failed) return retval;

            IDENT19=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_parameterDeclaration1021); if (state.failed) return retval;

            pushFollow(FOLLOW_arrayBrackets_in_parameterDeclaration1023);
            arrayBrackets20=arrayBrackets();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            if ( state.backtracking==0 ) { 
                    retval.type = typeSpec18;
                    retval.name = IDENT19.getText();
                    if ((arrayBrackets20!=null?arrayBrackets20.used:false)) {
                      retval.type = new FullType(Type.ARRAY, typeSpec18);
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
            if ( state.backtracking>0 ) { memoize(input, 16, parameterDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parameterDeclaration"



    // $ANTLR start "compoundStatement"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:340:1: compoundStatement : ^( BLOCK_SCOPE ( statement )* ) ;
    public final void compoundStatement() throws RecognitionException {
        int compoundStatement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:341:2: ( ^( BLOCK_SCOPE ( statement )* ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:341:4: ^( BLOCK_SCOPE ( statement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_compoundStatement1063); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:341:18: ( statement )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==BLOCK_SCOPE||LA19_0==BREAK||LA19_0==CONTINUE||LA19_0==DO||LA19_0==EMPTY||(LA19_0 >= EXPRESSION && LA19_0 <= FOR)||LA19_0==IF||LA19_0==RETURN||LA19_0==SWITCH||(LA19_0 >= VAR_DECL && LA19_0 <= WHILE)) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:341:19: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_compoundStatement1066);
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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:345:1: statement : ( compoundStatement | declaration | ^( EXPRESSION expression ) | ^( IF expression ifStat= statement (elseStat= statement )? ) | ^( FOR forInit forCond forIter statement ) | ^( WHILE expression statement ) | ^( DO statement expression ) | BREAK | CONTINUE | RETURN | ^( SWITCH expression ( casesGroup )* ) | EMPTY );
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:346:3: ( compoundStatement | declaration | ^( EXPRESSION expression ) | ^( IF expression ifStat= statement (elseStat= statement )? ) | ^( FOR forInit forCond forIter statement ) | ^( WHILE expression statement ) | ^( DO statement expression ) | BREAK | CONTINUE | RETURN | ^( SWITCH expression ( casesGroup )* ) | EMPTY )
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
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:346:5: compoundStatement
                    {
                    pushFollow(FOLLOW_compoundStatement_in_statement1082);
                    compoundStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:347:5: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_statement1088);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:348:5: ^( EXPRESSION expression )
                    {
                    match(input,EXPRESSION,FOLLOW_EXPRESSION_in_statement1102); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement1104);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:349:5: ^( IF expression ifStat= statement (elseStat= statement )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement1120); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement1122);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_statement1126);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:349:38: (elseStat= statement )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==BLOCK_SCOPE||LA20_0==BREAK||LA20_0==CONTINUE||LA20_0==DO||LA20_0==EMPTY||(LA20_0 >= EXPRESSION && LA20_0 <= FOR)||LA20_0==IF||LA20_0==RETURN||LA20_0==SWITCH||(LA20_0 >= VAR_DECL && LA20_0 <= WHILE)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:349:40: elseStat= statement
                            {
                            pushFollow(FOLLOW_statement_in_statement1132);
                            statement();

                            state._fsp--;
                            if (state.failed) return ;

                            if ( state.backtracking==0 ) {}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:350:5: ^( FOR forInit forCond forIter statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement1147); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_forInit_in_statement1149);
                    forInit();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_forCond_in_statement1151);
                    forCond();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_forIter_in_statement1153);
                    forIter();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_statement1155);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:351:5: ^( WHILE expression statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement1163); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement1165);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_statement_in_statement1167);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:352:5: ^( DO statement expression )
                    {
                    match(input,DO,FOLLOW_DO_in_statement1176); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_statement1178);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expression_in_statement1180);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:353:5: BREAK
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement1187); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:354:5: CONTINUE
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1193); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:355:5: RETURN
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement1199); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:356:5: ^( SWITCH expression ( casesGroup )* )
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement1206); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_statement1208);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:356:25: ( casesGroup )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==CASE||LA21_0==DEFAULT) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:356:26: casesGroup
                    	    {
                    	    pushFollow(FOLLOW_casesGroup_in_statement1211);
                    	    casesGroup();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 12 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:357:5: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_statement1220); if (state.failed) return ;

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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:361:1: forInit : ( ^( FOR_INIT declaration ) | ^( FOR_INIT expressionList ) | FOR_INIT );
    public final void forInit() throws RecognitionException {
        int forInit_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:362:3: ( ^( FOR_INIT declaration ) | ^( FOR_INIT expressionList ) | FOR_INIT )
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
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:362:5: ^( FOR_INIT declaration )
                    {
                    match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit1235); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_declaration_in_forInit1237);
                    declaration();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:363:5: ^( FOR_INIT expressionList )
                    {
                    match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit1245); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expressionList_in_forInit1247);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:364:5: FOR_INIT
                    {
                    match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit1254); if (state.failed) return ;

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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:368:1: forCond : ^( FOR_CONDITION ( expression )? ) ;
    public final void forCond() throws RecognitionException {
        int forCond_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:369:3: ( ^( FOR_CONDITION ( expression )? ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:369:5: ^( FOR_CONDITION ( expression )? )
            {
            match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCond1269); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:369:21: ( expression )?
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==EXPR) ) {
                    alt24=1;
                }
                switch (alt24) {
                    case 1 :
                        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:369:21: expression
                        {
                        pushFollow(FOLLOW_expression_in_forCond1271);
                        expression();

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
            if ( state.backtracking>0 ) { memoize(input, 20, forCond_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "forCond"



    // $ANTLR start "forIter"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:373:1: forIter : ^( FOR_ITER ( expressionList )? ) ;
    public final void forIter() throws RecognitionException {
        int forIter_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:374:3: ( ^( FOR_ITER ( expressionList )? ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:374:5: ^( FOR_ITER ( expressionList )? )
            {
            match(input,FOR_ITER,FOLLOW_FOR_ITER_in_forIter1293); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:374:16: ( expressionList )?
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==EXPR) ) {
                    alt25=1;
                }
                switch (alt25) {
                    case 1 :
                        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:374:16: expressionList
                        {
                        pushFollow(FOLLOW_expressionList_in_forIter1295);
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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:378:1: casesGroup : aCase ( statement )* ;
    public final void casesGroup() throws RecognitionException {
        int casesGroup_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:379:3: ( aCase ( statement )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:379:5: aCase ( statement )*
            {
            pushFollow(FOLLOW_aCase_in_casesGroup1314);
            aCase();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:379:11: ( statement )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==BLOCK_SCOPE||LA26_0==BREAK||LA26_0==CONTINUE||LA26_0==DO||LA26_0==EMPTY||(LA26_0 >= EXPRESSION && LA26_0 <= FOR)||LA26_0==IF||LA26_0==RETURN||LA26_0==SWITCH||(LA26_0 >= VAR_DECL && LA26_0 <= WHILE)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:379:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casesGroup1316);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
            if ( state.backtracking>0 ) { memoize(input, 22, casesGroup_StartIndex); }

        }
        return ;
    }
    // $ANTLR end "casesGroup"



    // $ANTLR start "aCase"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:383:1: aCase : ( ^( CASE expression ) | DEFAULT );
    public final void aCase() throws RecognitionException {
        int aCase_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:384:3: ( ^( CASE expression ) | DEFAULT )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==CASE) ) {
                alt27=1;
            }
            else if ( (LA27_0==DEFAULT) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:384:5: ^( CASE expression )
                    {
                    match(input,CASE,FOLLOW_CASE_in_aCase1332); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_aCase1334);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:385:5: DEFAULT
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_aCase1341); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "aCase"



    // $ANTLR start "expression"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:393:1: expression returns [FullType type] : ^( EXPR expr ) ;
    public final FullType expression() throws RecognitionException {
        FullType type = null;

        int expression_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:394:5: ( ^( EXPR expr ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:394:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression1368); if (state.failed) return type;

            match(input, Token.DOWN, null); if (state.failed) return type;
            pushFollow(FOLLOW_expr_in_expression1370);
            expr();

            state._fsp--;
            if (state.failed) return type;

            match(input, Token.UP, null); if (state.failed) return type;


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
        return type;
    }
    // $ANTLR end "expression"



    // $ANTLR start "expr"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:399:1: expr returns [FullType type] : ( ^( ASSIGN expr1= expr expr2= expr ) | ^( PLUS_ASSIGN expr1= expr expr2= expr ) | ^( MINUS_ASSIGN expr1= expr expr2= expr ) | ^( STAR_ASSIGN expr1= expr expr2= expr ) | ^( DIV_ASSIGN expr1= expr expr2= expr ) | ^( BAND_ASSIGN expr1= expr expr2= expr ) | ^( BOR_ASSIGN expr1= expr expr2= expr ) | ^( BXOR_ASSIGN expr1= expr expr2= expr ) | ^( MOD_ASSIGN expr1= expr expr2= expr ) | ^( QUESTION cond= expr expr1= expr COLON expr2= expr ) | ^( LOR expr1= expr expr2= expr ) | ^( LAND expr1= expr expr2= expr ) | ^( BOR expr1= expr expr2= expr ) | ^( BXOR expr1= expr expr2= expr ) | ^( BAND expr1= expr expr2= expr ) | ^( EQUAL expr1= expr expr2= expr ) | ^( NOT_EQUAL expr1= expr expr2= expr ) | ^( LE expr1= expr expr2= expr ) | ^( GE expr1= expr expr2= expr ) | ^( GT expr1= expr expr2= expr ) | ^( LT expr1= expr expr2= expr ) | ^( PLUS expr1= expr expr2= expr ) | ^( MINUS expr1= expr expr2= expr ) | ^( STAR expr1= expr expr2= expr ) | ^( DIV expr1= expr expr2= expr ) | ^( MOD expr1= expr expr2= expr ) | ^( UNARY_PLUS e= expr ) | ^( UNARY_MINUS e= expr ) | ^( PRE_INC e= expr ) | ^( PRE_DEC e= expr ) | ^( POST_INC e= expr ) | ^( POST_DEC e= expr ) | ^( NOT e= expr ) | ^( LOGICAL_NOT e= expr ) | primaryExpression );
    public final FullType expr() throws RecognitionException {
        FullType type = null;

        int expr_StartIndex = input.index();

        FullType expr1 =null;

        FullType expr2 =null;

        FullType cond =null;

        FullType e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:400:5: ( ^( ASSIGN expr1= expr expr2= expr ) | ^( PLUS_ASSIGN expr1= expr expr2= expr ) | ^( MINUS_ASSIGN expr1= expr expr2= expr ) | ^( STAR_ASSIGN expr1= expr expr2= expr ) | ^( DIV_ASSIGN expr1= expr expr2= expr ) | ^( BAND_ASSIGN expr1= expr expr2= expr ) | ^( BOR_ASSIGN expr1= expr expr2= expr ) | ^( BXOR_ASSIGN expr1= expr expr2= expr ) | ^( MOD_ASSIGN expr1= expr expr2= expr ) | ^( QUESTION cond= expr expr1= expr COLON expr2= expr ) | ^( LOR expr1= expr expr2= expr ) | ^( LAND expr1= expr expr2= expr ) | ^( BOR expr1= expr expr2= expr ) | ^( BXOR expr1= expr expr2= expr ) | ^( BAND expr1= expr expr2= expr ) | ^( EQUAL expr1= expr expr2= expr ) | ^( NOT_EQUAL expr1= expr expr2= expr ) | ^( LE expr1= expr expr2= expr ) | ^( GE expr1= expr expr2= expr ) | ^( GT expr1= expr expr2= expr ) | ^( LT expr1= expr expr2= expr ) | ^( PLUS expr1= expr expr2= expr ) | ^( MINUS expr1= expr expr2= expr ) | ^( STAR expr1= expr expr2= expr ) | ^( DIV expr1= expr expr2= expr ) | ^( MOD expr1= expr expr2= expr ) | ^( UNARY_PLUS e= expr ) | ^( UNARY_MINUS e= expr ) | ^( PRE_INC e= expr ) | ^( PRE_DEC e= expr ) | ^( POST_INC e= expr ) | ^( POST_DEC e= expr ) | ^( NOT e= expr ) | ^( LOGICAL_NOT e= expr ) | primaryExpression )
            int alt28=35;
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
            case ARRAY_ELEMENT_ACCESS:
            case CHAR_LITERAL:
            case IDENT:
            case LPAREN:
            case METHOD_CALL:
            case NUM_DOUBLE:
            case NUM_INT:
            case STRING_LITERAL:
            case STRUCT_ACCESS:
            case 120:
            case 123:
            case 129:
                {
                alt28=35;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:400:9: ^( ASSIGN expr1= expr expr2= expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr1397); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1401);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1405);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:401:9: ^( PLUS_ASSIGN expr1= expr expr2= expr )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_expr1418); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1422);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1426);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:402:9: ^( MINUS_ASSIGN expr1= expr expr2= expr )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_expr1438); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1442);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1446);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:403:9: ^( STAR_ASSIGN expr1= expr expr2= expr )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_expr1463); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1467);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1471);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:404:9: ^( DIV_ASSIGN expr1= expr expr2= expr )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_expr1489); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1493);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1497);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 6 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:405:9: ^( BAND_ASSIGN expr1= expr expr2= expr )
                    {
                    match(input,BAND_ASSIGN,FOLLOW_BAND_ASSIGN_in_expr1516); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1520);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1524);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 7 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:406:9: ^( BOR_ASSIGN expr1= expr expr2= expr )
                    {
                    match(input,BOR_ASSIGN,FOLLOW_BOR_ASSIGN_in_expr1541); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1545);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1549);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 8 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:407:9: ^( BXOR_ASSIGN expr1= expr expr2= expr )
                    {
                    match(input,BXOR_ASSIGN,FOLLOW_BXOR_ASSIGN_in_expr1561); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1565);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1569);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 9 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:408:9: ^( MOD_ASSIGN expr1= expr expr2= expr )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_expr1581); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1585);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1589);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 10 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:409:9: ^( QUESTION cond= expr expr1= expr COLON expr2= expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expr1601); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1605);
                    cond=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1609);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input,COLON,FOLLOW_COLON_in_expr1611); if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1615);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 11 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:410:9: ^( LOR expr1= expr expr2= expr )
                    {
                    match(input,LOR,FOLLOW_LOR_in_expr1627); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1631);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1635);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 12 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:411:9: ^( LAND expr1= expr expr2= expr )
                    {
                    match(input,LAND,FOLLOW_LAND_in_expr1647); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1651);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1655);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 13 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:412:9: ^( BOR expr1= expr expr2= expr )
                    {
                    match(input,BOR,FOLLOW_BOR_in_expr1667); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1671);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1675);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 14 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:413:9: ^( BXOR expr1= expr expr2= expr )
                    {
                    match(input,BXOR,FOLLOW_BXOR_in_expr1687); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1691);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1695);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 15 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:414:9: ^( BAND expr1= expr expr2= expr )
                    {
                    match(input,BAND,FOLLOW_BAND_in_expr1707); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1711);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1715);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 16 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:415:9: ^( EQUAL expr1= expr expr2= expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expr1727); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1731);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1735);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 17 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:416:9: ^( NOT_EQUAL expr1= expr expr2= expr )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr1747); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1751);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1755);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 18 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:417:9: ^( LE expr1= expr expr2= expr )
                    {
                    match(input,LE,FOLLOW_LE_in_expr1767); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1771);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1775);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 19 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:418:9: ^( GE expr1= expr expr2= expr )
                    {
                    match(input,GE,FOLLOW_GE_in_expr1787); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1791);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1795);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 20 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:419:9: ^( GT expr1= expr expr2= expr )
                    {
                    match(input,GT,FOLLOW_GT_in_expr1807); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1811);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1815);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 21 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:420:9: ^( LT expr1= expr expr2= expr )
                    {
                    match(input,LT,FOLLOW_LT_in_expr1828); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1832);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1836);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 22 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:421:9: ^( PLUS expr1= expr expr2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr1850); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1854);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1858);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 23 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:422:9: ^( MINUS expr1= expr expr2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr1871); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1875);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1879);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 24 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:423:9: ^( STAR expr1= expr expr2= expr )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expr1891); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1895);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1899);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 25 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:424:9: ^( DIV expr1= expr expr2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr1912); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1916);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1920);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 26 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:425:9: ^( MOD expr1= expr expr2= expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr1932); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1936);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_expr1940);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 27 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:426:9: ^( UNARY_PLUS e= expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr1954); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1958);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 28 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:427:9: ^( UNARY_MINUS e= expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr1971); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1975);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 29 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:428:9: ^( PRE_INC e= expr )
                    {
                    match(input,PRE_INC,FOLLOW_PRE_INC_in_expr1988); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr1992);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 30 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:429:9: ^( PRE_DEC e= expr )
                    {
                    match(input,PRE_DEC,FOLLOW_PRE_DEC_in_expr2006); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr2010);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 31 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:430:9: ^( POST_INC e= expr )
                    {
                    match(input,POST_INC,FOLLOW_POST_INC_in_expr2022); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr2026);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 32 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:431:9: ^( POST_DEC e= expr )
                    {
                    match(input,POST_DEC,FOLLOW_POST_DEC_in_expr2038); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr2042);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 33 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:432:9: ^( NOT e= expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr2054); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr2058);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 34 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:433:9: ^( LOGICAL_NOT e= expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr2071); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_expr_in_expr2075);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 35 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:434:9: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr2087);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return type;

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
        return type;
    }
    // $ANTLR end "expr"



    // $ANTLR start "primaryExpression"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:438:1: primaryExpression returns [FullType type] : ( ^( METHOD_CALL id= IDENT argList ) | ^( STRUCT_ACCESS structVar= primaryExpression structField= IDENT ) | ^( ARRAY_ELEMENT_ACCESS var= primaryExpression idx= expression ) | constant | 'true' | 'false' | 'null' | IDENT | LPAREN e= expr RPAREN );
    public final FullType primaryExpression() throws RecognitionException {
        FullType type = null;

        int primaryExpression_StartIndex = input.index();

        CommonTree id=null;
        CommonTree structField=null;
        FullType structVar =null;

        FullType var =null;

        FullType idx =null;

        FullType e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:439:5: ( ^( METHOD_CALL id= IDENT argList ) | ^( STRUCT_ACCESS structVar= primaryExpression structField= IDENT ) | ^( ARRAY_ELEMENT_ACCESS var= primaryExpression idx= expression ) | constant | 'true' | 'false' | 'null' | IDENT | LPAREN e= expr RPAREN )
            int alt29=9;
            switch ( input.LA(1) ) {
            case METHOD_CALL:
                {
                alt29=1;
                }
                break;
            case STRUCT_ACCESS:
                {
                alt29=2;
                }
                break;
            case ARRAY_ELEMENT_ACCESS:
                {
                alt29=3;
                }
                break;
            case CHAR_LITERAL:
            case NUM_DOUBLE:
            case NUM_INT:
            case STRING_LITERAL:
                {
                alt29=4;
                }
                break;
            case 129:
                {
                alt29=5;
                }
                break;
            case 120:
                {
                alt29=6;
                }
                break;
            case 123:
                {
                alt29=7;
                }
                break;
            case IDENT:
                {
                alt29=8;
                }
                break;
            case LPAREN:
                {
                alt29=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:439:7: ^( METHOD_CALL id= IDENT argList )
                    {
                    match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression2126); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2130); if (state.failed) return type;

                    pushFollow(FOLLOW_argList_in_primaryExpression2132);
                    argList();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:440:7: ^( STRUCT_ACCESS structVar= primaryExpression structField= IDENT )
                    {
                    match(input,STRUCT_ACCESS,FOLLOW_STRUCT_ACCESS_in_primaryExpression2143); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression2147);
                    structVar=primaryExpression();

                    state._fsp--;
                    if (state.failed) return type;

                    structField=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2151); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:441:7: ^( ARRAY_ELEMENT_ACCESS var= primaryExpression idx= expression )
                    {
                    match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression2163); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression2167);
                    var=primaryExpression();

                    state._fsp--;
                    if (state.failed) return type;

                    pushFollow(FOLLOW_expression_in_primaryExpression2171);
                    idx=expression();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:442:7: constant
                    {
                    pushFollow(FOLLOW_constant_in_primaryExpression2181);
                    constant();

                    state._fsp--;
                    if (state.failed) return type;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:443:7: 'true'
                    {
                    match(input,129,FOLLOW_129_in_primaryExpression2189); if (state.failed) return type;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:444:7: 'false'
                    {
                    match(input,120,FOLLOW_120_in_primaryExpression2198); if (state.failed) return type;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:445:7: 'null'
                    {
                    match(input,123,FOLLOW_123_in_primaryExpression2209); if (state.failed) return type;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:446:7: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2219); if (state.failed) return type;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:447:7: LPAREN e= expr RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression2244); if (state.failed) return type;

                    pushFollow(FOLLOW_expr_in_primaryExpression2248);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return type;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression2250); if (state.failed) return type;

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
        return type;
    }
    // $ANTLR end "primaryExpression"



    // $ANTLR start "expressionList"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:452:1: expressionList returns [ArrayList<FullType> types] : e1= expression (e2= expression )* ;
    public final ArrayList<FullType> expressionList() throws RecognitionException {
        ArrayList<FullType> types = null;

        int expressionList_StartIndex = input.index();

        FullType e1 =null;

        FullType e2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return types; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:453:3: (e1= expression (e2= expression )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:453:5: e1= expression (e2= expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList2278);
            e1=expression();

            state._fsp--;
            if (state.failed) return types;

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:453:19: (e2= expression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==EXPR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:453:20: e2= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList2283);
            	    e2=expression();

            	    state._fsp--;
            	    if (state.failed) return types;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:457:1: argList returns [ArrayList<FullType> types] : ( expressionList | EMPTY );
    public final ArrayList<FullType> argList() throws RecognitionException {
        ArrayList<FullType> types = null;

        int argList_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return types; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:458:3: ( expressionList | EMPTY )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==EXPR) ) {
                alt31=1;
            }
            else if ( (LA31_0==EMPTY) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return types;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:458:6: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_argList2308);
                    expressionList();

                    state._fsp--;
                    if (state.failed) return types;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:459:7: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_argList2316); if (state.failed) return types;

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
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:462:1: constant returns [FullType type] : ( NUM_INT | CHAR_LITERAL | STRING_LITERAL | NUM_DOUBLE );
    public final FullType constant() throws RecognitionException {
        FullType type = null;

        int constant_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return type; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:463:3: ( NUM_INT | CHAR_LITERAL | STRING_LITERAL | NUM_DOUBLE )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:
            {
            if ( input.LA(1)==CHAR_LITERAL||(input.LA(1) >= NUM_DOUBLE && input.LA(1) <= NUM_INT)||input.LA(1)==STRING_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return type;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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

    // $ANTLR start synpred3_FuncTreeWalker
    public final void synpred3_FuncTreeWalker_fragment() throws RecognitionException {
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:87:37: ( parameterDeclarationList )
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:87:37: parameterDeclarationList
        {
        pushFollow(FOLLOW_parameterDeclarationList_in_synpred3_FuncTreeWalker145);
        parameterDeclarationList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_FuncTreeWalker

    // $ANTLR start synpred15_FuncTreeWalker
    public final void synpred15_FuncTreeWalker_fragment() throws RecognitionException {
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:149:7: ( ( LBRACK RBRACK )* )
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:149:7: ( LBRACK RBRACK )*
        {
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:150:5: ( LBRACK RBRACK )*
        loop35:
        do {
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LBRACK) ) {
                alt35=1;
            }


            switch (alt35) {
        	case 1 :
        	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\FuncTreeWalker.g:150:6: LBRACK RBRACK
        	    {
        	    match(input,LBRACK,FOLLOW_LBRACK_in_synpred15_FuncTreeWalker424); if (state.failed) return ;

        	    match(input,RBRACK,FOLLOW_RBRACK_in_synpred15_FuncTreeWalker427); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop35;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred15_FuncTreeWalker

    // Delegated rules

    public final boolean synpred15_FuncTreeWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_FuncTreeWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_FuncTreeWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_FuncTreeWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_START_PROG_in_compilationUnit98 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_funcOrVar_in_compilationUnit100 = new BitSet(new long[]{0x0000480000000008L,0x0000010000000000L});
    public static final BitSet FOLLOW_EOF_in_compilationUnit110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_DECL_in_funcOrVar137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeSpec_in_funcOrVar139 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_funcOrVar143 = new BitSet(new long[]{0x0000000000000800L,0x0000000000020000L});
    public static final BitSet FOLLOW_parameterDeclarationList_in_funcOrVar145 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_compoundStatement_in_funcOrVar150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRUCT_DECL_in_funcOrVar160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_funcOrVar164 = new BitSet(new long[]{0x0000000000000000L,0xD412000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_structMembersList_in_funcOrVar166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GLOBAL_STATEMENT_in_funcOrVar187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_funcOrVar189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_builtInType_in_typeSpec220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInType_in_typeSpec230 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LBRACK_in_typeSpec242 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_typeSpec245 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_structUsage_in_typeSpec292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECL_in_declaration313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeSpec_in_declaration315 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_variableDefinitions_in_declaration317 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_130_in_builtInType339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_builtInType350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_builtInType358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_builtInType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_builtInType378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_builtInType389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayBrackets424 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayBrackets427 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayBrackets471 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expression_in_arrayBrackets473 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayBrackets475 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDefinitions514 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_variableDefinitions531 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDefinitions541 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclarator578 = new BitSet(new long[]{0x0100000000000100L});
    public static final BitSet FOLLOW_arrayBrackets_in_variableDeclarator582 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_varInitializer_in_variableDeclarator584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_varInitializer625 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_initializer_in_varInitializer629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_initializer663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_initializer711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_initializer_in_arrayInitializer753 = new BitSet(new long[]{0x0000002000000048L});
    public static final BitSet FOLLOW_structMember_in_structMembersList814 = new BitSet(new long[]{0x0000000000000002L,0xD412000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeSpec_in_structMember852 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_structMember854 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_arrayBrackets_in_structMember856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_structUsage885 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_structUsage889 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_structUsage892 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_structUsage895 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_parameterDeclaration_in_parameterDeclarationList946 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_parameterDeclarationList966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parameterDeclaration_in_parameterDeclarationList972 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_PARAM_DECL_in_parameterDeclaration1017 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeSpec_in_parameterDeclaration1019 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_parameterDeclaration1021 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_arrayBrackets_in_parameterDeclaration1023 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_compoundStatement1063 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_compoundStatement1066 = new BitSet(new long[]{0x002000C481008808L,0x0000620008000000L});
    public static final BitSet FOLLOW_compoundStatement_in_statement1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_statement1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_statement1102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement1120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1122 = new BitSet(new long[]{0x002000C481008800L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_statement1126 = new BitSet(new long[]{0x002000C481008808L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_statement1132 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement1147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement1149 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_forCond_in_statement1151 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_forIter_in_statement1153 = new BitSet(new long[]{0x002000C481008800L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_statement1155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement1163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1165 = new BitSet(new long[]{0x002000C481008800L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_statement1167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement1176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1178 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expression_in_statement1180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1208 = new BitSet(new long[]{0x0000000008100008L});
    public static final BitSet FOLLOW_casesGroup_in_statement1211 = new BitSet(new long[]{0x0000000008100008L});
    public static final BitSet FOLLOW_EMPTY_in_statement1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit1235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_forInit1237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit1245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_forInit1247 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_CONDITION_in_forCond1269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCond1271 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_ITER_in_forIter1293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_forIter1295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_aCase_in_casesGroup1314 = new BitSet(new long[]{0x002000C481008802L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_casesGroup1316 = new BitSet(new long[]{0x002000C481008802L,0x0000620008000000L});
    public static final BitSet FOLLOW_CASE_in_aCase1332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_aCase1334 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFAULT_in_aCase1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPR_in_expression1368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression1370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr1397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1401 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_expr1418 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1422 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_expr1438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1442 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1446 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_expr1463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1467 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_expr1489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1493 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_ASSIGN_in_expr1516 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1520 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_ASSIGN_in_expr1541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1545 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BXOR_ASSIGN_in_expr1561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1565 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1569 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_expr1581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1585 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1589 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_in_expr1601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1605 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1609 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_expr1611 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1615 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOR_in_expr1627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1631 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1635 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAND_in_expr1647 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1651 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1655 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_in_expr1667 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1671 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1675 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BXOR_in_expr1687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1691 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_in_expr1707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1711 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1715 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr1727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1731 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1735 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr1747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1751 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1755 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_expr1767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1771 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1775 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_expr1787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1791 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_expr1807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1811 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expr1828 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1832 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1836 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr1850 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1854 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1858 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr1871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1875 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr1891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1895 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr1912 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1916 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1920 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr1932 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1936 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1940 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr1954 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr1971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1975 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_expr1988 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1992 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_expr2006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2010 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_expr2022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2026 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_expr2038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr2054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2058 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr2071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2075 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression2126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2130 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_argList_in_primaryExpression2132 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRUCT_ACCESS_in_primaryExpression2143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression2147 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2151 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression2163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression2167 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_primaryExpression2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_primaryExpression2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_primaryExpression2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_primaryExpression2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression2244 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_primaryExpression2248 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList2278 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList2283 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_expressionList_in_argList2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_argList2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameterDeclarationList_in_synpred3_FuncTreeWalker145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_synpred15_FuncTreeWalker424 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_synpred15_FuncTreeWalker427 = new BitSet(new long[]{0x0100000000000002L});

}