/**
 */
package rsgf.mw.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import rsgf.mw.Middleware;
import rsgf.mw.MwPackage;

import rsgf.vm.VM;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Middleware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rsgf.mw.impl.MiddlewareImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link rsgf.mw.impl.MiddlewareImpl#getUses <em>Uses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiddlewareImpl extends MinimalEObjectImpl.Container implements Middleware {
	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<rsgf.bundle.Process> process;

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
		return MwPackage.Literals.MIDDLEWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<rsgf.bundle.Process> getProcess() {
		if (process == null) {
			process = new EObjectResolvingEList<rsgf.bundle.Process>(rsgf.bundle.Process.class, this, MwPackage.MIDDLEWARE__PROCESS);
		}
		return process;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MwPackage.MIDDLEWARE__USES, oldUses, uses));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MwPackage.MIDDLEWARE__USES, oldUses, uses));
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
			case MwPackage.MIDDLEWARE__PROCESS:
				return getProcess();
			case MwPackage.MIDDLEWARE__USES:
				if (resolve) return getUses();
				return basicGetUses();
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
			case MwPackage.MIDDLEWARE__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends rsgf.bundle.Process>)newValue);
				return;
			case MwPackage.MIDDLEWARE__USES:
				setUses((VM)newValue);
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
			case MwPackage.MIDDLEWARE__PROCESS:
				getProcess().clear();
				return;
			case MwPackage.MIDDLEWARE__USES:
				setUses((VM)null);
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
			case MwPackage.MIDDLEWARE__PROCESS:
				return process != null && !process.isEmpty();
			case MwPackage.MIDDLEWARE__USES:
				return uses != null;
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
			case MwPackage.MIDDLEWARE___BIND:
				bind();
				return null;
			case MwPackage.MIDDLEWARE___ESTABLISH:
				establish();
				return null;
			case MwPackage.MIDDLEWARE___SEND:
				send();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MiddlewareImpl
