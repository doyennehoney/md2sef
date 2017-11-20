/**
 */
package Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic DEVS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model.AtomicDEVS#getDeltaInt <em>Delta Int</em>}</li>
 *   <li>{@link Model.AtomicDEVS#getDeltaConf <em>Delta Conf</em>}</li>
 *   <li>{@link Model.AtomicDEVS#getDeltaExt <em>Delta Ext</em>}</li>
 *   <li>{@link Model.AtomicDEVS#getPhases <em>Phases</em>}</li>
 *   <li>{@link Model.AtomicDEVS#getStateVars <em>State Vars</em>}</li>
 * </ul>
 *
 * @see Model.DEVSPackage#getAtomicDEVS()
 * @model
 * @generated
 */
public interface AtomicDEVS extends DEVS {
	/**
	 * Returns the value of the '<em><b>Delta Int</b></em>' containment reference list.
	 * The list contents are of type {@link Model.IntTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta Int</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta Int</em>' containment reference list.
	 * @see Model.DEVSPackage#getAtomicDEVS_DeltaInt()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<IntTransition> getDeltaInt();

	/**
	 * Returns the value of the '<em><b>Delta Conf</b></em>' containment reference list.
	 * The list contents are of type {@link Model.ConfTrans}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta Conf</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta Conf</em>' containment reference list.
	 * @see Model.DEVSPackage#getAtomicDEVS_DeltaConf()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ConfTrans> getDeltaConf();

	/**
	 * Returns the value of the '<em><b>Delta Ext</b></em>' containment reference list.
	 * The list contents are of type {@link Model.ExtTrans}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta Ext</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta Ext</em>' containment reference list.
	 * @see Model.DEVSPackage#getAtomicDEVS_DeltaExt()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExtTrans> getDeltaExt();

	/**
	 * Returns the value of the '<em><b>Phases</b></em>' containment reference list.
	 * The list contents are of type {@link Model.Phase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' containment reference list.
	 * @see Model.DEVSPackage#getAtomicDEVS_Phases()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Phase> getPhases();

	/**
	 * Returns the value of the '<em><b>State Vars</b></em>' containment reference list.
	 * The list contents are of type {@link Model.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Vars</em>' containment reference list.
	 * @see Model.DEVSPackage#getAtomicDEVS_StateVars()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Variable> getStateVars();

} // AtomicDEVS
