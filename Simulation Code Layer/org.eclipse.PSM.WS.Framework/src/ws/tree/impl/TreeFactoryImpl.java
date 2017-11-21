/**
 */
package ws.tree.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ws.tree.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TreeFactoryImpl extends EFactoryImpl implements TreeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TreeFactory init() {
		try {
			TreeFactory theTreeFactory = (TreeFactory)EPackage.Registry.INSTANCE.getEFactory(TreePackage.eNS_URI);
			if (theTreeFactory != null) {
				return theTreeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TreeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeFactoryImpl() {
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
			case TreePackage.TREE: return createTree();
			case TreePackage.ROOT: return createRoot();
			case TreePackage.COORDINATOR: return createCoordinator();
			case TreePackage.CDEVS_COORDINATOR: return createCDEVSCoordinator();
			case TreePackage.PDEVS_COORDINATOR: return createPDEVSCoordinator();
			case TreePackage.FLAT_COORDINATOR: return createFlatCoordinator();
			case TreePackage.NODE_COORDINATOR: return createNodeCoordinator();
			case TreePackage.PCOORDINATOR: return createP_Coordinator();
			case TreePackage.CDEVS_SIMULATOR: return createCDEVSSimulator();
			case TreePackage.PDEVS_SIMULATOR: return createPDEVSSimulator();
			case TreePackage.PSIMULATOR: return createP_Simulator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree createTree() {
		TreeImpl tree = new TreeImpl();
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinator createCoordinator() {
		CoordinatorImpl coordinator = new CoordinatorImpl();
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEVSCoordinator createCDEVSCoordinator() {
		CDEVSCoordinatorImpl cdevsCoordinator = new CDEVSCoordinatorImpl();
		return cdevsCoordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDEVSCoordinator createPDEVSCoordinator() {
		PDEVSCoordinatorImpl pdevsCoordinator = new PDEVSCoordinatorImpl();
		return pdevsCoordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatCoordinator createFlatCoordinator() {
		FlatCoordinatorImpl flatCoordinator = new FlatCoordinatorImpl();
		return flatCoordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCoordinator createNodeCoordinator() {
		NodeCoordinatorImpl nodeCoordinator = new NodeCoordinatorImpl();
		return nodeCoordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_Coordinator createP_Coordinator() {
		P_CoordinatorImpl p_Coordinator = new P_CoordinatorImpl();
		return p_Coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEVSSimulator createCDEVSSimulator() {
		CDEVSSimulatorImpl cdevsSimulator = new CDEVSSimulatorImpl();
		return cdevsSimulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDEVSSimulator createPDEVSSimulator() {
		PDEVSSimulatorImpl pdevsSimulator = new PDEVSSimulatorImpl();
		return pdevsSimulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_Simulator createP_Simulator() {
		P_SimulatorImpl p_Simulator = new P_SimulatorImpl();
		return p_Simulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreePackage getTreePackage() {
		return (TreePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TreePackage getPackage() {
		return TreePackage.eINSTANCE;
	}

} //TreeFactoryImpl
