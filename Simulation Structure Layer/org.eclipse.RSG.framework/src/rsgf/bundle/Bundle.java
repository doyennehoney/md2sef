/**
 */
package rsgf.bundle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import rsgf.skeleton.Skeleton;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rsgf.bundle.Bundle#getID <em>ID</em>}</li>
 *   <li>{@link rsgf.bundle.Bundle#getSkeleton <em>Skeleton</em>}</li>
 *   <li>{@link rsgf.bundle.Bundle#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see rsgf.bundle.BundlePackage#getBundle()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueBundleID AllRootsFromSkeletonAreNotInBundle AllRootsFromTreeAreNotInBundle AllCoordinatorsAreNotInBundle AllSimulatorsAreNotInBundle IDCanNotBeEmpty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueBundleID='self.ID\n\t\t\t\t->forAll(n | Bundle.allInstances().ID\n\t\t\t\t\t->count(n) = 1)' AllRootsFromSkeletonAreNotInBundle='self.Process.nodes\n\t\t\t\t->includesAll(self.skeleton.rootskel)' AllRootsFromTreeAreNotInBundle='self.Process.nodes\n\t\t\t\t->includes(self.skeleton.tree.Root)' AllCoordinatorsAreNotInBundle='self.Process.nodes\n\t\t\t\t->includesAll(self.skeleton.tree.Coordinator)' AllSimulatorsAreNotInBundle='self.Process.nodes\n\t\t\t\t->includesAll(self.skeleton.tree.Simulator)' IDCanNotBeEmpty='\n\t\t\t\tself.ID.size() > 0'"
 * @generated
 */
public interface Bundle extends EObject {
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
	 * @see rsgf.bundle.BundlePackage#getBundle_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link rsgf.bundle.Bundle#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Skeleton</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skeleton</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skeleton</em>' reference.
	 * @see #setSkeleton(Skeleton)
	 * @see rsgf.bundle.BundlePackage#getBundle_Skeleton()
	 * @model required="true"
	 * @generated
	 */
	Skeleton getSkeleton();

	/**
	 * Sets the value of the '{@link rsgf.bundle.Bundle#getSkeleton <em>Skeleton</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skeleton</em>' reference.
	 * @see #getSkeleton()
	 * @generated
	 */
	void setSkeleton(Skeleton value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link rsgf.bundle.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see rsgf.bundle.BundlePackage#getBundle_Process()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<rsgf.bundle.Process> getProcess();

} // Bundle
