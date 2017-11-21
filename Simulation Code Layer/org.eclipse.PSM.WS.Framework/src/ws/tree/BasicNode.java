/**
 */
package ws.tree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ws.tree.BasicNode#getModelName <em>Model Name</em>}</li>
 * </ul>
 *
 * @see ws.tree.TreePackage#getBasicNode()
 * @model abstract="true"
 * @generated
 */
public interface BasicNode extends Node {
	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see ws.tree.TreePackage#getBasicNode_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link ws.tree.BasicNode#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

} // BasicNode
