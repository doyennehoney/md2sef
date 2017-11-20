/**
 */
package Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ext Trans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model.ExtTrans#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see Model.DEVSPackage#getExtTrans()
 * @model
 * @generated
 */
public interface ExtTrans extends PhaseTransition {
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
	 * @see Model.DEVSPackage#getExtTrans_Inputs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Event> getInputs();

} // ExtTrans
