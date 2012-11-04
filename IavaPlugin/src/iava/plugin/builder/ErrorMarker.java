package iava.plugin.builder;

import iava.plugin.ConsoleWriter;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.xml.sax.helpers.DefaultHandler;
import org.eclipse.swt.graphics.Color;
import utils.ErrorMessage;
import utils.IErrorHandler;

/**
 * This class handles the errors and display them to the user
 */
public class ErrorMarker extends DefaultHandler implements IErrorHandler {
	private static final String CONSOLE_NAME = "Build";

	/**
	 * the marker id
	 */
	public static final String MARKER_TYPE = IMarker.PROBLEM;
	
	private IFile file;
	private ConsoleWriter c;
	private IOConsoleOutputStream out;
	private boolean noProb = true; // indicates if there are any problems 
	/**
	 * create a new ErrorMarker:
	 * 
	 * destroys the previous Build console and make the new one in the foreground of the console viewer and then returns the stream to
	 * print to it
	 * @param file the file this marker is created for
	 */
	public ErrorMarker(IFile file) {
		this.file = file;
		ConsoleWriter.destroyConsole(CONSOLE_NAME);
		c = new ConsoleWriter(CONSOLE_NAME);
		out =  c.getStream();
		setColor(false);
		c.showConsole(); 
	}

	/**
	 * sets the out stream letters to be red if error is true and green otherwise
	 * @param errors indicates if true whether there are errors and false if there are none.
	 */
	private void setColor(boolean errors) {
		Display device = Display.getCurrent();
		Color c = new org.eclipse.swt.graphics.Color(device, 255, 0, 0);
		if (!errors)
			c = new org.eclipse.swt.graphics.Color(device, 0, 200, 0);
		out.setColor(c);
	}

	private void addMarker(IFile file, String message, int line, int sev) {
		try {
			IMarker m = file.createMarker(MARKER_TYPE);
			m.setAttribute(IMarker.MESSAGE, message);
			m.setAttribute(IMarker.SEVERITY, sev);
			if (line == -1) 
				line = 1;
			m.setAttribute(IMarker.LINE_NUMBER, line);
		} catch (CoreException e) {}
	}

	/**
	 * iterate the errors and display them to the user
	 */
	@Override
	public void informUserOfErrors(List<ErrorMessage> messages) {
		noProb = messages.isEmpty();
		setColor(!noProb);
		try{
			
			for(ErrorMessage m : messages){
				addMarker(file, m.getMsg(), m.getLine(), IMarker.SEVERITY_ERROR);		
				out.write("Error in "+file.getName()+": "+ m.getMsg()+ " Line: "+ m.getLine()+"\n");
			}
			if(messages.isEmpty())
				reportNoErrors();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the stream of the BUILD console for either reading or writing to it
	 */
	public IOConsoleOutputStream getStream() {
		return c.getStream();
	}
	
	/**
	 * 
	 * @return true if there are no problems.
	 */
	public boolean noProblems() {
		return noProb;
	}
	
	/**
	 * report that no errors were found in green letters
	 * @throws IOException
	 */
	public void reportNoErrors() throws IOException{
		out.write("No Errors in "+file.getName());
	}
}