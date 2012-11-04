package iava.plugin.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

class Configuration extends SourceViewerConfiguration {
	@Override
	public IPresentationReconciler getPresentationReconciler(
			final ISourceViewer sourceViewer) {
		PresentationReconciler $ = new PresentationReconciler();
		DefaultDamagerRepairer ddr = new DefaultDamagerRepairer(new Scanner());
		$.setRepairer(ddr, IDocument.DEFAULT_CONTENT_TYPE);
		$.setDamager(ddr, IDocument.DEFAULT_CONTENT_TYPE);
		return $;
	}

	@Override
	public IContentAssistant getContentAssistant(final ISourceViewer sourceViewer) {
		ContentAssistant $ = new ContentAssistant();
		IContentAssistProcessor cap = new CompletionProcessor();
		$.setContentAssistProcessor(cap, IDocument.DEFAULT_CONTENT_TYPE);
		$.setInformationControlCreator(getInformationControlCreator(sourceViewer));
		return $;
	}

}