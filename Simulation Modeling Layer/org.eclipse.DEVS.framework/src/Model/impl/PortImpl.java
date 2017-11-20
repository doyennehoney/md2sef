/**
 */
package Model.impl;

import Model.DEVS;
import Model.DEVSPackage;
import Model.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model.impl.PortImpl#getPortId <em>Port Id</em>}</li>
 *   <li>{@link Model.impl.PortImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link Model.impl.PortImpl#getPortType <em>Port Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PortImpl extends MinimalEObjectImpl.Container implements Port {
	/**
	 * The default value of the '{@link #getPortId() <em>Port Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortId()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortId() <em>Port Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortId()
	 * @generated
	 * @ordered
	 */
	protected String portId = PORT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected DEVS owner;

	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected EClassifier portType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DEVSPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortId() {
		return portId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortId(String newPortId) {
		String oldPortId = portId;
		portId = newPortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DEVSPackage.PORT__PORT_ID, oldPortId, portId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEVS getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (DEVS)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DEVSPackage.PORT__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEVS basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(DEVS newOwner) {
		DEVS oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DEVSPackage.PORT__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getPortType() {
		if (portType != null && portType.eIsProxy()) {
			InternalEObject oldPortType = (InternalEObject)portType;
			portType = (EClassifier)eResolveProxy(oldPortType);
			if (portType != oldPortType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DEVSPackage.PORT__PORT_TYPE, oldPortType, portType));
			}
		}
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetPortType() {
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortType(EClassifier newPortType) {
		EClassifier oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DEVSPackage.PORT__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DEVSPackage.PORT__PORT_ID:
				return getPortId();
			case DEVSPackage.PORT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case DEVSPackage.PORT__PORT_TYPE:
				if (resolve) return getPortType();
				return basicGetPortType();
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
			case DEVSPackage.PORT__PORT_ID:
				setPortId((String)newValue);
				return;
			case DEVSPackage.PORT__OWNER:
				setOwner((DEVS)newValue);
				return;
			case DEVSPackage.PORT__PORT_TYPE:
				setPortType((EClassifier)newValue);
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
			case DEVSPackage.PORT__PORT_ID:
				setPortId(PORT_ID_EDEFAULT);
				return;
			case DEVSPackage.PORT__OWNER:
				setOwner((DEVS)null);
				return;
			case DEVSPackage.PORT__PORT_TYPE:
				setPortType((EClassifier)null);
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
			case DEVSPackage.PORT__PORT_ID:
				return PORT_ID_EDEFAULT == null ? portId != null : !PORT_ID_EDEFAULT.equals(portId);
			case DEVSPackage.PORT__OWNER:
				return owner != null;
			case DEVSPackage.PORT__PORT_TYPE:
				return portType != null;
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
		result.append(" (portId: ");
		result.append(portId);
		result.append(')');
		return result.toString();
	}

} //PortImpl
