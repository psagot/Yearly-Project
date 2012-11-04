package utils;

/**
 * @author g2
 */
public class FullType {
  private Type t;
  private String sn = null;
  private FullType at = null;
  private boolean iv = false;
  
  /**
   * @author g2. Define the allowed types of vars
   */
  public enum Type {
    /***/
    VOID,
    /***/
    INTEGER,
    /***/
    REAL,
    /***/
    CHAR,
    /***/
    BOOLEAN,
    /***/
    STRING,
    /***/
    STRUCT,
    /***/
    ARRAY,
    /***/
    NULL,
    /***/
    UNSET,
    /***/
    ERROR;
  }
  
  /**
   * This c'tor is for struct vars only
   * 
   * @param type
   *          - can be only Type.STRUCT
   * @param structName
   *          - the struct name of this var
   */
  public FullType(final Type type, final String structName) {
    t = type;
    sn = structName;
  }
  
  /**
   * This c'tor is for array vars only
   * 
   * @param type
   *          - can be only Type.ARRAY
   * @param arrayType
   *          - the type of this array
   */
  public FullType(final Type type, final FullType arrayType) {
    t = type;
    at = arrayType;
  }
  
  /**
   * This c'tor is for array vars only
   * 
   * @param type
   *          - can be only Type.ARRAY
   * @param arrayType
   *          - the type of this array
   * @param dim
   *          - the array dimension
   */
  public FullType(final Type type, final FullType arrayType, final int dim) {
    FullType tmp = arrayType;
    for (int i = 0; i < dim - 1; i++)
      tmp = new FullType(Type.ARRAY, tmp);
    t = type;
    at = tmp;
  }
  
  /**
   * This c'tor is for non struct or array vars
   * 
   * @param type
   *          - can be any Type except Type.ARRAY or Type.STRUCT
   */
  public FullType(final Type type) {
    t = type;
  }
  
  /**
   * This c'tor is for variables vars (can't be for struct and array) and not
   * constants
   * 
   * @param type
   *          - can be any Type except Type.ARRAY or Type.STRUCT
   * @param isVar
   *          - if this type is of variable
   */
  public FullType(final Type type, final boolean isVar) {
    t = type;
    iv = isVar;
  }
  
  /**
   * This is copy c'tor
   * 
   * @param ft
   *          - FullType to get its copy
   */
  public FullType(final FullType ft) {
    t = ft.t;
    sn = ft.sn;
    if (ft.at != null)
      at = new FullType(ft.at);
    else
      at = null;
    iv = ft.iv;
  }
  
  /**
   * @return the type of this var
   */
  public Type getType() {
    return t;
  }
  
  /**
   * @return the name of the struct name of this var if the var is from
   *         Type.STRUCT
   */
  public String getStructName() {
    return sn;
  }
  
  /**
   * @return the name of the array type of this var if the var is from
   *         Type.ARRAY
   */
  public FullType getArrayType() {
    return at;
  }
  
  /**
   * @return the type the array consist of Type.ARRAY
   */
  public Type getInnerType() {
    if (t == Type.ARRAY)
      return at.getInnerType();
    return t;
  }
  
  /**
   * updates the type or the inner type of the array.
   * 
   * @param type
   *          - the type to update for UNSET types
   * @param structName
   *          - if the type to update is struct this is the struct type
   */
  public void updateInnerType(final Type type, final String structName) {
    if (t == Type.ARRAY)
      at.updateInnerType(type, structName);
    else
      t = type;
    if (t == Type.STRUCT)
      sn = structName;
  }
  
  /**
   * @return whether this type is var or not
   */
  public boolean isVar() {
    return iv;
  }
  
  /**
   * Change this type to be var type
   * 
   * @param isVar
   *          - true if this is type of variable
   */
  public void setVar(final boolean isVar) {
    iv = isVar;
  }
  
  @Override
  public String toString() {
    String res = new String();
    res += t;
    if (t == Type.STRUCT)
      res += "." + sn;
    if (t == Type.ARRAY)
      res += "<" + at + ">";
    return res;
  }
  
  @Override
  public boolean equals(final Object other) {
    if (other == null)
      return false;
    if (other == this)
      return true;
    if (getClass() != other.getClass())
      return false;
    // t checks
    if (t != ((FullType) other).getType())
      return false;
    // at checks
    if (at == null && ((FullType) other).getArrayType() != null)
      return false;
    if (at != null && ((FullType) other).getArrayType() == null)
      return false;
    if (at == null) {
      // continue
    } else if (!at.equals(((FullType) other).getArrayType()))
      return false;
    // sn checks
    if (sn == null && ((FullType) other).getStructName() != null)
      return false;
    if (sn != null && ((FullType) other).getStructName() == null)
      return false;
    if (sn == null) {
      // continue
    } else if (!sn.equals(((FullType) other).getStructName()))
      return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
