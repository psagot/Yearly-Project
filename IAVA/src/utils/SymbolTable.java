package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import utils.FullType.Type;

/**
 * @author g2 Implements the symbol table functionality.
 */
public class SymbolTable {
	private final Map<String, FullType> globalVars = new HashMap<String, FullType>();
	private final ArrayList<ArrayList<Map<String, FullType>>> localVars = new ArrayList<ArrayList<Map<String, FullType>>>();
	private final Map<String, Map<String, FullType>> structTypes = new HashMap<String, Map<String, FullType>>();
	private String lastErrMsg = "No error msg";

	/**
	 * @return the last error msg that was discovered
	 */
	public String getLastErrMsg() {
		return lastErrMsg;
	}

	/**
	 * @param s
	 *            - the name of the global var
	 * @param ft
	 *            - the full type of the global var (see FullType description)
	 * @return - 0 if the global var s wasn't exist before, else -1
	 */
	public int addGlobalVar(final String s, final FullType ft) {
		// Check if ft is legal
		if ((ft.getType() == Type.STRUCT)
				&& !structTypes.containsKey(ft.getStructName())) {
			lastErrMsg = "Error: the global var " + s
					+ " is from undefined struct type.";
			return -1;
		}
		if ((ft.getType() == Type.ARRAY) && (ft.getArrayType() == null)) {
			lastErrMsg = "Error: the global var " + s
					+ " is from undefined array type.";
			return -1;
		}
		if (globalVars.containsKey(s)) {
			lastErrMsg = "Error: global var with the name " + s
					+ " already exist.";
			return -1;
		}
		globalVars.put(s, ft);
		return 0;
	}

	/**
	 * @param structName
	 *            - the struct name
	 * @param fieldsType
	 *            - list of the struct fields types
	 * @param fieldsName
	 *            - list of the struct fields names
	 * @return - 0 if the struct was added, else -1
	 */
	public int addStructType(final String structName,
			final ArrayList<FullType> fieldsType,
			final ArrayList<String> fieldsName) {
		if (structTypes.containsKey(structName)) {
			lastErrMsg = "Error: struct type " + structName + " duplication";
			return -1;
		}
		if (fieldsType.size() != fieldsName.size()) {
			lastErrMsg = "Error: no match between the size of the fields types and their names.";
			return -1;
		}
		final Map<String, FullType> fields = new HashMap<String, FullType>();
		for (int i = 0; i < fieldsName.size(); i++) {
			if (fields.containsKey(fieldsName.get(i))) {
				lastErrMsg = "Error: duplication of the field name "
						+ fieldsName.get(i) + ".";
				return -1;
			}
			fields.put(fieldsName.get(i), fieldsType.get(i));
		}
		structTypes.put(structName, fields);
		return 0;
	}

	/**
	 * Call this func when new function is called
	 */
	public void startFunc() {
		final ArrayList<Map<String, FullType>> func = new ArrayList<Map<String, FullType>>();
		// Add to func the first block (the base block)
		func.add(new HashMap<String, FullType>());
		localVars.add(func);
	}

	/**
	 * Call this func when function is ended
	 * 
	 * @return 0 if everything is ok -1 for error.
	 */
	public int endFunc() {
		if (localVars.isEmpty()) {
			lastErrMsg = "Error: more endFunc from startFunc.";
			return -1;
		}
		localVars.remove(localVars.size() - 1);
		return 0;
	}

	/**
	 * Call this func when new block is started
	 * 
	 * @return 0 is everything is ok, -1 for error.
	 */
	public int startBlock() {
		if (localVars.isEmpty()) {
			lastErrMsg = "Error: try to start block outside of function.";
			return -1;
		}
		lastFunc().add(new HashMap<String, FullType>());
		return 0;
	}

	/**
	 * Call this func when block is ended
	 * 
	 * @return 0 if everything is ok -1 for error.
	 */
	public int endBlock() {
		if (localVars.isEmpty()) {
			lastErrMsg = "Error: try to end block outside of function.";
			return -1;
		}
		if (lastFunc().size() == 1 /* only basic block exist */) {
			lastErrMsg = "Error: more endBlock from startBlock.";
			return -1;
		}
		lastFunc().remove(lastFunc().size() - 1);
		return 0;
	}

	/**
	 * @param s
	 *            - the name of the global var
	 * @param ft
	 *            - the type of the global var
	 * @return - 0 if the global var s wasn't exist before and we are inside of
	 *         function, else -1
	 */
	public int addLocalVar(final String s, final FullType ft) {
		// Check if ft is legal
		if ((ft.getType() == Type.STRUCT)
				&& !structTypes.containsKey(ft.getStructName())) {
			lastErrMsg = "Error: the local var " + s
					+ " is from undefined struct type " + ft.getStructName();
			return -1;
		}
		if ((ft.getType() == Type.ARRAY) && (ft.getArrayType() == null)) {
			lastErrMsg = "Error: the local var " + s
					+ " is from undefined array type.";
			return -1;
		}
		// Search for s in all the current blocks of the last function and if it
		// isn't exist add s to the last block in the last function
		if (localVars.isEmpty()) {
			lastErrMsg = "Error: try to insert local var outside of function.";
			return -1;
		}
		for (final Map<String, FullType> b : lastFunc())
			if (b.containsKey(s)) {
				lastErrMsg = "Error: local var with the name " + s
						+ " already exist.";
				return -1;
			}
		lastBlock().put(s, ft);
		return 0;
	}

	/**
	 * @param s
	 *            - global var name
	 * @return - type of the global var s or null if s is not a global var
	 */
	private FullType typeOfGlobalVar(final String s) {
		if (globalVars.containsKey(s))
			return globalVars.get(s);
		return null;
	}

	/**
	 * @param s
	 *            - local var name
	 * @return - type of the local var s or null if s is not a global var
	 */
	private FullType typeOfLocalVar(final String s) {
		if (localVars.isEmpty())
			return null;
		// Search for s in all the current blocks of the last function
		for (final Map<String, FullType> b : lastFunc())
			if (b.containsKey(s))
				return b.get(s);
		return null;
	}

	private ArrayList<Map<String, FullType>> lastFunc() {
		return localVars.get(localVars.size() - 1);
	}

	private Map<String, FullType> lastBlock() {
		return lastFunc().get(lastFunc().size() - 1);
	}

	/**
	 * @param s
	 *            - var name
	 * @return - first check if the var is local and if it is, return it's type.
	 *         If the var isn't local, check if the var is global and if it is,
	 *         return it's type. else, return null.
	 */
	public FullType typeOfVar(final String s) {
		if (typeOfLocalVar(s) != null)
			return new FullType(typeOfLocalVar(s));
		if (typeOfGlobalVar(s) != null)
			return new FullType(typeOfGlobalVar(s));
		lastErrMsg = "Error: there is no variable with the name " + s;
		return null;
	}

	/**
	 * @param structType
	 *            - the name of the variable of type struct
	 * @param structField
	 *            - the name of the field we wan't to check
	 * @return - the field FullType or null if the structVar doesn't exist or
	 *         doesn't from struct type or if the field doesn't exist
	 */
	public FullType typeOfStructField(final FullType structType,
			final String structField) {
		if (structType == null) {
			lastErrMsg = "Error: struct is null";
			return null;
		}
		if (structType.getType() != Type.STRUCT) {
			lastErrMsg = "Error: " + structType.getType() + " is not a struct";
			return null;
		}
		final Map<String, FullType> struct = structTypes.get(structType
				.getStructName());
		if (struct.get(structField) == null) {
			lastErrMsg = "Error: struct " + structType.getStructName()
					+ " has no field named " + structField;
			return null;
		}
		return new FullType(struct.get(structField));
	}

	/**
	 * @param arrayVar
	 *            - the name of the variable of type array
	 * @return the array cells type or null for error
	 */
	public FullType typeOfArrayCells(final String arrayVar) {
		final FullType var = typeOfVar(arrayVar);
		if ((var == null) || (var.getType() != Type.ARRAY)) {
			lastErrMsg = "Error: there is no array variable with the name "
					+ arrayVar;
			return null;
		}
		return new FullType(var.getArrayType());
	}
}
