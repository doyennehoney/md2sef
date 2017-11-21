/**
 */
package ws.middleware;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ws.middleware.WebService#getStubs <em>Stubs</em>}</li>
 *   <li>{@link ws.middleware.WebService#getRegistry <em>Registry</em>}</li>
 * </ul>
 *
 * @see ws.middleware.MiddlewarePackage#getWebService()
 * @model
 * @generated
 */
public interface WebService extends Middleware {
	/**
	 * Returns the value of the '<em><b>Stubs</b></em>' containment reference list.
	 * The list contents are of type {@link ws.middleware.Stub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stubs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stubs</em>' containment reference list.
	 * @see ws.middleware.MiddlewarePackage#getWebService_Stubs()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Stub> getStubs();

	/**
	 * Returns the value of the '<em><b>Registry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry</em>' reference.
	 * @see #setRegistry(Repository)
	 * @see ws.middleware.MiddlewarePackage#getWebService_Registry()
	 * @model required="true"
	 * @generated
	 */
	Repository getRegistry();

	/**
	 * Sets the value of the '{@link ws.middleware.WebService#getRegistry <em>Registry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry</em>' reference.
	 * @see #getRegistry()
	 * @generated
	 */
	void setRegistry(Repository value);

} // WebService
