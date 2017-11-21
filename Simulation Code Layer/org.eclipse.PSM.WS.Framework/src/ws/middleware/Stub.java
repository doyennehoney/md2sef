/**
 */
package ws.middleware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ws.middleware.Stub#getImpl <em>Impl</em>}</li>
 * </ul>
 *
 * @see ws.middleware.MiddlewarePackage#getStub()
 * @model
 * @generated
 */
public interface Stub extends EObject {
	/**
	 * Returns the value of the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl</em>' reference.
	 * @see #setImpl(ServiceImpl)
	 * @see ws.middleware.MiddlewarePackage#getStub_Impl()
	 * @model required="true"
	 * @generated
	 */
	ServiceImpl getImpl();

	/**
	 * Sets the value of the '{@link ws.middleware.Stub#getImpl <em>Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl</em>' reference.
	 * @see #getImpl()
	 * @generated
	 */
	void setImpl(ServiceImpl value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receive();

} // Stub
