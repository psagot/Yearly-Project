package utils;

import java.util.List;

/**
 * This interface handles syntax \ semantic errors, either found in the grammar or during semantic checks.
 *
 */
public interface IErrorHandler {

	/**
	 * @param messages is a list of error messages of type ErrorMessage.
	 */
	void informUserOfErrors(List<ErrorMessage> messages);

}
