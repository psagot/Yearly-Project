package iava.plugin.wizards;

import iava.plugin.project.ProjectSupport;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

/**
 * the wizard that creates the IAVA project
 */
public class ProjectNewWizard extends Wizard implements INewWizard, IExecutableExtension {

	private static final String WIZARD_NAME = "New Iava Plug-in Project"; //$NON-NLS-1$
	private static final String PAGE_NAME = "Iava Plug-in Project Wizard"; //$NON-NLS-1$
	private WizardNewProjectCreationPage page;
	private IConfigurationElement c;

	/**
	 * The wizard constructor
	 */
	public ProjectNewWizard() {
		setWindowTitle(WIZARD_NAME);
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		String name = page.getProjectName();
		URI loc = null;
		if (!page.useDefaults()) 
			loc = page.getLocationURI();        
		ProjectSupport.createProject(name, loc);
		BasicNewProjectResourceWizard.updatePerspective(c);
		return true;
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();
		page = new WizardNewProjectCreationPage(PAGE_NAME);
		page.setTitle(Messages.ProjectNewWizard_New_Iava_Project);
		page.setDescription(Messages.ProjectNewWizard_Iava_Project_Description);
		addPage(page);
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(final IWorkbench workbench, final IStructuredSelection selection) {}

	/**
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
	 */
	@Override
	public void setInitializationData(final IConfigurationElement config, final String propertyName, final Object data) throws CoreException {
		c = config;
	}

}
