package unittests.parser;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import java.io.File;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import parser.InputHandler;


{2}

/**
 * @author Arnony
 * Tests the correctness of the auto-generated lexer and parser files.
 */
@SuppressWarnings("all")
public class ParserTests {{

	final String testsPath = "{0}";
	
	/**
	 * Stop printing to out and err.
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
	 * The main test function - receives a test file name and executes the parser on it.
	 * @param fileName
	 * @return
	 */
	private boolean testFile(final File f) throws IOException {{

		try {{

			// If this is a directory, walk each file/dir in that directory
			if (f.isDirectory()) {{
				final String files[] = f.list();
				for (final String file : files)
					return testFile(new File(f, file));
			}}

			InputHandler.sendFileToParser(f.getAbsolutePath(), false);
			return true;
			//return InputHandler.doFile(new File(fileName));
		}} catch (final IOException e) {{
			throw e;
		}} catch (final Exception e) {{
			e.printStackTrace();
			return false;
		}}
	}}

	
	
	{1}

}}
