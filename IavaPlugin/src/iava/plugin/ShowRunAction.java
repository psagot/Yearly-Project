package iava.plugin;

import iava.plugin.runner.ClassRunner;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * shows the run console
 */
public class ShowRunAction extends AbstractAction implements IWorkbenchWindowActionDelegate {

	/** (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(final IAction action) {
		ConsoleWriter.showConsole(ClassRunner.RUN_CONSOLE);
	}
}
