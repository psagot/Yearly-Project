package unittests.parser;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import org.antlr.runtime.RecognitionException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import parser.IavaParser.compilationUnit_return;
import parser.InputHandler;


{2}


/**
 * @author Arnony Tests the correctness of the auto-generated lexer and parser
 *         files.
 */
@SuppressWarnings("all")
public class TreeParserTests {{

	final String testsPath = "{0}";

	/**
	 * Stop printing to out and err. We suppress semantic errors while testing
	 * the tree parsing.
	 */
	@Before
	public void setUpStreams() {{
		System.setOut(new PrintStream(new ByteArrayOutputStream()));
		System.setErr(new PrintStream(new ByteArrayOutputStream()));
	}}

	/**
	 * Set printing to out and err to default
	 */
	@After
	public void cleanUpStreams() {{
		System.setOut(System.out);
		System.setErr(System.err);
	}}

	/**
	 * The main test function - receives a test file name and executes the
	 * parser on it.
	 * 
	 * @param fileName
	 * @return false iff there was a parser or semantic error
	 */
	private boolean testFile(final File f) throws IOException  {{

		try {{

			// If this is a directory, walk each file/dir in that directory
			if (f.isDirectory()) {{
				final String files[] = f.list();
				for (final String file : files)
					return testFile(new File(f, file));
			}}

			final compilationUnit_return cu_return = InputHandler
			.sendFileToParser(f.getAbsolutePath(), false);
			
			InputHandler.resetTables();
			if (!InputHandler.walkTheFuncTree(cu_return))
				return false;

			// /Walks the generated tree to find tree parsing errors:
			if (!InputHandler.walkTheSemanticTree(cu_return))
				return false;
			
			return true;

			// return InputHandler.doFile(new File(fileName));
		}} catch (final RecognitionException e) {{
			e.printStackTrace();
			return false;
		}} catch (final RuntimeException e) {{
			e.printStackTrace();
			return false;
		}} catch (final Exception e) {{
			e.printStackTrace();
			return false;
		}}
	}}

	
	
	{1}
	
}}
