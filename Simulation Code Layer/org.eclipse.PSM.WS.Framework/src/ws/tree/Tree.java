/**
 */
package ws.tree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ws.tree.Tree#getID <em>ID</em>}</li>
 *   <li>{@link ws.tree.Tree#getRoot <em>Root</em>}</li>
 *   <li>{@link ws.tree.Tree#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link ws.tree.Tree#getSimulator <em>Simulator</em>}</li>
 * </ul>
 *
 * @see ws.tree.TreePackage#getTree()
 * @model
 * @generated
 */
public interface Tree extends EObject {
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
	 * @see ws.tree.TreePackage#getTree_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link ws.tree.Tree#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Root)
	 * @see ws.tree.TreePackage#getTree_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Root getRoot();

	/**
	 * Sets the value of the '{@link ws.tree.Tree#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Root value);

	/**
	 * Returns the value of the '<em><b>Coordinator</b></em>' containment reference list.
	 * The list contents are of type {@link ws.tree.Coordinator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinator</em>' containment reference list.
	 * @see ws.tree.TreePackage#getTree_Coordinator()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Coordinator> getCoordinator();

	/**
	 * Returns the value of the '<em><b>Simulator</b></em>' containment reference list.
	 * The list contents are of type {@link ws.tree.Simulator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulator</em>' containment reference list.
	 * @see ws.tree.TreePackage#getTree_Simulator()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Simulator> getSimulator();

} // Tree
