package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author g2
 * 
 */
public class ErrorReporter {

	private boolean mMessageCollectionEnabled = false;
	private boolean mHasErrors = false;
	private final List<String> mMessages = new ArrayList<String>();

	/**
	 * Switches error message collection on or of.
	 * 
	 * The standard destination for parser error messages is
	 * <code>System.err</code>. However, if <code>true</code> gets passed to
	 * this method this default behavior will be switched off and all error
	 * messages will be collected instead of written to anywhere.
	 * 
	 * @param pNewState
	 *            <code>true</code> if error messages should be collected.
	 */
	public void enableErrorMessageCollection(final boolean pNewState) {
		mMessageCollectionEnabled = pNewState;
	}

	/**
	 * Collects an error message or passes the error message to <code>
	 *  super.emitErrorMessage(...)</code>.
	 * 
	 * The actual behavior depends on whether collecting error messages has been
	 * enabled or not.
	 * 
	 * @param pMessage
	 *            The error message.
	 */
	public void emitErrorMessage(final String pMessage) {
		if (mMessageCollectionEnabled) { // /Add a syntax error to the list
			mMessages.add(pMessage);
			mHasErrors = true;
		} else {
			throw new RuntimeException(pMessage); // Useful for unit tests
		}
	}

	/**
	 * @param hdr
	 *            - header of the error msg (line, col, etc.)
	 * @param msg
	 *            - body of the error msg
	 */
	public void displayRecognitionError(final String hdr, final String msg) {
		if (mMessageCollectionEnabled) { // /Add a syntax error to the list
			mMessages.add(hdr + " " + msg);
			mHasErrors = true;
		} else {
			throw new RuntimeException(hdr + " " + msg); // Useful for unit
															// tests
		}
	}

	/**
	 * Returns collected error messages.
	 * 
	 * @return list of all the error messages
	 */
	public List<String> getMessages() {
		return mMessages;
	}

	/**
	 * Tells if parsing a Java source has caused any error messages.
	 * 
	 * @return true if error occur
	 */
	public boolean hasErrors() {
		return mHasErrors;
	}

	/**
	 * Prints the error with the given msg and position and sets mHasErrors.
	 * 
	 * @param fileName
	 *            the fileName we are working with
	 * @param msg
	 *            the message of the error
	 * @param line
	 *            position the position of the error.
	 * @param position
	 *            inside line
	 */
	public void newError(final String fileName, final String msg,
			final int line, final int position) {
		if (msg.contains("ERROR"))
			return;
		mMessages.add(fileName + " line " + line + ":" + position + " "
				+ msg);
		mHasErrors = true;
	}

}
