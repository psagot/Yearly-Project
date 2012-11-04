package utils;

import java.util.ArrayList;

import utils.FullType.Type;

/**
 * @author g2 Implement the function symbol table.
 */
public class FuncSymbolTable {

	private String lastErrMsg = "No error msg";

	private class FuncParams {
		public String funcName;
		public FullType returnType;
		public ArrayList<FullType> argsTypes = new ArrayList<FullType>();

		public FuncParams(final String fn, final FullType rt,
				final ArrayList<FullType> at) {
			funcName = fn;
			returnType = rt;
			argsTypes.addAll(at);
		}
	}

	/**
	 * @return the last error msg that was discovered
	 */
	public String getLastErrMsg() {
		return lastErrMsg;
	}

	/**
	 * Key - name of the function Value - list of types, first index is the
	 * return value type
	 */
	private final ArrayList<FuncParams> funcs = new ArrayList<FuncParams>();

	/**
	 * @param funcName
	 *            - name of the function
	 * @param returnType
	 *            - the type of the return value
	 * @param argsType
	 *            - the function arguments types
	 * @return - 0 if the function was added or -1 for error
	 */
	public int addFunc(final String funcName, final FullType returnType,
			final ArrayList<FullType> argsType) {

		for (final FuncParams fp : funcs) {
			if (fp.funcName.equals(funcName) && fp.argsTypes.equals(argsType)) {
				lastErrMsg = "Error: function " + funcName + "(" + argsType
				+ ")" + " duplication";
				return -1;
			}
		}
		funcs.add(new FuncParams(funcName, returnType, argsType));
		return 0;
	}

	/**
	 * @param funcName
	 *            - the function name
	 * @param argsType
	 *            - the function arguments types
	 * @return true if the function call is ok, else false
	 */
	public boolean isFuncCallOK(final String funcName,
			final ArrayList<FullType> argsType) {

		for (final FuncParams fp : funcs) {
			if (fp.funcName.equals("arrayLength")
					&& fp.funcName.equals(funcName)) {
				if ((argsType != null) && (argsType.size() == 1)
						&& (argsType.get(0).getType() == Type.ARRAY))
					return true;
			}
			if (fp.funcName.equals(funcName) && fp.argsTypes.equals(argsType))
				return true;
		}
		lastErrMsg = "Error: no matching function for this call";
		return false;
	}

	/**
	 * @param funcName
	 *            - the function name
	 * @param argsType
	 *            - the function arguments types
	 * @return - the function return type or null if the function not exist
	 */
	public FullType getFuncReturnType(final String funcName,
			final ArrayList<FullType> argsType) {

		for (final FuncParams fp : funcs) {
			if (fp.funcName.equals("arrayLength")
					&& fp.funcName.equals(funcName)) {
				if ((argsType != null) && (argsType.size() == 1)
						&& (argsType.get(0).getType() == Type.ARRAY))
					return fp.returnType;
			}
			if (fp.funcName.equals(funcName) && fp.argsTypes.equals(argsType))
				return fp.returnType;
		}

		lastErrMsg = "Error: function not exist";
		return null;
	}

}
