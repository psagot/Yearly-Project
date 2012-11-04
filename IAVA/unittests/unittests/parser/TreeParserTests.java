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



// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// 
// This is file was auto generated, all changes will be erased.
// If you want to change this class, please edit th appropriate template.
// If you want to add tests, put the .iava files into the 
// appropriate directory.
// 
// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 


/**
 * @author Arnony Tests the correctness of the auto-generated lexer and parser
 *         files.
 */
@SuppressWarnings("all")
public class TreeParserTests {

	final String testsPath = "Language Tests/";

	/**
	 * Stop printing to out and err. We suppress semantic errors while testing
	 * the tree parsing.
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
	 * The main test function - receives a test file name and executes the
	 * parser on it.
	 * 
	 * @param fileName
	 * @return false iff there was a parser or semantic error
	 */
	private boolean testFile(final File f) throws IOException  {

		try {

			// If this is a directory, walk each file/dir in that directory
			if (f.isDirectory()) {
				final String files[] = f.list();
				for (final String file : files)
					return testFile(new File(f, file));
			}

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
		} catch (final RecognitionException e) {
			e.printStackTrace();
			return false;
		} catch (final RuntimeException e) {
			e.printStackTrace();
			return false;
		} catch (final Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	
	
    @Test
    public void test_ShouldPass_boolean() throws IOException {
	final File f = new File(testsPath + "Should Pass/boolean.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_bool_comp1() throws IOException {
	final File f = new File(testsPath + "Should Pass/bool_comp1.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_bool_comp2() throws IOException {
	final File f = new File(testsPath + "Should Pass/bool_comp2.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_brackets1() throws IOException {
	final File f = new File(testsPath + "Should Pass/brackets1.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_brackets2() throws IOException {
	final File f = new File(testsPath + "Should Pass/brackets2.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_brackets3() throws IOException {
	final File f = new File(testsPath + "Should Pass/brackets3.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_brackets4() throws IOException {
	final File f = new File(testsPath + "Should Pass/brackets4.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_brackets5() throws IOException {
	final File f = new File(testsPath + "Should Pass/brackets5.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_brackets6() throws IOException {
	final File f = new File(testsPath + "Should Pass/brackets6.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_brackets7() throws IOException {
	final File f = new File(testsPath + "Should Pass/brackets7.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_break1() throws IOException {
	final File f = new File(testsPath + "Should Pass/break1.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_break2() throws IOException {
	final File f = new File(testsPath + "Should Pass/break2.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_break3() throws IOException {
	final File f = new File(testsPath + "Should Pass/break3.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_breakContinue() throws IOException {
	final File f = new File(testsPath + "Should Pass/breakContinue.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_comparison1() throws IOException {
	final File f = new File(testsPath + "Should Pass/comparison1.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_comparison_integer2() throws IOException {
	final File f = new File(testsPath + "Should Pass/comparison_integer2.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_conditions() throws IOException {
	final File f = new File(testsPath + "Should Pass/conditions.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_dangling_if() throws IOException {
	final File f = new File(testsPath + "Should Pass/dangling_if.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_defaultInit() throws IOException {
	final File f = new File(testsPath + "Should Pass/defaultInit.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_double_seicolon() throws IOException {
	final File f = new File(testsPath + "Should Pass/double_seicolon.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_empty() throws IOException {
	final File f = new File(testsPath + "Should Pass/empty.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_expressions() throws IOException {
	final File f = new File(testsPath + "Should Pass/expressions.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_fastTest() throws IOException {
	final File f = new File(testsPath + "Should Pass/fastTest.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_fnction4() throws IOException {
	final File f = new File(testsPath + "Should Pass/fnction4.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_fnction5() throws IOException {
	final File f = new File(testsPath + "Should Pass/fnction5.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_forempty() throws IOException {
	final File f = new File(testsPath + "Should Pass/forempty.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_function1() throws IOException {
	final File f = new File(testsPath + "Should Pass/function1.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_function2() throws IOException {
	final File f = new File(testsPath + "Should Pass/function2.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_function3() throws IOException {
	final File f = new File(testsPath + "Should Pass/function3.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_function6() throws IOException {
	final File f = new File(testsPath + "Should Pass/function6.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_function7() throws IOException {
	final File f = new File(testsPath + "Should Pass/function7.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_function8() throws IOException {
	final File f = new File(testsPath + "Should Pass/function8.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_functions() throws IOException {
	final File f = new File(testsPath + "Should Pass/functions.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_functionsDeclaration() throws IOException {
	final File f = new File(testsPath + "Should Pass/functionsDeclaration.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_func_redef2() throws IOException {
	final File f = new File(testsPath + "Should Pass/func_redef2.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_fun_scope1() throws IOException {
	final File f = new File(testsPath + "Should Pass/fun_scope1.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_if1() throws IOException {
	final File f = new File(testsPath + "Should Pass/if1.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_if2() throws IOException {
	final File f = new File(testsPath + "Should Pass/if2.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_if3() throws IOException {
	final File f = new File(testsPath + "Should Pass/if3.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_inOutVars() throws IOException {
	final File f = new File(testsPath + "Should Pass/inOutVars.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_legalNull1() throws IOException {
	final File f = new File(testsPath + "Should Pass/legalNull1.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_legalNull2() throws IOException {
	final File f = new File(testsPath + "Should Pass/legalNull2.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_loops() throws IOException {
	final File f = new File(testsPath + "Should Pass/loops.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_nobody3() throws IOException {
	final File f = new File(testsPath + "Should Pass/nobody3.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_nobody5() throws IOException {
	final File f = new File(testsPath + "Should Pass/nobody5.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_nullType() throws IOException {
	final File f = new File(testsPath + "Should Pass/nullType.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_operatorplus() throws IOException {
	final File f = new File(testsPath + "Should Pass/operatorplus.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_parser_bug1() throws IOException {
	final File f = new File(testsPath + "Should Pass/parser_bug1.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_primitives() throws IOException {
	final File f = new File(testsPath + "Should Pass/primitives.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_reserved_word11() throws IOException {
	final File f = new File(testsPath + "Should Pass/reserved_word11.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_reserved_word12() throws IOException {
	final File f = new File(testsPath + "Should Pass/reserved_word12.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_reserved_word13() throws IOException {
	final File f = new File(testsPath + "Should Pass/reserved_word13.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_reserved_word14() throws IOException {
	final File f = new File(testsPath + "Should Pass/reserved_word14.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_reserved_word15() throws IOException {
	final File f = new File(testsPath + "Should Pass/reserved_word15.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_reserved_word17() throws IOException {
	final File f = new File(testsPath + "Should Pass/reserved_word17.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_return_in_main() throws IOException {
	final File f = new File(testsPath + "Should Pass/return_in_main.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_StdLib() throws IOException {
	final File f = new File(testsPath + "Should Pass/StdLib.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_struct0() throws IOException {
	final File f = new File(testsPath + "Should Pass/struct0.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_struct1() throws IOException {
	final File f = new File(testsPath + "Should Pass/struct1.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_struct10arr() throws IOException {
	final File f = new File(testsPath + "Should Pass/struct10arr.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_struct2arr() throws IOException {
	final File f = new File(testsPath + "Should Pass/struct2arr.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_struct3() throws IOException {
	final File f = new File(testsPath + "Should Pass/struct3.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_struct4() throws IOException {
	final File f = new File(testsPath + "Should Pass/struct4.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_struct5arr() throws IOException {
	final File f = new File(testsPath + "Should Pass/struct5arr.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_struct6arr() throws IOException {
	final File f = new File(testsPath + "Should Pass/struct6arr.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_struct7arr() throws IOException {
	final File f = new File(testsPath + "Should Pass/struct7arr.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_struct8() throws IOException {
	final File f = new File(testsPath + "Should Pass/struct8.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_struct9() throws IOException {
	final File f = new File(testsPath + "Should Pass/struct9.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_structs() throws IOException {
	final File f = new File(testsPath + "Should Pass/structs.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_structsDeclaration() throws IOException {
	final File f = new File(testsPath + "Should Pass/structsDeclaration.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_struct_arr_complex() throws IOException {
	final File f = new File(testsPath + "Should Pass/struct_arr_complex.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_switch_scope() throws IOException {
	final File f = new File(testsPath + "Should Pass/switch_scope.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_unreachable_test() throws IOException {
	final File f = new File(testsPath + "Should Pass/unreachable_test.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_varfunc_conflict() throws IOException {
	final File f = new File(testsPath + "Should Pass/varfunc_conflict.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_varinteger() throws IOException {
	final File f = new File(testsPath + "Should Pass/varinteger.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_varstring() throws IOException {
	final File f = new File(testsPath + "Should Pass/varstring.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_Arrays_arrays() throws IOException {
	final File f = new File(testsPath + "Should Pass/Arrays/arrays.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_Arrays_arrays1() throws IOException {
	final File f = new File(testsPath + "Should Pass/Arrays/arrays1.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_Arrays_arrays2() throws IOException {
	final File f = new File(testsPath + "Should Pass/Arrays/arrays2.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_Arrays_arrays3() throws IOException {
	final File f = new File(testsPath + "Should Pass/Arrays/arrays3.iava");
	assertTrue(testFile(f));
    }

    @Test
    public void test_ShouldPass_Arrays_arraysAndRegular() throws IOException {
	final File f = new File(testsPath + "Should Pass/Arrays/arraysAndRegular.iava");
	assertTrue(testFile(f));
    }

	
}
