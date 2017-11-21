/**
 */
package rsgf.tree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rsgf.tree.Node#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see rsgf.tree.TreePackage#getNode()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueID IDCanNotBeEmpty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueID='self.ID\n\t\t\t\t->forAll(n | Node.allInstances().ID\n\t\t\t\t\t->count(n) = 1)' IDCanNotBeEmpty='\n\t\t\t\tself.ID.size() > 0'"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see rsgf.tree.TreePackage#getNode_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link rsgf.tree.Node#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // Node
