
package iava.plugin.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * A object of this class is created every time we want to create a
 * new IAVA file
 */
public class WizardFileCreation extends WizardNewFileCreationPage {

	private static final String PAGE_NAME = "Iava Plug-in File Wizard"; //$NON-NLS-1$

	/**
	 * @param sel where the user wants to create the File (selection on the GUI) 
	 */
	public WizardFileCreation(final IStructuredSelection sel) {
		super(PAGE_NAME, sel);

		setTitle(Messages.WizardFileCreation_Title);
		setDescription(Messages.WizardFileCreation_Description);
		setFileExtension(Messages.WizardFileCreation_Extension); 
	}

}
