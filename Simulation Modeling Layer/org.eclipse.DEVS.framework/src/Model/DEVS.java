/**
 */
package Model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DEVS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model.DEVS#getName <em>Name</em>}</li>
 *   <li>{@link Model.DEVS#getContainer <em>Container</em>}</li>
 *   <li>{@link Model.DEVS#getIports <em>Iports</em>}</li>
 *   <li>{@link Model.DEVS#getOports <em>Oports</em>}</li>
 * </ul>
 *
 * @see Model.DEVSPackage#getDEVS()
 * @model abstract="true"
 * @generated
 */
public interface DEVS extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Model.DEVSPackage#getDEVS_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Model.DEVS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(DEVS)
	 * @see Model.DEVSPackage#getDEVS_Container()
	 * @model
	 * @generated
	 */
	DEVS getContainer();

	/**
	 * Sets the value of the '{@link Model.DEVS#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(DEVS value);

	/**
	 * Returns the value of the '<em><b>Iports</b></em>' containment reference list.
	 * The list contents are of type {@link Model.IPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iports</em>' containment reference list.
	 * @see Model.DEVSPackage#getDEVS_Iports()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<IPort> getIports();

	/**
	 * Returns the value of the '<em><b>Oports</b></em>' containment reference list.
	 * The list contents are of type {@link Model.OPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oports</em>' containment reference list.
	 * @see Model.DEVSPackage#getDEVS_Oports()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OPort> getOports();

} // DEVS
