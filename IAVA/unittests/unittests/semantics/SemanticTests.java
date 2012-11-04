package unittests.semantics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import java.io.File;

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
public class SemanticTests {

	final String testsPath = "Language Tests/";

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
	 * The main test function - receives a test file name and executes the
	 * parser on it.
	 * 
	 * @param fileName
	 * @return false iff there was a parser or semantic error
	 */
	private boolean testFile(final File f) throws IOException {

		try {

			// If this is a directory, walk each file/dir in that directory
			if (f.isDirectory()) {
				final String files[] = f.list();
				for (final String file : files)
					return testFile(new File(f, file));
			}

			final compilationUnit_return cu_return = InputHandler.sendFileToParser(f.getAbsolutePath(), false);

			InputHandler.resetTables();
			boolean res1 = InputHandler.walkTheFuncTree(cu_return);
			// Continue to the next step to find all the semantics errors:
			// Walks the generated tree to find semantic errors:
			boolean res2 = InputHandler.walkTheSemanticTree(cu_return);
			
			if (!res1 || !res2)
				return false;
			return true;

			// return InputHandler.doFile(new File(fileName));
		} catch (final RecognitionException e) {
			e.printStackTrace();
			return false;
		} catch (final RuntimeException e) {
			e.printStackTrace();
			fail("RuntimeException");
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

    @Test
    public void test_SemanticError_bad_break1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/bad_break1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_bad_break2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/bad_break2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_boolean_comparison1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/boolean_comparison1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_boolean_comparison2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/boolean_comparison2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_boolean_comparison3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/boolean_comparison3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_boolean_comparison4() throws IOException {
	final File f = new File(testsPath + "Semantic Error/boolean_comparison4.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_boolean_op1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/boolean_op1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_boolean_op2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/boolean_op2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_boolean_op3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/boolean_op3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_boolean_op4() throws IOException {
	final File f = new File(testsPath + "Semantic Error/boolean_op4.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_bool_assign_eval() throws IOException {
	final File f = new File(testsPath + "Semantic Error/bool_assign_eval.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_breakContinueErr1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/breakContinueErr1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_breakContinueErr2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/breakContinueErr2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_breakContinueErr3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/breakContinueErr3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_comparison_mismatch1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/comparison_mismatch1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_comparison_mismatch2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/comparison_mismatch2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_comparison_string2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/comparison_string2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_consts() throws IOException {
	final File f = new File(testsPath + "Semantic Error/consts.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_dollar_in_main() throws IOException {
	final File f = new File(testsPath + "Semantic Error/dollar_in_main.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_illegalNull1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/illegalNull1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_illegalNull2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/illegalNull2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_illegalNull3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/illegalNull3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_illegalNull4() throws IOException {
	final File f = new File(testsPath + "Semantic Error/illegalNull4.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_illegalSwitch1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/illegalSwitch1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_illegalSwitch2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/illegalSwitch2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_illegalSwitch3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/illegalSwitch3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_illegalSwitch4() throws IOException {
	final File f = new File(testsPath + "Semantic Error/illegalSwitch4.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_noAssignError1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/noAssignError1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_noAssignError2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/noAssignError2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_retval_in_void1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/retval_in_void1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_retval_in_void2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/retval_in_void2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_retval_in_void3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/retval_in_void3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_rhs_void1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/rhs_void1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_rhs_void2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/rhs_void2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_rhs_void3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/rhs_void3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_scope_1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/scope_1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_scope_2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/scope_2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_scope_3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/scope_3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_scope_4() throws IOException {
	final File f = new File(testsPath + "Semantic Error/scope_4.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_scope_5() throws IOException {
	final File f = new File(testsPath + "Semantic Error/scope_5.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_scope_6() throws IOException {
	final File f = new File(testsPath + "Semantic Error/scope_6.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_scope_special() throws IOException {
	final File f = new File(testsPath + "Semantic Error/scope_special.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_string_assignment1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/string_assignment1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_string_assignment2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/string_assignment2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_string_assignment3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/string_assignment3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_string_assignment4() throws IOException {
	final File f = new File(testsPath + "Semantic Error/string_assignment4.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_string_char1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/string_char1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_string_char2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/string_char2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_string_char3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/string_char3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_string_subscript1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/string_subscript1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_string_subscript2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/string_subscript2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_string_subscript3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/string_subscript3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_switch() throws IOException {
	final File f = new File(testsPath + "Semantic Error/switch.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_switch2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/switch2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_switchErrors() throws IOException {
	final File f = new File(testsPath + "Semantic Error/switchErrors.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_typing_adv1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/typing_adv1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_typing_adv2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/typing_adv2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_typing_adv3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/typing_adv3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_var_redef1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/var_redef1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_var_redef2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/var_redef2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_var_redef_scope1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/var_redef_scope1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_var_redef_scope2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/var_redef_scope2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_var_redef_scope3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/var_redef_scope3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_var_redef_scope4() throws IOException {
	final File f = new File(testsPath + "Semantic Error/var_redef_scope4.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_var_redef_scope6() throws IOException {
	final File f = new File(testsPath + "Semantic Error/var_redef_scope6.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_var_redef_scope_5() throws IOException {
	final File f = new File(testsPath + "Semantic Error/var_redef_scope_5.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_void_var1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/void_var1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_void_var2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/void_var2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_void_var3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/void_var3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_void_var4() throws IOException {
	final File f = new File(testsPath + "Semantic Error/void_var4.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arraysError1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arraysError1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arraysError10() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arraysError10.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arraysError11() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arraysError11.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arraysError2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arraysError2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arraysError3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arraysError3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arraysError4() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arraysError4.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arraysError5() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arraysError5.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arraysError6() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arraysError6.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arraysError7() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arraysError7.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arraysError8() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arraysError8.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arraysError9() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arraysError9.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arr_subscript1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arr_subscript1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arr_subscript2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arr_subscript2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Arrays_arr_subscript3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Arrays/arr_subscript3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Functions_funcError1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Functions/funcError1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Functions_func_arg_redef() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Functions/func_arg_redef.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Functions_func_assign1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Functions/func_assign1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Functions_func_assign2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Functions/func_assign2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Functions_func_assign3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Functions/func_assign3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Functions_func_comp() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Functions/func_comp.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Functions_func_redef1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Functions/func_redef1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Functions_func_redef3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Functions/func_redef3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Strings_string_comp_bad() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Strings/string_comp_bad.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Strings_string_null() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Strings/string_null.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Structs_structError1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Structs/structError1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Structs_structError2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Structs/structError2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Structs_structError3() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Structs/structError3.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Structs_structError4() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Structs/structError4.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Structs_structError5() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Structs/structError5.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Structs_structError6() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Structs/structError6.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Structs_structInit() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Structs/structInit.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Structs_struct_comp1() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Structs/struct_comp1.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Structs_struct_comp2() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Structs/struct_comp2.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Structs_struct_comp_mismatch() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Structs/struct_comp_mismatch.iava");
	assertFalse(testFile(f));
    }

    @Test
    public void test_SemanticError_Structs_struct_mismatch() throws IOException {
	final File f = new File(testsPath + "Semantic Error/Structs/struct_mismatch.iava");
	assertFalse(testFile(f));
    }

	
	
}
