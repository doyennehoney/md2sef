/**
 */
package Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model.IntTransition#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see Model.DEVSPackage#getIntTransition()
 * @model
 * @generated
 */
public interface IntTransition extends PhaseTransition {
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
	 * @see Model.DEVSPackage#getIntTransition_Outputs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Event> getOutputs();

} // IntTransition
