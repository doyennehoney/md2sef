/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model.PhaseTransition#getSourcePhase <em>Source Phase</em>}</li>
 *   <li>{@link Model.PhaseTransition#getTargetPhase <em>Target Phase</em>}</li>
 * </ul>
 *
 * @see Model.DEVSPackage#getPhaseTransition()
 * @model abstract="true"
 * @generated
 */
public interface PhaseTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Phase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Phase</em>' reference.
	 * @see #setSourcePhase(Phase)
	 * @see Model.DEVSPackage#getPhaseTransition_SourcePhase()
	 * @model required="true"
	 * @generated
	 */
	Phase getSourcePhase();

	/**
	 * Sets the value of the '{@link Model.PhaseTransition#getSourcePhase <em>Source Phase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Phase</em>' reference.
	 * @see #getSourcePhase()
	 * @generated
	 */
	void setSourcePhase(Phase value);

	/**
	 * Returns the value of the '<em><b>Target Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Phase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Phase</em>' reference.
	 * @see #setTargetPhase(Phase)
	 * @see Model.DEVSPackage#getPhaseTransition_TargetPhase()
	 * @model required="true"
	 * @generated
	 */
	Phase getTargetPhase();

	/**
	 * Sets the value of the '{@link Model.PhaseTransition#getTargetPhase <em>Target Phase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Phase</em>' reference.
	 * @see #getTargetPhase()
	 * @generated
	 */
	void setTargetPhase(Phase value);

} // PhaseTransition
