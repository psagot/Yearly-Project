package unittests.symbolTable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utils.FullType;
import utils.FullType.Type;
import utils.FuncSymbolTable;

/**
 * @author g2 Tests for the utils.FuncSymbolTable class
 * 
 */
public class FuncSymbolTableTests {

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
	 * Test for addFunc()
	 */
	@Test
	public void testAddFunc() {
		final FuncSymbolTable fst = new FuncSymbolTable();
		final ArrayList<FullType> at = new ArrayList<FullType>();
		at.add(new FullType(Type.INTEGER));
		at.add(new FullType(Type.BOOLEAN));
		assertEquals(new Integer(0),
				new Integer(fst.addFunc("f1", new FullType(Type.STRING), at)));
		assertEquals(new Integer(0),
				new Integer(fst.addFunc("f2", new FullType(Type.STRING), at)));
		assertEquals(new Integer(-1),
				new Integer(fst.addFunc("f1", new FullType(Type.STRING), at)));
	}

	/**
	 * Test for isFuncCallOK()
	 */
	@Test
	public void testIsFuncCallOK() {
		final FuncSymbolTable fst = new FuncSymbolTable();
		final ArrayList<FullType> at = new ArrayList<FullType>();
		at.add(new FullType(Type.INTEGER));
		at.add(new FullType(Type.BOOLEAN));
		assertEquals(new Integer(0),
				new Integer(fst.addFunc("f1", new FullType(Type.STRING), at)));
		assertEquals(new Integer(0),
				new Integer(fst.addFunc("f2", new FullType(Type.STRING), at)));
		assertTrue(fst.isFuncCallOK("f1", at));
		assertTrue(fst.isFuncCallOK("f2", at));
		assertFalse(fst.isFuncCallOK("f3", at));
		at.add(new FullType(Type.INTEGER));
		assertFalse(fst.isFuncCallOK("f2", at));
	}

	/**
	 * Test for getFuncReturnType()
	 */
	@Test
	public void testGetFuncReturnType() {
		final FuncSymbolTable fst = new FuncSymbolTable();
		final ArrayList<FullType> at = new ArrayList<FullType>();
		at.add(new FullType(Type.INTEGER));
		at.add(new FullType(Type.BOOLEAN));
		assertEquals(new Integer(0),
				new Integer(fst.addFunc("f1", new FullType(Type.STRING), at)));
		assertEquals(new Integer(0),
				new Integer(fst.addFunc("f2", new FullType(Type.INTEGER), at)));
		assertEquals(Type.STRING, fst.getFuncReturnType("f1", at).getType());
		assertEquals(Type.INTEGER, fst.getFuncReturnType("f2", at).getType());
		assertNull(fst.getFuncReturnType("f3", at));
		at.add(new FullType(Type.INTEGER));
		assertNull(fst.getFuncReturnType("f1", at));
	}

	/**
	 * Test for special function from stdLib arrayLength
	 */
	@Test
	public void testForArrayLengthFunc() {
		// Init
		final FuncSymbolTable fst = new FuncSymbolTable();
		final ArrayList<FullType> at = new ArrayList<FullType>();
		at.add(new FullType(Type.ARRAY));
		assertEquals(
				new Integer(0),
				new Integer(fst.addFunc("arrayLength", new FullType(Type.INTEGER),
						at)));
		// Test
		assertTrue(fst.isFuncCallOK("arrayLength", at));
		at.clear();
		at.add(new FullType(Type.ARRAY, new FullType(Type.BOOLEAN)));
		assertTrue(fst.isFuncCallOK("arrayLength", at));
		assertFalse(fst.isFuncCallOK("arrayLength", null));

	}

	/**
	 * Test for getLastErrMsg()
	 */
	@Test
	public void testGetLastErrMsg() {
		final FuncSymbolTable fst = new FuncSymbolTable();
		final ArrayList<FullType> at = new ArrayList<FullType>();
		at.add(new FullType(Type.ARRAY));

		fst.addFunc("arrayLength", new FullType(Type.INTEGER), at);
		fst.addFunc("arrayLength", new FullType(Type.INTEGER), at);
		assertFalse(fst.getLastErrMsg().equals("No error msg"));
	}

}
