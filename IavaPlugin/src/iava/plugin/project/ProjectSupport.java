package iava.plugin.project;

import iava.plugin.builder.ProjectNature;

import java.net.URI;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;

/**
 * 
 * This class is responsible for the actions to be taken when a new IAVA project
 * is created.
 *
 */
public class ProjectSupport {
	/**
	 * For this project we need to:
	 * 1. create the default Eclipse project
	 * 2. add the custom project nature
	 * 3. create the folder structure
	 * 
	 * @param name the project's name
	 * @param loc where to create the project
	 * @return the new IAVA project
	 */
	public static IProject createProject(final String name, final URI loc) {
		Assert.isNotNull(name);
		Assert.isTrue(name.trim().length() > 0);

		IProject $ = createBaseProject(name, loc);
		try {
			addNature($);
			String[] paths = { "src" }; //$NON-NLS-1$ 			 
			addToProjectStructure($, paths);
		} catch (CoreException e) {
			e.printStackTrace();
			$ = null;
		}
		return $;
	}

	/**
	 * Just do the basics: create a basic project.
	 * 
	 * @param loc
	 * @param name
	 */
	private static IProject createBaseProject(final String name, final URI loc) {
		// it is acceptable to use the ResourcesPlugin class
		IProject $ = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		if($.exists())
			return $;

		URI loaction = loc;
		IProjectDescription desc = $.getWorkspace().newProjectDescription($.getName());
		if (loc != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(loc)) 
			loaction = null;

		desc.setLocationURI(loaction);
		try {
			$.create(desc, null);
			if (!$.isOpen()) 
				$.open(null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return $;
	}

	private static void createFolder(final IFolder f) throws CoreException {
		IContainer p = f.getParent();
		if (p instanceof IFolder) 
			createFolder((IFolder) p);
		if (!f.exists()) 
			f.create(false, true, null);
	}

	/**
	 * Create a folder structure with a parent root, overlay, and a few child
	 * folders.
	 * 
	 * @param p the project
	 * @param paths the paths to add
	 * @throws CoreException
	 */
	private static void addToProjectStructure(final IProject p, final String[] paths) throws CoreException {
		for (String path : paths) 
			createFolder(p.getFolder(path));
	}

	private static void addNature(final IProject p) throws CoreException {
		if (p.hasNature(ProjectNature.NATURE_ID))
			return;

		IProjectDescription desc = p.getDescription();
		String[] ids = desc.getNatureIds();
		String[] nat = new String[ids.length + 1];
		System.arraycopy(ids, 0, nat, 0, ids.length);
		nat[ids.length] = ProjectNature.NATURE_ID;
		desc.setNatureIds(nat);

		p.setDescription(desc, null);

	}
}
