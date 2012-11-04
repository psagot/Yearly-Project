package iava.plugin.wizards;

import org.eclipse.osgi.util.NLS;
/**
 * 
 * This class loads dynamically the messeges.properties file, where the GUI strings
 * are defined. This enables programmers change the language without changing 
 * the source files
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "iava.plugin.wizards.messages"; //$NON-NLS-1$
	/**
	 * title of new creation of IAVA file
	 */
	public static String NewFileWizard_Title;
	/**
	 * IAVA Project Description
	 */
	public static String ProjectNewWizard_Iava_Project_Description;
	/**
	 * New IAVA Project
	 */
	public static String ProjectNewWizard_New_Iava_Project;
	/**
	 * New IAVA File Description
	 */
	public static String WizardFileCreation_Description;
	/**
	 * IAVA File extension
	 */
	public static String WizardFileCreation_Extension;
	/**
	 * The relative path of the IAVA File template
	 */
	public static String WizardFileCreation_Template;
	/**
	 * New IAVA project title
	 */
	public static String WizardFileCreation_Title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {}
}
