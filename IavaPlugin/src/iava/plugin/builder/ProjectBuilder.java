package iava.plugin.builder;

import iava.plugin.Activator;

import java.io.PrintWriter;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.console.IOConsoleOutputStream;

import parser.InputHandler;

/**
 * 
 * This class defines the IAVA builder and invokes when needed
 *
 */
public class ProjectBuilder extends IncrementalProjectBuilder {

	/**
	 * the name of the generated java class
	 */
	public static final String CLASS = "__javawrap__";

	private static final String GEN_JAVA = "/" + CLASS+".java";
	private static final String ext = "iava";

	class DeltaVisitor implements IResourceDeltaVisitor {
		/**
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		@Override
		public boolean visit(final IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				checkFile(resource);
				break;
			case IResourceDelta.REMOVED:
				break;
			case IResourceDelta.CHANGED:
				checkFile(resource);
				break;
			}
			return true;
		}
	}

	class ResourceVisitor implements IResourceVisitor {
		@Override
		public boolean visit(final IResource resource) {
			checkFile(resource);
			return true;  //return true to continue visiting children.
		}
	}


	/**
	 * The id of the IAVA builder
	 */
	public static final String BUILDER_ID = "IavaPlugin.ProjectBuilder";


	/**
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	@SuppressWarnings({ "rawtypes", "restriction" }) 
	protected IProject[] build(final int kind, final Map args, final IProgressMonitor monitor)
	throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
			return null;
		} 
		IResourceDelta delta = getDelta(getProject());
		if (delta == null) 
			fullBuild(monitor);
		else 
			incrementalBuild(delta, monitor);
		return null;
	}
	private void deleteMarkers(final IFile file) {
		try {
			file.deleteMarkers(ErrorMarker.MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {}
	}
	/**
	 * @param r the resource to compile
	 * @return true if the resource is of expected type and no compilations errors were found
	 */
	public boolean checkFile(final IResource r) {
		if (r instanceof IFile && r.getFileExtension().equals(ext)) {
			IFile f = (IFile) r;
			deleteMarkers(f);
			ErrorMarker m = new ErrorMarker(f);
			try {
				InputHandler.setErrorHandler(m);
				String p = ResourcesPlugin.getWorkspace().getRoot().getLocation().makeAbsolute().toString() 
				+ f.getFullPath().toString();

				String src = f.getParent().getLocation().toString(); //the path of the 'src' folder
				String []args = {p ,src+GEN_JAVA};

				InputHandler.main(args);

				if(!m.noProblems()) // if compilation problems -- don't compile to class file 
					return false;

				String workspace = FileLocator.getBundleFile(Platform.getBundle(Activator.PLUGIN_ID)).getAbsolutePath();
				String classpath = src+"/:rt.jar:"+workspace;

				if (javaCompile(src, classpath, m.getStream())) {
					hideFiles(r.getParent());
					m.reportNoErrors();
					return true;
				}
				hideFiles(r.getParent());
			} catch (Exception e1) {}
		}
		return false;
	}
	private boolean javaCompile(final String jFile, final String classpath, final IOConsoleOutputStream c) {

		return org.eclipse.jdt.core.compiler.batch.BatchCompiler.compile(
				"-classpath "+classpath + "  -5 " +jFile+GEN_JAVA,new PrintWriter(c), 
				new PrintWriter(c), null);
	}

	private void hideFiles(final IResource r){
		IResource[] arr = null;
		try {
			arr = ((IFolder)r).members();
		} catch (CoreException e) {
			e.printStackTrace();
			return;
		}

		for(IResource m : arr)
			if(m.getFileExtension() == null || !m.getFileExtension().equals(ext)){
				try {
					m.setHidden(true);
				} catch (CoreException e) {			
					e.printStackTrace();
				}
			}
	}
	protected void fullBuild(final IProgressMonitor monitor)
	throws CoreException {
		try {
			getProject().accept(new ResourceVisitor());
		} catch (CoreException e) {}
	}

	// the visitor does the work.
	protected void incrementalBuild(final IResourceDelta delta, final IProgressMonitor monitor)
	throws CoreException {
		delta.accept(new DeltaVisitor());
	}
}
