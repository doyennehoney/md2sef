/**
 */
package rsgf.tree.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rsgf.tree.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rsgf.tree.TreePackage
 * @generated
 */
public class TreeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TreePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TreePackage.eINSTANCE;
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
	protected TreeSwitch<Adapter> modelSwitch =
		new TreeSwitch<Adapter>() {
			@Override
			public Adapter caseTree(Tree object) {
				return createTreeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter caseBasicNode(BasicNode object) {
				return createBasicNodeAdapter();
			}
			@Override
			public Adapter caseCoordinator(Coordinator object) {
				return createCoordinatorAdapter();
			}
			@Override
			public Adapter caseCDEVSCoordinator(CDEVSCoordinator object) {
				return createCDEVSCoordinatorAdapter();
			}
			@Override
			public Adapter casePDEVSCoordinator(PDEVSCoordinator object) {
				return createPDEVSCoordinatorAdapter();
			}
			@Override
			public Adapter caseFlatCoordinator(FlatCoordinator object) {
				return createFlatCoordinatorAdapter();
			}
			@Override
			public Adapter caseNodeCoordinator(NodeCoordinator object) {
				return createNodeCoordinatorAdapter();
			}
			@Override
			public Adapter caseP_Coordinator(P_Coordinator object) {
				return createP_CoordinatorAdapter();
			}
			@Override
			public Adapter caseSimulator(Simulator object) {
				return createSimulatorAdapter();
			}
			@Override
			public Adapter caseCDEVSSimulator(CDEVSSimulator object) {
				return createCDEVSSimulatorAdapter();
			}
			@Override
			public Adapter casePDEVSSimulator(PDEVSSimulator object) {
				return createPDEVSSimulatorAdapter();
			}
			@Override
			public Adapter caseP_Simulator(P_Simulator object) {
				return createP_SimulatorAdapter();
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
	 * Creates a new adapter for an object of class '{@link rsgf.tree.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.Tree
	 * @generated
	 */
	public Adapter createTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.BasicNode <em>Basic Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.BasicNode
	 * @generated
	 */
	public Adapter createBasicNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.Coordinator <em>Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.Coordinator
	 * @generated
	 */
	public Adapter createCoordinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.CDEVSCoordinator <em>CDEVS Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.CDEVSCoordinator
	 * @generated
	 */
	public Adapter createCDEVSCoordinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.PDEVSCoordinator <em>PDEVS Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.PDEVSCoordinator
	 * @generated
	 */
	public Adapter createPDEVSCoordinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.FlatCoordinator <em>Flat Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.FlatCoordinator
	 * @generated
	 */
	public Adapter createFlatCoordinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.NodeCoordinator <em>Node Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.NodeCoordinator
	 * @generated
	 */
	public Adapter createNodeCoordinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.P_Coordinator <em>PCoordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.P_Coordinator
	 * @generated
	 */
	public Adapter createP_CoordinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.Simulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.Simulator
	 * @generated
	 */
	public Adapter createSimulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.CDEVSSimulator <em>CDEVS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.CDEVSSimulator
	 * @generated
	 */
	public Adapter createCDEVSSimulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.PDEVSSimulator <em>PDEVS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.PDEVSSimulator
	 * @generated
	 */
	public Adapter createPDEVSSimulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rsgf.tree.P_Simulator <em>PSimulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rsgf.tree.P_Simulator
	 * @generated
	 */
	public Adapter createP_SimulatorAdapter() {
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

} //TreeAdapterFactory
