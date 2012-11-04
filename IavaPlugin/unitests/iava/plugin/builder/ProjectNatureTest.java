package iava.plugin.builder;


import iava.plugin.Activator;
import iava.plugin.project.ProjectSupport;
import iava.plugin.project.ProjectSupportTest;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;


/**
 * Tests the class: ProjectNature
 *
 */
public class ProjectNatureTest {

	/**
	 * Should succeed in creating a project in the workspace junit-workspace2 
	 * (located in the plugin's install directory). The name of the project is 
	 * delete-me.
	 * @throws URISyntaxException
	 * @throws CoreException
	 */
	@SuppressWarnings("nls")
	@Test
	public void testCreateProjectWithDifferentLocationArg() throws URISyntaxException, CoreException {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		String w = null;
		try {
			w = FileLocator.getBundleFile(bundle).getAbsolutePath() +"/junit-workspace2";
		} catch (IOException e) {
			e.printStackTrace();
		}
		File workspace = ProjectSupportTest.createTempWorkspace(w);
		String name = "delete-me"; //$NON-NLS-1$
		String path = w + "/" + name;
		URI loc = (new Path(path)).toFile().toURI();

		assertProjectDotFileAndStructureAndNatureExist(path, name, loc);

		ProjectSupportTest.deleteTempWorkspace(workspace);
	}


	@SuppressWarnings("nls")
	private void assertProjectDotFileAndStructureAndNatureExist(final String path, final String name, final URI loc)
	throws CoreException {
		IProject p = ProjectSupport.createProject(name, loc);

		String projectFilePath = path + "/" + ".project";
		try {
			Assert.assertNotNull(p);
			ProjectSupportTest.assertFileExists(projectFilePath);
			assertBuilderIn(p);

			//check the getters and setters
			ProjectNature n = new ProjectNature(); // beware: explicit creation might cause problems in other versions
			n.setProject(p);
			Assert.assertEquals(p, n.getProject());
		} finally {
			p.delete(true, null);  // always do this before returning
		}
	}



	private void assertBuilderIn(final IProject p) throws CoreException {
		IProjectDescription dsc = p.getDescription();
		ICommand[] cmds = dsc.getBuildSpec();
		if (cmds.length != 1) 
			Assert.fail("No Builders found in project."); //$NON-NLS-1$

		if (!cmds[0].getBuilderName().equals(ProjectBuilder.BUILDER_ID)) 
			Assert.fail("Project builder not found in project."); //$NON-NLS-1$
	}

}
