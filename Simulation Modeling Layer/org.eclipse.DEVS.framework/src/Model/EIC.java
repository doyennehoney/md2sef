/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EIC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model.EIC#getInfluencer <em>Influencer</em>}</li>
 *   <li>{@link Model.EIC#getInfluencee <em>Influencee</em>}</li>
 * </ul>
 *
 * @see Model.DEVSPackage#getEIC()
 * @model
 * @generated
 */
public interface EIC extends EObject {
	/**
	 * Returns the value of the '<em><b>Influencer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Influencer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Influencer</em>' reference.
	 * @see #setInfluencer(IPort)
	 * @see Model.DEVSPackage#getEIC_Influencer()
	 * @model required="true"
	 * @generated
	 */
	IPort getInfluencer();

	/**
	 * Sets the value of the '{@link Model.EIC#getInfluencer <em>Influencer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Influencer</em>' reference.
	 * @see #getInfluencer()
	 * @generated
	 */
	void setInfluencer(IPort value);

	/**
	 * Returns the value of the '<em><b>Influencee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Influencee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Influencee</em>' reference.
	 * @see #setInfluencee(IPort)
	 * @see Model.DEVSPackage#getEIC_Influencee()
	 * @model required="true"
	 * @generated
	 */
	IPort getInfluencee();

	/**
	 * Sets the value of the '{@link Model.EIC#getInfluencee <em>Influencee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Influencee</em>' reference.
	 * @see #getInfluencee()
	 * @generated
	 */
	void setInfluencee(IPort value);

} // EIC
