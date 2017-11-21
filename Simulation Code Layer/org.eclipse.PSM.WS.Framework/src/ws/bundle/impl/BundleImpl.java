/**
 */
package ws.bundle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ws.bundle.Bundle;
import ws.bundle.BundlePackage;

import ws.skeleton.Skeleton;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ws.bundle.impl.BundleImpl#getID <em>ID</em>}</li>
 *   <li>{@link ws.bundle.impl.BundleImpl#getSkeleton <em>Skeleton</em>}</li>
 *   <li>{@link ws.bundle.impl.BundleImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BundleImpl extends MinimalEObjectImpl.Container implements Bundle {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSkeleton() <em>Skeleton</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkeleton()
	 * @generated
	 * @ordered
	 */
	protected Skeleton skeleton;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<ws.bundle.Process> process;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BundlePackage.Literals.BUNDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skeleton getSkeleton() {
		if (skeleton != null && skeleton.eIsProxy()) {
			InternalEObject oldSkeleton = (InternalEObject)skeleton;
			skeleton = (Skeleton)eResolveProxy(oldSkeleton);
			if (skeleton != oldSkeleton) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BundlePackage.BUNDLE__SKELETON, oldSkeleton, skeleton));
			}
		}
		return skeleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skeleton basicGetSkeleton() {
		return skeleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkeleton(Skeleton newSkeleton) {
		Skeleton oldSkeleton = skeleton;
		skeleton = newSkeleton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BundlePackage.BUNDLE__SKELETON, oldSkeleton, skeleton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ws.bundle.Process> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<ws.bundle.Process>(ws.bundle.Process.class, this, BundlePackage.BUNDLE__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BundlePackage.BUNDLE__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
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
			case BundlePackage.BUNDLE__ID:
				return getID();
			case BundlePackage.BUNDLE__SKELETON:
				if (resolve) return getSkeleton();
				return basicGetSkeleton();
			case BundlePackage.BUNDLE__PROCESS:
				return getProcess();
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
			case BundlePackage.BUNDLE__ID:
				setID((String)newValue);
				return;
			case BundlePackage.BUNDLE__SKELETON:
				setSkeleton((Skeleton)newValue);
				return;
			case BundlePackage.BUNDLE__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends ws.bundle.Process>)newValue);
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
			case BundlePackage.BUNDLE__ID:
				setID(ID_EDEFAULT);
				return;
			case BundlePackage.BUNDLE__SKELETON:
				setSkeleton((Skeleton)null);
				return;
			case BundlePackage.BUNDLE__PROCESS:
				getProcess().clear();
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
			case BundlePackage.BUNDLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BundlePackage.BUNDLE__SKELETON:
				return skeleton != null;
			case BundlePackage.BUNDLE__PROCESS:
				return process != null && !process.isEmpty();
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //BundleImpl
