/**
 */
package Model.impl;

import Model.DEVSPackage;
import Model.Phase;
import Model.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model.impl.PhaseImpl#getPhaseID <em>Phase ID</em>}</li>
 *   <li>{@link Model.impl.PhaseImpl#getTimeAdvance <em>Time Advance</em>}</li>
 *   <li>{@link Model.impl.PhaseImpl#getPredicates <em>Predicates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseImpl extends MinimalEObjectImpl.Container implements Phase {
	/**
	 * The default value of the '{@link #getPhaseID() <em>Phase ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseID()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseID() <em>Phase ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseID()
	 * @generated
	 * @ordered
	 */
	protected String phaseID = PHASE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeAdvance() <em>Time Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAdvance()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_ADVANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeAdvance() <em>Time Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAdvance()
	 * @generated
	 * @ordered
	 */
	protected double timeAdvance = TIME_ADVANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> predicates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DEVSPackage.Literals.PHASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseID() {
		return phaseID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseID(String newPhaseID) {
		String oldPhaseID = phaseID;
		phaseID = newPhaseID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DEVSPackage.PHASE__PHASE_ID, oldPhaseID, phaseID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeAdvance() {
		return timeAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeAdvance(double newTimeAdvance) {
		double oldTimeAdvance = timeAdvance;
		timeAdvance = newTimeAdvance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DEVSPackage.PHASE__TIME_ADVANCE, oldTimeAdvance, timeAdvance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getPredicates() {
		if (predicates == null) {
			predicates = new EObjectResolvingEList<Variable>(Variable.class, this, DEVSPackage.PHASE__PREDICATES);
		}
		return predicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DEVSPackage.PHASE__PHASE_ID:
				return getPhaseID();
			case DEVSPackage.PHASE__TIME_ADVANCE:
				return getTimeAdvance();
			case DEVSPackage.PHASE__PREDICATES:
				return getPredicates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DEVSPackage.PHASE__PHASE_ID:
				setPhaseID((String)newValue);
				return;
			case DEVSPackage.PHASE__TIME_ADVANCE:
				setTimeAdvance((Double)newValue);
				return;
			case DEVSPackage.PHASE__PREDICATES:
				getPredicates().clear();
				getPredicates().addAll((Collection<? extends Variable>)newValue);
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
			case DEVSPackage.PHASE__PHASE_ID:
				setPhaseID(PHASE_ID_EDEFAULT);
				return;
			case DEVSPackage.PHASE__TIME_ADVANCE:
				setTimeAdvance(TIME_ADVANCE_EDEFAULT);
				return;
			case DEVSPackage.PHASE__PREDICATES:
				getPredicates().clear();
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
			case DEVSPackage.PHASE__PHASE_ID:
				return PHASE_ID_EDEFAULT == null ? phaseID != null : !PHASE_ID_EDEFAULT.equals(phaseID);
			case DEVSPackage.PHASE__TIME_ADVANCE:
				return timeAdvance != TIME_ADVANCE_EDEFAULT;
			case DEVSPackage.PHASE__PREDICATES:
				return predicates != null && !predicates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (phaseID: ");
		result.append(phaseID);
		result.append(", timeAdvance: ");
		result.append(timeAdvance);
		result.append(')');
		return result.toString();
	}

} //PhaseImpl
