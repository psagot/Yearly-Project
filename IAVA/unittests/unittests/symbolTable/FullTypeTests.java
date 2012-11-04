package unittests.symbolTable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utils.FullType;
import utils.FullType.Type;

/**
 * @author g2
 * 
 */
public class FullTypeTests {

	/**
	 * Stop printing to out and err.
	 */
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(new ByteArrayOutputStream()));
		System.setErr(new PrintStream(new ByteArrayOutputStream()));
	}

	/**
	 * Set printing to out and err to default
	 */
	@After
	public void cleanUpStreams() {
		System.setOut(System.out);
		System.setErr(System.err);
	}

	/**
	 * Test for struct c'tor
	 */
	@Test
	public void testFullTypeForStructg() {
		final FullType ft = new FullType(Type.STRUCT, "s1");
		assertNotNull(ft);
	}

	/**
	 * Test for array c'tor
	 */
	@Test
	public void testFullTypeForArray() {
		final FullType ft = new FullType(Type.ARRAY, new FullType(Type.STRING));
		assertNotNull(ft);
	}

	/**
	 * Test for regular c'tor
	 */
	@Test
	public void testFullTypeRegular() {
		final FullType ft = new FullType(Type.STRING);
		assertNotNull(ft);
	}

	/**
	 * Test for getType()
	 */
	@Test
	public void testGetType() {
		final FullType ft = new FullType(Type.STRING);
		assertNotNull(ft);
		assertEquals(Type.STRING, ft.getType());
	}

	/**
	 * Test for getStructName()
	 */
	@Test
	public void testGetStructName() {
		final FullType ft = new FullType(Type.STRUCT, "s1");
		assertNotNull(ft);
		assertEquals("s1", ft.getStructName());
	}

	/**
	 * Test for getArrayType()
	 */
	@Test
	public void testGetArrayType() {
		final FullType ft = new FullType(Type.ARRAY, new FullType(Type.INTEGER));
		assertNotNull(ft);
		assertEquals(Type.INTEGER, ft.getArrayType().getType());
	}

	/**
	 * Test for toString()
	 */
	@Test
	public void testToString() {
		final FullType ft = new FullType(Type.ARRAY, new FullType(Type.INTEGER));
		assertNotNull(ft);
		ft.toString();
	}

	/**
	 * Test for equals()
	 */
	@Test
	public void testEqualsObject() {
		final FullType ft = null;
		final FullType ft1 = new FullType(Type.ARRAY,
				new FullType(Type.INTEGER));
		final FullType ft2 = new FullType(Type.ARRAY,
				new FullType(Type.INTEGER));
		final FullType ft3 = new FullType(Type.INTEGER);
		final FullType ft4 = new FullType(Type.ARRAY, ft);
		final FullType ft5 = new FullType(Type.ARRAY,
				new FullType(Type.BOOLEAN));
		final FullType ft6 = new FullType(Type.ARRAY, ft);

		assertEquals(ft1, ft2);
		assertFalse(ft1.equals(null));
		assertFalse(ft1.equals(new Object()));
		assertTrue(ft1.equals(ft1));
		assertFalse(ft1.equals(ft3));
		assertFalse(ft1.equals(ft4));
		assertFalse(ft4.equals(ft1));
		assertFalse(ft1.equals(ft5));
		assertTrue(ft4.equals(ft6));

		final String sn = null;
		final FullType st1 = new FullType(Type.STRUCT, "s1");
		final FullType st2 = new FullType(Type.STRUCT, sn);
		final FullType st3 = new FullType(Type.STRUCT, sn);
		final FullType st4 = new FullType(Type.STRUCT, "s4");

		assertFalse(st1.equals(st2));
		assertFalse(st2.equals(st1));
		assertTrue(st2.equals(st3));
		assertFalse(st1.equals(st4));
	}

	/**
	 * Test for equals2()
	 */
	@Test
	public void testEqualsObject2() {
		final FullType ft1 = new FullType(Type.ARRAY,
				new FullType(Type.INTEGER));
		final FullType ft2 = new FullType(Type.ARRAY, ft1);

		final FullType ft3 = new FullType(Type.ARRAY,
				new FullType(Type.INTEGER));
		final FullType ft4 = new FullType(Type.ARRAY, ft3);

		assertEquals(ft2, ft4);
	}

	/**
	 * Test for the type array ctor
	 */
	@Test
	public void testArrayCtor() {
		final FullType ft1 = new FullType(Type.ARRAY,
				new FullType(Type.INTEGER), 3);
		final FullType ft2 = new FullType(Type.ARRAY,
				new FullType(Type.INTEGER), 2);
		assertFalse(ft1.equals(ft2));
	}

	/**
	 * Test for the type variable ctor
	 */
	@Test
	public void testVarCtor() {
		final FullType ft1 = new FullType(Type.INTEGER, true);
		final FullType ft2 = new FullType(Type.INTEGER, false);
		assertTrue(ft1.isVar());
		assertFalse(ft2.isVar());
		ft2.setVar(true);
		assertTrue(ft2.isVar());
	}

	/**
	 * Test for inner type
	 */
	@Test
	public void testInnerType() {
		final FullType ft1 = new FullType(Type.ARRAY,
				new FullType(Type.INTEGER), 3);
		assertEquals(Type.INTEGER, ft1.getInnerType());
		ft1.updateInnerType(Type.REAL, null);
		assertEquals(Type.REAL, ft1.getInnerType());
	}

}
