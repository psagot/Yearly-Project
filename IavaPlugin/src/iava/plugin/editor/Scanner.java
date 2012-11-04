package iava.plugin.editor;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

class Scanner extends RuleBasedScanner {

	private class MyWordDectator implements IWordDetector{
		@Override
		public boolean isWordStart(final char c) { 
			return Character.isJavaIdentifierStart(c); 
		}
		@Override
		public boolean isWordPart(final char c) {   
			return Character.isJavaIdentifierPart(c); 
		}
	}

	public Scanner() {
		WordRule rule = new WordRule(new MyWordDectator());
		FunctionRule func = new FunctionRule(new MyWordDectator());

		Token keyword = new Token(new TextAttribute(new Color(Display.getCurrent(), new RGB(127 , 0 ,85)), null, SWT.BOLD));
		Token comment = new Token(new TextAttribute(new Color(Display.getCurrent(), new RGB(0 ,128, 0)), null, SWT.NORMAL));
		Token string = new Token(new TextAttribute(new Color(Display.getCurrent(), new RGB(42, 0, 255)), null, SWT.NORMAL));
		//add tokens for each reserved word
		for (Keyword k: IavaKeywords.getKeywords()) 
			rule.addWord( k.getKey(), keyword);
		for (String k: IavaKeywords.getStdlib()) 
			func.addWord( k, keyword);

		setRules(new IRule[] {
				rule,
				func,
				new SingleLineRule("//", null, comment, '\\'),    // comment highlighting
				new MultiLineRule("/*", "*/", comment),			// comment highlighting
				new SingleLineRule("\"", "\"", string, '\\'),		// string highlighting 
				new SingleLineRule("'", "'", string, '\\'),		// char highlighting 
				new WhitespaceRule(new IWhitespaceDetector() {
					@Override
					public boolean isWhitespace(final char c) {
						return Character.isWhitespace(c);
					}
				}),
		});	// end of setRules()
	} //end of constructor
}