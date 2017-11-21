/**
 */
package rsgf.tree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rsgf.tree.Root#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see rsgf.tree.TreePackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends Node {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(BasicNode)
	 * @see rsgf.tree.TreePackage#getRoot_Child()
	 * @model required="true"
	 * @generated
	 */
	BasicNode getChild();

	/**
	 * Sets the value of the '{@link rsgf.tree.Root#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(BasicNode value);

} // Root
