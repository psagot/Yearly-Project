package iava.plugin.editor;

import java.util.ArrayList;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContextInformation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

/**
 * completes the code by the keywords in IAVA and by the standard library
 *
 */
public class CompletionProcessor implements IContentAssistProcessor {
	private final IContextInformation[] NO_CONTEXTS = { };
	private final ICompletionProposal[] NO_COMPLETIONS = { };

	/** (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeCompletionProposals(org.eclipse.jface.text.ITextViewer, int)
	 */
	@Override
	public ICompletionProposal[] computeCompletionProposals(final ITextViewer viewer, final int offset) {
		try {
			String prefix = lastWord( viewer.getDocument() , offset);
			ArrayList<ICompletionProposal> res= new ArrayList<ICompletionProposal>();

			Keyword[] values = IavaKeywords.getCompletionKeywords();
			for (Keyword value : values) {
				String k = value.getKey();
				if(!k.startsWith(prefix))
					continue;

				IContextInformation info= new ContextInformation(k, "no info");
				res.add(new CompletionProposal( k.substring(prefix.length(), k.length()), 
						offset, 0, k.length() - prefix.length()+1, null, k, info, value.getDesc()));
			}
			return res.toArray(new ICompletionProposal[res.size()]);
		} 
		catch (Exception e) {
			return NO_COMPLETIONS;
		}
	}

	private String lastWord(final IDocument doc, final int offset) {
		try {
			for (int n = offset-1; n >= 0; n--)
				if (!Character.isJavaIdentifierPart(doc.getChar(n)) )
					return doc.get(n + 1, offset-n-1);

			if( doc.getLength() == offset)
				return doc.get(0,offset);
		} catch (BadLocationException e) {}

		return "";
	}




	/** (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeContextInformation(org.eclipse.jface.text.ITextViewer, int)
	 */
	@Override
	public IContextInformation[] computeContextInformation(final ITextViewer viewer,final int offset) {
		return NO_CONTEXTS;
	}

	/** (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getCompletionProposalAutoActivationCharacters()
	 */
	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}

	/** (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationAutoActivationCharacters()
	 */
	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	/** (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationValidator()
	 */
	@Override
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

	/** (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getErrorMessage()
	 */
	@Override
	public String getErrorMessage() {
		return null;
	}


}
