package errorReporter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import utils.ErrorReporter;

/**
 * @author g2
 * 
 */
public class ErrorReporterTest {

	/**
	 * Test for enableErrorMessageCollection()
	 */
	@Test
	public void testEnableErrorMessageCollection() {
		final ErrorReporter er = new ErrorReporter();
		assertNotNull(er);
		er.enableErrorMessageCollection(true);
		er.newError("a", "m", 0, 0);
		er.newError("a", "m", 1, 1);
		final List<String> el = er.getMessages();
		assertEquals(2, el.size());
		assertEquals("a line 0:0 m", el.get(0));
		assertEquals("a line 1:1 m", el.get(1));
	}

	/**
	 * Test for emitErrorMessage()
	 */
	@Test
	public void testEmitErrorMessage() {
		final ErrorReporter er = new ErrorReporter();
		assertNotNull(er);
		er.enableErrorMessageCollection(true);
		er.emitErrorMessage("m");
		final List<String> el = er.getMessages();
		assertEquals(1, el.size());
		assertEquals("m", el.get(0));

		// Now the emitErrorMessage should throw runTimeException
		er.enableErrorMessageCollection(false);
		try {
			er.emitErrorMessage("m");
		} catch (final RuntimeException e) {
			assertEquals("m", e.getMessage());
		}
	}

	/**
	 * Test for displayRecognitionError()
	 */
	@Test
	public void testDisplayRecognitionError() {
		final ErrorReporter er = new ErrorReporter();
		assertNotNull(er);
		er.enableErrorMessageCollection(true);
		er.displayRecognitionError("h", "m");
		final List<String> el = er.getMessages();
		assertEquals(1, el.size());
		assertEquals("h m", el.get(0));

		// Now the enableErrorMessageCollection should throw runTimeException
		er.enableErrorMessageCollection(false);
		try {
			er.displayRecognitionError("h", "m");
		} catch (final RuntimeException e) {
			assertEquals("h m", e.getMessage());
		}
	}

	/**
	 * Test for getMessages()
	 */
	@Test
	public void testGetMessages() {
		final ErrorReporter er = new ErrorReporter();
		assertNotNull(er);
		List<String> el = er.getMessages();
		assertEquals(0, el.size());
		er.enableErrorMessageCollection(true);
		er.emitErrorMessage("m");
		el = er.getMessages();
		assertEquals(1, el.size());
		assertEquals("m", el.get(0));
	}

	/**
	 * Test for hasErrors()
	 */
	@Test
	public void testHasErrors() {
		final ErrorReporter er = new ErrorReporter();
		assertNotNull(er);
		assertFalse(er.hasErrors());
		er.enableErrorMessageCollection(true);
		er.emitErrorMessage("m");
		assertTrue(er.hasErrors());
	}

	/**
	 * Test for newError()
	 */
	@Test
	public void testNewError() {
		final ErrorReporter er = new ErrorReporter();
		assertNotNull(er);
		er.enableErrorMessageCollection(true);
		er.newError("a", "m", 0, 0);
		er.newError("a", "m", 1, 1);
		List<String> el = er.getMessages();
		assertEquals(2, el.size());
		er.newError("a", "ERROR", 0, 0);
		el = er.getMessages();
		// If the word ERROR is part of the error msg then error isn't reported.
		// This is to avoid derived error.
		assertEquals(2, el.size());
	}

}
