package iava.plugin.runner;

import iava.plugin.AbstractAction;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;


/**
 * stops the run of the current running program
 */
public class StopRun extends AbstractAction implements IWorkbenchWindowActionDelegate {

	/** (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(final IAction action) {
		ClassRunner.stopRun(true);
	}
}
