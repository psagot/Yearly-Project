package iava.plugin.editor;

import org.eclipse.ui.editors.text.TextEditor;

/**
 * Iava editor
 */
public class IavaEditor extends TextEditor {
	/**
	 * constructor
	 */
	public IavaEditor() {
		super();
		setSourceViewerConfiguration(new Configuration());
	}
	/**
	 * (non-Javadoc)
	 * @see org.eclipse.ui.editors.text.TextEditor#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
	}
}
