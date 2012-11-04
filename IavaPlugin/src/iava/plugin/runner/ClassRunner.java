package iava.plugin.runner;

import iava.plugin.Activator;
import iava.plugin.ConsoleWriter;
import iava.plugin.builder.ProjectBuilder;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.console.IOConsoleOutputStream;

/**
 * Runs file with ".class" extension
 */
public class ClassRunner extends Thread{ 

	private static final String MAIN = "main";
	private static final String STANDARD_LIB = "standardLib.StdLib";
	/**
	 * the name of the run console where the infirior's input and output are displayed
	 */
	public static final String RUN_CONSOLE = "Run Console";
	private final String dir;
	private static Thread current ;

	/**
	 * @param dir the directory whose is the parent of
	 *  the class file to execute
	 */
	public ClassRunner(final String dir) {
		this.dir = dir;
	}

	/**
	 * runs the file that got
	 */
	@Override
	public void run(){
		try {
			ConsoleWriter c = runSetup();
			String jarPath = getJarPath();
			current = this;

			PrintStream s1 = System.out;
			PrintStream s2 = System.err;
			InputStream sin = System.in;
			IOConsoleOutputStream  out = c.getStream();
			setStreams(new PrintStream(out), new PrintStream(out) , c.getInStream());

			File stdFile = new File(jarPath);
			File wrap = new File(dir);
			URL[] urls = new URL[] { wrap.toURI().toURL(),  stdFile.toURI().toURL() };  
			URLClassLoader ucl = new URLClassLoader(urls);
			ucl.loadClass(STANDARD_LIB);
			Method m = ((Class<?>) ucl.loadClass(ProjectBuilder.CLASS)).getDeclaredMethod(MAIN, String[].class);
			m.invoke(null, (Object) null);

			System.setOut(s1);
			System.setErr(s2);
			System.setIn(sin);

		}catch (InvocationTargetException e) {
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setStreams(final PrintStream out , final PrintStream err , final InputStream in) {
		System.setOut(out);
		System.setErr(err);
		System.setIn(in);
	}
	/**
	 * stops the current run of the user's program
	 * @param v violent termination
	 */
	@SuppressWarnings("deprecation")
	public static void stopRun(boolean v){
		if(current == null)
			return;
		if(v)
			System.out.println("\nTerminated...");
		current.stop();
	}


	private String getJarPath() throws IOException {
		return FileLocator.getBundleFile(Platform.getBundle(Activator.PLUGIN_ID)).getAbsolutePath();// +"/iava.jar";
	}

	private ConsoleWriter runSetup() {
		ConsoleWriter.destroyConsole(RUN_CONSOLE);
		ConsoleWriter $ = new ConsoleWriter(RUN_CONSOLE);
		$.showConsole();
		return $;
	}
}
