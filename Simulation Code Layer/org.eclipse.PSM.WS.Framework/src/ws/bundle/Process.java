/**
 */
package ws.bundle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ws.middleware.Middleware;

import ws.tree.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ws.bundle.Process#getID <em>ID</em>}</li>
 *   <li>{@link ws.bundle.Process#getNodes <em>Nodes</em>}</li>
 *   <li>{@link ws.bundle.Process#getMiddleware <em>Middleware</em>}</li>
 * </ul>
 *
 * @see ws.bundle.BundlePackage#getProcess()
 * @model
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
	 * @see ws.bundle.BundlePackage#getProcess_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link ws.bundle.Process#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link ws.tree.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see ws.bundle.BundlePackage#getProcess_Nodes()
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
	 * @see ws.bundle.BundlePackage#getProcess_Middleware()
	 * @model required="true"
	 * @generated
	 */
	Middleware getMiddleware();

	/**
	 * Sets the value of the '{@link ws.bundle.Process#getMiddleware <em>Middleware</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middleware</em>' reference.
	 * @see #getMiddleware()
	 * @generated
	 */
	void setMiddleware(Middleware value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receive();

} // Process
