package iava.plugin.runner;

import iava.plugin.AbstractAction;
import iava.plugin.builder.ProjectBuilder;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * run button of the iava file
 */
public class RunAction extends AbstractAction implements IWorkbenchWindowActionDelegate {

	/** (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(final IAction action) {
		IFile f = (IFile)window.getActivePage().getActiveEditor().getEditorInput().getAdapter(IFile.class);
		boolean b = (new ProjectBuilder()).checkFile(f);
		if (!b)
			return;
		String p = f.getParent().getLocation().toString()+"/";
		ClassRunner.stopRun(false);
		(new ClassRunner(p)).start();
	}
}
