/**
 */
package rsgf.skeleton;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import rsgf.tree.Root;
import rsgf.tree.Tree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skeleton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rsgf.skeleton.Skeleton#getID <em>ID</em>}</li>
 *   <li>{@link rsgf.skeleton.Skeleton#getTree <em>Tree</em>}</li>
 *   <li>{@link rsgf.skeleton.Skeleton#getRootskel <em>Rootskel</em>}</li>
 * </ul>
 *
 * @see rsgf.skeleton.SkeletonPackage#getSkeleton()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueID IDCanNotBeEmpty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueID='self.ID\n\t\t\t\t->forAll(n | Skeleton.allInstances().ID\n\t\t\t\t\t->count(n) = 1)' IDCanNotBeEmpty='\n\t\t\t\tself.ID.size() > 0'"
 * @generated
 */
public interface Skeleton extends EObject {
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
	 * @see rsgf.skeleton.SkeletonPackage#getSkeleton_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link rsgf.skeleton.Skeleton#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Tree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree</em>' reference.
	 * @see #setTree(Tree)
	 * @see rsgf.skeleton.SkeletonPackage#getSkeleton_Tree()
	 * @model
	 * @generated
	 */
	Tree getTree();

	/**
	 * Sets the value of the '{@link rsgf.skeleton.Skeleton#getTree <em>Tree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree</em>' reference.
	 * @see #getTree()
	 * @generated
	 */
	void setTree(Tree value);

	/**
	 * Returns the value of the '<em><b>Rootskel</b></em>' containment reference list.
	 * The list contents are of type {@link rsgf.tree.Root}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rootskel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rootskel</em>' containment reference list.
	 * @see rsgf.skeleton.SkeletonPackage#getSkeleton_Rootskel()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Root> getRootskel();

} // Skeleton
