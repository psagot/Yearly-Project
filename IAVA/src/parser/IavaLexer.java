// $ANTLR 3.4 C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g 2012-06-22 10:58:37

  package parser;
  import utils.ErrorReporter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class IavaLexer extends Lexer {
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


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public IavaLexer() {} 
    public IavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public IavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g"; }

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:49:8: ( 'boolean' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:49:10: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:50:8: ( 'break' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:50:10: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:51:8: ( 'case' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:51:10: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:52:8: ( 'char' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:52:10: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:53:8: ( 'continue' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:53:10: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:54:8: ( 'default' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:54:10: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:55:8: ( 'do' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:55:10: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:56:8: ( 'false' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:56:10: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:57:8: ( 'for' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:57:10: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:58:8: ( 'integer' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:58:10: 'integer'
            {
            match("integer"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:59:8: ( 'null' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:59:10: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:60:8: ( 'real' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:60:10: 'real'
            {
            match("real"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:61:8: ( 'return' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:61:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:62:8: ( 'string' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:62:10: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:63:8: ( 'struct' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:63:10: 'struct'
            {
            match("struct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:64:8: ( 'switch' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:64:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:65:8: ( 'true' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:65:10: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:66:8: ( 'void' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:66:10: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:67:8: ( 'while' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:67:10: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:532:11: ( '?' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:532:13: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:535:10: ( '(' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:535:12: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:538:10: ( ')' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:538:12: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:541:10: ( '[' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:541:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:544:10: ( ']' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:544:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:547:10: ( '{' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:547:12: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:550:10: ( '}' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:550:12: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:553:9: ( ':' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:553:11: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:556:9: ( ',' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:556:11: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:558:8: ( '.' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:558:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:560:10: ( '=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:560:12: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:563:9: ( '==' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:563:11: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "LNOT"
    public final void mLNOT() throws RecognitionException {
        try {
            int _type = LNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:566:8: ( '!' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:566:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LNOT"

    // $ANTLR start "BNOT"
    public final void mBNOT() throws RecognitionException {
        try {
            int _type = BNOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:569:8: ( '~' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:569:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BNOT"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:572:12: ( '!=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:572:14: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:575:8: ( '/' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:575:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "DIV_ASSIGN"
    public final void mDIV_ASSIGN() throws RecognitionException {
        try {
            int _type = DIV_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:578:13: ( '/=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:578:15: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV_ASSIGN"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:581:8: ( '+' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:581:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "PLUS_ASSIGN"
    public final void mPLUS_ASSIGN() throws RecognitionException {
        try {
            int _type = PLUS_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:584:14: ( '+=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:584:16: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS_ASSIGN"

    // $ANTLR start "INC"
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:587:8: ( '++' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:587:10: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INC"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:590:9: ( '-' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:590:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MINUS_ASSIGN"
    public final void mMINUS_ASSIGN() throws RecognitionException {
        try {
            int _type = MINUS_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:593:14: ( '-=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:593:16: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS_ASSIGN"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:596:8: ( '--' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:596:10: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:599:8: ( '*' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:599:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "STAR_ASSIGN"
    public final void mSTAR_ASSIGN() throws RecognitionException {
        try {
            int _type = STAR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:602:14: ( '*=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:602:16: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR_ASSIGN"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:605:8: ( '%' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:605:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "MOD_ASSIGN"
    public final void mMOD_ASSIGN() throws RecognitionException {
        try {
            int _type = MOD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:608:13: ( '%=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:608:15: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD_ASSIGN"

    // $ANTLR start "SR"
    public final void mSR() throws RecognitionException {
        try {
            int _type = SR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:611:7: ( '>>' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:611:9: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SR"

    // $ANTLR start "SR_ASSIGN"
    public final void mSR_ASSIGN() throws RecognitionException {
        try {
            int _type = SR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:614:12: ( '>>=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:614:14: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SR_ASSIGN"

    // $ANTLR start "BSR"
    public final void mBSR() throws RecognitionException {
        try {
            int _type = BSR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:617:8: ( '>>>' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:617:10: '>>>'
            {
            match(">>>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BSR"

    // $ANTLR start "BSR_ASSIGN"
    public final void mBSR_ASSIGN() throws RecognitionException {
        try {
            int _type = BSR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:620:13: ( '>>>=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:620:15: '>>>='
            {
            match(">>>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BSR_ASSIGN"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:623:7: ( '>=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:623:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:626:7: ( '>' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:626:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "SL"
    public final void mSL() throws RecognitionException {
        try {
            int _type = SL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:629:7: ( '<<' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:629:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL"

    // $ANTLR start "SL_ASSIGN"
    public final void mSL_ASSIGN() throws RecognitionException {
        try {
            int _type = SL_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:632:12: ( '<<=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:632:14: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_ASSIGN"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:635:7: ( '<=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:635:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:638:7: ( '<' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:638:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "BXOR"
    public final void mBXOR() throws RecognitionException {
        try {
            int _type = BXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:641:8: ( '^' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:641:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BXOR"

    // $ANTLR start "BXOR_ASSIGN"
    public final void mBXOR_ASSIGN() throws RecognitionException {
        try {
            int _type = BXOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:644:14: ( '^=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:644:16: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BXOR_ASSIGN"

    // $ANTLR start "BOR"
    public final void mBOR() throws RecognitionException {
        try {
            int _type = BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:647:8: ( '|' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:647:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOR"

    // $ANTLR start "BOR_ASSIGN"
    public final void mBOR_ASSIGN() throws RecognitionException {
        try {
            int _type = BOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:650:13: ( '|=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:650:15: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOR_ASSIGN"

    // $ANTLR start "LOR"
    public final void mLOR() throws RecognitionException {
        try {
            int _type = LOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:653:8: ( '||' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:653:10: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOR"

    // $ANTLR start "BAND"
    public final void mBAND() throws RecognitionException {
        try {
            int _type = BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:656:8: ( '&' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:656:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAND"

    // $ANTLR start "BAND_ASSIGN"
    public final void mBAND_ASSIGN() throws RecognitionException {
        try {
            int _type = BAND_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:659:14: ( '&=' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:659:16: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAND_ASSIGN"

    // $ANTLR start "LAND"
    public final void mLAND() throws RecognitionException {
        try {
            int _type = LAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:662:8: ( '&&' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:662:10: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LAND"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:665:11: ( 'if' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:665:13: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:668:11: ( 'else' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:668:13: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:671:8: ( ';' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:671:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:675:4: ( ( ' ' | '\\t' | '\\f' | ( '\\r\\n' | '\\n' ) )+ )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:675:6: ( ' ' | '\\t' | '\\f' | ( '\\r\\n' | '\\n' ) )+
            {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:675:6: ( ' ' | '\\t' | '\\f' | ( '\\r\\n' | '\\n' ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt2=1;
                    }
                    break;
                case '\t':
                    {
                    alt2=2;
                    }
                    break;
                case '\f':
                    {
                    alt2=3;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:675:8: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:676:5: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:677:5: '\\f'
            	    {
            	    match('\f'); 

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:679:5: ( '\\r\\n' | '\\n' )
            	    {
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:679:5: ( '\\r\\n' | '\\n' )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0=='\r') ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0=='\n') ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:679:7: '\\r\\n'
            	            {
            	            match("\r\n"); 



            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:680:6: '\\n'
            	            {
            	            match('\n'); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:688:2: ( '//' ( options {greedy=false; } : . )* ( '\\r' )? '\\n' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:688:4: '//' ( options {greedy=false; } : . )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:688:9: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\r') ) {
                    alt3=2;
                }
                else if ( (LA3_0=='\n') ) {
                    alt3=2;
                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:688:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:688:40: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:688:41: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:694:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:694:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:695:3: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:695:31: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:701:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )* )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:701:4: ( 'a' .. 'z' | 'A' .. 'Z' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:701:28: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='$'||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "NUM_INT"
    public final void mNUM_INT() throws RecognitionException {
        try {
            int _type = NUM_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:706:5: ( DECIMAL_LITERAL | HEX_LITERAL | OCTAL_LITERAL )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= '1' && LA7_0 <= '9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='0') ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2=='X'||LA7_2=='x') ) {
                    alt7=2;
                }
                else {
                    alt7=3;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:706:7: DECIMAL_LITERAL
                    {
                    mDECIMAL_LITERAL(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:707:7: HEX_LITERAL
                    {
                    mHEX_LITERAL(); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:708:7: OCTAL_LITERAL
                    {
                    mOCTAL_LITERAL(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM_INT"

    // $ANTLR start "DECIMAL_LITERAL"
    public final void mDECIMAL_LITERAL() throws RecognitionException {
        try {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:713:16: ( '1' .. '9' ( '0' .. '9' )* ( 'l' | 'L' )? )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:713:18: '1' .. '9' ( '0' .. '9' )* ( 'l' | 'L' )?
            {
            matchRange('1','9'); 

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:713:27: ( '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:713:39: ( 'l' | 'L' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='L'||LA9_0=='l') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL_LITERAL"

    // $ANTLR start "HEX_LITERAL"
    public final void mHEX_LITERAL() throws RecognitionException {
        try {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:716:12: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( 'l' | 'L' )? )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:716:14: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( 'l' | 'L' )?
            {
            match('0'); 

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:716:28: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'F')||(LA10_0 >= 'a' && LA10_0 <= 'f')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:716:58: ( 'l' | 'L' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='L'||LA11_0=='l') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_LITERAL"

    // $ANTLR start "OCTAL_LITERAL"
    public final void mOCTAL_LITERAL() throws RecognitionException {
        try {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:719:14: ( '0' ( '0' .. '7' )* ( 'l' | 'L' )? )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:719:16: '0' ( '0' .. '7' )* ( 'l' | 'L' )?
            {
            match('0'); 

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:719:20: ( '0' .. '7' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '0' && LA12_0 <= '7')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:719:32: ( 'l' | 'L' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='L'||LA13_0=='l') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_LITERAL"

    // $ANTLR start "NUM_DOUBLE"
    public final void mNUM_DOUBLE() throws RecognitionException {
        try {
            int _type = NUM_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:721:5: ( DIGITS '.' ( DIGITS )? | '.' DIGITS )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                alt15=1;
            }
            else if ( (LA15_0=='.') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:721:11: DIGITS '.' ( DIGITS )?
                    {
                    mDIGITS(); 


                    match('.'); 

                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:721:22: ( DIGITS )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:721:23: DIGITS
                            {
                            mDIGITS(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:722:11: '.' DIGITS
                    {
                    match('.'); 

                    mDIGITS(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM_DOUBLE"

    // $ANTLR start "DIGITS"
    public final void mDIGITS() throws RecognitionException {
        try {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:727:8: ( ( '0' .. '9' )+ )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:727:10: ( '0' .. '9' )+
            {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:727:10: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGITS"

    // $ANTLR start "CHAR_LITERAL"
    public final void mCHAR_LITERAL() throws RecognitionException {
        try {
            int _type = CHAR_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:729:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ESCAPE_SEQUENCE ) '\\'' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:730:7: '\\'' (~ ( '\\'' | '\\\\' ) | ESCAPE_SEQUENCE ) '\\''
            {
            match('\''); 

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:731:7: (~ ( '\\'' | '\\\\' ) | ESCAPE_SEQUENCE )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
                alt17=1;
            }
            else if ( (LA17_0=='\\') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:731:9: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:732:9: ESCAPE_SEQUENCE
                    {
                    mESCAPE_SEQUENCE(); 


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:738:5: ( '\\\"' (~ ( '\\\"' | '\\\\' ) | ESCAPE_SEQUENCE )* '\\\"' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:739:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ESCAPE_SEQUENCE )* '\\\"'
            {
            match('\"'); 

            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:740:7: (~ ( '\\\"' | '\\\\' ) | ESCAPE_SEQUENCE )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '\u0000' && LA18_0 <= '!')||(LA18_0 >= '#' && LA18_0 <= '[')||(LA18_0 >= ']' && LA18_0 <= '\uFFFF')) ) {
                    alt18=1;
                }
                else if ( (LA18_0=='\\') ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:740:9: ~ ( '\\\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:741:9: ESCAPE_SEQUENCE
            	    {
            	    mESCAPE_SEQUENCE(); 


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "ESCAPE_SEQUENCE"
    public final void mESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:749:5: ( '\\\\' 'b' | '\\\\' 't' | '\\\\' 'n' | '\\\\' 'f' | '\\\\' 'r' | '\\\\' '\\\"' | '\\\\' '\\'' | '\\\\' '\\\\' | '\\\\' '0' .. '3' OCTAL_DIGIT OCTAL_DIGIT | '\\\\' OCTAL_DIGIT OCTAL_DIGIT | '\\\\' OCTAL_DIGIT | UNICODE_CHAR )
            int alt19=12;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'b':
                    {
                    alt19=1;
                    }
                    break;
                case 't':
                    {
                    alt19=2;
                    }
                    break;
                case 'n':
                    {
                    alt19=3;
                    }
                    break;
                case 'f':
                    {
                    alt19=4;
                    }
                    break;
                case 'r':
                    {
                    alt19=5;
                    }
                    break;
                case '\"':
                    {
                    alt19=6;
                    }
                    break;
                case '\'':
                    {
                    alt19=7;
                    }
                    break;
                case '\\':
                    {
                    alt19=8;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                    {
                    int LA19_10 = input.LA(3);

                    if ( ((LA19_10 >= '0' && LA19_10 <= '7')) ) {
                        int LA19_13 = input.LA(4);

                        if ( ((LA19_13 >= '0' && LA19_13 <= '7')) ) {
                            alt19=9;
                        }
                        else {
                            alt19=10;
                        }
                    }
                    else {
                        alt19=11;
                    }
                    }
                    break;
                case 'u':
                    {
                    alt19=12;
                    }
                    break;
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    int LA19_12 = input.LA(3);

                    if ( ((LA19_12 >= '0' && LA19_12 <= '7')) ) {
                        alt19=10;
                    }
                    else {
                        alt19=11;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:749:7: '\\\\' 'b'
                    {
                    match('\\'); 

                    match('b'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:750:9: '\\\\' 't'
                    {
                    match('\\'); 

                    match('t'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:751:9: '\\\\' 'n'
                    {
                    match('\\'); 

                    match('n'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:752:9: '\\\\' 'f'
                    {
                    match('\\'); 

                    match('f'); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:753:9: '\\\\' 'r'
                    {
                    match('\\'); 

                    match('r'); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:754:9: '\\\\' '\\\"'
                    {
                    match('\\'); 

                    match('\"'); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:755:9: '\\\\' '\\''
                    {
                    match('\\'); 

                    match('\''); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:756:9: '\\\\' '\\\\'
                    {
                    match('\\'); 

                    match('\\'); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:757:7: '\\\\' '0' .. '3' OCTAL_DIGIT OCTAL_DIGIT
                    {
                    match('\\'); 

                    matchRange('0','3'); 

                    mOCTAL_DIGIT(); 


                    mOCTAL_DIGIT(); 


                    }
                    break;
                case 10 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:758:9: '\\\\' OCTAL_DIGIT OCTAL_DIGIT
                    {
                    match('\\'); 

                    mOCTAL_DIGIT(); 


                    mOCTAL_DIGIT(); 


                    }
                    break;
                case 11 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:759:9: '\\\\' OCTAL_DIGIT
                    {
                    match('\\'); 

                    mOCTAL_DIGIT(); 


                    }
                    break;
                case 12 :
                    // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:760:4: UNICODE_CHAR
                    {
                    mUNICODE_CHAR(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESCAPE_SEQUENCE"

    // $ANTLR start "UNICODE_CHAR"
    public final void mUNICODE_CHAR() throws RecognitionException {
        try {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:765:2: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:765:4: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_CHAR"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:770:2: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "OCTAL_DIGIT"
    public final void mOCTAL_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:775:2: ( '0' .. '7' )
            // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_DIGIT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:8: ( T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | LCURLY | RCURLY | COLON | COMMA | DOT | ASSIGN | EQUAL | LNOT | BNOT | NOT_EQUAL | DIV | DIV_ASSIGN | PLUS | PLUS_ASSIGN | INC | MINUS | MINUS_ASSIGN | DEC | STAR | STAR_ASSIGN | MOD | MOD_ASSIGN | SR | SR_ASSIGN | BSR | BSR_ASSIGN | GE | GT | SL | SL_ASSIGN | LE | LT | BXOR | BXOR_ASSIGN | BOR | BOR_ASSIGN | LOR | BAND | BAND_ASSIGN | LAND | IF | ELSE | SEMI | WS | SL_COMMENT | ML_COMMENT | IDENT | NUM_INT | NUM_DOUBLE | CHAR_LITERAL | STRING_LITERAL )
        int alt20=75;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:10: T__113
                {
                mT__113(); 


                }
                break;
            case 2 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:17: T__114
                {
                mT__114(); 


                }
                break;
            case 3 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:24: T__115
                {
                mT__115(); 


                }
                break;
            case 4 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:31: T__116
                {
                mT__116(); 


                }
                break;
            case 5 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:38: T__117
                {
                mT__117(); 


                }
                break;
            case 6 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:45: T__118
                {
                mT__118(); 


                }
                break;
            case 7 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:52: T__119
                {
                mT__119(); 


                }
                break;
            case 8 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:59: T__120
                {
                mT__120(); 


                }
                break;
            case 9 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:66: T__121
                {
                mT__121(); 


                }
                break;
            case 10 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:73: T__122
                {
                mT__122(); 


                }
                break;
            case 11 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:80: T__123
                {
                mT__123(); 


                }
                break;
            case 12 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:87: T__124
                {
                mT__124(); 


                }
                break;
            case 13 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:94: T__125
                {
                mT__125(); 


                }
                break;
            case 14 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:101: T__126
                {
                mT__126(); 


                }
                break;
            case 15 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:108: T__127
                {
                mT__127(); 


                }
                break;
            case 16 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:115: T__128
                {
                mT__128(); 


                }
                break;
            case 17 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:122: T__129
                {
                mT__129(); 


                }
                break;
            case 18 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:129: T__130
                {
                mT__130(); 


                }
                break;
            case 19 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:136: T__131
                {
                mT__131(); 


                }
                break;
            case 20 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:143: QUESTION
                {
                mQUESTION(); 


                }
                break;
            case 21 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:152: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 22 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:159: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 23 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:166: LBRACK
                {
                mLBRACK(); 


                }
                break;
            case 24 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:173: RBRACK
                {
                mRBRACK(); 


                }
                break;
            case 25 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:180: LCURLY
                {
                mLCURLY(); 


                }
                break;
            case 26 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:187: RCURLY
                {
                mRCURLY(); 


                }
                break;
            case 27 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:194: COLON
                {
                mCOLON(); 


                }
                break;
            case 28 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:200: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 29 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:206: DOT
                {
                mDOT(); 


                }
                break;
            case 30 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:210: ASSIGN
                {
                mASSIGN(); 


                }
                break;
            case 31 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:217: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 32 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:223: LNOT
                {
                mLNOT(); 


                }
                break;
            case 33 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:228: BNOT
                {
                mBNOT(); 


                }
                break;
            case 34 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:233: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 35 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:243: DIV
                {
                mDIV(); 


                }
                break;
            case 36 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:247: DIV_ASSIGN
                {
                mDIV_ASSIGN(); 


                }
                break;
            case 37 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:258: PLUS
                {
                mPLUS(); 


                }
                break;
            case 38 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:263: PLUS_ASSIGN
                {
                mPLUS_ASSIGN(); 


                }
                break;
            case 39 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:275: INC
                {
                mINC(); 


                }
                break;
            case 40 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:279: MINUS
                {
                mMINUS(); 


                }
                break;
            case 41 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:285: MINUS_ASSIGN
                {
                mMINUS_ASSIGN(); 


                }
                break;
            case 42 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:298: DEC
                {
                mDEC(); 


                }
                break;
            case 43 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:302: STAR
                {
                mSTAR(); 


                }
                break;
            case 44 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:307: STAR_ASSIGN
                {
                mSTAR_ASSIGN(); 


                }
                break;
            case 45 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:319: MOD
                {
                mMOD(); 


                }
                break;
            case 46 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:323: MOD_ASSIGN
                {
                mMOD_ASSIGN(); 


                }
                break;
            case 47 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:334: SR
                {
                mSR(); 


                }
                break;
            case 48 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:337: SR_ASSIGN
                {
                mSR_ASSIGN(); 


                }
                break;
            case 49 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:347: BSR
                {
                mBSR(); 


                }
                break;
            case 50 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:351: BSR_ASSIGN
                {
                mBSR_ASSIGN(); 


                }
                break;
            case 51 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:362: GE
                {
                mGE(); 


                }
                break;
            case 52 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:365: GT
                {
                mGT(); 


                }
                break;
            case 53 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:368: SL
                {
                mSL(); 


                }
                break;
            case 54 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:371: SL_ASSIGN
                {
                mSL_ASSIGN(); 


                }
                break;
            case 55 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:381: LE
                {
                mLE(); 


                }
                break;
            case 56 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:384: LT
                {
                mLT(); 


                }
                break;
            case 57 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:387: BXOR
                {
                mBXOR(); 


                }
                break;
            case 58 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:392: BXOR_ASSIGN
                {
                mBXOR_ASSIGN(); 


                }
                break;
            case 59 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:404: BOR
                {
                mBOR(); 


                }
                break;
            case 60 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:408: BOR_ASSIGN
                {
                mBOR_ASSIGN(); 


                }
                break;
            case 61 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:419: LOR
                {
                mLOR(); 


                }
                break;
            case 62 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:423: BAND
                {
                mBAND(); 


                }
                break;
            case 63 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:428: BAND_ASSIGN
                {
                mBAND_ASSIGN(); 


                }
                break;
            case 64 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:440: LAND
                {
                mLAND(); 


                }
                break;
            case 65 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:445: IF
                {
                mIF(); 


                }
                break;
            case 66 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:448: ELSE
                {
                mELSE(); 


                }
                break;
            case 67 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:453: SEMI
                {
                mSEMI(); 


                }
                break;
            case 68 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:458: WS
                {
                mWS(); 


                }
                break;
            case 69 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:461: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 70 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:472: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 71 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:483: IDENT
                {
                mIDENT(); 


                }
                break;
            case 72 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:489: NUM_INT
                {
                mNUM_INT(); 


                }
                break;
            case 73 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:497: NUM_DOUBLE
                {
                mNUM_DOUBLE(); 


                }
                break;
            case 74 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:508: CHAR_LITERAL
                {
                mCHAR_LITERAL(); 


                }
                break;
            case 75 :
                // C:\\Users\\Arnony\\workspace\\IAVA\\src\\parser\\Iava.g:1:521: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\13\46\11\uffff\1\75\1\100\1\102\1\uffff\1\106\1\111\1\114"+
        "\1\116\1\120\1\123\1\126\1\130\1\133\1\136\1\46\3\uffff\2\141\2"+
        "\uffff\6\46\1\151\3\46\1\155\7\46\24\uffff\1\170\2\uffff\1\172\12"+
        "\uffff\1\46\1\141\1\uffff\1\141\6\46\1\uffff\1\46\1\u0083\1\46\1"+
        "\uffff\10\46\1\uffff\1\u008f\3\uffff\3\46\1\u0093\1\u0094\3\46\1"+
        "\uffff\1\46\1\u0099\1\u009a\4\46\1\u009f\1\u00a0\1\46\2\uffff\1"+
        "\u00a2\1\46\1\u00a4\2\uffff\2\46\1\u00a7\1\46\2\uffff\4\46\2\uffff"+
        "\1\u00ad\1\uffff\1\46\1\uffff\2\46\1\uffff\1\46\1\u00b2\1\u00b3"+
        "\1\u00b4\1\u00b5\1\uffff\1\u00b6\1\46\1\u00b8\1\u00b9\5\uffff\1"+
        "\u00ba\3\uffff";
    static final String DFA20_eofS =
        "\u00bb\uffff";
    static final String DFA20_minS =
        "\1\11\1\157\1\141\1\145\1\141\1\146\1\165\1\145\1\164\1\162\1\157"+
        "\1\150\11\uffff\1\60\2\75\1\uffff\1\52\1\53\1\55\3\75\1\74\2\75"+
        "\1\46\1\154\3\uffff\2\56\2\uffff\1\157\1\145\1\163\1\141\1\156\1"+
        "\146\1\44\1\154\1\162\1\164\1\44\1\154\1\141\1\162\1\151\1\165\2"+
        "\151\24\uffff\1\75\2\uffff\1\75\12\uffff\1\163\1\56\1\uffff\1\56"+
        "\1\154\1\141\1\145\1\162\1\164\1\141\1\uffff\1\163\1\44\1\145\1"+
        "\uffff\2\154\1\165\1\151\1\164\1\145\1\144\1\154\1\uffff\1\75\3"+
        "\uffff\2\145\1\153\2\44\1\151\1\165\1\145\1\uffff\1\147\2\44\1\162"+
        "\1\156\2\143\2\44\1\145\2\uffff\1\44\1\141\1\44\2\uffff\1\156\1"+
        "\154\1\44\1\145\2\uffff\1\156\1\147\1\164\1\150\2\uffff\1\44\1\uffff"+
        "\1\156\1\uffff\1\165\1\164\1\uffff\1\162\4\44\1\uffff\1\44\1\145"+
        "\2\44\5\uffff\1\44\3\uffff";
    static final String DFA20_maxS =
        "\1\176\1\162\3\157\1\156\1\165\1\145\1\167\1\162\1\157\1\150\11"+
        "\uffff\1\71\2\75\1\uffff\5\75\1\76\2\75\1\174\1\75\1\154\3\uffff"+
        "\2\71\2\uffff\1\157\1\145\1\163\1\141\1\156\1\146\1\172\1\154\1"+
        "\162\1\164\1\172\1\154\1\164\1\162\1\151\1\165\2\151\24\uffff\1"+
        "\76\2\uffff\1\75\12\uffff\1\163\1\71\1\uffff\1\71\1\154\1\141\1"+
        "\145\1\162\1\164\1\141\1\uffff\1\163\1\172\1\145\1\uffff\2\154\2"+
        "\165\1\164\1\145\1\144\1\154\1\uffff\1\75\3\uffff\2\145\1\153\2"+
        "\172\1\151\1\165\1\145\1\uffff\1\147\2\172\1\162\1\156\2\143\2\172"+
        "\1\145\2\uffff\1\172\1\141\1\172\2\uffff\1\156\1\154\1\172\1\145"+
        "\2\uffff\1\156\1\147\1\164\1\150\2\uffff\1\172\1\uffff\1\156\1\uffff"+
        "\1\165\1\164\1\uffff\1\162\4\172\1\uffff\1\172\1\145\2\172\5\uffff"+
        "\1\172\3\uffff";
    static final String DFA20_acceptS =
        "\14\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\3\uffff\1"+
        "\41\13\uffff\1\103\1\104\1\107\2\uffff\1\112\1\113\22\uffff\1\35"+
        "\1\111\1\37\1\36\1\42\1\40\1\44\1\105\1\106\1\43\1\46\1\47\1\45"+
        "\1\51\1\52\1\50\1\54\1\53\1\56\1\55\1\uffff\1\63\1\64\1\uffff\1"+
        "\67\1\70\1\72\1\71\1\74\1\75\1\73\1\77\1\100\1\76\2\uffff\1\110"+
        "\7\uffff\1\7\3\uffff\1\101\10\uffff\1\60\1\uffff\1\57\1\66\1\65"+
        "\10\uffff\1\11\12\uffff\1\62\1\61\3\uffff\1\3\1\4\4\uffff\1\13\1"+
        "\14\4\uffff\1\21\1\22\1\uffff\1\102\1\uffff\1\2\2\uffff\1\10\5\uffff"+
        "\1\23\4\uffff\1\15\1\16\1\17\1\20\1\1\1\uffff\1\6\1\12\1\5";
    static final String DFA20_specialS =
        "\u00bb\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\45\1\uffff\2\45\22\uffff\1\45\1\27\1\52\1\uffff\1\46\1\35"+
            "\1\42\1\51\1\15\1\16\1\34\1\32\1\24\1\33\1\25\1\31\1\50\11\47"+
            "\1\23\1\44\1\37\1\26\1\36\1\14\1\uffff\32\46\1\17\1\uffff\1"+
            "\20\1\40\2\uffff\1\46\1\1\1\2\1\3\1\43\1\4\2\46\1\5\4\46\1\6"+
            "\3\46\1\7\1\10\1\11\1\46\1\12\1\13\3\46\1\21\1\41\1\22\1\30",
            "\1\53\2\uffff\1\54",
            "\1\55\6\uffff\1\56\6\uffff\1\57",
            "\1\60\11\uffff\1\61",
            "\1\62\15\uffff\1\63",
            "\1\65\7\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\70\2\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\76",
            "\1\77",
            "\1\101",
            "",
            "\1\105\4\uffff\1\104\15\uffff\1\103",
            "\1\110\21\uffff\1\107",
            "\1\113\17\uffff\1\112",
            "\1\115",
            "\1\117",
            "\1\122\1\121",
            "\1\124\1\125",
            "\1\127",
            "\1\131\76\uffff\1\132",
            "\1\135\26\uffff\1\134",
            "\1\137",
            "",
            "",
            "",
            "\1\76\1\uffff\12\140",
            "\1\76\1\uffff\10\142\2\76",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\156",
            "\1\157\22\uffff\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\166\1\167",
            "",
            "",
            "\1\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\173",
            "\1\76\1\uffff\12\140",
            "",
            "\1\76\1\uffff\10\142\2\76",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\13\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u00a1",
            "",
            "",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u00a3",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u00a8",
            "",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\u00b7",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "",
            "",
            "",
            "",
            "\1\46\13\uffff\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32"+
            "\46",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | LCURLY | RCURLY | COLON | COMMA | DOT | ASSIGN | EQUAL | LNOT | BNOT | NOT_EQUAL | DIV | DIV_ASSIGN | PLUS | PLUS_ASSIGN | INC | MINUS | MINUS_ASSIGN | DEC | STAR | STAR_ASSIGN | MOD | MOD_ASSIGN | SR | SR_ASSIGN | BSR | BSR_ASSIGN | GE | GT | SL | SL_ASSIGN | LE | LT | BXOR | BXOR_ASSIGN | BOR | BOR_ASSIGN | LOR | BAND | BAND_ASSIGN | LAND | IF | ELSE | SEMI | WS | SL_COMMENT | ML_COMMENT | IDENT | NUM_INT | NUM_DOUBLE | CHAR_LITERAL | STRING_LITERAL );";
        }
    }
 

}