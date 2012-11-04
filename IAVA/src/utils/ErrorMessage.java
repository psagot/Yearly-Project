package utils;

/**
 * The class holds information regarding a single error message, either syntax or semantics.
 */
public class ErrorMessage {

	private final String fileName;
	private final String msg;
	private final int line;
	private final int column;

	/**
	 * @param filename - the file name where the error occurred
	 * @param msg - the error message itself
	 * @param line - the line number where the error occurred
	 * @param column - the column number where the error occurred
	 */
	public ErrorMessage(final String filename, final String msg, final int line, final int column) {
		this.fileName = filename;
		this.msg = msg;
		this.line = line;
		this.column = column;
	}

	@Override public String toString() {
		return "Error in file: " + fileName + " line " + line + ":" + column + " - " + msg;
	}

	/**
	 * @return the file name where the error occurred
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @return the error message itself
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @return the line number where the error occurred
	 */
	public int getLine() {
		return line;
	}

	/**
	 * @return the column number where the error occurred
	 */
	public int getColumn() {
		return column;
	}


}
