/**
 */
package rsgf.tree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rsgf.tree.BasicNode#getModelName <em>Model Name</em>}</li>
 * </ul>
 *
 * @see rsgf.tree.TreePackage#getBasicNode()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustBeAChild'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MustBeAChild='Coordinator.allInstances().children\n\t\t\t\t->includes(self) or Root.allInstances().child\n\t\t\t\t->includes(self)'"
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
	 * @see rsgf.tree.TreePackage#getBasicNode_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link rsgf.tree.BasicNode#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

} // BasicNode
