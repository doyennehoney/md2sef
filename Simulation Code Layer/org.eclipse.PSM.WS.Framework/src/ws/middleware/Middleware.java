/**
 */
package ws.middleware;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Middleware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ws.middleware.Middleware#getUses <em>Uses</em>}</li>
 *   <li>{@link ws.middleware.Middleware#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see ws.middleware.MiddlewarePackage#getMiddleware()
 * @model abstract="true"
 * @generated
 */
public interface Middleware extends EObject {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference.
	 * @see #setUses(VM)
	 * @see ws.middleware.MiddlewarePackage#getMiddleware_Uses()
	 * @model
	 * @generated
	 */
	VM getUses();

	/**
	 * Sets the value of the '{@link ws.middleware.Middleware#getUses <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(VM value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference list.
	 * The list contents are of type {@link ws.bundle.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference list.
	 * @see ws.middleware.MiddlewarePackage#getMiddleware_Process()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ws.bundle.Process> getProcess();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bind();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void establish();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void send();

} // Middleware
