// $ANTLR 3.4 C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g 2012-06-22 10:58:38

  package parser;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TranslatorTreeWalker extends TreeParser {
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


    public TranslatorTreeWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TranslatorTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[120+1];
         

    }

    public String[] getTokenNames() { return TranslatorTreeWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g"; }


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



    // $ANTLR start "compilationUnit"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:40:1: compilationUnit returns [String str] : ( ^( START_PROG ( funcOrVar )* ) | EOF );
    public final String compilationUnit() throws RecognitionException {
        String str = null;

        int compilationUnit_StartIndex = input.index();

        String funcOrVar1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:41:5: ( ^( START_PROG ( funcOrVar )* ) | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==START_PROG) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:41:7: ^( START_PROG ( funcOrVar )* )
                    {
                    if ( state.backtracking==0 ) {
                            str = header;
                          }

                    match(input,START_PROG,FOLLOW_START_PROG_in_compilationUnit119); if (state.failed) return str;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return str;
                        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:44:18: ( funcOrVar )*
                        loop1:
                        do {
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==FUNC_DECL||LA1_0==GLOBAL_STATEMENT||LA1_0==STRUCT_DECL) ) {
                                alt1=1;
                            }


                            switch (alt1) {
                        	case 1 :
                        	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:44:19: funcOrVar
                        	    {
                        	    pushFollow(FOLLOW_funcOrVar_in_compilationUnit122);
                        	    funcOrVar1=funcOrVar();

                        	    state._fsp--;
                        	    if (state.failed) return str;

                        	    if ( state.backtracking==0 ) {str = str + funcOrVar1;}

                        	    }
                        	    break;

                        	default :
                        	    break loop1;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return str;
                    }


                    if ( state.backtracking==0 ) {
                            str += "\n} catch (Exception e) {\nshowException(e);\n}\n}\n";
                            str += functions + "\n" + structures + "\n}\n";
                          }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:49:7: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_compilationUnit143); if (state.failed) return str;

                    if ( state.backtracking==0 ) {
                            str = header + "\n} catch (Exception e) {\nshowException(e);\n}\n}\n}\n";
                            
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
            if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }

        }
        return str;
    }
    // $ANTLR end "compilationUnit"



    // $ANTLR start "funcOrVar"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:56:1: funcOrVar returns [String str] : ( ^( FUNC_DECL typeSpec id= IDENT ( parameterDeclarationList )? compoundStatement ) | ^( STRUCT_DECL id= IDENT structMembersList ) | ^( GLOBAL_STATEMENT statement ) );
    public final String funcOrVar() throws RecognitionException {
        String str = null;

        int funcOrVar_StartIndex = input.index();

        CommonTree id=null;
        String parameterDeclarationList2 =null;

        TranslatorTreeWalker.typeSpec_return typeSpec3 =null;

        String compoundStatement4 =null;

        String structMembersList5 =null;

        TranslatorTreeWalker.statement_return statement6 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:58:5: ( ^( FUNC_DECL typeSpec id= IDENT ( parameterDeclarationList )? compoundStatement ) | ^( STRUCT_DECL id= IDENT structMembersList ) | ^( GLOBAL_STATEMENT statement ) )
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
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:58:7: ^( FUNC_DECL typeSpec id= IDENT ( parameterDeclarationList )? compoundStatement )
                    {
                    match(input,FUNC_DECL,FOLLOW_FUNC_DECL_in_funcOrVar177); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_typeSpec_in_funcOrVar179);
                    typeSpec3=typeSpec();

                    state._fsp--;
                    if (state.failed) return str;

                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_funcOrVar183); if (state.failed) return str;

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:58:37: ( parameterDeclarationList )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==PARAM_DECL) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==BLOCK_SCOPE) ) {
                        int LA3_2 = input.LA(2);

                        if ( (synpred3_TranslatorTreeWalker()) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:58:37: parameterDeclarationList
                            {
                            pushFollow(FOLLOW_parameterDeclarationList_in_funcOrVar185);
                            parameterDeclarationList2=parameterDeclarationList();

                            state._fsp--;
                            if (state.failed) return str;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_compoundStatement_in_funcOrVar188);
                    compoundStatement4=compoundStatement();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) {
                             String func = "";
                             String tmp = parameterDeclarationList2;
                             if (tmp == null) tmp="";
                             func += "static " + (typeSpec3!=null?typeSpec3.str:null) + " " + "_"+id.getText() + "(" 
                                     + tmp + ")\n{\n" +  (typeSpec3!=null?typeSpec3.str:null) + " _$ = " + 
                                     (!(typeSpec3!=null?typeSpec3.is_struct:false)?defaultInitializer((typeSpec3!=null?typeSpec3.str:null)):"new "+ (typeSpec3!=null?typeSpec3.str:null) +"()" ) + ";"
                                     + compoundStatement4.substring(1,compoundStatement4.length()-2) +"return _$;\n}\n" ;
                             functions += "\n" + func;
                             str = "";
                             }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:71:7: ^( STRUCT_DECL id= IDENT structMembersList )
                    {
                    match(input,STRUCT_DECL,FOLLOW_STRUCT_DECL_in_funcOrVar214); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_funcOrVar218); if (state.failed) return str;

                    pushFollow(FOLLOW_structMembersList_in_funcOrVar220);
                    structMembersList5=structMembersList();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { 
                              String new_struct = "static public class " + "_"+id.getText() + "{\n" ;
                              new_struct += structMembersList5 + "}\n\n";
                              structures += new_struct;
                              str = "";
                            }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:78:7: ^( GLOBAL_STATEMENT statement )
                    {
                    match(input,GLOBAL_STATEMENT,FOLLOW_GLOBAL_STATEMENT_in_funcOrVar241); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_statement_in_funcOrVar243);
                    statement6=statement();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) {
                              str = (statement6!=null?statement6.str:null).replace("if (true) return _$;\n", "if (true) return;\n");
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
            if ( state.backtracking>0 ) { memoize(input, 2, funcOrVar_StartIndex); }

        }
        return str;
    }
    // $ANTLR end "funcOrVar"


    public static class typeSpec_return extends TreeRuleReturnScope {
        public String str;
        public boolean is_struct;
    };


    // $ANTLR start "typeSpec"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:85:1: typeSpec returns [String str, boolean is_struct] : ( builtInType | builtInType ( LBRACK RBRACK )+ | structUsage );
    public final TranslatorTreeWalker.typeSpec_return typeSpec() throws RecognitionException {
        TranslatorTreeWalker.typeSpec_return retval = new TranslatorTreeWalker.typeSpec_return();
        retval.start = input.LT(1);

        int typeSpec_StartIndex = input.index();

        String builtInType7 =null;

        String builtInType8 =null;

        String structUsage9 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:86:5: ( builtInType | builtInType ( LBRACK RBRACK )+ | structUsage )
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
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
                    if (state.backtracking>0) {state.failed=true; return retval;}
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:86:7: builtInType
                    {
                    if ( state.backtracking==0 ) { retval.is_struct = false;}

                    pushFollow(FOLLOW_builtInType_in_typeSpec292);
                    builtInType7=builtInType();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.str = builtInType7; }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:88:7: builtInType ( LBRACK RBRACK )+
                    {
                    pushFollow(FOLLOW_builtInType_in_typeSpec302);
                    builtInType8=builtInType();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.str = builtInType8; }

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:88:48: ( LBRACK RBRACK )+
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
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:88:49: LBRACK RBRACK
                    	    {
                    	    match(input,LBRACK,FOLLOW_LBRACK_in_typeSpec307); if (state.failed) return retval;

                    	    match(input,RBRACK,FOLLOW_RBRACK_in_typeSpec310); if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.str = retval.str + "[]"; }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:89:7: structUsage
                    {
                    pushFollow(FOLLOW_structUsage_in_typeSpec325);
                    structUsage9=structUsage();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.str = structUsage9;
                            retval.is_struct = true;
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
            if ( state.backtracking>0 ) { memoize(input, 3, typeSpec_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeSpec"



    // $ANTLR start "declaration"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:96:1: declaration returns [String str] : ^( VAR_DECL typeSpec variableDefinitions ) ;
    public final String declaration() throws RecognitionException {
        String str = null;

        int declaration_StartIndex = input.index();

        TranslatorTreeWalker.typeSpec_return typeSpec10 =null;

        TranslatorTreeWalker.variableDefinitions_return variableDefinitions11 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:97:3: ( ^( VAR_DECL typeSpec variableDefinitions ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:97:5: ^( VAR_DECL typeSpec variableDefinitions )
            {
            match(input,VAR_DECL,FOLLOW_VAR_DECL_in_declaration357); if (state.failed) return str;

            match(input, Token.DOWN, null); if (state.failed) return str;
            pushFollow(FOLLOW_typeSpec_in_declaration359);
            typeSpec10=typeSpec();

            state._fsp--;
            if (state.failed) return str;

            pushFollow(FOLLOW_variableDefinitions_in_declaration361);
            variableDefinitions11=variableDefinitions();

            state._fsp--;
            if (state.failed) return str;

            match(input, Token.UP, null); if (state.failed) return str;


            if ( state.backtracking==0 ) {
                  if ((typeSpec10!=null?typeSpec10.is_struct:false) || (typeSpec10!=null?typeSpec10.str:null) =="String"){
                    str = (typeSpec10!=null?typeSpec10.str:null) + " " +  
                            (variableDefinitions11!=null?variableDefinitions11.str:null).replaceAll("__default__", "new " + (typeSpec10!=null?typeSpec10.str:null) + "()")
                              .replaceAll("__type__", (typeSpec10!=null?typeSpec10.str:null));
                             
                  } else {
                    str = (typeSpec10!=null?typeSpec10.str:null) + " " +  
                            (variableDefinitions11!=null?variableDefinitions11.str:null).replaceAll("__default__",defaultInitializer((typeSpec10!=null?typeSpec10.str:null)))
                              .replaceAll("__type__", (typeSpec10!=null?typeSpec10.str:null));
                  }
                  if (!(variableDefinitions11!=null?variableDefinitions11.inits:null).equals(""))
                    str = str + ";\n" + (variableDefinitions11!=null?variableDefinitions11.inits:null);
                    if(str.indexOf(";\ninitArray(")!=-1)
                      str = str.substring(0,(str.indexOf(";\ninitArray(")));
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
        return str;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "builtInType"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:117:1: builtInType returns [String str] : ( 'void' | 'boolean' | 'char' | 'integer' | 'real' | 'string' );
    public final String builtInType() throws RecognitionException {
        String str = null;

        int builtInType_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:118:3: ( 'void' | 'boolean' | 'char' | 'integer' | 'real' | 'string' )
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
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:118:5: 'void'
                    {
                    match(input,130,FOLLOW_130_in_builtInType394); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = "Object"; }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:119:5: 'boolean'
                    {
                    match(input,113,FOLLOW_113_in_builtInType405); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = "boolean"; }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:120:5: 'char'
                    {
                    match(input,116,FOLLOW_116_in_builtInType413); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = "char"; }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:121:5: 'integer'
                    {
                    match(input,122,FOLLOW_122_in_builtInType424); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = "long"; }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:122:5: 'real'
                    {
                    match(input,124,FOLLOW_124_in_builtInType433); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = "double"; }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:123:5: 'string'
                    {
                    match(input,126,FOLLOW_126_in_builtInType444); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = "String"; }

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
        return str;
    }
    // $ANTLR end "builtInType"


    public static class arrayBrackets_return extends TreeRuleReturnScope {
        public String str;
        public boolean fixedSize;
    };


    // $ANTLR start "arrayBrackets"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:129:1: arrayBrackets returns [String str, boolean fixedSize] : ( ( LBRACK RBRACK )* | ( LBRACK e= expression RBRACK )* );
    public final TranslatorTreeWalker.arrayBrackets_return arrayBrackets() throws RecognitionException {
        TranslatorTreeWalker.arrayBrackets_return retval = new TranslatorTreeWalker.arrayBrackets_return();
        retval.start = input.LT(1);

        int arrayBrackets_StartIndex = input.index();

        String e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:130:3: ( ( LBRACK RBRACK )* | ( LBRACK e= expression RBRACK )* )
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

                if ( (synpred15_TranslatorTreeWalker()) ) {
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

                if ( (synpred15_TranslatorTreeWalker()) ) {
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

                if ( (synpred15_TranslatorTreeWalker()) ) {
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

                if ( (synpred15_TranslatorTreeWalker()) ) {
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

                if ( (synpred15_TranslatorTreeWalker()) ) {
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

                if ( (synpred15_TranslatorTreeWalker()) ) {
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

                if ( (synpred15_TranslatorTreeWalker()) ) {
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

                if ( (synpred15_TranslatorTreeWalker()) ) {
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

                if ( (synpred15_TranslatorTreeWalker()) ) {
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

                if ( (synpred15_TranslatorTreeWalker()) ) {
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

                if ( (synpred15_TranslatorTreeWalker()) ) {
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
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:130:5: ( LBRACK RBRACK )*
                    {
                    if ( state.backtracking==0 ) {retval.str = ""; }

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:130:20: ( LBRACK RBRACK )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==LBRACK) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:130:21: LBRACK RBRACK
                    	    {
                    	    match(input,LBRACK,FOLLOW_LBRACK_in_arrayBrackets471); if (state.failed) return retval;

                    	    match(input,RBRACK,FOLLOW_RBRACK_in_arrayBrackets474); if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.str = retval.str + "[]"; retval.fixedSize = false; }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:131:5: ( LBRACK e= expression RBRACK )*
                    {
                    if ( state.backtracking==0 ) {retval.str = ""; }

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:131:20: ( LBRACK e= expression RBRACK )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==LBRACK) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:131:21: LBRACK e= expression RBRACK
                    	    {
                    	    match(input,LBRACK,FOLLOW_LBRACK_in_arrayBrackets527); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_arrayBrackets531);
                    	    e=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    match(input,RBRACK,FOLLOW_RBRACK_in_arrayBrackets533); if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.str = retval.str + "[(int)(" + e +  ")]"; retval.fixedSize = true; }

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


    public static class variableDefinitions_return extends TreeRuleReturnScope {
        public String str;
        public String inits;
    };


    // $ANTLR start "variableDefinitions"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:135:1: variableDefinitions returns [String str, String inits] : var1= variableDeclarator ( COMMA var2= variableDeclarator )* ;
    public final TranslatorTreeWalker.variableDefinitions_return variableDefinitions() throws RecognitionException {
        TranslatorTreeWalker.variableDefinitions_return retval = new TranslatorTreeWalker.variableDefinitions_return();
        retval.start = input.LT(1);

        int variableDefinitions_StartIndex = input.index();

        TranslatorTreeWalker.variableDeclarator_return var1 =null;

        TranslatorTreeWalker.variableDeclarator_return var2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:136:3: (var1= variableDeclarator ( COMMA var2= variableDeclarator )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:136:5: var1= variableDeclarator ( COMMA var2= variableDeclarator )*
            {
            pushFollow(FOLLOW_variableDeclarator_in_variableDefinitions560);
            var1=variableDeclarator();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.str = (var1!=null?var1.str:null); retval.inits = (var1!=null?var1.init:null); }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:137:5: ( COMMA var2= variableDeclarator )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:137:7: COMMA var2= variableDeclarator
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_variableDefinitions570); if (state.failed) return retval;

            	    pushFollow(FOLLOW_variableDeclarator_in_variableDefinitions580);
            	    var2=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.str = retval.str+ ", " + (var2!=null?var2.str:null); retval.inits = retval.inits + (var2!=null?var2.init:null); }

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
        return retval;
    }
    // $ANTLR end "variableDefinitions"


    public static class variableDeclarator_return extends TreeRuleReturnScope {
        public String str;
        public String init;
    };


    // $ANTLR start "variableDeclarator"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:143:1: variableDeclarator returns [String str, String init] : IDENT a= arrayBrackets vi= varInitializer ;
    public final TranslatorTreeWalker.variableDeclarator_return variableDeclarator() throws RecognitionException {
        TranslatorTreeWalker.variableDeclarator_return retval = new TranslatorTreeWalker.variableDeclarator_return();
        retval.start = input.LT(1);

        int variableDeclarator_StartIndex = input.index();

        CommonTree IDENT12=null;
        TranslatorTreeWalker.arrayBrackets_return a =null;

        String vi =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:144:3: ( IDENT a= arrayBrackets vi= varInitializer )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:144:5: IDENT a= arrayBrackets vi= varInitializer
            {
            IDENT12=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variableDeclarator610); if (state.failed) return retval;

            pushFollow(FOLLOW_arrayBrackets_in_variableDeclarator614);
            a=arrayBrackets();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_varInitializer_in_variableDeclarator618);
            vi=varInitializer();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                  retval.init = "";
                  if (!(vi.equals(""))) {      //User has initialized already        
                    if ((a!=null?a.str:null).equals(""))          //Non-array init: do nothing
                        retval.str = "_" + IDENT12.getText() + (a!=null?a.str:null) + vi;
                    
                    else {  ///Array init: change "char[2] = {1,2}" to "char[] = {1,2}"
                        retval.str = "_" + IDENT12.getText() + (a!=null?a.str:null).replaceAll("[^\\[\\]]", "") + vi;
                    }  
                  }
                  
                  else if ((a!=null?a.str:null).equals("")) {   //Initialize non-array to default value:
                    retval.str = "_" + IDENT12.getText() + " = __default__";   ///__default__ replaced with default value later
                  }  
                  
                  else {                          //Initialize an array:
                    int numBrackets = (a!=null?a.str:null).split("\\[").length - 1;
                    retval.str = "_" + IDENT12.getText();
                    for (int i=0; i<numBrackets; i++)
                      retval.str = retval.str + "[]";
                    
                    if ((a!=null?a.fixedSize:false)) {
                         //retval.str = retval.str + " = new __type__" + (a!=null?a.str:null) + ";\ninitArray(" + "_"+IDENT12.getText() + ")";          ///__type__ replaced with type later
                         retval.str = retval.str + " = new __type__" + (a!=null?a.str:null);          ///__type__ replaced with type later
                         retval.init = "initArray(" + "_"+IDENT12.getText() + ");\n";
                    }
                    else 
                         retval.str = retval.str + " = null";          ///example: integer b[] should be replaced with integer b[] = null;
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



    // $ANTLR start "varInitializer"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:177:1: varInitializer returns [String str] : ( ASSIGN i= initializer )? ;
    public final String varInitializer() throws RecognitionException {
        String str = null;

        int varInitializer_StartIndex = input.index();

        String i =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:178:3: ( ( ASSIGN i= initializer )? )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:179:3: ( ASSIGN i= initializer )?
            {
            if ( state.backtracking==0 ) { str = ""; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:180:3: ( ASSIGN i= initializer )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ASSIGN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:180:5: ASSIGN i= initializer
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_varInitializer655); if (state.failed) return str;

                    pushFollow(FOLLOW_initializer_in_varInitializer659);
                    i=initializer();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = " = " + i; }

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
            if ( state.backtracking>0 ) { memoize(input, 9, varInitializer_StartIndex); }

        }
        return str;
    }
    // $ANTLR end "varInitializer"



    // $ANTLR start "initializer"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:186:1: initializer returns [String str] : (e= expression |ai= arrayInitializer );
    public final String initializer() throws RecognitionException {
        String str = null;

        int initializer_StartIndex = input.index();

        String e =null;

        String ai =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:187:3: (e= expression |ai= arrayInitializer )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EXPR) ) {
                alt13=1;
            }
            else if ( (LA13_0==ARRAY_INITIALIZER) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:187:5: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_initializer686);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = e;  }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:188:5: ai= arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_initializer706);
                    ai=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = ai; }

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
        return str;
    }
    // $ANTLR end "initializer"



    // $ANTLR start "arrayInitializer"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:192:1: arrayInitializer returns [String str] : ^( ARRAY_INITIALIZER (i= initializer )* ) ;
    public final String arrayInitializer() throws RecognitionException {
        String str = null;

        int arrayInitializer_StartIndex = input.index();

        String i =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:193:3: ( ^( ARRAY_INITIALIZER (i= initializer )* ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:193:5: ^( ARRAY_INITIALIZER (i= initializer )* )
            {
            match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer731); if (state.failed) return str;

            if ( state.backtracking==0 ) { str = "{"; }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return str;
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:195:3: (i= initializer )*
                loop14:
                do {
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ARRAY_INITIALIZER||LA14_0==EXPR) ) {
                        alt14=1;
                    }


                    switch (alt14) {
                	case 1 :
                	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:196:5: i= initializer
                	    {
                	    pushFollow(FOLLOW_initializer_in_arrayInitializer748);
                	    i=initializer();

                	    state._fsp--;
                	    if (state.failed) return str;

                	    if ( state.backtracking==0 ) { if (str.equals("{")) 
                	                              str = str + i;  
                	                          else
                	                              str = str + ", " + i; }

                	    }
                	    break;

                	default :
                	    break loop14;
                    }
                } while (true);


                if ( state.backtracking==0 ) { str = str + "}"; }

                match(input, Token.UP, null); if (state.failed) return str;
            }


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
        return str;
    }
    // $ANTLR end "arrayInitializer"



    // $ANTLR start "structMembersList"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:211:1: structMembersList returns [String str] : ( structMember )+ ;
    public final String structMembersList() throws RecognitionException {
        String str = null;

        int structMembersList_StartIndex = input.index();

        String structMember13 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:212:3: ( ( structMember )+ )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:212:5: ( structMember )+
            {
            if ( state.backtracking==0 ) {str = "";}

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:213:3: ( structMember )+
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
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:213:4: structMember
            	    {
            	    pushFollow(FOLLOW_structMember_in_structMembersList798);
            	    structMember13=structMember();

            	    state._fsp--;
            	    if (state.failed) return str;

            	    if ( state.backtracking==0 ) {str += structMember13 +";\n";}

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return str;}
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
        return str;
    }
    // $ANTLR end "structMembersList"



    // $ANTLR start "structMember"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:217:1: structMember returns [String str] : typeSpec IDENT a= arrayBrackets ;
    public final String structMember() throws RecognitionException {
        String str = null;

        int structMember_StartIndex = input.index();

        CommonTree IDENT15=null;
        TranslatorTreeWalker.arrayBrackets_return a =null;

        TranslatorTreeWalker.typeSpec_return typeSpec14 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:218:3: ( typeSpec IDENT a= arrayBrackets )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:218:5: typeSpec IDENT a= arrayBrackets
            {
            pushFollow(FOLLOW_typeSpec_in_structMember824);
            typeSpec14=typeSpec();

            state._fsp--;
            if (state.failed) return str;

            IDENT15=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_structMember826); if (state.failed) return str;

            pushFollow(FOLLOW_arrayBrackets_in_structMember830);
            a=arrayBrackets();

            state._fsp--;
            if (state.failed) return str;

            if ( state.backtracking==0 ) {
                     if ((a!=null?a.str:null).equals(""))   ///Initialize a non-array type (primitive or struct)
                        str = (typeSpec14!=null?typeSpec14.str:null) + " " + "_"+IDENT15.getText() /*+ " = " + defaultInitializer((typeSpec14!=null?typeSpec14.str:null))*/;
                  
                     else {                   ///Initialize an array
                        int numBrackets = (a!=null?a.str:null).split("\\[").length - 1;
                        str = (typeSpec14!=null?typeSpec14.str:null) + " _" + IDENT15.getText();
                        for (int i=0; i<numBrackets; i++)
                          str = str + "[]";
                    
                        if ((a!=null?a.fixedSize:false))
                          str = str + " = new " + (typeSpec14!=null?typeSpec14.str:null) + (a!=null?a.str:null);                
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
        return str;
    }
    // $ANTLR end "structMember"



    // $ANTLR start "structUsage"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:236:1: structUsage returns [String str] : 'struct' id= IDENT ( LBRACK RBRACK )* ;
    public final String structUsage() throws RecognitionException {
        String str = null;

        int structUsage_StartIndex = input.index();

        CommonTree id=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:237:3: ( 'struct' id= IDENT ( LBRACK RBRACK )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:237:6: 'struct' id= IDENT ( LBRACK RBRACK )*
            {
            match(input,127,FOLLOW_127_in_structUsage859); if (state.failed) return str;

            id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_structUsage863); if (state.failed) return str;

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:237:24: ( LBRACK RBRACK )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LBRACK) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:237:25: LBRACK RBRACK
            	    {
            	    match(input,LBRACK,FOLLOW_LBRACK_in_structUsage866); if (state.failed) return str;

            	    match(input,RBRACK,FOLLOW_RBRACK_in_structUsage869); if (state.failed) return str;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            if ( state.backtracking==0 ) {  
                  str = "_"+id.getText();
                  }

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
        return str;
    }
    // $ANTLR end "structUsage"



    // $ANTLR start "parameterDeclarationList"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:249:1: parameterDeclarationList returns [String str] : (p1= parameterDeclaration ( COMMA p2= parameterDeclaration )* )? ;
    public final String parameterDeclarationList() throws RecognitionException {
        String str = null;

        int parameterDeclarationList_StartIndex = input.index();

        String p1 =null;

        String p2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:250:3: ( (p1= parameterDeclaration ( COMMA p2= parameterDeclaration )* )? )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:250:5: (p1= parameterDeclaration ( COMMA p2= parameterDeclaration )* )?
            {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:250:5: (p1= parameterDeclaration ( COMMA p2= parameterDeclaration )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==PARAM_DECL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:250:7: p1= parameterDeclaration ( COMMA p2= parameterDeclaration )*
                    {
                    pushFollow(FOLLOW_parameterDeclaration_in_parameterDeclarationList910);
                    p1=parameterDeclaration();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = p1 ; }

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:251:5: ( COMMA p2= parameterDeclaration )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:251:7: COMMA p2= parameterDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_parameterDeclarationList921); if (state.failed) return str;

                    	    pushFollow(FOLLOW_parameterDeclaration_in_parameterDeclarationList927);
                    	    p2=parameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return str;

                    	    if ( state.backtracking==0 ) { str += ", " + p2 ;}

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
        return str;
    }
    // $ANTLR end "parameterDeclarationList"



    // $ANTLR start "parameterDeclaration"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:255:1: parameterDeclaration returns [String str] : ^( PARAM_DECL typeSpec IDENT ab= arrayBrackets ) ;
    public final String parameterDeclaration() throws RecognitionException {
        String str = null;

        int parameterDeclaration_StartIndex = input.index();

        CommonTree IDENT17=null;
        TranslatorTreeWalker.arrayBrackets_return ab =null;

        TranslatorTreeWalker.typeSpec_return typeSpec16 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:256:3: ( ^( PARAM_DECL typeSpec IDENT ab= arrayBrackets ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:256:5: ^( PARAM_DECL typeSpec IDENT ab= arrayBrackets )
            {
            match(input,PARAM_DECL,FOLLOW_PARAM_DECL_in_parameterDeclaration953); if (state.failed) return str;

            match(input, Token.DOWN, null); if (state.failed) return str;
            pushFollow(FOLLOW_typeSpec_in_parameterDeclaration955);
            typeSpec16=typeSpec();

            state._fsp--;
            if (state.failed) return str;

            IDENT17=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_parameterDeclaration957); if (state.failed) return str;

            pushFollow(FOLLOW_arrayBrackets_in_parameterDeclaration961);
            ab=arrayBrackets();

            state._fsp--;
            if (state.failed) return str;

            match(input, Token.UP, null); if (state.failed) return str;


            if ( state.backtracking==0 ) { 
                    str = (typeSpec16!=null?typeSpec16.str:null) + " " + "_"+IDENT17.getText() + (ab!=null?ab.str:null);
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
        return str;
    }
    // $ANTLR end "parameterDeclaration"



    // $ANTLR start "compoundStatement"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:269:1: compoundStatement returns [String str] : ^( BLOCK_SCOPE ( statement )* ) ;
    public final String compoundStatement() throws RecognitionException {
        String str = null;

        int compoundStatement_StartIndex = input.index();

        TranslatorTreeWalker.statement_return statement18 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:270:2: ( ^( BLOCK_SCOPE ( statement )* ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:270:4: ^( BLOCK_SCOPE ( statement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_compoundStatement1005); if (state.failed) return str;

            if ( state.backtracking==0 ) {str = "{\n";}

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return str;
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:272:3: ( statement )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==BLOCK_SCOPE||LA19_0==BREAK||LA19_0==CONTINUE||LA19_0==DO||LA19_0==EMPTY||(LA19_0 >= EXPRESSION && LA19_0 <= FOR)||LA19_0==IF||LA19_0==RETURN||LA19_0==SWITCH||(LA19_0 >= VAR_DECL && LA19_0 <= WHILE)) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:272:6: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_compoundStatement1016);
                	    statement18=statement();

                	    state._fsp--;
                	    if (state.failed) return str;

                	    if ( state.backtracking==0 ) {str += (statement18!=null?statement18.str:null); }

                	    }
                	    break;

                	default :
                	    break loop19;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return str;
            }


            if ( state.backtracking==0 ) {str += "}\n";}

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
        return str;
    }
    // $ANTLR end "compoundStatement"


    public static class statement_return extends TreeRuleReturnScope {
        public String str;
        public boolean is_comp;
    };


    // $ANTLR start "statement"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:279:1: statement returns [String str, boolean is_comp] : ( compoundStatement | declaration | ^( EXPRESSION expression ) | ^( IF e= expression ifStat= statement (elseStat= statement )? ) | ^( FOR forInit forCond forIter s= statement ) | ^( WHILE e= expression st= statement ) | ^( DO st= statement e= expression ) | BREAK | CONTINUE | RETURN | ^( SWITCH e= expression (cg= casesGroup )* ) | EMPTY );
    public final TranslatorTreeWalker.statement_return statement() throws RecognitionException {
        TranslatorTreeWalker.statement_return retval = new TranslatorTreeWalker.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        String e =null;

        TranslatorTreeWalker.statement_return ifStat =null;

        TranslatorTreeWalker.statement_return elseStat =null;

        TranslatorTreeWalker.statement_return s =null;

        TranslatorTreeWalker.statement_return st =null;

        String cg =null;

        String compoundStatement19 =null;

        String declaration20 =null;

        String expression21 =null;

        String forInit22 =null;

        String forCond23 =null;

        String forIter24 =null;


         boolean defaultUsed = false; 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:281:3: ( compoundStatement | declaration | ^( EXPRESSION expression ) | ^( IF e= expression ifStat= statement (elseStat= statement )? ) | ^( FOR forInit forCond forIter s= statement ) | ^( WHILE e= expression st= statement ) | ^( DO st= statement e= expression ) | BREAK | CONTINUE | RETURN | ^( SWITCH e= expression (cg= casesGroup )* ) | EMPTY )
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:281:5: compoundStatement
                    {
                    if ( state.backtracking==0 ) {retval.is_comp = false;}

                    pushFollow(FOLLOW_compoundStatement_in_statement1056);
                    compoundStatement19=compoundStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                            retval.str = compoundStatement19;
                            retval.is_comp = true; 
                            }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:286:5: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_statement1073);
                    declaration20=declaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.str = declaration20 + ";\n";}

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:288:5: ^( EXPRESSION expression )
                    {
                    match(input,EXPRESSION,FOLLOW_EXPRESSION_in_statement1111); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement1113);
                    expression21=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) {retval.str = expression21 + ";\n";}

                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:289:5: ^( IF e= expression ifStat= statement (elseStat= statement )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement1124); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement1128);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_statement1132);
                    ifStat=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { 
                                    if((ifStat!=null?ifStat.is_comp:false))
                                        retval.str = "if (" + e + ")\n" + (ifStat!=null?ifStat.str:null);
                                    else
                                        retval.str = "if (" + e + ")\n{\n" + (ifStat!=null?ifStat.str:null) +"}\n"; 
                                    }

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:295:9: (elseStat= statement )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==BLOCK_SCOPE||LA20_0==BREAK||LA20_0==CONTINUE||LA20_0==DO||LA20_0==EMPTY||(LA20_0 >= EXPRESSION && LA20_0 <= FOR)||LA20_0==IF||LA20_0==RETURN||LA20_0==SWITCH||(LA20_0 >= VAR_DECL && LA20_0 <= WHILE)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:295:11: elseStat= statement
                            {
                            pushFollow(FOLLOW_statement_in_statement1148);
                            elseStat=statement();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { 
                                            if((elseStat!=null?elseStat.is_comp:false))
                                                retval.str = retval.str + "else \n" + (elseStat!=null?elseStat.str:null); 
                                            else
                                                 retval.str = retval.str + "else \n{\n" + (elseStat!=null?elseStat.str:null) + "}\n"; 
                                            }

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:304:5: ^( FOR forInit forCond forIter s= statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement1182); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_forInit_in_statement1184);
                    forInit22=forInit();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_forCond_in_statement1186);
                    forCond23=forCond();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_forIter_in_statement1188);
                    forIter24=forIter();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_statement1192);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) {
                                retval.str = "for (" + forInit22 + " ; " + forCond23 + " ; " + forIter24 + ")\n";
                                if((s!=null?s.is_comp:false)) {
                                    retval.str = retval.str + "{\nif(false)break;\n" +(s!=null?s.str:null).subSequence(2, (s!=null?s.str:null).length());  
                                }else {
                                    retval.str = retval.str + "{\nif(false)break;\n" +(s!=null?s.str:null) + "}\n";
                                }
                              }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:313:5: ^( WHILE e= expression st= statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement1212); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement1216);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_statement1220);
                    st=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) {
                                if((st!=null?st.is_comp:false)) {
                                    retval.str = "while (" + e + ")\n{\nif(false)break;\n" + 
                                        (st!=null?st.str:null).subSequence(2, (st!=null?st.str:null).length());
                                }else {
                                    retval.str = "while (" + e + ")\n{\nif(false)break;\n" + (st!=null?st.str:null) +"}\n" ;
                                }
                              }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:322:5: ^( DO st= statement e= expression )
                    {
                    match(input,DO,FOLLOW_DO_in_statement1241); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement1245);
                    st=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_statement1249);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) {
                                if((st!=null?st.is_comp:false)) {
                                    retval.str = "do {\nif(false)break;\n" + 
                                        (st!=null?st.str:null).subSequence(2, (st!=null?st.str:null).length()) + 
                                        "while (" + e + ");";
                                }else{
                                    retval.str = "do {\nif(false)break;\n" + (st!=null?st.str:null) + "}\n" + "while (" + e + ");";            
                                }
                              }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:332:5: BREAK
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement1269); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.str = "if (true) break;\n"; }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:333:5: CONTINUE
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1280); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.str = "continue;\n"; }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:334:5: RETURN
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement1288); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.str = "if (true) return _$;\n"; }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:335:5: ^( SWITCH e= expression (cg= casesGroup )* )
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement1297); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement1301);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.str = ""; }

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:336:9: (cg= casesGroup )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==CASE||LA21_0==DEFAULT) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:336:10: cg= casesGroup
                    	    {
                    	    pushFollow(FOLLOW_casesGroup_in_statement1317);
                    	    cg=casesGroup();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) {   
                    	                if (!defaultUsed) {    ///Haven't used default yet, keep on translating
                    	                   if (retval.str.equals(""))
                    	                        retval.str = retval.str + cg.replaceAll("___replace___", e); 
                    	                   else
                    	                        retval.str = retval.str + cg.replace("if (", "else if(").replaceAll("___replace___", e); 
                    	                        
                    	                   if (!cg.contains("___replace___")) defaultUsed = true;  ///default used   
                    	                }
                    	            }

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 12 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:348:5: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_statement1356); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.str = ";"; }

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
        return retval;
    }
    // $ANTLR end "statement"



    // $ANTLR start "forInit"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:352:1: forInit returns [String str] : ( ^( FOR_INIT declaration ) | ^( FOR_INIT expressionList ) | FOR_INIT );
    public final String forInit() throws RecognitionException {
        String str = null;

        int forInit_StartIndex = input.index();

        String declaration25 =null;

        String expressionList26 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:353:3: ( ^( FOR_INIT declaration ) | ^( FOR_INIT expressionList ) | FOR_INIT )
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
                        if (state.backtracking>0) {state.failed=true; return str;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA23_1==FOR_CONDITION) ) {
                    alt23=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return str;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:353:5: ^( FOR_INIT declaration )
                    {
                    match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit1377); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_declaration_in_forInit1379);
                    declaration25=declaration();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = declaration25; }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:354:5: ^( FOR_INIT expressionList )
                    {
                    match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit1397); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expressionList_in_forInit1399);
                    expressionList26=expressionList();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expressionList26; }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:355:5: FOR_INIT
                    {
                    match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit1409); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = ""; }

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
        return str;
    }
    // $ANTLR end "forInit"



    // $ANTLR start "forCond"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:359:1: forCond returns [String str] : ^( FOR_CONDITION ( expression )? ) ;
    public final String forCond() throws RecognitionException {
        String str = null;

        int forCond_StartIndex = input.index();

        String expression27 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:360:3: ( ^( FOR_CONDITION ( expression )? ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:360:5: ^( FOR_CONDITION ( expression )? )
            {
            match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCond1431); if (state.failed) return str;

            if ( state.backtracking==0 ) { str = "";}

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return str;
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:360:35: ( expression )?
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==EXPR) ) {
                    alt24=1;
                }
                switch (alt24) {
                    case 1 :
                        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:360:36: expression
                        {
                        pushFollow(FOLLOW_expression_in_forCond1436);
                        expression27=expression();

                        state._fsp--;
                        if (state.failed) return str;

                        if ( state.backtracking==0 ) {str =expression27;}

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return str;
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
        return str;
    }
    // $ANTLR end "forCond"



    // $ANTLR start "forIter"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:364:1: forIter returns [String str] : ^( FOR_ITER ( expressionList )? ) ;
    public final String forIter() throws RecognitionException {
        String str = null;

        int forIter_StartIndex = input.index();

        String expressionList28 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:365:3: ( ^( FOR_ITER ( expressionList )? ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:365:5: ^( FOR_ITER ( expressionList )? )
            {
            match(input,FOR_ITER,FOLLOW_FOR_ITER_in_forIter1465); if (state.failed) return str;

            if ( state.backtracking==0 ) { str = "";}

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return str;
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:365:30: ( expressionList )?
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==EXPR) ) {
                    alt25=1;
                }
                switch (alt25) {
                    case 1 :
                        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:365:31: expressionList
                        {
                        pushFollow(FOLLOW_expressionList_in_forIter1470);
                        expressionList28=expressionList();

                        state._fsp--;
                        if (state.failed) return str;

                        if ( state.backtracking==0 ) {str =expressionList28;}

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return str;
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
        return str;
    }
    // $ANTLR end "forIter"



    // $ANTLR start "casesGroup"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:369:1: casesGroup returns [String str] : ( aCase ) ( statement )* ;
    public final String casesGroup() throws RecognitionException {
        String str = null;

        int casesGroup_StartIndex = input.index();

        String aCase29 =null;

        TranslatorTreeWalker.statement_return statement30 =null;


         str = ""; 
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:371:3: ( ( aCase ) ( statement )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:371:7: ( aCase ) ( statement )*
            {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:371:7: ( aCase )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:371:8: aCase
            {
            pushFollow(FOLLOW_aCase_in_casesGroup1505);
            aCase29=aCase();

            state._fsp--;
            if (state.failed) return str;

            if ( state.backtracking==0 ) { 
                      if (aCase29.equals("default"))  //translate default to else
                          str = str + "\nelse\n";          
                      else                                //translate case to if
                          str = str + "\nif (___replace___ == " + aCase29 + ")\n";         
                  }

            }


            if ( state.backtracking==0 ) { str = str + "{\n"; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:380:7: ( statement )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==BLOCK_SCOPE||LA26_0==BREAK||LA26_0==CONTINUE||LA26_0==DO||LA26_0==EMPTY||(LA26_0 >= EXPRESSION && LA26_0 <= FOR)||LA26_0==IF||LA26_0==RETURN||LA26_0==SWITCH||(LA26_0 >= VAR_DECL && LA26_0 <= WHILE)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:380:8: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_casesGroup1541);
            	    statement30=statement();

            	    state._fsp--;
            	    if (state.failed) return str;

            	    if ( state.backtracking==0 ) { str = str + (statement30!=null?statement30.str:null); }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            if ( state.backtracking==0 ) { str = str + "\n}";  }

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
        return str;
    }
    // $ANTLR end "casesGroup"



    // $ANTLR start "aCase"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:386:1: aCase returns [String str] : ( ^( CASE e= expression ) | DEFAULT );
    public final String aCase() throws RecognitionException {
        String str = null;

        int aCase_StartIndex = input.index();

        String e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:387:3: ( ^( CASE e= expression ) | DEFAULT )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==CASE) ) {
                alt27=1;
            }
            else if ( (LA27_0==DEFAULT) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:387:5: ^( CASE e= expression )
                    {
                    match(input,CASE,FOLLOW_CASE_in_aCase1588); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expression_in_aCase1592);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = e; }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:388:5: DEFAULT
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_aCase1602); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = "default";}

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
        return str;
    }
    // $ANTLR end "aCase"



    // $ANTLR start "expression"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:396:1: expression returns [String str] : ^( EXPR expr ) ;
    public final String expression() throws RecognitionException {
        String str = null;

        int expression_StartIndex = input.index();

        String expr31 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:397:5: ( ^( EXPR expr ) )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:397:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression1645); if (state.failed) return str;

            match(input, Token.DOWN, null); if (state.failed) return str;
            pushFollow(FOLLOW_expr_in_expression1647);
            expr31=expr();

            state._fsp--;
            if (state.failed) return str;

            match(input, Token.UP, null); if (state.failed) return str;


            if ( state.backtracking==0 ) { str = expr31; }

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
        return str;
    }
    // $ANTLR end "expression"



    // $ANTLR start "expr"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:402:1: expr returns [String str] : ( ^( ASSIGN expr1= expr expr2= expr ) | ^( PLUS_ASSIGN expr1= expr expr2= expr ) | ^( MINUS_ASSIGN expr1= expr expr2= expr ) | ^( STAR_ASSIGN expr1= expr expr2= expr ) | ^( DIV_ASSIGN expr1= expr expr2= expr ) | ^( BAND_ASSIGN expr1= expr expr2= expr ) | ^( BOR_ASSIGN expr1= expr expr2= expr ) | ^( BXOR_ASSIGN expr1= expr expr2= expr ) | ^( MOD_ASSIGN expr1= expr expr2= expr ) | ^( QUESTION e1= expr e2= expr COLON e= expr ) | ^( LOR expr1= expr expr2= expr ) | ^( LAND expr1= expr expr2= expr ) | ^( BOR expr1= expr expr2= expr ) | ^( BXOR expr1= expr expr2= expr ) | ^( BAND expr1= expr expr2= expr ) | ^( EQUAL expr1= expr expr2= expr ) | ^( NOT_EQUAL expr1= expr expr2= expr ) | ^( LE expr1= expr expr2= expr ) | ^( GE expr1= expr expr2= expr ) | ^( GT expr1= expr expr2= expr ) | ^( LT expr1= expr expr2= expr ) | ^( PLUS expr1= expr expr2= expr ) | ^( MINUS expr1= expr expr2= expr ) | ^( STAR expr1= expr expr2= expr ) | ^( DIV expr1= expr expr2= expr ) | ^( MOD expr1= expr expr2= expr ) | ^( UNARY_PLUS e= expr ) | ^( UNARY_MINUS e= expr ) | ^( PRE_INC e= expr ) | ^( PRE_DEC e= expr ) | ^( POST_INC e= expr ) | ^( POST_DEC e= expr ) | ^( NOT e= expr ) | ^( LOGICAL_NOT e= expr ) | primaryExpression );
    public final String expr() throws RecognitionException {
        String str = null;

        int expr_StartIndex = input.index();

        CommonTree ASSIGN32=null;
        CommonTree PLUS_ASSIGN33=null;
        CommonTree MINUS_ASSIGN34=null;
        CommonTree STAR_ASSIGN35=null;
        CommonTree DIV_ASSIGN36=null;
        CommonTree BAND_ASSIGN37=null;
        CommonTree BOR_ASSIGN38=null;
        CommonTree BXOR_ASSIGN39=null;
        CommonTree MOD_ASSIGN40=null;
        CommonTree LOR41=null;
        CommonTree LAND42=null;
        CommonTree BOR43=null;
        CommonTree BXOR44=null;
        CommonTree BAND45=null;
        CommonTree EQUAL46=null;
        CommonTree NOT_EQUAL47=null;
        CommonTree LE48=null;
        CommonTree GE49=null;
        CommonTree GT50=null;
        CommonTree LT51=null;
        CommonTree PLUS52=null;
        CommonTree MINUS53=null;
        CommonTree STAR54=null;
        CommonTree DIV55=null;
        CommonTree MOD56=null;
        String expr1 =null;

        String expr2 =null;

        String e1 =null;

        String e2 =null;

        String e =null;

        String primaryExpression57 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:403:5: ( ^( ASSIGN expr1= expr expr2= expr ) | ^( PLUS_ASSIGN expr1= expr expr2= expr ) | ^( MINUS_ASSIGN expr1= expr expr2= expr ) | ^( STAR_ASSIGN expr1= expr expr2= expr ) | ^( DIV_ASSIGN expr1= expr expr2= expr ) | ^( BAND_ASSIGN expr1= expr expr2= expr ) | ^( BOR_ASSIGN expr1= expr expr2= expr ) | ^( BXOR_ASSIGN expr1= expr expr2= expr ) | ^( MOD_ASSIGN expr1= expr expr2= expr ) | ^( QUESTION e1= expr e2= expr COLON e= expr ) | ^( LOR expr1= expr expr2= expr ) | ^( LAND expr1= expr expr2= expr ) | ^( BOR expr1= expr expr2= expr ) | ^( BXOR expr1= expr expr2= expr ) | ^( BAND expr1= expr expr2= expr ) | ^( EQUAL expr1= expr expr2= expr ) | ^( NOT_EQUAL expr1= expr expr2= expr ) | ^( LE expr1= expr expr2= expr ) | ^( GE expr1= expr expr2= expr ) | ^( GT expr1= expr expr2= expr ) | ^( LT expr1= expr expr2= expr ) | ^( PLUS expr1= expr expr2= expr ) | ^( MINUS expr1= expr expr2= expr ) | ^( STAR expr1= expr expr2= expr ) | ^( DIV expr1= expr expr2= expr ) | ^( MOD expr1= expr expr2= expr ) | ^( UNARY_PLUS e= expr ) | ^( UNARY_MINUS e= expr ) | ^( PRE_INC e= expr ) | ^( PRE_DEC e= expr ) | ^( POST_INC e= expr ) | ^( POST_DEC e= expr ) | ^( NOT e= expr ) | ^( LOGICAL_NOT e= expr ) | primaryExpression )
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
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:403:9: ^( ASSIGN expr1= expr expr2= expr )
                    {
                    ASSIGN32=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr1676); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr1680);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1684);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + ASSIGN32.getText() + expr2;   }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:404:9: ^( PLUS_ASSIGN expr1= expr expr2= expr )
                    {
                    PLUS_ASSIGN33=(CommonTree)match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_expr1706); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr1710);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1714);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + PLUS_ASSIGN33.getText() + expr2;  }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:405:9: ^( MINUS_ASSIGN expr1= expr expr2= expr )
                    {
                    MINUS_ASSIGN34=(CommonTree)match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_expr1731); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr1735);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1739);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + MINUS_ASSIGN34.getText() + expr2;   }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:406:9: ^( STAR_ASSIGN expr1= expr expr2= expr )
                    {
                    STAR_ASSIGN35=(CommonTree)match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_expr1755); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr1759);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1763);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + STAR_ASSIGN35.getText() + expr2;   }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:407:9: ^( DIV_ASSIGN expr1= expr expr2= expr )
                    {
                    DIV_ASSIGN36=(CommonTree)match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_expr1780); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr1784);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1788);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + DIV_ASSIGN36.getText() + expr2;   }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:408:9: ^( BAND_ASSIGN expr1= expr expr2= expr )
                    {
                    BAND_ASSIGN37=(CommonTree)match(input,BAND_ASSIGN,FOLLOW_BAND_ASSIGN_in_expr1806); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr1810);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1814);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + BAND_ASSIGN37.getText() + expr2;   }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:409:9: ^( BOR_ASSIGN expr1= expr expr2= expr )
                    {
                    BOR_ASSIGN38=(CommonTree)match(input,BOR_ASSIGN,FOLLOW_BOR_ASSIGN_in_expr1831); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr1835);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1839);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + BOR_ASSIGN38.getText() + expr2;   }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:410:9: ^( BXOR_ASSIGN expr1= expr expr2= expr )
                    {
                    BXOR_ASSIGN39=(CommonTree)match(input,BXOR_ASSIGN,FOLLOW_BXOR_ASSIGN_in_expr1857); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr1861);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1865);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + BXOR_ASSIGN39.getText() + expr2;   }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:411:9: ^( MOD_ASSIGN expr1= expr expr2= expr )
                    {
                    MOD_ASSIGN40=(CommonTree)match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_expr1882); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr1886);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1890);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + MOD_ASSIGN40.getText() + expr2;   }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:412:9: ^( QUESTION e1= expr e2= expr COLON e= expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expr1908); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr1912);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1916);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input,COLON,FOLLOW_COLON_in_expr1918); if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1922);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = e1 + " ? " + e2 + " : " + e;   }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:413:9: ^( LOR expr1= expr expr2= expr )
                    {
                    LOR41=(CommonTree)match(input,LOR,FOLLOW_LOR_in_expr1936); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr1940);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1944);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + LOR41.getText() + expr2;   }

                    }
                    break;
                case 12 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:414:9: ^( LAND expr1= expr expr2= expr )
                    {
                    LAND42=(CommonTree)match(input,LAND,FOLLOW_LAND_in_expr1969); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr1973);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr1977);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + LAND42.getText() + expr2;   }

                    }
                    break;
                case 13 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:415:9: ^( BOR expr1= expr expr2= expr )
                    {
                    BOR43=(CommonTree)match(input,BOR,FOLLOW_BOR_in_expr2001); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2005);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2009);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + BOR43.getText() + expr2;   }

                    }
                    break;
                case 14 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:416:9: ^( BXOR expr1= expr expr2= expr )
                    {
                    BXOR44=(CommonTree)match(input,BXOR,FOLLOW_BXOR_in_expr2034); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2038);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2042);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + BXOR44.getText() + expr2;   }

                    }
                    break;
                case 15 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:417:9: ^( BAND expr1= expr expr2= expr )
                    {
                    BAND45=(CommonTree)match(input,BAND,FOLLOW_BAND_in_expr2066); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2070);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2074);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + BAND45.getText() + expr2;   }

                    }
                    break;
                case 16 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:418:9: ^( EQUAL expr1= expr expr2= expr )
                    {
                    EQUAL46=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_expr2098); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2102);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2106);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + EQUAL46.getText() + expr2;   }

                    }
                    break;
                case 17 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:419:9: ^( NOT_EQUAL expr1= expr expr2= expr )
                    {
                    NOT_EQUAL47=(CommonTree)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr2129); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2133);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2137);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + NOT_EQUAL47.getText() + expr2;   }

                    }
                    break;
                case 18 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:420:9: ^( LE expr1= expr expr2= expr )
                    {
                    LE48=(CommonTree)match(input,LE,FOLLOW_LE_in_expr2156); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2160);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2164);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + LE48.getText() + expr2;   }

                    }
                    break;
                case 19 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:421:9: ^( GE expr1= expr expr2= expr )
                    {
                    GE49=(CommonTree)match(input,GE,FOLLOW_GE_in_expr2190); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2194);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2198);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + GE49.getText() + expr2;   }

                    }
                    break;
                case 20 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:422:9: ^( GT expr1= expr expr2= expr )
                    {
                    GT50=(CommonTree)match(input,GT,FOLLOW_GT_in_expr2224); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2228);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2232);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + GT50.getText() + expr2;   }

                    }
                    break;
                case 21 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:423:9: ^( LT expr1= expr expr2= expr )
                    {
                    LT51=(CommonTree)match(input,LT,FOLLOW_LT_in_expr2258); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2262);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2266);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + LT51.getText() + expr2;   }

                    }
                    break;
                case 22 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:424:9: ^( PLUS expr1= expr expr2= expr )
                    {
                    PLUS52=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr2292); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2296);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2300);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + PLUS52.getText() + expr2;   }

                    }
                    break;
                case 23 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:425:9: ^( MINUS expr1= expr expr2= expr )
                    {
                    MINUS53=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr2324); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2328);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2332);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + MINUS53.getText() + expr2;   }

                    }
                    break;
                case 24 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:426:9: ^( STAR expr1= expr expr2= expr )
                    {
                    STAR54=(CommonTree)match(input,STAR,FOLLOW_STAR_in_expr2355); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2359);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2363);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + STAR54.getText() + expr2;   }

                    }
                    break;
                case 25 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:427:9: ^( DIV expr1= expr expr2= expr )
                    {
                    DIV55=(CommonTree)match(input,DIV,FOLLOW_DIV_in_expr2387); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2391);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2395);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + DIV55.getText() + expr2;   }

                    }
                    break;
                case 26 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:428:9: ^( MOD expr1= expr expr2= expr )
                    {
                    MOD56=(CommonTree)match(input,MOD,FOLLOW_MOD_in_expr2420); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2424);
                    expr1=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_expr2428);
                    expr2=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = expr1 + MOD56.getText() + expr2;   }

                    }
                    break;
                case 27 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:429:9: ^( UNARY_PLUS e= expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr2453); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2457);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = "+" + e;}

                    }
                    break;
                case 28 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:430:9: ^( UNARY_MINUS e= expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr2490); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2494);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = "-" + e;}

                    }
                    break;
                case 29 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:431:9: ^( PRE_INC e= expr )
                    {
                    match(input,PRE_INC,FOLLOW_PRE_INC_in_expr2526); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2530);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = "--" + e;}

                    }
                    break;
                case 30 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:432:9: ^( PRE_DEC e= expr )
                    {
                    match(input,PRE_DEC,FOLLOW_PRE_DEC_in_expr2566); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2570);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = "--" + e;}

                    }
                    break;
                case 31 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:433:9: ^( POST_INC e= expr )
                    {
                    match(input,POST_INC,FOLLOW_POST_INC_in_expr2606); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2610);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = e + "++";   }

                    }
                    break;
                case 32 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:434:9: ^( POST_DEC e= expr )
                    {
                    match(input,POST_DEC,FOLLOW_POST_DEC_in_expr2645); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2649);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = e + "--";   }

                    }
                    break;
                case 33 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:435:9: ^( NOT e= expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr2684); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2688);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = "~" + e;}

                    }
                    break;
                case 34 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:436:9: ^( LOGICAL_NOT e= expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr2728); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_expr_in_expr2732);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { str = "!" + e;}

                    }
                    break;
                case 35 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:437:9: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr2763);
                    primaryExpression57=primaryExpression();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = primaryExpression57;  }

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
        return str;
    }
    // $ANTLR end "expr"



    // $ANTLR start "primaryExpression"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:441:1: primaryExpression returns [String str] : ( ^( METHOD_CALL id= IDENT argList ) | ^( STRUCT_ACCESS structVar= primaryExpression structField= IDENT ) | ^( ARRAY_ELEMENT_ACCESS var= primaryExpression idx= expression ) | constant | 'true' | 'false' | 'null' | IDENT | LPAREN e= expr RPAREN );
    public final String primaryExpression() throws RecognitionException {
        String str = null;

        int primaryExpression_StartIndex = input.index();

        CommonTree id=null;
        CommonTree structField=null;
        CommonTree IDENT60=null;
        String structVar =null;

        String var =null;

        String idx =null;

        String e =null;

        String argList58 =null;

        String constant59 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:442:5: ( ^( METHOD_CALL id= IDENT argList ) | ^( STRUCT_ACCESS structVar= primaryExpression structField= IDENT ) | ^( ARRAY_ELEMENT_ACCESS var= primaryExpression idx= expression ) | constant | 'true' | 'false' | 'null' | IDENT | LPAREN e= expr RPAREN )
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
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:442:7: ^( METHOD_CALL id= IDENT argList )
                    {
                    match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression2810); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    id=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2814); if (state.failed) return str;

                    pushFollow(FOLLOW_argList_in_primaryExpression2816);
                    argList58=argList();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { 
                                str = "_"+id.getText() + "(" + argList58 + ")";
                            }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:446:7: ^( STRUCT_ACCESS structVar= primaryExpression structField= IDENT )
                    {
                    match(input,STRUCT_ACCESS,FOLLOW_STRUCT_ACCESS_in_primaryExpression2858); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression2862);
                    structVar=primaryExpression();

                    state._fsp--;
                    if (state.failed) return str;

                    structField=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2866); if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) {
                                str = structVar + "." + "_" + structField.getText();
                            }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:450:7: ^( ARRAY_ELEMENT_ACCESS var= primaryExpression idx= expression )
                    {
                    match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression2904); if (state.failed) return str;

                    match(input, Token.DOWN, null); if (state.failed) return str;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression2908);
                    var=primaryExpression();

                    state._fsp--;
                    if (state.failed) return str;

                    pushFollow(FOLLOW_expression_in_primaryExpression2912);
                    idx=expression();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input, Token.UP, null); if (state.failed) return str;


                    if ( state.backtracking==0 ) { 
                                str = var + "[(int)(" + idx + ")]"; 
                            }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:454:7: constant
                    {
                    pushFollow(FOLLOW_constant_in_primaryExpression2933);
                    constant59=constant();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = constant59; }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:455:7: 'true'
                    {
                    match(input,129,FOLLOW_129_in_primaryExpression2956); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = "true"; }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:456:7: 'false'
                    {
                    match(input,120,FOLLOW_120_in_primaryExpression2981); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = "false"; }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:457:7: 'null'
                    {
                    match(input,123,FOLLOW_123_in_primaryExpression3005); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = "null"; }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:458:7: IDENT
                    {
                    IDENT60=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3030); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = "_"+IDENT60.getText(); }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:459:7: LPAREN e= expr RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3056); if (state.failed) return str;

                    pushFollow(FOLLOW_expr_in_primaryExpression3060);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return str;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3062); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = "(" + e + ")"; }

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
        return str;
    }
    // $ANTLR end "primaryExpression"



    // $ANTLR start "expressionList"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:464:1: expressionList returns [String str] : e1= expression (e2= expression )* ;
    public final String expressionList() throws RecognitionException {
        String str = null;

        int expressionList_StartIndex = input.index();

        String e1 =null;

        String e2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:465:3: (e1= expression (e2= expression )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:465:5: e1= expression (e2= expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList3092);
            e1=expression();

            state._fsp--;
            if (state.failed) return str;

            if ( state.backtracking==0 ) { str = e1; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:465:39: (e2= expression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==EXPR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:465:40: e2= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expressionList3099);
            	    e2=expression();

            	    state._fsp--;
            	    if (state.failed) return str;

            	    if ( state.backtracking==0 ) { str = str + ", " + e2; }

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
        return str;
    }
    // $ANTLR end "expressionList"



    // $ANTLR start "argList"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:469:1: argList returns [String str] : ( expressionList | EMPTY );
    public final String argList() throws RecognitionException {
        String str = null;

        int argList_StartIndex = input.index();

        String expressionList61 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:470:3: ( expressionList | EMPTY )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==EXPR) ) {
                alt31=1;
            }
            else if ( (LA31_0==EMPTY) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:470:6: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_argList3126);
                    expressionList61=expressionList();

                    state._fsp--;
                    if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = expressionList61; }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:471:7: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_argList3136); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = ""; }

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
        return str;
    }
    // $ANTLR end "argList"



    // $ANTLR start "constant"
    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:474:1: constant returns [String str] : ( NUM_INT | CHAR_LITERAL | STRING_LITERAL | NUM_DOUBLE );
    public final String constant() throws RecognitionException {
        String str = null;

        int constant_StartIndex = input.index();

        CommonTree NUM_INT62=null;
        CommonTree CHAR_LITERAL63=null;
        CommonTree STRING_LITERAL64=null;
        CommonTree NUM_DOUBLE65=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return str; }

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:475:3: ( NUM_INT | CHAR_LITERAL | STRING_LITERAL | NUM_DOUBLE )
            int alt32=4;
            switch ( input.LA(1) ) {
            case NUM_INT:
                {
                alt32=1;
                }
                break;
            case CHAR_LITERAL:
                {
                alt32=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt32=3;
                }
                break;
            case NUM_DOUBLE:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return str;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:475:5: NUM_INT
                    {
                    NUM_INT62=(CommonTree)match(input,NUM_INT,FOLLOW_NUM_INT_in_constant3160); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = NUM_INT62.getText(); }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:476:5: CHAR_LITERAL
                    {
                    CHAR_LITERAL63=(CommonTree)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_constant3176); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = CHAR_LITERAL63.getText(); }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:477:5: STRING_LITERAL
                    {
                    STRING_LITERAL64=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant3187); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = STRING_LITERAL64.getText(); }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:478:5: NUM_DOUBLE
                    {
                    NUM_DOUBLE65=(CommonTree)match(input,NUM_DOUBLE,FOLLOW_NUM_DOUBLE_in_constant3197); if (state.failed) return str;

                    if ( state.backtracking==0 ) { str = NUM_DOUBLE65.getText(); }

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
        return str;
    }
    // $ANTLR end "constant"

    // $ANTLR start synpred3_TranslatorTreeWalker
    public final void synpred3_TranslatorTreeWalker_fragment() throws RecognitionException {
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:58:37: ( parameterDeclarationList )
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:58:37: parameterDeclarationList
        {
        pushFollow(FOLLOW_parameterDeclarationList_in_synpred3_TranslatorTreeWalker185);
        parameterDeclarationList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_TranslatorTreeWalker

    // $ANTLR start synpred15_TranslatorTreeWalker
    public final void synpred15_TranslatorTreeWalker_fragment() throws RecognitionException {
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:130:5: ( ( LBRACK RBRACK )* )
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:130:5: ( LBRACK RBRACK )*
        {
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:130:20: ( LBRACK RBRACK )*
        loop36:
        do {
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LBRACK) ) {
                alt36=1;
            }


            switch (alt36) {
        	case 1 :
        	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\TranslatorTreeWalker.g:130:21: LBRACK RBRACK
        	    {
        	    match(input,LBRACK,FOLLOW_LBRACK_in_synpred15_TranslatorTreeWalker471); if (state.failed) return ;

        	    match(input,RBRACK,FOLLOW_RBRACK_in_synpred15_TranslatorTreeWalker474); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop36;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred15_TranslatorTreeWalker

    // Delegated rules

    public final boolean synpred15_TranslatorTreeWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_TranslatorTreeWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_TranslatorTreeWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_TranslatorTreeWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_START_PROG_in_compilationUnit119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_funcOrVar_in_compilationUnit122 = new BitSet(new long[]{0x0000480000000008L,0x0000010000000000L});
    public static final BitSet FOLLOW_EOF_in_compilationUnit143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_DECL_in_funcOrVar177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeSpec_in_funcOrVar179 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_funcOrVar183 = new BitSet(new long[]{0x0000000000000800L,0x0000000000020000L});
    public static final BitSet FOLLOW_parameterDeclarationList_in_funcOrVar185 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_compoundStatement_in_funcOrVar188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRUCT_DECL_in_funcOrVar214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_funcOrVar218 = new BitSet(new long[]{0x0000000000000000L,0xD412000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_structMembersList_in_funcOrVar220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GLOBAL_STATEMENT_in_funcOrVar241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_funcOrVar243 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_builtInType_in_typeSpec292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInType_in_typeSpec302 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LBRACK_in_typeSpec307 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_typeSpec310 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_structUsage_in_typeSpec325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECL_in_declaration357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeSpec_in_declaration359 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_variableDefinitions_in_declaration361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_130_in_builtInType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_builtInType405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_builtInType413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_builtInType424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_builtInType433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_builtInType444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayBrackets471 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayBrackets474 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayBrackets527 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expression_in_arrayBrackets531 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayBrackets533 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDefinitions560 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_variableDefinitions570 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDefinitions580 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclarator610 = new BitSet(new long[]{0x0100000000000100L});
    public static final BitSet FOLLOW_arrayBrackets_in_variableDeclarator614 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_varInitializer_in_variableDeclarator618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_varInitializer655 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_initializer_in_varInitializer659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_initializer686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_initializer706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_initializer_in_arrayInitializer748 = new BitSet(new long[]{0x0000002000000048L});
    public static final BitSet FOLLOW_structMember_in_structMembersList798 = new BitSet(new long[]{0x0000000000000002L,0xD412000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_typeSpec_in_structMember824 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_structMember826 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_arrayBrackets_in_structMember830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_structUsage859 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_structUsage863 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_structUsage866 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_structUsage869 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_parameterDeclaration_in_parameterDeclarationList910 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_parameterDeclarationList921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_parameterDeclaration_in_parameterDeclarationList927 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_PARAM_DECL_in_parameterDeclaration953 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeSpec_in_parameterDeclaration955 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_parameterDeclaration957 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_arrayBrackets_in_parameterDeclaration961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_compoundStatement1005 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_compoundStatement1016 = new BitSet(new long[]{0x002000C481008808L,0x0000620008000000L});
    public static final BitSet FOLLOW_compoundStatement_in_statement1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_statement1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSION_in_statement1111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement1124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1128 = new BitSet(new long[]{0x002000C481008800L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_statement1132 = new BitSet(new long[]{0x002000C481008808L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_statement1148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement1182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement1184 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_forCond_in_statement1186 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_forIter_in_statement1188 = new BitSet(new long[]{0x002000C481008800L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_statement1192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement1212 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1216 = new BitSet(new long[]{0x002000C481008800L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_statement1220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement1241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement1245 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expression_in_statement1249 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1297 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1301 = new BitSet(new long[]{0x0000000008100008L});
    public static final BitSet FOLLOW_casesGroup_in_statement1317 = new BitSet(new long[]{0x0000000008100008L});
    public static final BitSet FOLLOW_EMPTY_in_statement1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit1377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_forInit1379 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit1397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_forInit1399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_CONDITION_in_forCond1431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCond1436 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_ITER_in_forIter1465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_forIter1470 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_aCase_in_casesGroup1505 = new BitSet(new long[]{0x002000C481008802L,0x0000620008000000L});
    public static final BitSet FOLLOW_statement_in_casesGroup1541 = new BitSet(new long[]{0x002000C481008802L,0x0000620008000000L});
    public static final BitSet FOLLOW_CASE_in_aCase1588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_aCase1592 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFAULT_in_aCase1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPR_in_expression1645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression1647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr1676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1680 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_expr1706 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1710 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1714 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_expr1731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1735 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1739 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_expr1755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1759 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_expr1780 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1784 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1788 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_ASSIGN_in_expr1806 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1810 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1814 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_ASSIGN_in_expr1831 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1835 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1839 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BXOR_ASSIGN_in_expr1857 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1861 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1865 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_expr1882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1886 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_in_expr1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1912 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1916 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COLON_in_expr1918 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1922 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOR_in_expr1936 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1940 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1944 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAND_in_expr1969 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1973 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr1977 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_in_expr2001 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2005 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2009 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BXOR_in_expr2034 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2038 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_in_expr2066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2070 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr2098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2102 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr2129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2133 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_expr2156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2160 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_expr2190 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2194 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2198 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_expr2224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2228 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_expr2258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2262 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr2292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2296 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr2324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2328 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr2355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2359 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr2387 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2391 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr2420 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2424 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr2428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr2453 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr2490 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2494 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_expr2526 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_expr2566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2570 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_expr2606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2610 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_expr2645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr2684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2688 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr2728 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression2810 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2814 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_argList_in_primaryExpression2816 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRUCT_ACCESS_in_primaryExpression2858 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression2862 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2866 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression2904 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression2908 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_primaryExpression2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_primaryExpression2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_primaryExpression2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_primaryExpression3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3056 = new BitSet(new long[]{0x84922008602C6720L,0x09000CE801FC3F7EL,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_primaryExpression3060 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList3092 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList3099 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_expressionList_in_argList3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_argList3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_INT_in_constant3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_constant3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_constant3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_DOUBLE_in_constant3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameterDeclarationList_in_synpred3_TranslatorTreeWalker185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_synpred15_TranslatorTreeWalker471 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RBRACK_in_synpred15_TranslatorTreeWalker474 = new BitSet(new long[]{0x0100000000000002L});

}