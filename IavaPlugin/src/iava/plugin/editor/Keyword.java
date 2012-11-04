package iava.plugin.editor;
/**
 * abstraction for the keywords
 */
public class Keyword{
	private final String key;
	private final String desc; // description for the keyword (shown by the code completion) 
	/**
	 * @param k the keyword
	 */
	public Keyword(final String k){
		this(k,null);
	}
	/**
	 * @param k the keyword
	 * @param d description
	 */
	public Keyword(final String k, final String d) {
		key = k;
		desc = d;
	}
	/**
	 * @return returns the keyword
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @return returns the keyword's description
	 */
	public String getDesc() {
		return desc;
	}
}