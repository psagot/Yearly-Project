package iava.plugin;


import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * shows the build console
 *
 */
public class ShowBuildAction extends AbstractAction implements IWorkbenchWindowActionDelegate {


	/** (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(final IAction action) {
		ConsoleWriter.showConsole("Build");
	}
}
