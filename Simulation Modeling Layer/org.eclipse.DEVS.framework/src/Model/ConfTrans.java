/**
 */
package Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conf Trans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model.ConfTrans#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link Model.ConfTrans#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see Model.DEVSPackage#getConfTrans()
 * @model
 * @generated
 */
public interface ConfTrans extends PhaseTransition {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link Model.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see Model.DEVSPackage#getConfTrans_Outputs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Event> getOutputs();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link Model.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see Model.DEVSPackage#getConfTrans_Inputs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Event> getInputs();

} // ConfTrans
