package errorReporter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import utils.ErrorMessage;

/**
 * @author g2
 * 
 */
public class ErrorMassageTest {

	/**
	 * Test for c'tor
	 */
	@Test
	public void testErrorMessage() {
		final ErrorMessage em = new ErrorMessage("f", "m", 1, 1);
		assertNotNull(em);
	}

	/**
	 * Test for toString
	 */
	@Test
	public void testToString() {
		final ErrorMessage em = new ErrorMessage("f", "m", 1, 1);
		assertNotNull(em);
		assertEquals("Error in file: f line 1:1 - m", em.toString());
	}

	/**
	 * Test for getFileName()
	 */
	@Test
	public void testGetFileName() {
		final ErrorMessage em = new ErrorMessage("f", "m", 1, 1);
		assertNotNull(em);
		assertEquals("f", em.getFileName());
	}

	/**
	 * Test for getMsg()
	 */
	@Test
	public void testGetMsg() {
		final ErrorMessage em = new ErrorMessage("f", "m", 1, 1);
		assertNotNull(em);
		assertEquals("m", em.getMsg());
	}

	/**
	 * Test for getLine()
	 */
	@Test
	public void testGetLine() {
		final ErrorMessage em = new ErrorMessage("f", "m", 0, 1);
		assertNotNull(em);
		assertEquals(0, em.getLine());
	}

	/**
	 * Test for getColumn()
	 */
	@Test
	public void testGetColumn() {
		final ErrorMessage em = new ErrorMessage("f", "m", 0, 1);
		assertNotNull(em);
		assertEquals(1, em.getColumn());
	}

}
