package iava.plugin.project;


import iava.plugin.Activator;
import iava.plugin.builder.ProjectNature;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.AssertionFailedException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;


/**
 * Tests the class: ProjectSupport
 */
public class ProjectSupportTest {

	/**
	 * Should succeed in creating a project in the workspace junit-workspace 
	 * (located in the plugin's install directory). The name of the project is 
	 * delete-me.
	 * @throws URISyntaxException
	 * @throws CoreException
	 */
	@SuppressWarnings("nls")
	@Test
	public void testCreateProjectWithDifferentLocationArg() throws URISyntaxException, CoreException {
		Bundle b = Platform.getBundle(Activator.PLUGIN_ID);
		String workspace = null;
		try {
			workspace = FileLocator.getBundleFile(b).getAbsolutePath() +"/junit-workspace7";
		} catch (IOException e) {
			e.printStackTrace();
		}
		File w = createTempWorkspace(workspace);
		String name = "delete-me"; //$NON-NLS-1$
		String path = workspace + "/" + name;
		URI loc = (new Path(path)).toFile().toURI();

		assertProjectCreation(path, name, loc);
		deleteTempWorkspace(w);
	}

	/**
	 * Should fail -- no valid name
	 */
	@Test
	public void testCreateProjectWithEmptyNameArg() {
		assertCreateProjectWithBadNameArg(" ");
	}

	/**
	 * Should fail - name is null
	 */
	@Test
	public void testCreateProjectWithNullNameArg() {
		assertCreateProjectWithBadNameArg(null);
	}

	/**
	 * checks:
	 * 1. created project not null
	 * 2. created project succeeded by that the .project file exists
	 * 3. The IAVA nature exists
	 * 4. The project structure is as defined
	 * @param path
	 * @param name
	 * @param loc
	 * @throws CoreException
	 */
	@SuppressWarnings("nls")
	private void assertProjectCreation(final String path, final String name, final URI loc)
	throws CoreException {
		IProject p = ProjectSupport.createProject(name, loc);

		String projectFilePath = path + "/" + ".project";
		try {
			Assert.assertNotNull(p);
			assertFileExists(projectFilePath);
			assertNatureIn(p);
			assertFolderStructureIn(path);
		} finally {
			p.delete(true, null);  // always do this before returning
		}
	}

	/**
	 * 
	 * @param p projectPath
	 */
	@SuppressWarnings("nls")
	private void assertFolderStructureIn(final String p) {

		File file = new File(p + "/" + "src");//$NON-NLS-1$
		if (!file.exists()) 
			Assert.fail("Folder structure " + file.toString() + " does not exist.");     
	}

	private void assertNatureIn(final IProject p) throws CoreException {
		IProjectDescription desc = p.getDescription();
		String[] ids = desc.getNatureIds();
		if (ids.length != 1) 
			Assert.fail("No natures found in project."); //$NON-NLS-1$

		if (!ids[0].equals(ProjectNature.NATURE_ID)) 
			Assert.fail("Project natures not found in project."); //$NON-NLS-1$
	}

	/**
	 * checks that the .project file exists indicating that the creation of the project
	 * succeeded.
	 * @param path
	 */
	static public void assertFileExists(final String path) {
		File f = new File(path);

		if (!f.exists()) 
			Assert.fail("File " + path + " does not exist."); //$NON-NLS-1$//$NON-NLS-2$
	}

	private void assertCreateProjectWithBadNameArg(final String name) {
		URI loc = null;
		try {
			ProjectSupport.createProject(name, loc);
			Assert.fail("The call to ProjectSupport.createProject() did not fail!"); //$NON-NLS-1$
		} catch (AssertionFailedException e) {}
	}

	/**
	 * 
	 * @param w the workspace to delete
	 */
	static public void deleteTempWorkspace(final File w) {
		if (! w.delete() ) 
			Assert.fail("Unable to delete the new workspace dir at " + w); //$NON-NLS-1$
	}

	/**
	 * Creates a workspace for testing
	 * @param path
	 * @return the workspace
	 */
	static public File createTempWorkspace(final String path) {
		File $ = new File(path);
		if (!$.exists()) {
			boolean dirCreated = $.mkdir();
			if (!dirCreated) 
				Assert.fail("Unable to create the new workspace dir at " + $); //$NON-NLS-1$
		}
		return $;
	}

}
