package unittests.inputHandler;

import static org.junit.Assert.fail;

import org.junit.Test;

import parser.InputHandler;
import utils.PrintErrorHandler;

/**
 * @author g2
 * 
 */
public class InputHandlerTests {

	/**
	 * Test for set error handler
	 */
	@Test
	public void testSetErrorHandler() {
		final PrintErrorHandler peh = new PrintErrorHandler();
		InputHandler.setErrorHandler(peh);
	}

	/**
	 * test for compileFile function
	 */
	@Test
	public void testCompileFile() {
		try {
			InputHandler.compileFile("System Tests/arrayParameters.iava");
		} catch (final Exception e) {
			fail("Error in compileFile");
		}
	}

}
