/**
 */
package Model.impl;

import Model.DEVSPackage;
import Model.IC;
import Model.IPort;
import Model.OPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model.impl.ICImpl#getInfluencer <em>Influencer</em>}</li>
 *   <li>{@link Model.impl.ICImpl#getInfluencee <em>Influencee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ICImpl extends MinimalEObjectImpl.Container implements IC {
	/**
	 * The cached value of the '{@link #getInfluencer() <em>Influencer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluencer()
	 * @generated
	 * @ordered
	 */
	protected OPort influencer;

	/**
	 * The cached value of the '{@link #getInfluencee() <em>Influencee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluencee()
	 * @generated
	 * @ordered
	 */
	protected IPort influencee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ICImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DEVSPackage.Literals.IC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPort getInfluencer() {
		if (influencer != null && influencer.eIsProxy()) {
			InternalEObject oldInfluencer = (InternalEObject)influencer;
			influencer = (OPort)eResolveProxy(oldInfluencer);
			if (influencer != oldInfluencer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DEVSPackage.IC__INFLUENCER, oldInfluencer, influencer));
			}
		}
		return influencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPort basicGetInfluencer() {
		return influencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfluencer(OPort newInfluencer) {
		OPort oldInfluencer = influencer;
		influencer = newInfluencer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DEVSPackage.IC__INFLUENCER, oldInfluencer, influencer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPort getInfluencee() {
		if (influencee != null && influencee.eIsProxy()) {
			InternalEObject oldInfluencee = (InternalEObject)influencee;
			influencee = (IPort)eResolveProxy(oldInfluencee);
			if (influencee != oldInfluencee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DEVSPackage.IC__INFLUENCEE, oldInfluencee, influencee));
			}
		}
		return influencee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPort basicGetInfluencee() {
		return influencee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfluencee(IPort newInfluencee) {
		IPort oldInfluencee = influencee;
		influencee = newInfluencee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DEVSPackage.IC__INFLUENCEE, oldInfluencee, influencee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DEVSPackage.IC__INFLUENCER:
				if (resolve) return getInfluencer();
				return basicGetInfluencer();
			case DEVSPackage.IC__INFLUENCEE:
				if (resolve) return getInfluencee();
				return basicGetInfluencee();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DEVSPackage.IC__INFLUENCER:
				setInfluencer((OPort)newValue);
				return;
			case DEVSPackage.IC__INFLUENCEE:
				setInfluencee((IPort)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DEVSPackage.IC__INFLUENCER:
				setInfluencer((OPort)null);
				return;
			case DEVSPackage.IC__INFLUENCEE:
				setInfluencee((IPort)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DEVSPackage.IC__INFLUENCER:
				return influencer != null;
			case DEVSPackage.IC__INFLUENCEE:
				return influencee != null;
		}
		return super.eIsSet(featureID);
	}

} //ICImpl
