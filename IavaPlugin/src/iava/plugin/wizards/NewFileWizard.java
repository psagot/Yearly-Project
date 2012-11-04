package iava.plugin.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;

/**
 * This class is responsible to create a new IAVA file for writing the code
 */
public class NewFileWizard extends Wizard implements INewWizard {

	protected WizardNewFileCreationPage page;
	private IWorkbench w;
	protected IStructuredSelection sel;

	/**
	 * ProjectNewFile constructor
	 */
	public NewFileWizard() {
		super();
		setWindowTitle(Messages.NewFileWizard_Title); 
	}

	/**
	 * @see: {@link org.eclipse.jface.wizard.Wizard#performFinish()}
	 */
	@Override
	public boolean performFinish() {
		boolean $ = false;

		IFile f = page.createNewFile();
		$ = (f != null);
		if ($) {
			try {
				IDE.openEditor(w.getActiveWorkbenchWindow().getActivePage(), f);
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
		return $;
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(final IWorkbench workbench, final IStructuredSelection selection) {
		w = workbench;
		sel = selection;
	}

	/** 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();
		page = new WizardFileCreation(sel);
		addPage(page);
	}
}
