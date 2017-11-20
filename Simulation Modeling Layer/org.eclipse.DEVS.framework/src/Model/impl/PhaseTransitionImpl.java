/**
 */
package Model.impl;

import Model.DEVSPackage;
import Model.Phase;
import Model.PhaseTransition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model.impl.PhaseTransitionImpl#getSourcePhase <em>Source Phase</em>}</li>
 *   <li>{@link Model.impl.PhaseTransitionImpl#getTargetPhase <em>Target Phase</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PhaseTransitionImpl extends MinimalEObjectImpl.Container implements PhaseTransition {
	/**
	 * The cached value of the '{@link #getSourcePhase() <em>Source Phase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePhase()
	 * @generated
	 * @ordered
	 */
	protected Phase sourcePhase;

	/**
	 * The cached value of the '{@link #getTargetPhase() <em>Target Phase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPhase()
	 * @generated
	 * @ordered
	 */
	protected Phase targetPhase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DEVSPackage.Literals.PHASE_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase getSourcePhase() {
		if (sourcePhase != null && sourcePhase.eIsProxy()) {
			InternalEObject oldSourcePhase = (InternalEObject)sourcePhase;
			sourcePhase = (Phase)eResolveProxy(oldSourcePhase);
			if (sourcePhase != oldSourcePhase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DEVSPackage.PHASE_TRANSITION__SOURCE_PHASE, oldSourcePhase, sourcePhase));
			}
		}
		return sourcePhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase basicGetSourcePhase() {
		return sourcePhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePhase(Phase newSourcePhase) {
		Phase oldSourcePhase = sourcePhase;
		sourcePhase = newSourcePhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DEVSPackage.PHASE_TRANSITION__SOURCE_PHASE, oldSourcePhase, sourcePhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase getTargetPhase() {
		if (targetPhase != null && targetPhase.eIsProxy()) {
			InternalEObject oldTargetPhase = (InternalEObject)targetPhase;
			targetPhase = (Phase)eResolveProxy(oldTargetPhase);
			if (targetPhase != oldTargetPhase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DEVSPackage.PHASE_TRANSITION__TARGET_PHASE, oldTargetPhase, targetPhase));
			}
		}
		return targetPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase basicGetTargetPhase() {
		return targetPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPhase(Phase newTargetPhase) {
		Phase oldTargetPhase = targetPhase;
		targetPhase = newTargetPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DEVSPackage.PHASE_TRANSITION__TARGET_PHASE, oldTargetPhase, targetPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DEVSPackage.PHASE_TRANSITION__SOURCE_PHASE:
				if (resolve) return getSourcePhase();
				return basicGetSourcePhase();
			case DEVSPackage.PHASE_TRANSITION__TARGET_PHASE:
				if (resolve) return getTargetPhase();
				return basicGetTargetPhase();
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
			case DEVSPackage.PHASE_TRANSITION__SOURCE_PHASE:
				setSourcePhase((Phase)newValue);
				return;
			case DEVSPackage.PHASE_TRANSITION__TARGET_PHASE:
				setTargetPhase((Phase)newValue);
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
			case DEVSPackage.PHASE_TRANSITION__SOURCE_PHASE:
				setSourcePhase((Phase)null);
				return;
			case DEVSPackage.PHASE_TRANSITION__TARGET_PHASE:
				setTargetPhase((Phase)null);
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
			case DEVSPackage.PHASE_TRANSITION__SOURCE_PHASE:
				return sourcePhase != null;
			case DEVSPackage.PHASE_TRANSITION__TARGET_PHASE:
				return targetPhase != null;
		}
		return super.eIsSet(featureID);
	}

} //PhaseTransitionImpl
