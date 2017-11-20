/**
 */
package Model.impl;

import Model.CoupledDEVS;
import Model.DEVS;
import Model.DEVSPackage;
import Model.EIC;
import Model.EOC;
import Model.IC;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coupled DEVS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model.impl.CoupledDEVSImpl#getSubModels <em>Sub Models</em>}</li>
 *   <li>{@link Model.impl.CoupledDEVSImpl#getEics <em>Eics</em>}</li>
 *   <li>{@link Model.impl.CoupledDEVSImpl#getIcs <em>Ics</em>}</li>
 *   <li>{@link Model.impl.CoupledDEVSImpl#getEocs <em>Eocs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoupledDEVSImpl extends DEVSImpl implements CoupledDEVS {
	/**
	 * The cached value of the '{@link #getSubModels() <em>Sub Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModels()
	 * @generated
	 * @ordered
	 */
	protected EList<DEVS> subModels;

	/**
	 * The cached value of the '{@link #getEics() <em>Eics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEics()
	 * @generated
	 * @ordered
	 */
	protected EList<EIC> eics;

	/**
	 * The cached value of the '{@link #getIcs() <em>Ics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcs()
	 * @generated
	 * @ordered
	 */
	protected EList<IC> ics;

	/**
	 * The cached value of the '{@link #getEocs() <em>Eocs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEocs()
	 * @generated
	 * @ordered
	 */
	protected EList<EOC> eocs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoupledDEVSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DEVSPackage.Literals.COUPLED_DEVS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DEVS> getSubModels() {
		if (subModels == null) {
			subModels = new EObjectContainmentEList<DEVS>(DEVS.class, this, DEVSPackage.COUPLED_DEVS__SUB_MODELS);
		}
		return subModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EIC> getEics() {
		if (eics == null) {
			eics = new EObjectContainmentEList<EIC>(EIC.class, this, DEVSPackage.COUPLED_DEVS__EICS);
		}
		return eics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IC> getIcs() {
		if (ics == null) {
			ics = new EObjectContainmentEList<IC>(IC.class, this, DEVSPackage.COUPLED_DEVS__ICS);
		}
		return ics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EOC> getEocs() {
		if (eocs == null) {
			eocs = new EObjectContainmentEList<EOC>(EOC.class, this, DEVSPackage.COUPLED_DEVS__EOCS);
		}
		return eocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DEVSPackage.COUPLED_DEVS__SUB_MODELS:
				return ((InternalEList<?>)getSubModels()).basicRemove(otherEnd, msgs);
			case DEVSPackage.COUPLED_DEVS__EICS:
				return ((InternalEList<?>)getEics()).basicRemove(otherEnd, msgs);
			case DEVSPackage.COUPLED_DEVS__ICS:
				return ((InternalEList<?>)getIcs()).basicRemove(otherEnd, msgs);
			case DEVSPackage.COUPLED_DEVS__EOCS:
				return ((InternalEList<?>)getEocs()).basicRemove(otherEnd, msgs);
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
			case DEVSPackage.COUPLED_DEVS__SUB_MODELS:
				return getSubModels();
			case DEVSPackage.COUPLED_DEVS__EICS:
				return getEics();
			case DEVSPackage.COUPLED_DEVS__ICS:
				return getIcs();
			case DEVSPackage.COUPLED_DEVS__EOCS:
				return getEocs();
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
			case DEVSPackage.COUPLED_DEVS__SUB_MODELS:
				getSubModels().clear();
				getSubModels().addAll((Collection<? extends DEVS>)newValue);
				return;
			case DEVSPackage.COUPLED_DEVS__EICS:
				getEics().clear();
				getEics().addAll((Collection<? extends EIC>)newValue);
				return;
			case DEVSPackage.COUPLED_DEVS__ICS:
				getIcs().clear();
				getIcs().addAll((Collection<? extends IC>)newValue);
				return;
			case DEVSPackage.COUPLED_DEVS__EOCS:
				getEocs().clear();
				getEocs().addAll((Collection<? extends EOC>)newValue);
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
			case DEVSPackage.COUPLED_DEVS__SUB_MODELS:
				getSubModels().clear();
				return;
			case DEVSPackage.COUPLED_DEVS__EICS:
				getEics().clear();
				return;
			case DEVSPackage.COUPLED_DEVS__ICS:
				getIcs().clear();
				return;
			case DEVSPackage.COUPLED_DEVS__EOCS:
				getEocs().clear();
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
			case DEVSPackage.COUPLED_DEVS__SUB_MODELS:
				return subModels != null && !subModels.isEmpty();
			case DEVSPackage.COUPLED_DEVS__EICS:
				return eics != null && !eics.isEmpty();
			case DEVSPackage.COUPLED_DEVS__ICS:
				return ics != null && !ics.isEmpty();
			case DEVSPackage.COUPLED_DEVS__EOCS:
				return eocs != null && !eocs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoupledDEVSImpl
