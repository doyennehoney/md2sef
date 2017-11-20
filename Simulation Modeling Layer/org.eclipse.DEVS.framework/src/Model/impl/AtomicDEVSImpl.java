/**
 */
package Model.impl;

import Model.AtomicDEVS;
import Model.ConfTrans;
import Model.DEVSPackage;
import Model.ExtTrans;
import Model.IntTransition;
import Model.Phase;
import Model.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic DEVS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model.impl.AtomicDEVSImpl#getDeltaInt <em>Delta Int</em>}</li>
 *   <li>{@link Model.impl.AtomicDEVSImpl#getDeltaConf <em>Delta Conf</em>}</li>
 *   <li>{@link Model.impl.AtomicDEVSImpl#getDeltaExt <em>Delta Ext</em>}</li>
 *   <li>{@link Model.impl.AtomicDEVSImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link Model.impl.AtomicDEVSImpl#getStateVars <em>State Vars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicDEVSImpl extends DEVSImpl implements AtomicDEVS {
	/**
	 * The cached value of the '{@link #getDeltaInt() <em>Delta Int</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaInt()
	 * @generated
	 * @ordered
	 */
	protected EList<IntTransition> deltaInt;

	/**
	 * The cached value of the '{@link #getDeltaConf() <em>Delta Conf</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaConf()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfTrans> deltaConf;

	/**
	 * The cached value of the '{@link #getDeltaExt() <em>Delta Ext</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaExt()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtTrans> deltaExt;

	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected EList<Phase> phases;

	/**
	 * The cached value of the '{@link #getStateVars() <em>State Vars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateVars()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> stateVars;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicDEVSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DEVSPackage.Literals.ATOMIC_DEVS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntTransition> getDeltaInt() {
		if (deltaInt == null) {
			deltaInt = new EObjectContainmentEList<IntTransition>(IntTransition.class, this, DEVSPackage.ATOMIC_DEVS__DELTA_INT);
		}
		return deltaInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfTrans> getDeltaConf() {
		if (deltaConf == null) {
			deltaConf = new EObjectContainmentEList<ConfTrans>(ConfTrans.class, this, DEVSPackage.ATOMIC_DEVS__DELTA_CONF);
		}
		return deltaConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtTrans> getDeltaExt() {
		if (deltaExt == null) {
			deltaExt = new EObjectContainmentEList<ExtTrans>(ExtTrans.class, this, DEVSPackage.ATOMIC_DEVS__DELTA_EXT);
		}
		return deltaExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phase> getPhases() {
		if (phases == null) {
			phases = new EObjectContainmentEList<Phase>(Phase.class, this, DEVSPackage.ATOMIC_DEVS__PHASES);
		}
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getStateVars() {
		if (stateVars == null) {
			stateVars = new EObjectContainmentEList<Variable>(Variable.class, this, DEVSPackage.ATOMIC_DEVS__STATE_VARS);
		}
		return stateVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DEVSPackage.ATOMIC_DEVS__DELTA_INT:
				return ((InternalEList<?>)getDeltaInt()).basicRemove(otherEnd, msgs);
			case DEVSPackage.ATOMIC_DEVS__DELTA_CONF:
				return ((InternalEList<?>)getDeltaConf()).basicRemove(otherEnd, msgs);
			case DEVSPackage.ATOMIC_DEVS__DELTA_EXT:
				return ((InternalEList<?>)getDeltaExt()).basicRemove(otherEnd, msgs);
			case DEVSPackage.ATOMIC_DEVS__PHASES:
				return ((InternalEList<?>)getPhases()).basicRemove(otherEnd, msgs);
			case DEVSPackage.ATOMIC_DEVS__STATE_VARS:
				return ((InternalEList<?>)getStateVars()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DEVSPackage.ATOMIC_DEVS__DELTA_INT:
				return getDeltaInt();
			case DEVSPackage.ATOMIC_DEVS__DELTA_CONF:
				return getDeltaConf();
			case DEVSPackage.ATOMIC_DEVS__DELTA_EXT:
				return getDeltaExt();
			case DEVSPackage.ATOMIC_DEVS__PHASES:
				return getPhases();
			case DEVSPackage.ATOMIC_DEVS__STATE_VARS:
				return getStateVars();
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
			case DEVSPackage.ATOMIC_DEVS__DELTA_INT:
				getDeltaInt().clear();
				getDeltaInt().addAll((Collection<? extends IntTransition>)newValue);
				return;
			case DEVSPackage.ATOMIC_DEVS__DELTA_CONF:
				getDeltaConf().clear();
				getDeltaConf().addAll((Collection<? extends ConfTrans>)newValue);
				return;
			case DEVSPackage.ATOMIC_DEVS__DELTA_EXT:
				getDeltaExt().clear();
				getDeltaExt().addAll((Collection<? extends ExtTrans>)newValue);
				return;
			case DEVSPackage.ATOMIC_DEVS__PHASES:
				getPhases().clear();
				getPhases().addAll((Collection<? extends Phase>)newValue);
				return;
			case DEVSPackage.ATOMIC_DEVS__STATE_VARS:
				getStateVars().clear();
				getStateVars().addAll((Collection<? extends Variable>)newValue);
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
			case DEVSPackage.ATOMIC_DEVS__DELTA_INT:
				getDeltaInt().clear();
				return;
			case DEVSPackage.ATOMIC_DEVS__DELTA_CONF:
				getDeltaConf().clear();
				return;
			case DEVSPackage.ATOMIC_DEVS__DELTA_EXT:
				getDeltaExt().clear();
				return;
			case DEVSPackage.ATOMIC_DEVS__PHASES:
				getPhases().clear();
				return;
			case DEVSPackage.ATOMIC_DEVS__STATE_VARS:
				getStateVars().clear();
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
			case DEVSPackage.ATOMIC_DEVS__DELTA_INT:
				return deltaInt != null && !deltaInt.isEmpty();
			case DEVSPackage.ATOMIC_DEVS__DELTA_CONF:
				return deltaConf != null && !deltaConf.isEmpty();
			case DEVSPackage.ATOMIC_DEVS__DELTA_EXT:
				return deltaExt != null && !deltaExt.isEmpty();
			case DEVSPackage.ATOMIC_DEVS__PHASES:
				return phases != null && !phases.isEmpty();
			case DEVSPackage.ATOMIC_DEVS__STATE_VARS:
				return stateVars != null && !stateVars.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AtomicDEVSImpl
