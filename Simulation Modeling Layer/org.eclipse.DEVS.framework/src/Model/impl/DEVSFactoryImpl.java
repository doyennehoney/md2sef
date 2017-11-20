/**
 */
package Model.impl;

import Model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DEVSFactoryImpl extends EFactoryImpl implements DEVSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DEVSFactory init() {
		try {
			DEVSFactory theDEVSFactory = (DEVSFactory)EPackage.Registry.INSTANCE.getEFactory(DEVSPackage.eNS_URI);
			if (theDEVSFactory != null) {
				return theDEVSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DEVSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEVSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DEVSPackage.ATOMIC_DEVS: return createAtomicDEVS();
			case DEVSPackage.COUPLED_DEVS: return createCoupledDEVS();
			case DEVSPackage.IPORT: return createIPort();
			case DEVSPackage.OPORT: return createOPort();
			case DEVSPackage.EIC: return createEIC();
			case DEVSPackage.IC: return createIC();
			case DEVSPackage.EOC: return createEOC();
			case DEVSPackage.INT_TRANSITION: return createIntTransition();
			case DEVSPackage.CONF_TRANS: return createConfTrans();
			case DEVSPackage.EXT_TRANS: return createExtTrans();
			case DEVSPackage.EVENT: return createEvent();
			case DEVSPackage.PHASE: return createPhase();
			case DEVSPackage.VARIABLE: return createVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicDEVS createAtomicDEVS() {
		AtomicDEVSImpl atomicDEVS = new AtomicDEVSImpl();
		return atomicDEVS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledDEVS createCoupledDEVS() {
		CoupledDEVSImpl coupledDEVS = new CoupledDEVSImpl();
		return coupledDEVS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPort createIPort() {
		IPortImpl iPort = new IPortImpl();
		return iPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPort createOPort() {
		OPortImpl oPort = new OPortImpl();
		return oPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EIC createEIC() {
		EICImpl eic = new EICImpl();
		return eic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IC createIC() {
		ICImpl ic = new ICImpl();
		return ic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOC createEOC() {
		EOCImpl eoc = new EOCImpl();
		return eoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntTransition createIntTransition() {
		IntTransitionImpl intTransition = new IntTransitionImpl();
		return intTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfTrans createConfTrans() {
		ConfTransImpl confTrans = new ConfTransImpl();
		return confTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtTrans createExtTrans() {
		ExtTransImpl extTrans = new ExtTransImpl();
		return extTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase createPhase() {
		PhaseImpl phase = new PhaseImpl();
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEVSPackage getDEVSPackage() {
		return (DEVSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DEVSPackage getPackage() {
		return DEVSPackage.eINSTANCE;
	}

} //DEVSFactoryImpl
