package iava.plugin;


import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleInputStream;
import org.eclipse.ui.console.IOConsoleOutputStream;

/**
 * Write to the console of the user
 */
public class ConsoleWriter{

	private final IOConsole c;

	static private IOConsole findConsole(final String name) {
		IConsole[] arr = ConsolePlugin.getDefault().getConsoleManager().getConsoles();
		for (IConsole c : arr )
			if (name.equals(c.getName()))
				return (IOConsole) c;
		return null; // not found
	}

	/**
	 * @param name the name of the console
	 */
	public ConsoleWriter(final String name) {
		c = new IOConsole(name, null);
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{c});
	}

	/**
	 * @return the out stream which writes to the user's console
	 */
	public IOConsoleOutputStream  getStream(){
		return c.newOutputStream();
	}

	/**
	 * @return gets the input stream
	 */
	public IOConsoleInputStream  getInStream(){
		return c.getInputStream();
	}

	/**
	 * clears the console 
	 */
	public void clearConsole(){
		c.clearConsole();
	}

	/**
	 * destroys the console and remove it from the console manager
	 * @param name the name of the console 
	 */
	static public void destroyConsole(final String name){
		IOConsole con = findConsole(name);
		if(con == null)
			return;
		con.destroy();
		removeConsole(con);
	}

	private static void removeConsole(final IOConsole con) {
		IConsole cArr[] = {con};
		ConsolePlugin.getDefault().getConsoleManager().removeConsoles(cArr);
	}

	/**
	 * switches the console view to show  a specific console
	 * @param name the console to be in the foreground of the view
	 */
	static public void showConsole(final String name){
		IOConsole c = ConsoleWriter.findConsole(name);
		if (c == null) 
			return;
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(c);
	}

	/**
	 * switches the console view to show  a specific console
	 */
	public void showConsole(){
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(c);
	}

}

