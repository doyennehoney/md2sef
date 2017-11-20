/**
 */
package Model.impl;

import Model.DEVS;
import Model.DEVSPackage;
import Model.IPort;
import Model.OPort;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEVS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model.impl.DEVSImpl#getName <em>Name</em>}</li>
 *   <li>{@link Model.impl.DEVSImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link Model.impl.DEVSImpl#getIports <em>Iports</em>}</li>
 *   <li>{@link Model.impl.DEVSImpl#getOports <em>Oports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DEVSImpl extends MinimalEObjectImpl.Container implements DEVS {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected DEVS container;

	/**
	 * The cached value of the '{@link #getIports() <em>Iports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIports()
	 * @generated
	 * @ordered
	 */
	protected EList<IPort> iports;

	/**
	 * The cached value of the '{@link #getOports() <em>Oports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOports()
	 * @generated
	 * @ordered
	 */
	protected EList<OPort> oports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEVSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DEVSPackage.Literals.DEVS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DEVSPackage.DEVS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEVS getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (DEVS)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DEVSPackage.DEVS__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEVS basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(DEVS newContainer) {
		DEVS oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DEVSPackage.DEVS__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPort> getIports() {
		if (iports == null) {
			iports = new EObjectContainmentEList<IPort>(IPort.class, this, DEVSPackage.DEVS__IPORTS);
		}
		return iports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPort> getOports() {
		if (oports == null) {
			oports = new EObjectContainmentEList<OPort>(OPort.class, this, DEVSPackage.DEVS__OPORTS);
		}
		return oports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DEVSPackage.DEVS__IPORTS:
				return ((InternalEList<?>)getIports()).basicRemove(otherEnd, msgs);
			case DEVSPackage.DEVS__OPORTS:
				return ((InternalEList<?>)getOports()).basicRemove(otherEnd, msgs);
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
			case DEVSPackage.DEVS__NAME:
				return getName();
			case DEVSPackage.DEVS__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
			case DEVSPackage.DEVS__IPORTS:
				return getIports();
			case DEVSPackage.DEVS__OPORTS:
				return getOports();
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
			case DEVSPackage.DEVS__NAME:
				setName((String)newValue);
				return;
			case DEVSPackage.DEVS__CONTAINER:
				setContainer((DEVS)newValue);
				return;
			case DEVSPackage.DEVS__IPORTS:
				getIports().clear();
				getIports().addAll((Collection<? extends IPort>)newValue);
				return;
			case DEVSPackage.DEVS__OPORTS:
				getOports().clear();
				getOports().addAll((Collection<? extends OPort>)newValue);
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
			case DEVSPackage.DEVS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DEVSPackage.DEVS__CONTAINER:
				setContainer((DEVS)null);
				return;
			case DEVSPackage.DEVS__IPORTS:
				getIports().clear();
				return;
			case DEVSPackage.DEVS__OPORTS:
				getOports().clear();
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
			case DEVSPackage.DEVS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DEVSPackage.DEVS__CONTAINER:
				return container != null;
			case DEVSPackage.DEVS__IPORTS:
				return iports != null && !iports.isEmpty();
			case DEVSPackage.DEVS__OPORTS:
				return oports != null && !oports.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DEVSImpl
