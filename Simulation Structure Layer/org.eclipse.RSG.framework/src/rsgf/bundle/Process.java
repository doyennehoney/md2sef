/**
 */
package rsgf.bundle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import rsgf.mw.Middleware;

import rsgf.tree.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rsgf.bundle.Process#getID <em>ID</em>}</li>
 *   <li>{@link rsgf.bundle.Process#getNodes <em>Nodes</em>}</li>
 *   <li>{@link rsgf.bundle.Process#getMiddleware <em>Middleware</em>}</li>
 * </ul>
 *
 * @see rsgf.bundle.BundlePackage#getProcess()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueProcessID UniqueNodes ProcessIsNotInBundle IDCanNotBeEmpty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueProcessID='self.ID\n\t\t\t\t->forAll(n | Process.allInstances().ID\n\t\t\t\t\t->count(n) = 1)' UniqueNodes='self.nodes\n\t\t\t\t->forAll(n | Process.allInstances().nodes\n\t\t\t\t\t->count(n) = 1)' ProcessIsNotInBundle='Bundle.allInstances().Process\n\t\t\t\t->includes(self)' IDCanNotBeEmpty='\n\t\t\t\tself.ID.size() > 0'"
 * @generated
 */
public interface Process extends EObject {
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
	 * @see rsgf.bundle.BundlePackage#getProcess_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link rsgf.bundle.Process#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link rsgf.tree.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see rsgf.bundle.BundlePackage#getProcess_Nodes()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Middleware</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middleware</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middleware</em>' reference.
	 * @see #setMiddleware(Middleware)
	 * @see rsgf.bundle.BundlePackage#getProcess_Middleware()
	 * @model required="true"
	 * @generated
	 */
	Middleware getMiddleware();

	/**
	 * Sets the value of the '{@link rsgf.bundle.Process#getMiddleware <em>Middleware</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middleware</em>' reference.
	 * @see #getMiddleware()
	 * @generated
	 */
	void setMiddleware(Middleware value);

} // Process
