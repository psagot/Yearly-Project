package utils;

import java.util.List;

/**
 * @author Arnony
 * This class implements the IErrorHandler by printing all the messages to stderr.
 */
public class PrintErrorHandler implements IErrorHandler {

	@Override
	public void informUserOfErrors(final List<ErrorMessage> messages) {
		int i = 1;
		System.err.println();
		for (final ErrorMessage errMsg : messages)
			System.err.println("Error #" + i++ + ": " + errMsg);
	}

}
