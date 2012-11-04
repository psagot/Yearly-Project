package unittests.translation;

import static org.junit.Assert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

import org.antlr.runtime.RecognitionException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import parser.InputHandler;
import parser.IavaParser.compilationUnit_return;


{2}


/**
 * @author Arnony Tests the correctness of the auto-generated lexer and parser
 *         files.
 */
@SuppressWarnings("all")
public class TranslationTreeTests {{

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
	 * The main test function - receives a test file name and executes the
	 * translator on it.
	 * 
	 * @return true iff no exceptions thrown
	 * @param fileName
	 * @throws IOException
	 *             Is thrown if was not able to open test text file.
	 */
	private boolean testFile(final File f) throws IOException {{

		try {{
			// If this is a directory, walk each file/dir in that directory
			if (f.isDirectory()) {{
				final String files[] = f.list();
				for (final String file : files)
					return testFile(new File(f, file));
			}}

			final compilationUnit_return cu_return = InputHandler
					.sendFileToParser(f.getAbsolutePath(), false);
			if(cu_return == null)
				return false;
			
			// /Step 2 - Calling the translator in order to output the result
			// java file:
			final String javaCode = InputHandler.translateTree(cu_return);
			// first writing the java code into a temporary file.
			File temp = new File("__javawrap__.java");
			temp.deleteOnExit();
			BufferedWriter out = new BufferedWriter(new FileWriter(temp));
		    out.write(javaCode);
		    out.close();
			
			// compilation related code.
			
			final JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
			
			// setting classpath.
	        List<String> options = new ArrayList<String>();
		    // set compiler's classpath to be same as the runtime's
		    options.addAll(Arrays.asList("-classpath",System.getProperty("java.class.path")));
		    
		    final StandardJavaFileManager fm = compiler.getStandardFileManager(diagnostics, null, null);
			
		    final Iterable<? extends JavaFileObject> cu = fm.getJavaFileObjects(temp);
			
	        CompilationTask task = 
	                       compiler.getTask(null, fm, diagnostics, options, null, cu);
	        boolean result = task.call();
	        
	        File directory = new File(".");
	        File[] toBeDeleted = directory.listFiles(new FileFilter() {{  
	        	public boolean accept(File theFile) {{  
	        	if (theFile.isFile()) {{  
	        	return theFile.getName().endsWith(".class");  
	        	}}  
	        	return false;  
	        	}}  
	        	}});  
	        	   
	        	System.out.println(Arrays.toString(toBeDeleted));  
	        	for(File deletableFile:toBeDeleted){{  
	        	deletableFile.delete();  
	        	}}
	        
	        return result;

			// return InputHandler.doFile(new File(fileName));
		}} catch (final RecognitionException e) {{
			e.printStackTrace();
			return false;
		}} catch (final RuntimeException e) {{
			e.printStackTrace();
			return false;
		}}
	}}

	{1}
}}
