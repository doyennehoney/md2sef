/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Model.EOC#getInfluencer <em>Influencer</em>}</li>
 *   <li>{@link Model.EOC#getInfluencee <em>Influencee</em>}</li>
 * </ul>
 *
 * @see Model.DEVSPackage#getEOC()
 * @model
 * @generated
 */
public interface EOC extends EObject {
	/**
	 * Returns the value of the '<em><b>Influencer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Influencer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Influencer</em>' reference.
	 * @see #setInfluencer(OPort)
	 * @see Model.DEVSPackage#getEOC_Influencer()
	 * @model
	 * @generated
	 */
	OPort getInfluencer();

	/**
	 * Sets the value of the '{@link Model.EOC#getInfluencer <em>Influencer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Influencer</em>' reference.
	 * @see #getInfluencer()
	 * @generated
	 */
	void setInfluencer(OPort value);

	/**
	 * Returns the value of the '<em><b>Influencee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Influencee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Influencee</em>' reference.
	 * @see #setInfluencee(OPort)
	 * @see Model.DEVSPackage#getEOC_Influencee()
	 * @model
	 * @generated
	 */
	OPort getInfluencee();

	/**
	 * Sets the value of the '{@link Model.EOC#getInfluencee <em>Influencee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Influencee</em>' reference.
	 * @see #getInfluencee()
	 * @generated
	 */
	void setInfluencee(OPort value);

} // EOC
