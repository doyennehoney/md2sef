/**
 */
package Model.util;

import Model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Model.DEVSPackage
 * @generated
 */
public class DEVSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DEVSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEVSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DEVSPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEVSSwitch<Adapter> modelSwitch =
		new DEVSSwitch<Adapter>() {
			@Override
			public Adapter caseDEVS(DEVS object) {
				return createDEVSAdapter();
			}
			@Override
			public Adapter caseAtomicDEVS(AtomicDEVS object) {
				return createAtomicDEVSAdapter();
			}
			@Override
			public Adapter caseCoupledDEVS(CoupledDEVS object) {
				return createCoupledDEVSAdapter();
			}
			@Override
			public Adapter caseIPort(IPort object) {
				return createIPortAdapter();
			}
			@Override
			public Adapter caseOPort(OPort object) {
				return createOPortAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseEIC(EIC object) {
				return createEICAdapter();
			}
			@Override
			public Adapter caseIC(IC object) {
				return createICAdapter();
			}
			@Override
			public Adapter caseEOC(EOC object) {
				return createEOCAdapter();
			}
			@Override
			public Adapter caseIntTransition(IntTransition object) {
				return createIntTransitionAdapter();
			}
			@Override
			public Adapter caseConfTrans(ConfTrans object) {
				return createConfTransAdapter();
			}
			@Override
			public Adapter caseExtTrans(ExtTrans object) {
				return createExtTransAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter casePhase(Phase object) {
				return createPhaseAdapter();
			}
			@Override
			public Adapter casePhaseTransition(PhaseTransition object) {
				return createPhaseTransitionAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Model.DEVS <em>DEVS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.DEVS
	 * @generated
	 */
	public Adapter createDEVSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.AtomicDEVS <em>Atomic DEVS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.AtomicDEVS
	 * @generated
	 */
	public Adapter createAtomicDEVSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.CoupledDEVS <em>Coupled DEVS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.CoupledDEVS
	 * @generated
	 */
	public Adapter createCoupledDEVSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.IPort <em>IPort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.IPort
	 * @generated
	 */
	public Adapter createIPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.OPort <em>OPort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.OPort
	 * @generated
	 */
	public Adapter createOPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.EIC <em>EIC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.EIC
	 * @generated
	 */
	public Adapter createEICAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.IC <em>IC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.IC
	 * @generated
	 */
	public Adapter createICAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.EOC <em>EOC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.EOC
	 * @generated
	 */
	public Adapter createEOCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.IntTransition <em>Int Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.IntTransition
	 * @generated
	 */
	public Adapter createIntTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.ConfTrans <em>Conf Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.ConfTrans
	 * @generated
	 */
	public Adapter createConfTransAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.ExtTrans <em>Ext Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.ExtTrans
	 * @generated
	 */
	public Adapter createExtTransAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Phase
	 * @generated
	 */
	public Adapter createPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.PhaseTransition <em>Phase Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.PhaseTransition
	 * @generated
	 */
	public Adapter createPhaseTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Model.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Model.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DEVSAdapterFactory
