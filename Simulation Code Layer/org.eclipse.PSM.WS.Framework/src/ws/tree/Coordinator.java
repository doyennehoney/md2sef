/**
 */
package ws.tree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ws.tree.Coordinator#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see ws.tree.TreePackage#getCoordinator()
 * @model
 * @generated
 */
public interface Coordinator extends BasicNode {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link ws.tree.BasicNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see ws.tree.TreePackage#getCoordinator_Children()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<BasicNode> getChildren();

} // Coordinator
