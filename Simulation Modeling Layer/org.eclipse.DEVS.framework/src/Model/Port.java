/**
 */
package Model;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model.Port#getPortId <em>Port Id</em>}</li>
 *   <li>{@link Model.Port#getOwner <em>Owner</em>}</li>
 *   <li>{@link Model.Port#getPortType <em>Port Type</em>}</li>
 * </ul>
 *
 * @see Model.DEVSPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Id</em>' attribute.
	 * @see #setPortId(String)
	 * @see Model.DEVSPackage#getPort_PortId()
	 * @model required="true"
	 * @generated
	 */
	String getPortId();

	/**
	 * Sets the value of the '{@link Model.Port#getPortId <em>Port Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Id</em>' attribute.
	 * @see #getPortId()
	 * @generated
	 */
	void setPortId(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(DEVS)
	 * @see Model.DEVSPackage#getPort_Owner()
	 * @model required="true"
	 * @generated
	 */
	DEVS getOwner();

	/**
	 * Sets the value of the '{@link Model.Port#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(DEVS value);

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' reference.
	 * @see #setPortType(EClassifier)
	 * @see Model.DEVSPackage#getPort_PortType()
	 * @model required="true"
	 * @generated
	 */
	EClassifier getPortType();

	/**
	 * Sets the value of the '{@link Model.Port#getPortType <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' reference.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(EClassifier value);

} // Port
