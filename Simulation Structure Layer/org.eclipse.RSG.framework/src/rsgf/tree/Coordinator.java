/**
 */
package rsgf.tree;

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
 *   <li>{@link rsgf.tree.Coordinator#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see rsgf.tree.TreePackage#getCoordinator()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueChildren ChildrenCantIncludeSelf CantOccurAsChildOfRootAndCoordinator'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueChildren='self.children\n\t\t\t\t->forAll(n | Coordinator.allInstances().children\n\t\t\t\t\t->count(n) = 1)' ChildrenCantIncludeSelf='self.children\n\t\t\t\t->excludes(self)' CantOccurAsChildOfRootAndCoordinator='not (Coordinator.allInstances().children\n\t\t\t\t->includes(self) and Root.allInstances().child\n\t\t\t\t->includes(self))'"
 * @generated
 */
public interface Coordinator extends BasicNode {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link rsgf.tree.BasicNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see rsgf.tree.TreePackage#getCoordinator_Children()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<BasicNode> getChildren();

} // Coordinator
