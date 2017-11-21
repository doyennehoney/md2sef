/**
 */
package ws.tree;

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
 * @see ws.tree.TreeFactory
 * @model kind="package"
 * @generated
 */
public interface TreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tree";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://psm.org/Tree";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tree";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TreePackage eINSTANCE = ws.tree.impl.TreePackageImpl.init();

	/**
	 * The meta object id for the '{@link ws.tree.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.TreeImpl
	 * @see ws.tree.impl.TreePackageImpl#getTree()
	 * @generated
	 */
	int TREE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ID = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ROOT = 1;

	/**
	 * The feature id for the '<em><b>Coordinator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__COORDINATOR = 2;

	/**
	 * The feature id for the '<em><b>Simulator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__SIMULATOR = 3;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.NodeImpl
	 * @see ws.tree.impl.TreePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.RootImpl
	 * @see ws.tree.impl.TreePackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__CHILD = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.BasicNodeImpl <em>Basic Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.BasicNodeImpl
	 * @see ws.tree.impl.TreePackageImpl#getBasicNode()
	 * @generated
	 */
	int BASIC_NODE = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE__MODEL_NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.CoordinatorImpl <em>Coordinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.CoordinatorImpl
	 * @see ws.tree.impl.TreePackageImpl#getCoordinator()
	 * @generated
	 */
	int COORDINATOR = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__ID = BASIC_NODE__ID;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__MODEL_NAME = BASIC_NODE__MODEL_NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR__CHILDREN = BASIC_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_FEATURE_COUNT = BASIC_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATOR_OPERATION_COUNT = BASIC_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.CDEVSCoordinatorImpl <em>CDEVS Coordinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.CDEVSCoordinatorImpl
	 * @see ws.tree.impl.TreePackageImpl#getCDEVSCoordinator()
	 * @generated
	 */
	int CDEVS_COORDINATOR = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDEVS_COORDINATOR__ID = COORDINATOR__ID;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDEVS_COORDINATOR__MODEL_NAME = COORDINATOR__MODEL_NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDEVS_COORDINATOR__CHILDREN = COORDINATOR__CHILDREN;

	/**
	 * The number of structural features of the '<em>CDEVS Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDEVS_COORDINATOR_FEATURE_COUNT = COORDINATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CDEVS Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDEVS_COORDINATOR_OPERATION_COUNT = COORDINATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.PDEVSCoordinatorImpl <em>PDEVS Coordinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.PDEVSCoordinatorImpl
	 * @see ws.tree.impl.TreePackageImpl#getPDEVSCoordinator()
	 * @generated
	 */
	int PDEVS_COORDINATOR = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEVS_COORDINATOR__ID = COORDINATOR__ID;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEVS_COORDINATOR__MODEL_NAME = COORDINATOR__MODEL_NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEVS_COORDINATOR__CHILDREN = COORDINATOR__CHILDREN;

	/**
	 * The number of structural features of the '<em>PDEVS Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEVS_COORDINATOR_FEATURE_COUNT = COORDINATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PDEVS Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEVS_COORDINATOR_OPERATION_COUNT = COORDINATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.FlatCoordinatorImpl <em>Flat Coordinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.FlatCoordinatorImpl
	 * @see ws.tree.impl.TreePackageImpl#getFlatCoordinator()
	 * @generated
	 */
	int FLAT_COORDINATOR = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_COORDINATOR__ID = COORDINATOR__ID;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_COORDINATOR__MODEL_NAME = COORDINATOR__MODEL_NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_COORDINATOR__CHILDREN = COORDINATOR__CHILDREN;

	/**
	 * The number of structural features of the '<em>Flat Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_COORDINATOR_FEATURE_COUNT = COORDINATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flat Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_COORDINATOR_OPERATION_COUNT = COORDINATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.NodeCoordinatorImpl <em>Node Coordinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.NodeCoordinatorImpl
	 * @see ws.tree.impl.TreePackageImpl#getNodeCoordinator()
	 * @generated
	 */
	int NODE_COORDINATOR = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_COORDINATOR__ID = COORDINATOR__ID;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_COORDINATOR__MODEL_NAME = COORDINATOR__MODEL_NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_COORDINATOR__CHILDREN = COORDINATOR__CHILDREN;

	/**
	 * The number of structural features of the '<em>Node Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_COORDINATOR_FEATURE_COUNT = COORDINATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node Coordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_COORDINATOR_OPERATION_COUNT = COORDINATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.P_CoordinatorImpl <em>PCoordinator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.P_CoordinatorImpl
	 * @see ws.tree.impl.TreePackageImpl#getP_Coordinator()
	 * @generated
	 */
	int PCOORDINATOR = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCOORDINATOR__ID = COORDINATOR__ID;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCOORDINATOR__MODEL_NAME = COORDINATOR__MODEL_NAME;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCOORDINATOR__CHILDREN = COORDINATOR__CHILDREN;

	/**
	 * The number of structural features of the '<em>PCoordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCOORDINATOR_FEATURE_COUNT = COORDINATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCoordinator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCOORDINATOR_OPERATION_COUNT = COORDINATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.SimulatorImpl <em>Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.SimulatorImpl
	 * @see ws.tree.impl.TreePackageImpl#getSimulator()
	 * @generated
	 */
	int SIMULATOR = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR__ID = BASIC_NODE__ID;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR__MODEL_NAME = BASIC_NODE__MODEL_NAME;

	/**
	 * The number of structural features of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_FEATURE_COUNT = BASIC_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_OPERATION_COUNT = BASIC_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.CDEVSSimulatorImpl <em>CDEVS Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.CDEVSSimulatorImpl
	 * @see ws.tree.impl.TreePackageImpl#getCDEVSSimulator()
	 * @generated
	 */
	int CDEVS_SIMULATOR = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDEVS_SIMULATOR__ID = SIMULATOR__ID;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDEVS_SIMULATOR__MODEL_NAME = SIMULATOR__MODEL_NAME;

	/**
	 * The number of structural features of the '<em>CDEVS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDEVS_SIMULATOR_FEATURE_COUNT = SIMULATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CDEVS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDEVS_SIMULATOR_OPERATION_COUNT = SIMULATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.PDEVSSimulatorImpl <em>PDEVS Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.PDEVSSimulatorImpl
	 * @see ws.tree.impl.TreePackageImpl#getPDEVSSimulator()
	 * @generated
	 */
	int PDEVS_SIMULATOR = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEVS_SIMULATOR__ID = SIMULATOR__ID;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEVS_SIMULATOR__MODEL_NAME = SIMULATOR__MODEL_NAME;

	/**
	 * The number of structural features of the '<em>PDEVS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEVS_SIMULATOR_FEATURE_COUNT = SIMULATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PDEVS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDEVS_SIMULATOR_OPERATION_COUNT = SIMULATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ws.tree.impl.P_SimulatorImpl <em>PSimulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.tree.impl.P_SimulatorImpl
	 * @see ws.tree.impl.TreePackageImpl#getP_Simulator()
	 * @generated
	 */
	int PSIMULATOR = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSIMULATOR__ID = SIMULATOR__ID;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSIMULATOR__MODEL_NAME = SIMULATOR__MODEL_NAME;

	/**
	 * The number of structural features of the '<em>PSimulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSIMULATOR_FEATURE_COUNT = SIMULATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PSimulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSIMULATOR_OPERATION_COUNT = SIMULATOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ws.tree.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see ws.tree.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for the attribute '{@link ws.tree.Tree#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ws.tree.Tree#getID()
	 * @see #getTree()
	 * @generated
	 */
	EAttribute getTree_ID();

	/**
	 * Returns the meta object for the containment reference '{@link ws.tree.Tree#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see ws.tree.Tree#getRoot()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link ws.tree.Tree#getCoordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinator</em>'.
	 * @see ws.tree.Tree#getCoordinator()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_Coordinator();

	/**
	 * Returns the meta object for the containment reference list '{@link ws.tree.Tree#getSimulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simulator</em>'.
	 * @see ws.tree.Tree#getSimulator()
	 * @see #getTree()
	 * @generated
	 */
	EReference getTree_Simulator();

	/**
	 * Returns the meta object for class '{@link ws.tree.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see ws.tree.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the reference '{@link ws.tree.Root#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see ws.tree.Root#getChild()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Child();

	/**
	 * Returns the meta object for class '{@link ws.tree.Coordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinator</em>'.
	 * @see ws.tree.Coordinator
	 * @generated
	 */
	EClass getCoordinator();

	/**
	 * Returns the meta object for the reference list '{@link ws.tree.Coordinator#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see ws.tree.Coordinator#getChildren()
	 * @see #getCoordinator()
	 * @generated
	 */
	EReference getCoordinator_Children();

	/**
	 * Returns the meta object for class '{@link ws.tree.CDEVSCoordinator <em>CDEVS Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDEVS Coordinator</em>'.
	 * @see ws.tree.CDEVSCoordinator
	 * @generated
	 */
	EClass getCDEVSCoordinator();

	/**
	 * Returns the meta object for class '{@link ws.tree.PDEVSCoordinator <em>PDEVS Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDEVS Coordinator</em>'.
	 * @see ws.tree.PDEVSCoordinator
	 * @generated
	 */
	EClass getPDEVSCoordinator();

	/**
	 * Returns the meta object for class '{@link ws.tree.FlatCoordinator <em>Flat Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat Coordinator</em>'.
	 * @see ws.tree.FlatCoordinator
	 * @generated
	 */
	EClass getFlatCoordinator();

	/**
	 * Returns the meta object for class '{@link ws.tree.NodeCoordinator <em>Node Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Coordinator</em>'.
	 * @see ws.tree.NodeCoordinator
	 * @generated
	 */
	EClass getNodeCoordinator();

	/**
	 * Returns the meta object for class '{@link ws.tree.P_Coordinator <em>PCoordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCoordinator</em>'.
	 * @see ws.tree.P_Coordinator
	 * @generated
	 */
	EClass getP_Coordinator();

	/**
	 * Returns the meta object for class '{@link ws.tree.Simulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulator</em>'.
	 * @see ws.tree.Simulator
	 * @generated
	 */
	EClass getSimulator();

	/**
	 * Returns the meta object for class '{@link ws.tree.CDEVSSimulator <em>CDEVS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDEVS Simulator</em>'.
	 * @see ws.tree.CDEVSSimulator
	 * @generated
	 */
	EClass getCDEVSSimulator();

	/**
	 * Returns the meta object for class '{@link ws.tree.PDEVSSimulator <em>PDEVS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDEVS Simulator</em>'.
	 * @see ws.tree.PDEVSSimulator
	 * @generated
	 */
	EClass getPDEVSSimulator();

	/**
	 * Returns the meta object for class '{@link ws.tree.P_Simulator <em>PSimulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSimulator</em>'.
	 * @see ws.tree.P_Simulator
	 * @generated
	 */
	EClass getP_Simulator();

	/**
	 * Returns the meta object for class '{@link ws.tree.BasicNode <em>Basic Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Node</em>'.
	 * @see ws.tree.BasicNode
	 * @generated
	 */
	EClass getBasicNode();

	/**
	 * Returns the meta object for the attribute '{@link ws.tree.BasicNode#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see ws.tree.BasicNode#getModelName()
	 * @see #getBasicNode()
	 * @generated
	 */
	EAttribute getBasicNode_ModelName();

	/**
	 * Returns the meta object for class '{@link ws.tree.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ws.tree.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link ws.tree.Node#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ws.tree.Node#getID()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_ID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TreeFactory getTreeFactory();

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
		 * The meta object literal for the '{@link ws.tree.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.TreeImpl
		 * @see ws.tree.impl.TreePackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE__ID = eINSTANCE.getTree_ID();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__ROOT = eINSTANCE.getTree_Root();

		/**
		 * The meta object literal for the '<em><b>Coordinator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__COORDINATOR = eINSTANCE.getTree_Coordinator();

		/**
		 * The meta object literal for the '<em><b>Simulator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE__SIMULATOR = eINSTANCE.getTree_Simulator();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.RootImpl
		 * @see ws.tree.impl.TreePackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__CHILD = eINSTANCE.getRoot_Child();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.CoordinatorImpl <em>Coordinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.CoordinatorImpl
		 * @see ws.tree.impl.TreePackageImpl#getCoordinator()
		 * @generated
		 */
		EClass COORDINATOR = eINSTANCE.getCoordinator();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATOR__CHILDREN = eINSTANCE.getCoordinator_Children();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.CDEVSCoordinatorImpl <em>CDEVS Coordinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.CDEVSCoordinatorImpl
		 * @see ws.tree.impl.TreePackageImpl#getCDEVSCoordinator()
		 * @generated
		 */
		EClass CDEVS_COORDINATOR = eINSTANCE.getCDEVSCoordinator();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.PDEVSCoordinatorImpl <em>PDEVS Coordinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.PDEVSCoordinatorImpl
		 * @see ws.tree.impl.TreePackageImpl#getPDEVSCoordinator()
		 * @generated
		 */
		EClass PDEVS_COORDINATOR = eINSTANCE.getPDEVSCoordinator();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.FlatCoordinatorImpl <em>Flat Coordinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.FlatCoordinatorImpl
		 * @see ws.tree.impl.TreePackageImpl#getFlatCoordinator()
		 * @generated
		 */
		EClass FLAT_COORDINATOR = eINSTANCE.getFlatCoordinator();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.NodeCoordinatorImpl <em>Node Coordinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.NodeCoordinatorImpl
		 * @see ws.tree.impl.TreePackageImpl#getNodeCoordinator()
		 * @generated
		 */
		EClass NODE_COORDINATOR = eINSTANCE.getNodeCoordinator();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.P_CoordinatorImpl <em>PCoordinator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.P_CoordinatorImpl
		 * @see ws.tree.impl.TreePackageImpl#getP_Coordinator()
		 * @generated
		 */
		EClass PCOORDINATOR = eINSTANCE.getP_Coordinator();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.SimulatorImpl <em>Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.SimulatorImpl
		 * @see ws.tree.impl.TreePackageImpl#getSimulator()
		 * @generated
		 */
		EClass SIMULATOR = eINSTANCE.getSimulator();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.CDEVSSimulatorImpl <em>CDEVS Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.CDEVSSimulatorImpl
		 * @see ws.tree.impl.TreePackageImpl#getCDEVSSimulator()
		 * @generated
		 */
		EClass CDEVS_SIMULATOR = eINSTANCE.getCDEVSSimulator();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.PDEVSSimulatorImpl <em>PDEVS Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.PDEVSSimulatorImpl
		 * @see ws.tree.impl.TreePackageImpl#getPDEVSSimulator()
		 * @generated
		 */
		EClass PDEVS_SIMULATOR = eINSTANCE.getPDEVSSimulator();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.P_SimulatorImpl <em>PSimulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.P_SimulatorImpl
		 * @see ws.tree.impl.TreePackageImpl#getP_Simulator()
		 * @generated
		 */
		EClass PSIMULATOR = eINSTANCE.getP_Simulator();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.BasicNodeImpl <em>Basic Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.BasicNodeImpl
		 * @see ws.tree.impl.TreePackageImpl#getBasicNode()
		 * @generated
		 */
		EClass BASIC_NODE = eINSTANCE.getBasicNode();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_NODE__MODEL_NAME = eINSTANCE.getBasicNode_ModelName();

		/**
		 * The meta object literal for the '{@link ws.tree.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.tree.impl.NodeImpl
		 * @see ws.tree.impl.TreePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_ID();

	}

} //TreePackage
