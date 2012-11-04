package iava.plugin.editor;

import java.util.ArrayList;

/**
 * This is a constant class used for define all of IAVA keywords.
 *
 */
final public class IavaKeywords {

	private IavaKeywords(){}

	private final static Keyword[] fgKeywords= {
		new Keyword("break"), //$NON-NLS-1$
		new Keyword("case"), new Keyword("continue"), //$NON-NLS-1$
		new Keyword("default"),new Keyword("do"), //$NON-NLS-1$
		new Keyword("else"),  //$NON-NLS-1$
		new Keyword("for"), //$NON-NLS-1$ 
		new Keyword("if"), new Keyword("switch"), //$NON-NLS-1$
		new Keyword("while"), new Keyword("return"), new Keyword("struct"),//$NON-NLS-1$
		new Keyword("false"),new Keyword( "null"),//$NON-NLS-1$
		new Keyword("true"), //$NON-NLS-1$
		new Keyword("void"), new Keyword("boolean"),new Keyword( "char"),//$NON-NLS-1$
		new Keyword("integer"),new Keyword("real"), //$NON-NLS-1$
		new Keyword("string")//$NON-NLS-1$
	};

	private final static String[] stdLib = {
		"write", "writeln", "strCmp", "strConcat", "strLen","strToArr",  //$NON-NLS-1$
		"charToStr","readInt","readReal","readString","arrayLength","random","abs",  //$NON-NLS-1$
		"sqrt","power","cos","sin","isNaN","pi","intToReal","intToString","realToInt",  //$NON-NLS-1$
		"realToString","stringToReal","stringToInt" };  //$NON-NLS-1$

	private final static Keyword[] stdLibSignature = { 
		new Keyword("strCmp(,)","integer strCmp(string s1, string s2)"),
		new Keyword("strConcat(,)","string strConcat(string s1, string s2)"),
		new Keyword("strLen()","integer strLen( string s)"),
		new Keyword("strToArr()","char[] strToArr( string s)"),
		new Keyword("charToStr()","string charToStr( char c)"),
		new Keyword("writeln()","void writeln()\n" +
				"void writeln( integer i)\n" +
				"void writeln( char c)\n" +
				"void writeln( boolean b)\n" +
				"void writeln( real d)\n" +
		"void writeln( string s)"),
		new Keyword("write()",	"void write( integer i)\n" +
				"void write( char c)\n" +
				"void write( boolean b)\n" +
				"void write( real d)\n" +
		"void writeln( string s)"),
		new Keyword("readInt()","integer readInt()"),
		new Keyword("readReal()","real readReal()"),
		new Keyword("readString()","string readString()"),
		new Keyword("arrayLength()","integer arrayLength( ARRAY) \n" +
		"where ARRAY is array of some type"), 
		new Keyword("random()","integer random( integer upperBound)"),
		new Keyword("abs()","real abs( real r)"),
		new Keyword("sqrt()","real sqrt( real r)"),
		new Keyword("power(,)","real power( real a,  real b)"),
		new Keyword("cos()","real cos( real r)"),
		new Keyword("sin()","real sin( real r)"),
		new Keyword("isNaN()","boolean isNaN( real r)"),
		new Keyword("pi()","real pi()"),
		new Keyword("intToReal()","real intToReal( integer i)"),
		new Keyword("intToString()","string intToString( integer i)"),
		new Keyword("realToInt()","integer realToInt( real d)"),
		new Keyword("realToString()","string realToString( real d)"),
		new Keyword("stringToReal()","real stringToReal( string s)"),
		new Keyword("stringToInt()","integer stringToInt( string s)")
	};


	/**
	 * @return Iava's keywords
	 */
	public static Keyword[] getKeywords() {
		return fgKeywords;
	}

	/**
	 * @return Stdlib's function names
	 */
	public static String[] getStdlib() {
		return stdLib;
	}

	/**
	 * 
	 * @return the keywords of the stdlib functions' signature with description
	 * of their return values and parameters
	 */
	public static Keyword[] getStdlibSignature() {
		return stdLibSignature;
	}

	/**
	 * @return all the keywords and functions necessary for 
	 * the code completion
	 */
	public static Keyword[] getCompletionKeywords(){
		ArrayList<Keyword> list = new ArrayList<Keyword>();
		for(Keyword k : getKeywords())
			list.add(k);
		for(Keyword k : getStdlibSignature())
			list.add(k);
		return list.toArray(new Keyword[list.size()]);
	}

}