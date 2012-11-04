package parser;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import parser.IavaParser.compilationUnit_return;
import utils.ErrorMessage;
import utils.ErrorReporter;
import utils.FuncSymbolTable;
import utils.IErrorHandler;
import utils.PrintErrorHandler;
import utils.SymbolTable;

/**
 * Parse a iava file or directory of java files using the generated parser ANTLR
 * builds from java.g
 */
public class InputHandler {

	static IavaLexer lexer;

	static IErrorHandler errHan = new PrintErrorHandler();

	static ErrorReporter er;

	private static FuncSymbolTable fst = new FuncSymbolTable();

	private static SymbolTable st = new SymbolTable();

	/**
	 * @param handler
	 *            is the IErrorHandler object to treat the errors.
	 */
	static public void setErrorHandler(final IErrorHandler handler) {
		errHan = handler;
	}

	/**
	 * The main function, receives a iava file and parses it.
	 * @param args
	 *            args[0] is the file name
	 */
	public static void main(final String[] args) {

		//Step 0 - Verify arguments correctness:
		if (!verifyArguments(args))
			return;

		try {
			resetTables();

			//Step 1 - Compile the file and look for syntax \ semantic errors.
			final compilationUnit_return cu_return = compileFile(new File(args[0]).getAbsolutePath());
			if (cu_return == null) {
				System.err.println("Compilation process failed. Please view the compilation errors.");
				return;
			}

			//Step 2 - Calling the translator in order to output the result java file:
			final String finalJavaCode = translateTree(cu_return);
			writeResultToJavaFile(args, finalJavaCode);
		} catch (final Exception e) {
			e.printStackTrace(System.err);
		}
	}

	/**
	 * Writes the translated file to a java file
	 * @param args
	 * @param finalJavaCode - the java code to be written
	 */
	private static void writeResultToJavaFile(final String[] args,
			final String finalJavaCode) {
		FileOutputStream ofstream = null;
		try {
			final String out = (args.length == 2) ? args[1]
			                                             : "__javawrap__.java";
			ofstream = new FileOutputStream(out, false);
		} catch (final Exception e) {
			e.printStackTrace();
		}
		final DataOutputStream out = new DataOutputStream(ofstream);
		final PrintWriter pw = new PrintWriter(out);
		pw.append(finalJavaCode);
		pw.close();
	}

	/**
	 * Verifies the correctness of the iava file given as input.
	 * 
	 * @param args
	 *            args[0] should contain a *.iava file
	 * @return true iff the parameters are correct.
	 */
	private static boolean verifyArguments(final String[] args) {

		if (args.length == 0) {
			System.err
			.println("Illegal argument. Please write the file name to compile.");
			return false;
		}

		final String f = args[0];
		if (((f.length() <= 5) || !f.endsWith(".iava"))) {
			System.err
			.println("Illegal file name: File name must be of format *.iava");
			return false;
		}

		return true;
	}

	/**
	 * Compiles the iava file (syntax and semantics) and returns the AST.
	 * @param f
	 *            is the file name + absolute path.
	 * @throws Exception
	 *             if the file is problematic
	 * @return true iff no parsing errors were discovered.
	 */
	public static compilationUnit_return compileFile(final String f)
	throws Exception {
		try {
			//Create a scanner that reads from the input stream passed to us
			if (lexer == null)
				lexer = new IavaLexer();

			//Parses the file according to grammar to find syntax errors:
			final compilationUnit_return cu_return = sendFileToParser(f, true);
			if (cu_return == null) {
				System.err.println("Syntax errors found. Terminating...");
				return null; // /Found syntax errors. Terminating.
			}

			er = new ErrorReporter();
			//Walks the generated tree to add all function declaration to FuncSymbolTable:
			if (walkTheFuncTree(cu_return) == false)
				System.err.println("Problem adding func declarations into Symbol Table. Continuing...");

			//Walks the generated tree to find semantic errors:
			if (walkTheSemanticTree(cu_return) == false) {
				System.err.println("Semantic errors found. Terminating...");
				return null; // /Found syntax errors. Terminating.
			}

			return cu_return;
		}

		catch (final RuntimeException e) {
			System.err.println("An execption thrown during parsing. Please verify " +
					"that your program matches the IAVA syntax:\n" + e);
			return null;
		}
	}

	/**
	 * Parses the given file according to grammar in order to find syntactic
	 * errors.
	 * 
	 * @param f
	 *            is the given file
	 * @param enableErrorCollection
	 *            is true if we want to collect error messages and not throw
	 *            exceptions.
	 * @return the parser's result, or null in case syntax errors were found.
	 * @throws IOException
	 *             when the file is problematic
	 * @throws RecognitionException
	 *             when a syntax error was found
	 */
	public static compilationUnit_return sendFileToParser(final String f,
			final boolean enableErrorCollection) throws IOException,
			RecognitionException {

		er = new ErrorReporter();
		final CommonTokenStream tokens = createAndInitLexer(f,
				enableErrorCollection);

		//Create a parser that reads from the scanner
		IavaParser parser = null;
		parser = new IavaParser(tokens);
		parser.setErrorReporter(er);
		parser.enableErrorMessageCollection(enableErrorCollection);

		//Start parsing at the compilationUnit rule
		final compilationUnit_return cu_return = parser.compilationUnit();

		if (parser.hasErrors()) {
			notifySyntaxErrors(parser.getMessages());
			return null; //Found (and handled) syntax errors
		}

		return cu_return; // /No syntax errors found.
	}

	/**
	 * Create a scanner that reads from the input stream passed to us
	 * @param f is the file name
	 * @param enableErrorCollection marks whether errors are accumulated
	 * @return the token stream used by the parser
	 * @throws IOException
	 */
	private static CommonTokenStream createAndInitLexer(final String f,
			final boolean enableErrorCollection) throws IOException {
		if (lexer == null)
			lexer = new IavaLexer();

		lexer.setErrorReporter(er);
		lexer.enableErrorMessageCollection(enableErrorCollection);
		lexer.setCharStream(new ANTLRFileStream(f));
		final CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		tokens.LT(1); // force load
		return tokens;
	}

	/**
	 * used to reset the st and the fst between runs of the InputHandler (like
	 * in tests)
	 */
	public static void resetTables() {
		st = new SymbolTable();
		fst = new FuncSymbolTable();
	}

	/**
	 * Walks a generated tree and find all functions \ structs declarations:
	 * 
	 * @param cu_return
	 *            contains the AST
	 * @return true iff no errors were found
	 * @throws RecognitionException
	 *             when an error was found
	 */
	public static boolean walkTheFuncTree(final compilationUnit_return cu_return)
	throws RecognitionException {
		final CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(
				cu_return.getTree());
		final FuncTreeWalker walker = new FuncTreeWalker(nodeStream);
		walker.setTables(st, fst);
		walker.setErrorReporter(er);
		walker.compilationUnit();

		if (walker.hasErrors()) {
			notifySyntaxErrors(walker.getMessages());
			return false; // /Found (and handled) syntax errors
		}
		return true;
	}

	/**
	 * Walks a generated tree and looks for semantic errors:
	 * 
	 * @param cu_return
	 *            contains the AST
	 * @return true iff no semantic errors were found
	 * @throws RecognitionException
	 *             when a tree parsing error was found
	 */
	public static boolean walkTheSemanticTree(
			final compilationUnit_return cu_return) throws RecognitionException {
		final CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(
				cu_return.getTree());
		final IavaTreeWalker walker = new IavaTreeWalker(nodeStream);
		walker.setTables(st, fst);
		walker.setErrorReporter(er);
		walker.compilationUnit();

		if (walker.hasErrors()) {
			notifySyntaxErrors(walker.getMessages());
			return false; // /Found (and handled) syntax errors
		}
		return true;
	}

	/**
	 * Walks a generated tree and translates it to legal java code:
	 * 
	 * @param cu_return
	 *            contains the AST
	 * @return a string containing the java code
	 * @throws RecognitionException
	 *             - from the g file
	 */
	public static String translateTree(final compilationUnit_return cu_return)
	throws RecognitionException {
		final CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(
				cu_return.getTree());
		final TranslatorTreeWalker translator = new TranslatorTreeWalker(
				nodeStream);

		return translator.compilationUnit();
	}

	/**
	 * Uses the error handler to notify the user of the syntax errors (if
	 * exist).
	 */
	private static void notifySyntaxErrors(final List<String> errorString) {

		final List<ErrorMessage> messages = new LinkedList<ErrorMessage>();
		for (final String msg : errorString) {
			final ErrorMessage currentMessage = extractErrorDetails(msg);
			messages.add(currentMessage);
		}

		errHan.informUserOfErrors(messages);
	}

	/**
	 * Given an error message represented as string, extracts the relevant
	 * details.
	 * 
	 * @param msg
	 *            is the error message as string.
	 * @return an ErrorMessage type containing all relevant details.
	 */
	private static ErrorMessage extractErrorDetails(final String msg) {

		final String[] splitMsg = msg.split("line");
		final String fileName = splitMsg[0];
		final int line = Integer.parseInt(splitMsg[1].split("[:\\s]")[1]);
		final int column = Integer.parseInt(splitMsg[1].split("[:\\s]")[2]);
		final String message = splitMsg[1].split(line + ":" + column)[1];

		return new ErrorMessage(fileName, message, line, column);
	}
}
