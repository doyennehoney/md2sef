/**
 */
package Model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model.Phase#getPhaseID <em>Phase ID</em>}</li>
 *   <li>{@link Model.Phase#getTimeAdvance <em>Time Advance</em>}</li>
 *   <li>{@link Model.Phase#getPredicates <em>Predicates</em>}</li>
 * </ul>
 *
 * @see Model.DEVSPackage#getPhase()
 * @model
 * @generated
 */
public interface Phase extends EObject {
	/**
	 * Returns the value of the '<em><b>Phase ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase ID</em>' attribute.
	 * @see #setPhaseID(String)
	 * @see Model.DEVSPackage#getPhase_PhaseID()
	 * @model required="true"
	 * @generated
	 */
	String getPhaseID();

	/**
	 * Sets the value of the '{@link Model.Phase#getPhaseID <em>Phase ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase ID</em>' attribute.
	 * @see #getPhaseID()
	 * @generated
	 */
	void setPhaseID(String value);

	/**
	 * Returns the value of the '<em><b>Time Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Advance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Advance</em>' attribute.
	 * @see #setTimeAdvance(double)
	 * @see Model.DEVSPackage#getPhase_TimeAdvance()
	 * @model required="true"
	 * @generated
	 */
	double getTimeAdvance();

	/**
	 * Sets the value of the '{@link Model.Phase#getTimeAdvance <em>Time Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Advance</em>' attribute.
	 * @see #getTimeAdvance()
	 * @generated
	 */
	void setTimeAdvance(double value);

	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' reference list.
	 * The list contents are of type {@link Model.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' reference list.
	 * @see Model.DEVSPackage#getPhase_Predicates()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Variable> getPredicates();

} // Phase
