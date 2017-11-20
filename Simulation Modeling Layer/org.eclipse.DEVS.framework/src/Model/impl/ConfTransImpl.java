/**
 */
package Model.impl;

import Model.ConfTrans;
import Model.DEVSPackage;
import Model.Event;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conf Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Model.impl.ConfTransImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link Model.impl.ConfTransImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfTransImpl extends PhaseTransitionImpl implements ConfTrans {
	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> outputs;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfTransImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DEVSPackage.Literals.CONF_TRANS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectResolvingEList<Event>(Event.class, this, DEVSPackage.CONF_TRANS__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<Event>(Event.class, this, DEVSPackage.CONF_TRANS__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DEVSPackage.CONF_TRANS__OUTPUTS:
				return getOutputs();
			case DEVSPackage.CONF_TRANS__INPUTS:
				return getInputs();
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
			case DEVSPackage.CONF_TRANS__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Event>)newValue);
				return;
			case DEVSPackage.CONF_TRANS__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Event>)newValue);
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
			case DEVSPackage.CONF_TRANS__OUTPUTS:
				getOutputs().clear();
				return;
			case DEVSPackage.CONF_TRANS__INPUTS:
				getInputs().clear();
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
			case DEVSPackage.CONF_TRANS__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case DEVSPackage.CONF_TRANS__INPUTS:
				return inputs != null && !inputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfTransImpl
