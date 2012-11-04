package parser;

import utils.FullType;

/**
 * A class representing a single variable in the tree walker.
 * 
 */
public class NameType {
	/**
	 * The variable's name
	 */
	public String name;
	/**
	 * The variable's type
	 */
	public FullType type;

	/**
	 * true if this is of type array
	 */
	public boolean needBrackets = false;

	/**
	 * true if there is an array declaration like: integer a[]
	 */
	public boolean haveBrackets = false;

	/**
	 * @param name
	 *            is the name
	 * @param type
	 *            is the type
	 */
	public NameType(final String name, final FullType type) {
		this.name = name;
		this.type = type;
	}

	/**
	 * @param name
	 *            is the name
	 * @param type
	 *            is the type
	 * @param _needBrackets
	 *            - true if this is of type array
	 */
	public NameType(final String name, final FullType type,
			final boolean _needBrackets) {
		this.name = name;
		this.type = type;
		this.needBrackets = _needBrackets;
	}

	/**
	 * @param _haveBrackets
	 *            - set the haveBrackets to true if the type is a[] for example
	 */
	public void setBrackets(final boolean _haveBrackets) {
		this.haveBrackets = _haveBrackets;
	}

	@Override
	public String toString() {
		return name;
	}

}
