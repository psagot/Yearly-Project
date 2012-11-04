package unittests.stdLib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import standardLib.StdLib;
import utils.FullType;
import utils.FullType.Type;
import utils.FuncSymbolTable;

/**
 * Unit tests for the standard library.
 */
public class StdLibTest {

	/**
	 * Tests StdLib's abs function.
	 */
	@Test
	public void testAbs() {
		assertEquals(7.0, StdLib._abs(7), 0.005);
		assertEquals(7.0, StdLib._abs(-7), 0.005);
		assertEquals(0.0, StdLib._abs(0), 0.005);
	}

	/**
	 * Tests StdLib's sqrt function.
	 */
	@Test
	public void testSqrt() {
		assertEquals(2.0, StdLib._sqrt(4), 0.005);
		assertEquals(1.414213, StdLib._sqrt(2), 0.005);
		assertEquals(0.0, StdLib._sqrt(0), 0.005);
		assertEquals(Double.NaN, StdLib._sqrt(-5), 0.005);
	}

	/**
	 * Tests StdLib's power function.
	 */
	@Test
	public void testPower() {
		assertEquals(0.25, StdLib._power(4, -1), 0.005);
		assertEquals(256, StdLib._power(2, 8), 0.005);
		assertEquals(-27.0, StdLib._power(-3, 3), 0.005);
		assertEquals(0.25, StdLib._power(-2, -2), 0.005);
		assertEquals(125.0 / 8.0, StdLib._power(5.0 / 2.0, 3), 0.005);
	}

	/**
	 * Tests StdLib's cos function.
	 */
	@Test
	public void testCos() {
		assertEquals(1.00, StdLib._cos(0), 0.005);
		assertEquals(0.00, StdLib._cos(Math.PI / 2), 0.005);
		assertEquals(-1.00, StdLib._cos(Math.PI), 0.005);
	}

	/**
	 * Tests StdLib's sin function.
	 */
	@Test
	public void testSin() {
		assertEquals(0, StdLib._sin(0), 0.005);
		assertEquals(1.00, StdLib._sin(Math.PI / 2), 0.005);
		assertEquals(0, StdLib._sin(Math.PI), 0.005);
	}

	/**
	 * Tests isNaN function.
	 */
	@Test
	public void testIsNaN() {
		assertTrue(StdLib._isNaN(Double.NaN));
		assertTrue(StdLib._isNaN(StdLib._power(-5, 0.5)));
		assertFalse(StdLib._isNaN(0.0));
		assertFalse(StdLib._isNaN(163543.45));
	}

	/**
	 * Tests PI function.
	 */
	@Test
	public void testPi() {
		assertEquals(Math.PI, StdLib._pi(), 0.005);
	}

	/**
	 * Tests StdLib's intToDouble function.
	 */
	@Test
	public void testIntToDouble() {
		final long x = 3;
		assertEquals(3.0, StdLib._intToReal(x), 0.0005);
		assertEquals(-2.0, StdLib._intToReal(-2), 0.0005);
	}

	/**
	 * Tests StdLib's intToString function.
	 */
	@Test
	public void testIntToString() {
		final long x = 3;
		final int y = 7;
		assertEquals("3", StdLib._intToString(x));
		assertEquals("7", StdLib._intToString(y));
		assertEquals("-43242", StdLib._intToString(-43242));
	}

	/**
	 * Tests StdLib's realToInt function.
	 */
	@Test
	public void testDoubleToInt() {
		final double x = 3;
		final int y = 7;
		final long z = -17;
		assertEquals(3, StdLib._realToInt(x));
		assertEquals(y, StdLib._realToInt(7.0));
		assertEquals(z, StdLib._realToInt(-17.8));
		assertEquals(1, StdLib._realToInt(1.255));
	}

	/**
	 * Tests StdLib's realToString function.
	 */
	@Test
	public void testDoubleToString() {
		final double x = 3.145;

		assertEquals("3.145", StdLib._realToString(x));
		assertEquals("7.0", StdLib._realToString(7.0));
		assertEquals("-17.8", StdLib._realToString(-17.8));

	}

	/**
	 * Tests StdLib's stringToReal function.
	 */
	@Test
	public void testStringToDouble() {
		final double x = 3.145;

		assertEquals(x, StdLib._stringToReal("3.145"), 0.0005);
		assertEquals(-1.555, StdLib._stringToReal("-1.555"), 0.0005);
	}

	/**
	 * Tests StdLib's stringToInt function.
	 */
	@Test
	public void testStringToInt() {
		final int x = 3;
		final long y = -1000;

		assertEquals(x, StdLib._stringToInt("3"));
		assertEquals(y, StdLib._stringToInt("-1000"));
	}

	/**
	 * Tests StdLib's print function.
	 */
	@Test
	public void teststrCmp() {
		assertTrue(StdLib._strCmp("ABC", "BCD") < 0);
		assertTrue(StdLib._strCmp("BCD", "ABC") > 0);
		assertTrue(StdLib._strCmp("ABC", "ABC") == 0);
	}

	/**
	 * Tests StdLib's concat function.
	 */
	@Test
	public void teststrConcat() {
		assertEquals("ABCBCD", StdLib._strConcat("ABC", "BCD"));
		assertEquals("a", StdLib._strConcat("", "a"));
		assertEquals("", StdLib._strConcat("", ""));
	}

	/**
	 * Tests StdLib's strLen function.
	 */
	@Test
	public void teststrLen() {
		assertEquals(6, StdLib._strLen("ABCBCD"));
		assertEquals(0, StdLib._strLen(""));
	}

	/**
	 * Tests StdLib's strToArr function.
	 */
	@Test
	public void teststrToArr() {
		final char[] src = { 'a', 'B', 'c', 'D' };
		final char[] target = StdLib._strToArr("aBcD");
		assertEquals(src.length, target.length);
		for (int i = 0; i < src.length; i++)
			assertEquals(src[i], target[i]);
	}

	/**
	 * Tests StdLib's genFuncSymbolTable function.
	 */
	@Test
	public void testGenFuncSymbolTable() {
		final FuncSymbolTable fst = new FuncSymbolTable();
		StdLib.genFuncSymbolTable(fst);

		final FullType tString = new FullType(Type.STRING);
		final FullType tInt = new FullType(Type.INTEGER);
		ArrayList<FullType> at = new ArrayList<FullType>();
		at.add(tString);
		at.add(tString);

		assertEquals(tInt, fst.getFuncReturnType("strCmp", at));

		at = new ArrayList<FullType>();
		at.add(tInt);
		assertEquals(new FullType(Type.VOID),
				fst.getFuncReturnType("write", at));

	}

	/**
	 * Tests StdLib's arrayLength function.
	 */
	@Test
	public void testArrayLength() {
		assertEquals(5, StdLib._arrayLength(new int[5]));
		assertEquals(2, StdLib._arrayLength(new char[2]));
	}

	/**
	 * Tests StdLib's random function.
	 */
	@Test
	public void testRandom() {
		for (int i = 0; i < 50; i++) {
			final int r = StdLib._random(100);
			assertTrue(r < 100);
			assertTrue(r >= 0);
		}
	}

	/**
	 * Tests StdLib's random function.
	 */
	@Test
	public void testArrayInit() {
		final B[][][] arr = new B[10][10][3];
		StdLib.initArray(arr);
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++)
				for (int k = 0; k < 3; k++)
					assertEquals(0, arr[i][j][k].x);

	}

	/**
	 * Tests StdLib's CharToStr function.
	 */
	@Test
	public void testCharToStr() {
		final char c = 'a';
		final String s = StdLib._charToStr(c);
		assertEquals("a", s);
	}

	/**
	 * A class used by the randomness tests.
	 */
	static public class B {
		B[] b = new B[5];
		/**
		 * an integer named x
		 */
		public int x;
		/**
		 * an integer named y
		 */
		public int y;
	}

}
