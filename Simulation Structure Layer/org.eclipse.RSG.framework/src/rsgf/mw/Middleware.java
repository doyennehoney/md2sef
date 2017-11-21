/**
 */
package rsgf.mw;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import rsgf.vm.VM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Middleware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rsgf.mw.Middleware#getProcess <em>Process</em>}</li>
 *   <li>{@link rsgf.mw.Middleware#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @see rsgf.mw.MwPackage#getMiddleware()
 * @model
 * @generated
 */
public interface Middleware extends EObject {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference list.
	 * The list contents are of type {@link rsgf.bundle.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference list.
	 * @see rsgf.mw.MwPackage#getMiddleware_Process()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<rsgf.bundle.Process> getProcess();

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
	 * @see rsgf.mw.MwPackage#getMiddleware_Uses()
	 * @model
	 * @generated
	 */
	VM getUses();

	/**
	 * Sets the value of the '{@link rsgf.mw.Middleware#getUses <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(VM value);

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
