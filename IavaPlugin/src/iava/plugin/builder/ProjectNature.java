package iava.plugin.builder;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * 
 * This class defines the nature of the IAVA project
 *
 */
public class ProjectNature implements IProjectNature {

	/**
	 * ID of this project nature
	 */
	public static final String NATURE_ID = "IavaPlugin.ProjectNature";
	private IProject p;

	/**
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	@Override
	public void configure() throws CoreException {
		IProjectDescription desc = p.getDescription();
		ICommand[] arr = desc.getBuildSpec();

		//check if the IAVA builder was already added - if so exit
		for (ICommand c : arr) 
			if (c.getBuilderName().equals(ProjectBuilder.BUILDER_ID)) 
				return;

		addBuilder(desc, arr);
	}

	private void addBuilder(final IProjectDescription desc, final ICommand[] arr)
	throws CoreException {
		ICommand[] cmds = new ICommand[arr.length + 1];
		System.arraycopy(arr, 0, cmds, 0, arr.length);
		ICommand c = desc.newCommand();
		c.setBuilderName(ProjectBuilder.BUILDER_ID);
		cmds[cmds.length - 1] = c;
		desc.setBuildSpec(cmds);
		p.setDescription(desc, null);
	}

	/**
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	@Override
	public void deconfigure() throws CoreException {
		IProjectDescription desc = getProject().getDescription();
		ICommand[] arr = desc.getBuildSpec();
		for (int i = 0; i < arr.length; ++i) {
			if (!arr[i].getBuilderName().equals(ProjectBuilder.BUILDER_ID)) 
				continue;

			ICommand[] cmds = new ICommand[arr.length - 1];
			System.arraycopy(arr, 0, cmds, 0, i);
			System.arraycopy(arr, i + 1, cmds, i,arr.length - i - 1);
			desc.setBuildSpec(cmds);
			p.setDescription(desc, null);			
			return;	
		}
	}

	/**
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	@Override
	public IProject getProject() {
		return p;
	}

	/**
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	@Override
	public void setProject(final IProject p) {
		this.p = p;
	}

}
