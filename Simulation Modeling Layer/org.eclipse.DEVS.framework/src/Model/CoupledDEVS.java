/**
 */
package Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coupled DEVS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model.CoupledDEVS#getSubModels <em>Sub Models</em>}</li>
 *   <li>{@link Model.CoupledDEVS#getEics <em>Eics</em>}</li>
 *   <li>{@link Model.CoupledDEVS#getIcs <em>Ics</em>}</li>
 *   <li>{@link Model.CoupledDEVS#getEocs <em>Eocs</em>}</li>
 * </ul>
 *
 * @see Model.DEVSPackage#getCoupledDEVS()
 * @model
 * @generated
 */
public interface CoupledDEVS extends DEVS {
	/**
	 * Returns the value of the '<em><b>Sub Models</b></em>' containment reference list.
	 * The list contents are of type {@link Model.DEVS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Models</em>' containment reference list.
	 * @see Model.DEVSPackage#getCoupledDEVS_SubModels()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<DEVS> getSubModels();

	/**
	 * Returns the value of the '<em><b>Eics</b></em>' containment reference list.
	 * The list contents are of type {@link Model.EIC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eics</em>' containment reference list.
	 * @see Model.DEVSPackage#getCoupledDEVS_Eics()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EIC> getEics();

	/**
	 * Returns the value of the '<em><b>Ics</b></em>' containment reference list.
	 * The list contents are of type {@link Model.IC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ics</em>' containment reference list.
	 * @see Model.DEVSPackage#getCoupledDEVS_Ics()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<IC> getIcs();

	/**
	 * Returns the value of the '<em><b>Eocs</b></em>' containment reference list.
	 * The list contents are of type {@link Model.EOC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eocs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eocs</em>' containment reference list.
	 * @see Model.DEVSPackage#getCoupledDEVS_Eocs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EOC> getEocs();

} // CoupledDEVS
