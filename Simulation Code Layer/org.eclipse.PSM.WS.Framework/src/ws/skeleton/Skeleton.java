/**
 */
package ws.skeleton;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ws.tree.Root;
import ws.tree.Tree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skeleton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ws.skeleton.Skeleton#getID <em>ID</em>}</li>
 *   <li>{@link ws.skeleton.Skeleton#getTree <em>Tree</em>}</li>
 *   <li>{@link ws.skeleton.Skeleton#getRootskel <em>Rootskel</em>}</li>
 * </ul>
 *
 * @see ws.skeleton.SkeletonPackage#getSkeleton()
 * @model
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
	 * @see ws.skeleton.SkeletonPackage#getSkeleton_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link ws.skeleton.Skeleton#getID <em>ID</em>}' attribute.
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
	 * @see ws.skeleton.SkeletonPackage#getSkeleton_Tree()
	 * @model
	 * @generated
	 */
	Tree getTree();

	/**
	 * Sets the value of the '{@link ws.skeleton.Skeleton#getTree <em>Tree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree</em>' reference.
	 * @see #getTree()
	 * @generated
	 */
	void setTree(Tree value);

	/**
	 * Returns the value of the '<em><b>Rootskel</b></em>' containment reference list.
	 * The list contents are of type {@link ws.tree.Root}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rootskel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rootskel</em>' containment reference list.
	 * @see ws.skeleton.SkeletonPackage#getSkeleton_Rootskel()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Root> getRootskel();

} // Skeleton
