package iava.plugin.editor;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;

/**
 * 
 * This is the rules for functions. it will mark the words that are functions by the heuristic that they
 * must at the end have the character '('. Whitespace between the function name and the '(' character are allowed
 *
 */
public class FunctionRule extends WordRule {

	/** Buffer used for pattern detection. */
	private final StringBuffer fBuffer= new StringBuffer();

	/**
	 * @see WordRule#WordRule(IWordDetector)
	 */
	public FunctionRule(final IWordDetector detector) {
		super(detector);
	}
	/**
	 * @see WordRule#WordRule(IWordDetector, IToken)
	 */
	public FunctionRule(final IWordDetector detector, final IToken defaultToken) {
		super(detector, defaultToken, false);
	}

	/**
	 * @see WordRule#evaluate(ICharacterScanner)
	 */
	@Override
	public IToken evaluate(final ICharacterScanner scanner) {
		int c= scanner.read();
		if (c != ICharacterScanner.EOF && fDetector.isWordStart((char) c))
			if (fColumn == UNDEFINED || fColumn == scanner.getColumn() - 1) 
				return checkToken(scanner, c);
		scanner.unread();
		return Token.UNDEFINED;
	}


	private IToken checkToken(final ICharacterScanner scanner, int c) {
		fBuffer.setLength(0);
		do {
			fBuffer.append((char) c);
			c= scanner.read();
		} while (c != ICharacterScanner.EOF && fDetector.isWordPart((char) c));
		c = readWhitespace(scanner, c);
		boolean b = false;
		if(c == '(')
			b = true;
		scanner.unread();
		String buffer= fBuffer.toString();
		IToken token= (IToken)fWords.get(buffer);

		if (token != null && b)
			return token;
		if (fDefaultToken.isUndefined())
			unreadBuffer(scanner);

		return fDefaultToken;
	}
	/**
	 * used for {@link: FunctionRule#checkToken(ICharacterScanner, int)} for reading all the whitespace
	 * @param scanner
	 * @param c the first character
	 * @return the non-whitespace last character
	 */
	private int readWhitespace(final ICharacterScanner scanner, int c) {
		while( c != ICharacterScanner.EOF && Character.isWhitespace(c)  ){ // reads all the whitespace
			fBuffer.append((char) c);
			c= scanner.read();
		}
		return c;
	}

	/**
	 * Returns the characters in the buffer to the scanner.
	 *
	 * @param scanner the scanner to be used
	 */
	@Override
	protected void unreadBuffer(final ICharacterScanner scanner) {
		for (int i= fBuffer.length() - 1; i >= 0; i--)
			scanner.unread();
	}

}
