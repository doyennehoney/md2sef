/**
 */
package ws.middleware.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ws.middleware.MiddlewarePackage;
import ws.middleware.Repository;
import ws.middleware.Stub;
import ws.middleware.WebService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ws.middleware.impl.WebServiceImpl#getStubs <em>Stubs</em>}</li>
 *   <li>{@link ws.middleware.impl.WebServiceImpl#getRegistry <em>Registry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebServiceImpl extends MiddlewareImpl implements WebService {
	/**
	 * The cached value of the '{@link #getStubs() <em>Stubs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubs()
	 * @generated
	 * @ordered
	 */
	protected EList<Stub> stubs;

	/**
	 * The cached value of the '{@link #getRegistry() <em>Registry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistry()
	 * @generated
	 * @ordered
	 */
	protected Repository registry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiddlewarePackage.Literals.WEB_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stub> getStubs() {
		if (stubs == null) {
			stubs = new EObjectContainmentEList<Stub>(Stub.class, this, MiddlewarePackage.WEB_SERVICE__STUBS);
		}
		return stubs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository getRegistry() {
		if (registry != null && registry.eIsProxy()) {
			InternalEObject oldRegistry = (InternalEObject)registry;
			registry = (Repository)eResolveProxy(oldRegistry);
			if (registry != oldRegistry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiddlewarePackage.WEB_SERVICE__REGISTRY, oldRegistry, registry));
			}
		}
		return registry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetRegistry() {
		return registry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistry(Repository newRegistry) {
		Repository oldRegistry = registry;
		registry = newRegistry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiddlewarePackage.WEB_SERVICE__REGISTRY, oldRegistry, registry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MiddlewarePackage.WEB_SERVICE__STUBS:
				return ((InternalEList<?>)getStubs()).basicRemove(otherEnd, msgs);
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
			case MiddlewarePackage.WEB_SERVICE__STUBS:
				return getStubs();
			case MiddlewarePackage.WEB_SERVICE__REGISTRY:
				if (resolve) return getRegistry();
				return basicGetRegistry();
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
			case MiddlewarePackage.WEB_SERVICE__STUBS:
				getStubs().clear();
				getStubs().addAll((Collection<? extends Stub>)newValue);
				return;
			case MiddlewarePackage.WEB_SERVICE__REGISTRY:
				setRegistry((Repository)newValue);
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
			case MiddlewarePackage.WEB_SERVICE__STUBS:
				getStubs().clear();
				return;
			case MiddlewarePackage.WEB_SERVICE__REGISTRY:
				setRegistry((Repository)null);
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
			case MiddlewarePackage.WEB_SERVICE__STUBS:
				return stubs != null && !stubs.isEmpty();
			case MiddlewarePackage.WEB_SERVICE__REGISTRY:
				return registry != null;
		}
		return super.eIsSet(featureID);
	}

} //WebServiceImpl
