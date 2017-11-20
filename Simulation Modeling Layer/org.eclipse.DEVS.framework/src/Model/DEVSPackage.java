/**
 */
package Model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Model.DEVSFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 * @generated
 */
public interface DEVSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://model.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DEVSPackage eINSTANCE = Model.impl.DEVSPackageImpl.init();

	/**
	 * The meta object id for the '{@link Model.impl.DEVSImpl <em>DEVS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.DEVSImpl
	 * @see Model.impl.DEVSPackageImpl#getDEVS()
	 * @generated
	 */
	int DEVS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS__CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Iports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS__IPORTS = 2;

	/**
	 * The feature id for the '<em><b>Oports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS__OPORTS = 3;

	/**
	 * The number of structural features of the '<em>DEVS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>DEVS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.AtomicDEVSImpl <em>Atomic DEVS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.AtomicDEVSImpl
	 * @see Model.impl.DEVSPackageImpl#getAtomicDEVS()
	 * @generated
	 */
	int ATOMIC_DEVS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__NAME = DEVS__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__CONTAINER = DEVS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Iports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__IPORTS = DEVS__IPORTS;

	/**
	 * The feature id for the '<em><b>Oports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__OPORTS = DEVS__OPORTS;

	/**
	 * The feature id for the '<em><b>Delta Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__DELTA_INT = DEVS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delta Conf</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__DELTA_CONF = DEVS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delta Ext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__DELTA_EXT = DEVS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__PHASES = DEVS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS__STATE_VARS = DEVS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Atomic DEVS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS_FEATURE_COUNT = DEVS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Atomic DEVS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DEVS_OPERATION_COUNT = DEVS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.CoupledDEVSImpl <em>Coupled DEVS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.CoupledDEVSImpl
	 * @see Model.impl.DEVSPackageImpl#getCoupledDEVS()
	 * @generated
	 */
	int COUPLED_DEVS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_DEVS__NAME = DEVS__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_DEVS__CONTAINER = DEVS__CONTAINER;

	/**
	 * The feature id for the '<em><b>Iports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_DEVS__IPORTS = DEVS__IPORTS;

	/**
	 * The feature id for the '<em><b>Oports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_DEVS__OPORTS = DEVS__OPORTS;

	/**
	 * The feature id for the '<em><b>Sub Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_DEVS__SUB_MODELS = DEVS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_DEVS__EICS = DEVS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_DEVS__ICS = DEVS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Eocs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_DEVS__EOCS = DEVS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Coupled DEVS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_DEVS_FEATURE_COUNT = DEVS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Coupled DEVS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_DEVS_OPERATION_COUNT = DEVS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PortImpl
	 * @see Model.impl.DEVSPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 5;

	/**
	 * The feature id for the '<em><b>Port Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_ID = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.IPortImpl <em>IPort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.IPortImpl
	 * @see Model.impl.DEVSPackageImpl#getIPort()
	 * @generated
	 */
	int IPORT = 3;

	/**
	 * The feature id for the '<em><b>Port Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT__PORT_ID = PORT__PORT_ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT__OWNER = PORT__OWNER;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT__PORT_TYPE = PORT__PORT_TYPE;

	/**
	 * The number of structural features of the '<em>IPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.OPortImpl <em>OPort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.OPortImpl
	 * @see Model.impl.DEVSPackageImpl#getOPort()
	 * @generated
	 */
	int OPORT = 4;

	/**
	 * The feature id for the '<em><b>Port Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPORT__PORT_ID = PORT__PORT_ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPORT__OWNER = PORT__OWNER;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPORT__PORT_TYPE = PORT__PORT_TYPE;

	/**
	 * The number of structural features of the '<em>OPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.EICImpl <em>EIC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.EICImpl
	 * @see Model.impl.DEVSPackageImpl#getEIC()
	 * @generated
	 */
	int EIC = 6;

	/**
	 * The feature id for the '<em><b>Influencer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIC__INFLUENCER = 0;

	/**
	 * The feature id for the '<em><b>Influencee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIC__INFLUENCEE = 1;

	/**
	 * The number of structural features of the '<em>EIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.ICImpl <em>IC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ICImpl
	 * @see Model.impl.DEVSPackageImpl#getIC()
	 * @generated
	 */
	int IC = 7;

	/**
	 * The feature id for the '<em><b>Influencer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IC__INFLUENCER = 0;

	/**
	 * The feature id for the '<em><b>Influencee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IC__INFLUENCEE = 1;

	/**
	 * The number of structural features of the '<em>IC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.EOCImpl <em>EOC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.EOCImpl
	 * @see Model.impl.DEVSPackageImpl#getEOC()
	 * @generated
	 */
	int EOC = 8;

	/**
	 * The feature id for the '<em><b>Influencer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOC__INFLUENCER = 0;

	/**
	 * The feature id for the '<em><b>Influencee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOC__INFLUENCEE = 1;

	/**
	 * The number of structural features of the '<em>EOC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EOC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.PhaseTransitionImpl <em>Phase Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PhaseTransitionImpl
	 * @see Model.impl.DEVSPackageImpl#getPhaseTransition()
	 * @generated
	 */
	int PHASE_TRANSITION = 14;

	/**
	 * The feature id for the '<em><b>Source Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TRANSITION__SOURCE_PHASE = 0;

	/**
	 * The feature id for the '<em><b>Target Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TRANSITION__TARGET_PHASE = 1;

	/**
	 * The number of structural features of the '<em>Phase Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Phase Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.IntTransitionImpl <em>Int Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.IntTransitionImpl
	 * @see Model.impl.DEVSPackageImpl#getIntTransition()
	 * @generated
	 */
	int INT_TRANSITION = 9;

	/**
	 * The feature id for the '<em><b>Source Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TRANSITION__SOURCE_PHASE = PHASE_TRANSITION__SOURCE_PHASE;

	/**
	 * The feature id for the '<em><b>Target Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TRANSITION__TARGET_PHASE = PHASE_TRANSITION__TARGET_PHASE;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TRANSITION__OUTPUTS = PHASE_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TRANSITION_FEATURE_COUNT = PHASE_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TRANSITION_OPERATION_COUNT = PHASE_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.ConfTransImpl <em>Conf Trans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ConfTransImpl
	 * @see Model.impl.DEVSPackageImpl#getConfTrans()
	 * @generated
	 */
	int CONF_TRANS = 10;

	/**
	 * The feature id for the '<em><b>Source Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_TRANS__SOURCE_PHASE = PHASE_TRANSITION__SOURCE_PHASE;

	/**
	 * The feature id for the '<em><b>Target Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_TRANS__TARGET_PHASE = PHASE_TRANSITION__TARGET_PHASE;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_TRANS__OUTPUTS = PHASE_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_TRANS__INPUTS = PHASE_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conf Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_TRANS_FEATURE_COUNT = PHASE_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conf Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_TRANS_OPERATION_COUNT = PHASE_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.ExtTransImpl <em>Ext Trans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ExtTransImpl
	 * @see Model.impl.DEVSPackageImpl#getExtTrans()
	 * @generated
	 */
	int EXT_TRANS = 11;

	/**
	 * The feature id for the '<em><b>Source Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_TRANS__SOURCE_PHASE = PHASE_TRANSITION__SOURCE_PHASE;

	/**
	 * The feature id for the '<em><b>Target Phase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_TRANS__TARGET_PHASE = PHASE_TRANSITION__TARGET_PHASE;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_TRANS__INPUTS = PHASE_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ext Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_TRANS_FEATURE_COUNT = PHASE_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ext Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXT_TRANS_OPERATION_COUNT = PHASE_TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.EventImpl
	 * @see Model.impl.DEVSPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 12;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TARGET_PORT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PhaseImpl
	 * @see Model.impl.DEVSPackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 13;

	/**
	 * The feature id for the '<em><b>Phase ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__PHASE_ID = 0;

	/**
	 * The feature id for the '<em><b>Time Advance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__TIME_ADVANCE = 1;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__PREDICATES = 2;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.VariableImpl
	 * @see Model.impl.DEVSPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Model.DEVS <em>DEVS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEVS</em>'.
	 * @see Model.DEVS
	 * @generated
	 */
	EClass getDEVS();

	/**
	 * Returns the meta object for the attribute '{@link Model.DEVS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Model.DEVS#getName()
	 * @see #getDEVS()
	 * @generated
	 */
	EAttribute getDEVS_Name();

	/**
	 * Returns the meta object for the reference '{@link Model.DEVS#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see Model.DEVS#getContainer()
	 * @see #getDEVS()
	 * @generated
	 */
	EReference getDEVS_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link Model.DEVS#getIports <em>Iports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iports</em>'.
	 * @see Model.DEVS#getIports()
	 * @see #getDEVS()
	 * @generated
	 */
	EReference getDEVS_Iports();

	/**
	 * Returns the meta object for the containment reference list '{@link Model.DEVS#getOports <em>Oports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Oports</em>'.
	 * @see Model.DEVS#getOports()
	 * @see #getDEVS()
	 * @generated
	 */
	EReference getDEVS_Oports();

	/**
	 * Returns the meta object for class '{@link Model.AtomicDEVS <em>Atomic DEVS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic DEVS</em>'.
	 * @see Model.AtomicDEVS
	 * @generated
	 */
	EClass getAtomicDEVS();

	/**
	 * Returns the meta object for the containment reference list '{@link Model.AtomicDEVS#getDeltaInt <em>Delta Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delta Int</em>'.
	 * @see Model.AtomicDEVS#getDeltaInt()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_DeltaInt();

	/**
	 * Returns the meta object for the containment reference list '{@link Model.AtomicDEVS#getDeltaConf <em>Delta Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delta Conf</em>'.
	 * @see Model.AtomicDEVS#getDeltaConf()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_DeltaConf();

	/**
	 * Returns the meta object for the containment reference list '{@link Model.AtomicDEVS#getDeltaExt <em>Delta Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delta Ext</em>'.
	 * @see Model.AtomicDEVS#getDeltaExt()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_DeltaExt();

	/**
	 * Returns the meta object for the containment reference list '{@link Model.AtomicDEVS#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phases</em>'.
	 * @see Model.AtomicDEVS#getPhases()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_Phases();

	/**
	 * Returns the meta object for the containment reference list '{@link Model.AtomicDEVS#getStateVars <em>State Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Vars</em>'.
	 * @see Model.AtomicDEVS#getStateVars()
	 * @see #getAtomicDEVS()
	 * @generated
	 */
	EReference getAtomicDEVS_StateVars();

	/**
	 * Returns the meta object for class '{@link Model.CoupledDEVS <em>Coupled DEVS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled DEVS</em>'.
	 * @see Model.CoupledDEVS
	 * @generated
	 */
	EClass getCoupledDEVS();

	/**
	 * Returns the meta object for the containment reference list '{@link Model.CoupledDEVS#getSubModels <em>Sub Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Models</em>'.
	 * @see Model.CoupledDEVS#getSubModels()
	 * @see #getCoupledDEVS()
	 * @generated
	 */
	EReference getCoupledDEVS_SubModels();

	/**
	 * Returns the meta object for the containment reference list '{@link Model.CoupledDEVS#getEics <em>Eics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eics</em>'.
	 * @see Model.CoupledDEVS#getEics()
	 * @see #getCoupledDEVS()
	 * @generated
	 */
	EReference getCoupledDEVS_Eics();

	/**
	 * Returns the meta object for the containment reference list '{@link Model.CoupledDEVS#getIcs <em>Ics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ics</em>'.
	 * @see Model.CoupledDEVS#getIcs()
	 * @see #getCoupledDEVS()
	 * @generated
	 */
	EReference getCoupledDEVS_Ics();

	/**
	 * Returns the meta object for the containment reference list '{@link Model.CoupledDEVS#getEocs <em>Eocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eocs</em>'.
	 * @see Model.CoupledDEVS#getEocs()
	 * @see #getCoupledDEVS()
	 * @generated
	 */
	EReference getCoupledDEVS_Eocs();

	/**
	 * Returns the meta object for class '{@link Model.IPort <em>IPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPort</em>'.
	 * @see Model.IPort
	 * @generated
	 */
	EClass getIPort();

	/**
	 * Returns the meta object for class '{@link Model.OPort <em>OPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPort</em>'.
	 * @see Model.OPort
	 * @generated
	 */
	EClass getOPort();

	/**
	 * Returns the meta object for class '{@link Model.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see Model.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link Model.Port#getPortId <em>Port Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Id</em>'.
	 * @see Model.Port#getPortId()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_PortId();

	/**
	 * Returns the meta object for the reference '{@link Model.Port#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see Model.Port#getOwner()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Owner();

	/**
	 * Returns the meta object for the reference '{@link Model.Port#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see Model.Port#getPortType()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_PortType();

	/**
	 * Returns the meta object for class '{@link Model.EIC <em>EIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EIC</em>'.
	 * @see Model.EIC
	 * @generated
	 */
	EClass getEIC();

	/**
	 * Returns the meta object for the reference '{@link Model.EIC#getInfluencer <em>Influencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Influencer</em>'.
	 * @see Model.EIC#getInfluencer()
	 * @see #getEIC()
	 * @generated
	 */
	EReference getEIC_Influencer();

	/**
	 * Returns the meta object for the reference '{@link Model.EIC#getInfluencee <em>Influencee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Influencee</em>'.
	 * @see Model.EIC#getInfluencee()
	 * @see #getEIC()
	 * @generated
	 */
	EReference getEIC_Influencee();

	/**
	 * Returns the meta object for class '{@link Model.IC <em>IC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IC</em>'.
	 * @see Model.IC
	 * @generated
	 */
	EClass getIC();

	/**
	 * Returns the meta object for the reference '{@link Model.IC#getInfluencer <em>Influencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Influencer</em>'.
	 * @see Model.IC#getInfluencer()
	 * @see #getIC()
	 * @generated
	 */
	EReference getIC_Influencer();

	/**
	 * Returns the meta object for the reference '{@link Model.IC#getInfluencee <em>Influencee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Influencee</em>'.
	 * @see Model.IC#getInfluencee()
	 * @see #getIC()
	 * @generated
	 */
	EReference getIC_Influencee();

	/**
	 * Returns the meta object for class '{@link Model.EOC <em>EOC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOC</em>'.
	 * @see Model.EOC
	 * @generated
	 */
	EClass getEOC();

	/**
	 * Returns the meta object for the reference '{@link Model.EOC#getInfluencer <em>Influencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Influencer</em>'.
	 * @see Model.EOC#getInfluencer()
	 * @see #getEOC()
	 * @generated
	 */
	EReference getEOC_Influencer();

	/**
	 * Returns the meta object for the reference '{@link Model.EOC#getInfluencee <em>Influencee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Influencee</em>'.
	 * @see Model.EOC#getInfluencee()
	 * @see #getEOC()
	 * @generated
	 */
	EReference getEOC_Influencee();

	/**
	 * Returns the meta object for class '{@link Model.IntTransition <em>Int Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Transition</em>'.
	 * @see Model.IntTransition
	 * @generated
	 */
	EClass getIntTransition();

	/**
	 * Returns the meta object for the reference list '{@link Model.IntTransition#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see Model.IntTransition#getOutputs()
	 * @see #getIntTransition()
	 * @generated
	 */
	EReference getIntTransition_Outputs();

	/**
	 * Returns the meta object for class '{@link Model.ConfTrans <em>Conf Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conf Trans</em>'.
	 * @see Model.ConfTrans
	 * @generated
	 */
	EClass getConfTrans();

	/**
	 * Returns the meta object for the reference list '{@link Model.ConfTrans#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see Model.ConfTrans#getOutputs()
	 * @see #getConfTrans()
	 * @generated
	 */
	EReference getConfTrans_Outputs();

	/**
	 * Returns the meta object for the reference list '{@link Model.ConfTrans#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see Model.ConfTrans#getInputs()
	 * @see #getConfTrans()
	 * @generated
	 */
	EReference getConfTrans_Inputs();

	/**
	 * Returns the meta object for class '{@link Model.ExtTrans <em>Ext Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ext Trans</em>'.
	 * @see Model.ExtTrans
	 * @generated
	 */
	EClass getExtTrans();

	/**
	 * Returns the meta object for the reference list '{@link Model.ExtTrans#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see Model.ExtTrans#getInputs()
	 * @see #getExtTrans()
	 * @generated
	 */
	EReference getExtTrans_Inputs();

	/**
	 * Returns the meta object for class '{@link Model.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see Model.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference '{@link Model.Event#getTargetPort <em>Target Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Port</em>'.
	 * @see Model.Event#getTargetPort()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_TargetPort();

	/**
	 * Returns the meta object for the reference '{@link Model.Event#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see Model.Event#getValue()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Value();

	/**
	 * Returns the meta object for class '{@link Model.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see Model.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for the attribute '{@link Model.Phase#getPhaseID <em>Phase ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase ID</em>'.
	 * @see Model.Phase#getPhaseID()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_PhaseID();

	/**
	 * Returns the meta object for the attribute '{@link Model.Phase#getTimeAdvance <em>Time Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Advance</em>'.
	 * @see Model.Phase#getTimeAdvance()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_TimeAdvance();

	/**
	 * Returns the meta object for the reference list '{@link Model.Phase#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predicates</em>'.
	 * @see Model.Phase#getPredicates()
	 * @see #getPhase()
	 * @generated
	 */
	EReference getPhase_Predicates();

	/**
	 * Returns the meta object for class '{@link Model.PhaseTransition <em>Phase Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase Transition</em>'.
	 * @see Model.PhaseTransition
	 * @generated
	 */
	EClass getPhaseTransition();

	/**
	 * Returns the meta object for the reference '{@link Model.PhaseTransition#getSourcePhase <em>Source Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Phase</em>'.
	 * @see Model.PhaseTransition#getSourcePhase()
	 * @see #getPhaseTransition()
	 * @generated
	 */
	EReference getPhaseTransition_SourcePhase();

	/**
	 * Returns the meta object for the reference '{@link Model.PhaseTransition#getTargetPhase <em>Target Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Phase</em>'.
	 * @see Model.PhaseTransition#getTargetPhase()
	 * @see #getPhaseTransition()
	 * @generated
	 */
	EReference getPhaseTransition_TargetPhase();

	/**
	 * Returns the meta object for class '{@link Model.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see Model.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link Model.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Model.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link Model.Variable#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see Model.Variable#getDomain()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Domain();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DEVSFactory getDEVSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Model.impl.DEVSImpl <em>DEVS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.DEVSImpl
		 * @see Model.impl.DEVSPackageImpl#getDEVS()
		 * @generated
		 */
		EClass DEVS = eINSTANCE.getDEVS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVS__NAME = eINSTANCE.getDEVS_Name();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS__CONTAINER = eINSTANCE.getDEVS_Container();

		/**
		 * The meta object literal for the '<em><b>Iports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS__IPORTS = eINSTANCE.getDEVS_Iports();

		/**
		 * The meta object literal for the '<em><b>Oports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS__OPORTS = eINSTANCE.getDEVS_Oports();

		/**
		 * The meta object literal for the '{@link Model.impl.AtomicDEVSImpl <em>Atomic DEVS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.AtomicDEVSImpl
		 * @see Model.impl.DEVSPackageImpl#getAtomicDEVS()
		 * @generated
		 */
		EClass ATOMIC_DEVS = eINSTANCE.getAtomicDEVS();

		/**
		 * The meta object literal for the '<em><b>Delta Int</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__DELTA_INT = eINSTANCE.getAtomicDEVS_DeltaInt();

		/**
		 * The meta object literal for the '<em><b>Delta Conf</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__DELTA_CONF = eINSTANCE.getAtomicDEVS_DeltaConf();

		/**
		 * The meta object literal for the '<em><b>Delta Ext</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__DELTA_EXT = eINSTANCE.getAtomicDEVS_DeltaExt();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__PHASES = eINSTANCE.getAtomicDEVS_Phases();

		/**
		 * The meta object literal for the '<em><b>State Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_DEVS__STATE_VARS = eINSTANCE.getAtomicDEVS_StateVars();

		/**
		 * The meta object literal for the '{@link Model.impl.CoupledDEVSImpl <em>Coupled DEVS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.CoupledDEVSImpl
		 * @see Model.impl.DEVSPackageImpl#getCoupledDEVS()
		 * @generated
		 */
		EClass COUPLED_DEVS = eINSTANCE.getCoupledDEVS();

		/**
		 * The meta object literal for the '<em><b>Sub Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLED_DEVS__SUB_MODELS = eINSTANCE.getCoupledDEVS_SubModels();

		/**
		 * The meta object literal for the '<em><b>Eics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLED_DEVS__EICS = eINSTANCE.getCoupledDEVS_Eics();

		/**
		 * The meta object literal for the '<em><b>Ics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLED_DEVS__ICS = eINSTANCE.getCoupledDEVS_Ics();

		/**
		 * The meta object literal for the '<em><b>Eocs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLED_DEVS__EOCS = eINSTANCE.getCoupledDEVS_Eocs();

		/**
		 * The meta object literal for the '{@link Model.impl.IPortImpl <em>IPort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.IPortImpl
		 * @see Model.impl.DEVSPackageImpl#getIPort()
		 * @generated
		 */
		EClass IPORT = eINSTANCE.getIPort();

		/**
		 * The meta object literal for the '{@link Model.impl.OPortImpl <em>OPort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.OPortImpl
		 * @see Model.impl.DEVSPackageImpl#getOPort()
		 * @generated
		 */
		EClass OPORT = eINSTANCE.getOPort();

		/**
		 * The meta object literal for the '{@link Model.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PortImpl
		 * @see Model.impl.DEVSPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Port Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PORT_ID = eINSTANCE.getPort_PortId();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__OWNER = eINSTANCE.getPort_Owner();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PORT_TYPE = eINSTANCE.getPort_PortType();

		/**
		 * The meta object literal for the '{@link Model.impl.EICImpl <em>EIC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.EICImpl
		 * @see Model.impl.DEVSPackageImpl#getEIC()
		 * @generated
		 */
		EClass EIC = eINSTANCE.getEIC();

		/**
		 * The meta object literal for the '<em><b>Influencer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EIC__INFLUENCER = eINSTANCE.getEIC_Influencer();

		/**
		 * The meta object literal for the '<em><b>Influencee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EIC__INFLUENCEE = eINSTANCE.getEIC_Influencee();

		/**
		 * The meta object literal for the '{@link Model.impl.ICImpl <em>IC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ICImpl
		 * @see Model.impl.DEVSPackageImpl#getIC()
		 * @generated
		 */
		EClass IC = eINSTANCE.getIC();

		/**
		 * The meta object literal for the '<em><b>Influencer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IC__INFLUENCER = eINSTANCE.getIC_Influencer();

		/**
		 * The meta object literal for the '<em><b>Influencee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IC__INFLUENCEE = eINSTANCE.getIC_Influencee();

		/**
		 * The meta object literal for the '{@link Model.impl.EOCImpl <em>EOC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.EOCImpl
		 * @see Model.impl.DEVSPackageImpl#getEOC()
		 * @generated
		 */
		EClass EOC = eINSTANCE.getEOC();

		/**
		 * The meta object literal for the '<em><b>Influencer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOC__INFLUENCER = eINSTANCE.getEOC_Influencer();

		/**
		 * The meta object literal for the '<em><b>Influencee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOC__INFLUENCEE = eINSTANCE.getEOC_Influencee();

		/**
		 * The meta object literal for the '{@link Model.impl.IntTransitionImpl <em>Int Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.IntTransitionImpl
		 * @see Model.impl.DEVSPackageImpl#getIntTransition()
		 * @generated
		 */
		EClass INT_TRANSITION = eINSTANCE.getIntTransition();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_TRANSITION__OUTPUTS = eINSTANCE.getIntTransition_Outputs();

		/**
		 * The meta object literal for the '{@link Model.impl.ConfTransImpl <em>Conf Trans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ConfTransImpl
		 * @see Model.impl.DEVSPackageImpl#getConfTrans()
		 * @generated
		 */
		EClass CONF_TRANS = eINSTANCE.getConfTrans();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONF_TRANS__OUTPUTS = eINSTANCE.getConfTrans_Outputs();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONF_TRANS__INPUTS = eINSTANCE.getConfTrans_Inputs();

		/**
		 * The meta object literal for the '{@link Model.impl.ExtTransImpl <em>Ext Trans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ExtTransImpl
		 * @see Model.impl.DEVSPackageImpl#getExtTrans()
		 * @generated
		 */
		EClass EXT_TRANS = eINSTANCE.getExtTrans();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXT_TRANS__INPUTS = eINSTANCE.getExtTrans_Inputs();

		/**
		 * The meta object literal for the '{@link Model.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.EventImpl
		 * @see Model.impl.DEVSPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Target Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TARGET_PORT = eINSTANCE.getEvent_TargetPort();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__VALUE = eINSTANCE.getEvent_Value();

		/**
		 * The meta object literal for the '{@link Model.impl.PhaseImpl <em>Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PhaseImpl
		 * @see Model.impl.DEVSPackageImpl#getPhase()
		 * @generated
		 */
		EClass PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '<em><b>Phase ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__PHASE_ID = eINSTANCE.getPhase_PhaseID();

		/**
		 * The meta object literal for the '<em><b>Time Advance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__TIME_ADVANCE = eINSTANCE.getPhase_TimeAdvance();

		/**
		 * The meta object literal for the '<em><b>Predicates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE__PREDICATES = eINSTANCE.getPhase_Predicates();

		/**
		 * The meta object literal for the '{@link Model.impl.PhaseTransitionImpl <em>Phase Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PhaseTransitionImpl
		 * @see Model.impl.DEVSPackageImpl#getPhaseTransition()
		 * @generated
		 */
		EClass PHASE_TRANSITION = eINSTANCE.getPhaseTransition();

		/**
		 * The meta object literal for the '<em><b>Source Phase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_TRANSITION__SOURCE_PHASE = eINSTANCE.getPhaseTransition_SourcePhase();

		/**
		 * The meta object literal for the '<em><b>Target Phase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHASE_TRANSITION__TARGET_PHASE = eINSTANCE.getPhaseTransition_TargetPhase();

		/**
		 * The meta object literal for the '{@link Model.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.VariableImpl
		 * @see Model.impl.DEVSPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__DOMAIN = eINSTANCE.getVariable_Domain();

	}

} //DEVSPackage
