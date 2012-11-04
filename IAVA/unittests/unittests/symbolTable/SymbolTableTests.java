package unittests.symbolTable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utils.FullType;
import utils.FullType.Type;
import utils.SymbolTable;

/**
 * @author g2 Tests for the utils.SymbolTable class
 * 
 */
public class SymbolTableTests {

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
	 * Test for addGlobalVar()
	 */
	@Test
	public void testAddGlobalVar() {
		final SymbolTable st = new SymbolTable();
		assertEquals(new Integer(0),
				new Integer(st.addGlobalVar("g1", new FullType(Type.STRING))));
		assertEquals(new Integer(0),
				new Integer(st.addGlobalVar("g2", new FullType(Type.INTEGER))));
		assertEquals(Type.STRING, st.typeOfVar("g1").getType());
		assertEquals(Type.INTEGER, st.typeOfVar("g2").getType());
		assertEquals(new Integer(-1),
				new Integer(st.addGlobalVar("g1", new FullType(Type.STRING))));
	}

	/**
	 * Test for startFunc()
	 */
	@Test
	public void testStartFunc() {
		final SymbolTable st = new SymbolTable();
		st.startFunc();
	}

	/**
	 * Test for endFunc()
	 */
	@Test
	public void testEndFunc() {
		final SymbolTable st = new SymbolTable();
		assertEquals(new Integer(-1), new Integer(st.endFunc()));
		st.startFunc();
		assertEquals(new Integer(0), new Integer(st.endFunc()));
	}

	/**
	 * Test for startBlock()
	 */
	@Test
	public void testStartBlock() {
		final SymbolTable st = new SymbolTable();
		// Can't start block outside of function
		assertEquals(new Integer(-1), new Integer(st.startBlock()));

		st.startFunc();
		assertEquals(new Integer(0), new Integer(st.startBlock()));
	}

	/**
	 * Test for endBlock()
	 */
	@Test
	public void testEndBlock() {
		final SymbolTable st = new SymbolTable();
		assertEquals(new Integer(-1), new Integer(st.endBlock()));
		st.startFunc();
		assertEquals(new Integer(0), new Integer(st.startBlock()));
		assertEquals(new Integer(0), new Integer(st.endBlock()));
	}

	/**
	 * Test for addLocalVar()
	 */
	@Test
	public void testAddLocalVar() {
		final SymbolTable st = new SymbolTable();
		assertEquals(
				new Integer(-1),
				new Integer(st
						.addLocalVar("f1b0l1", new FullType(Type.INTEGER))));
		st.startFunc();
		assertEquals(
				new Integer(0),
				new Integer(st
						.addLocalVar("f1b0l1", new FullType(Type.INTEGER))));
		assertEquals(
				new Integer(0),
				new Integer(st
						.addLocalVar("f1b0l2", new FullType(Type.INTEGER))));
		// New block
		assertEquals(new Integer(0), new Integer(st.startBlock()));
		assertEquals(
				new Integer(0),
				new Integer(st
						.addLocalVar("f1b1l1", new FullType(Type.INTEGER))));
		assertEquals(
				new Integer(-1),
				new Integer(st.addLocalVar("f1b0l2", new FullType(Type.STRING))));
		// New func
		st.startFunc();
		assertEquals(
				new Integer(0),
				new Integer(st
						.addLocalVar("f2b0l1", new FullType(Type.INTEGER))));
		assertEquals(
				new Integer(0),
				new Integer(st.addLocalVar("f1b0l2", new FullType(Type.STRING))));
		// New block
		assertEquals(
				new Integer(0),
				new Integer(st
						.addLocalVar("f2b1l1", new FullType(Type.INTEGER))));
	}

	/**
	 * Test for typeOfVar()
	 */
	@Test
	public void testTypeOfVar() {
		final SymbolTable st = new SymbolTable();
		assertEquals(new Integer(0),
				new Integer(st.addGlobalVar("g1", new FullType(Type.INTEGER))));
		assertNull(st.typeOfVar("f1b0l1"));
		st.startFunc();
		assertEquals(
				new Integer(0),
				new Integer(st
						.addLocalVar("f1b0l1", new FullType(Type.INTEGER))));
		assertEquals(
				new Integer(0),
				new Integer(st
						.addLocalVar("f1b0l2", new FullType(Type.INTEGER))));
		assertEquals(Type.INTEGER, st.typeOfVar("f1b0l1").getType());
		// New block
		assertEquals(new Integer(0), new Integer(st.startBlock()));
		assertEquals(
				new Integer(0),
				new Integer(st.addLocalVar("f1b1l1", new FullType(Type.STRING))));
		assertEquals(Type.INTEGER, st.typeOfVar("f1b0l1").getType());
		assertEquals(Type.STRING, st.typeOfVar("f1b1l1").getType());
		// New func
		st.startFunc();
		assertEquals(new Integer(0),
				new Integer(st.addLocalVar("f2b0l1", new FullType(Type.REAL))));
		assertNull(st.typeOfVar("f1b0l1"));
		assertEquals(Type.REAL, st.typeOfVar("f2b0l1").getType());
		// New block
		assertEquals(
				new Integer(0),
				new Integer(st
						.addLocalVar("f2b1l1", new FullType(Type.INTEGER))));
		assertEquals(Type.INTEGER, st.typeOfVar("g1").getType());
	}

	/**
	 * Test for addStructType()
	 */
	@Test
	public void testAddStructType() {
		final SymbolTable st = new SymbolTable();
		final ArrayList<FullType> fieldsType = new ArrayList<FullType>();
		fieldsType.add(new FullType(Type.INTEGER));
		fieldsType.add(new FullType(Type.BOOLEAN));
		final ArrayList<String> fieldsName = new ArrayList<String>();
		fieldsName.add("f1");
		fieldsName.add("f2");
		assertEquals(new Integer(0),
				new Integer(st.addStructType("s1", fieldsType, fieldsName)));
		assertEquals(new Integer(0),
				new Integer(st.addStructType("s2", fieldsType, fieldsName)));
		assertEquals(new Integer(-1),
				new Integer(st.addStructType("s1", fieldsType, fieldsName)));
		fieldsType.remove(0);
		assertEquals(new Integer(-1),
				new Integer(st.addStructType("s2", fieldsType, fieldsName)));

		assertEquals(new Integer(-1),
				new Integer(st.addGlobalVar("g1", new FullType(Type.STRUCT))));
		assertEquals(new Integer(-1),
				new Integer(st.addGlobalVar("g1", new FullType(Type.ARRAY))));
		assertEquals(
				new Integer(0),
				new Integer(st.addGlobalVar("g1", new FullType(Type.STRUCT,
						"s2"))));
		assertEquals(
				new Integer(0),
				new Integer(st.addGlobalVar("g2", new FullType(Type.ARRAY,
						new FullType(Type.ARRAY, new FullType(Type.INTEGER))))));

	}

	/**
	 * Test for structs and arrays
	 */
	@Test
	public void testStructsArrays() {
		final SymbolTable st = new SymbolTable();
		final ArrayList<FullType> fieldsType = new ArrayList<FullType>();
		fieldsType.add(new FullType(Type.INTEGER));
		fieldsType.add(new FullType(Type.BOOLEAN));
		final ArrayList<String> fieldsName = new ArrayList<String>();
		fieldsName.add("f1");
		fieldsName.add("f2");
		assertEquals(new Integer(0),
				new Integer(st.addStructType("s1", fieldsType, fieldsName)));

		assertEquals(
				new Integer(0),
				new Integer(st.addGlobalVar("g1", new FullType(Type.STRUCT,
						"s1"))));
		st.startFunc();
		assertEquals(
				new Integer(0),
				new Integer(st.addLocalVar("f1b0l1", new FullType(Type.STRUCT,
						"s1"))));

		assertEquals(Type.STRUCT, st.typeOfVar("f1b0l1").getType());
		assertEquals("s1", st.typeOfVar("f1b0l1").getStructName());

		assertEquals(
				new Integer(0),
				new Integer(st.addLocalVar("f1b0l2", new FullType(Type.ARRAY,
						new FullType(Type.ARRAY, new FullType(Type.INTEGER))))));
		assertEquals(Type.ARRAY, st.typeOfVar("f1b0l2").getType());
		assertEquals(new FullType(Type.ARRAY, new FullType(Type.INTEGER)), st
				.typeOfVar("f1b0l2").getArrayType());
	}

	/**
	 * Test for typeOfStructField()
	 */
	@Test
	public void testTypeOfStructField() {
		// Initialization
		final SymbolTable st = new SymbolTable();
		final ArrayList<FullType> fieldsType = new ArrayList<FullType>();
		fieldsType.add(new FullType(Type.INTEGER));
		fieldsType.add(new FullType(Type.BOOLEAN));
		final ArrayList<String> fieldsName = new ArrayList<String>();
		fieldsName.add("f1");
		fieldsName.add("f2");
		assertEquals(new Integer(0),
				new Integer(st.addStructType("s1", fieldsType, fieldsName)));
		assertEquals(
				new Integer(0),
				new Integer(st.addGlobalVar("g1", new FullType(Type.STRUCT,
						"s1"))));

		// tests
		assertEquals(new FullType(Type.INTEGER),
				st.typeOfStructField(st.typeOfVar("g1"), "f1"));
		assertEquals(new FullType(Type.BOOLEAN),
				st.typeOfStructField(st.typeOfVar("g1"), "f2"));
		assertNull(st.typeOfStructField(st.typeOfVar("g1"), "f3"));
		assertNull(st.typeOfStructField(null, "f3"));
		assertNull(st.typeOfStructField(new FullType(Type.INTEGER), "f3"));
	}

	/**
	 * Test for typeOfArrayCells()
	 */
	@Test
	public void testTypeOfArrayCells() {
		// Initialization
		final SymbolTable st = new SymbolTable();
		st.addGlobalVar("g1", new FullType(Type.ARRAY, new FullType(
				Type.INTEGER)));
		st.addGlobalVar("g2", new FullType(Type.INTEGER));

		// tests
		assertEquals(new FullType(Type.INTEGER), st.typeOfArrayCells("g1"));
		assertNull(st.typeOfArrayCells("g2"));
		assertNull(st.typeOfArrayCells("g3"));
	}

	/**
	 * Test for getLastErrMsg()
	 */
	@Test
	public void testGetLastErrMsg() {
		final SymbolTable st = new SymbolTable();
		st.addGlobalVar("g1", new FullType(Type.ARRAY, new FullType(
				Type.INTEGER)));
		st.addGlobalVar("g1", new FullType(Type.ARRAY, new FullType(
				Type.INTEGER)));
		assertFalse(st.getLastErrMsg().equals("No error msg"));
	}

	/**
	 * General tests. Checks everything together
	 */
	@Test
	public void testsGeneral() {
		// Initialization
		final SymbolTable st = new SymbolTable();
		// Declare global vars
		assertEquals(new Integer(0),
				new Integer(st.addGlobalVar("g1", new FullType(Type.STRING))));
		assertEquals(new Integer(0),
				new Integer(st.addGlobalVar("g2", new FullType(Type.INTEGER))));
		assertEquals(st.typeOfVar("g1").getType(), Type.STRING);
		// Start function
		st.startFunc();
		// Declare local vars in basic block
		assertEquals(new Integer(0),
				new Integer(st.addLocalVar("l1", new FullType(Type.INTEGER))));
		assertEquals(st.typeOfVar("l1").getType(), Type.INTEGER);

		// Start another function. l1 doesn't exist
		st.startFunc();
		assertNull(st.typeOfVar("l1"));
		assertEquals(st.typeOfVar("g2").getType(), Type.INTEGER);

		// End last function. l1 exist
		assertEquals(new Integer(0), new Integer(st.endFunc()));
		assertEquals(st.typeOfVar("l1").getType(), Type.INTEGER);

		// Block 1
		assertEquals(new Integer(0), new Integer(st.startBlock()));
		assertEquals(new Integer(0),
				new Integer(st.addLocalVar("lb1", new FullType(Type.REAL))));
		assertEquals(st.typeOfVar("lb1").getType(), Type.REAL);
		assertEquals(st.typeOfVar("g2").getType(), Type.INTEGER);
		// Block 2
		assertEquals(new Integer(0), new Integer(st.startBlock()));
		assertEquals(new Integer(0),
				new Integer(st.addLocalVar("lb2", new FullType(Type.REAL))));
		assertEquals(st.typeOfVar("lb2").getType(), Type.REAL);
		assertEquals(st.typeOfVar("g2").getType(), Type.INTEGER);
		assertEquals(st.typeOfVar("lb1").getType(), Type.REAL);
		// Assert for error
		assertEquals(new Integer(-1),
				new Integer(st.addLocalVar("lb1", new FullType(Type.REAL))));
		// End block 2
		assertEquals(new Integer(0), new Integer(st.endBlock()));
		// Assert for error
		assertNull(st.typeOfVar("lb2"));

		assertEquals(new Integer(0),
				new Integer(st.addLocalVar("l2", new FullType(Type.INTEGER))));
		st.startFunc();
		assertEquals(new Integer(0),
				new Integer(st.addLocalVar("fl1", new FullType(Type.INTEGER))));
		assertEquals(new Integer(0),
				new Integer(st.addLocalVar("fl2", new FullType(Type.INTEGER))));
		assertEquals(
				new Integer(0),
				new Integer(st.addLocalVar("loooooooooooooong", new FullType(
						Type.INTEGER))));
	}

}
