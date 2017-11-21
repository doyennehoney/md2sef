/**
 */
package ws.middleware.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ws.middleware.Middleware;
import ws.middleware.MiddlewarePackage;
import ws.middleware.VM;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Middleware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ws.middleware.impl.MiddlewareImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link ws.middleware.impl.MiddlewareImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MiddlewareImpl extends MinimalEObjectImpl.Container implements Middleware {
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected VM uses;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference list.
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
	protected MiddlewareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MiddlewarePackage.Literals.MIDDLEWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VM getUses() {
		if (uses != null && uses.eIsProxy()) {
			InternalEObject oldUses = (InternalEObject)uses;
			uses = (VM)eResolveProxy(oldUses);
			if (uses != oldUses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MiddlewarePackage.MIDDLEWARE__USES, oldUses, uses));
			}
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VM basicGetUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUses(VM newUses) {
		VM oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiddlewarePackage.MIDDLEWARE__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ws.bundle.Process> getProcess() {
		if (process == null) {
			process = new EObjectResolvingEList<ws.bundle.Process>(ws.bundle.Process.class, this, MiddlewarePackage.MIDDLEWARE__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bind() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void establish() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void send() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiddlewarePackage.MIDDLEWARE__USES:
				if (resolve) return getUses();
				return basicGetUses();
			case MiddlewarePackage.MIDDLEWARE__PROCESS:
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
			case MiddlewarePackage.MIDDLEWARE__USES:
				setUses((VM)newValue);
				return;
			case MiddlewarePackage.MIDDLEWARE__PROCESS:
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
			case MiddlewarePackage.MIDDLEWARE__USES:
				setUses((VM)null);
				return;
			case MiddlewarePackage.MIDDLEWARE__PROCESS:
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
			case MiddlewarePackage.MIDDLEWARE__USES:
				return uses != null;
			case MiddlewarePackage.MIDDLEWARE__PROCESS:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MiddlewarePackage.MIDDLEWARE___BIND:
				bind();
				return null;
			case MiddlewarePackage.MIDDLEWARE___ESTABLISH:
				establish();
				return null;
			case MiddlewarePackage.MIDDLEWARE___SEND:
				send();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MiddlewareImpl
