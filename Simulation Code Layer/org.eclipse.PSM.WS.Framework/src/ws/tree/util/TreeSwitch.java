/**
 */
package ws.tree.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ws.tree.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ws.tree.TreePackage
 * @generated
 */
public class TreeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TreePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeSwitch() {
		if (modelPackage == null) {
			modelPackage = TreePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TreePackage.TREE: {
				Tree tree = (Tree)theEObject;
				T result = caseTree(tree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = caseNode(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.COORDINATOR: {
				Coordinator coordinator = (Coordinator)theEObject;
				T result = caseCoordinator(coordinator);
				if (result == null) result = caseBasicNode(coordinator);
				if (result == null) result = caseNode(coordinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.CDEVS_COORDINATOR: {
				CDEVSCoordinator cdevsCoordinator = (CDEVSCoordinator)theEObject;
				T result = caseCDEVSCoordinator(cdevsCoordinator);
				if (result == null) result = caseCoordinator(cdevsCoordinator);
				if (result == null) result = caseBasicNode(cdevsCoordinator);
				if (result == null) result = caseNode(cdevsCoordinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.PDEVS_COORDINATOR: {
				PDEVSCoordinator pdevsCoordinator = (PDEVSCoordinator)theEObject;
				T result = casePDEVSCoordinator(pdevsCoordinator);
				if (result == null) result = caseCoordinator(pdevsCoordinator);
				if (result == null) result = caseBasicNode(pdevsCoordinator);
				if (result == null) result = caseNode(pdevsCoordinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.FLAT_COORDINATOR: {
				FlatCoordinator flatCoordinator = (FlatCoordinator)theEObject;
				T result = caseFlatCoordinator(flatCoordinator);
				if (result == null) result = caseCoordinator(flatCoordinator);
				if (result == null) result = caseBasicNode(flatCoordinator);
				if (result == null) result = caseNode(flatCoordinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.NODE_COORDINATOR: {
				NodeCoordinator nodeCoordinator = (NodeCoordinator)theEObject;
				T result = caseNodeCoordinator(nodeCoordinator);
				if (result == null) result = caseCoordinator(nodeCoordinator);
				if (result == null) result = caseBasicNode(nodeCoordinator);
				if (result == null) result = caseNode(nodeCoordinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.PCOORDINATOR: {
				P_Coordinator p_Coordinator = (P_Coordinator)theEObject;
				T result = caseP_Coordinator(p_Coordinator);
				if (result == null) result = caseCoordinator(p_Coordinator);
				if (result == null) result = caseBasicNode(p_Coordinator);
				if (result == null) result = caseNode(p_Coordinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.SIMULATOR: {
				Simulator simulator = (Simulator)theEObject;
				T result = caseSimulator(simulator);
				if (result == null) result = caseBasicNode(simulator);
				if (result == null) result = caseNode(simulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.CDEVS_SIMULATOR: {
				CDEVSSimulator cdevsSimulator = (CDEVSSimulator)theEObject;
				T result = caseCDEVSSimulator(cdevsSimulator);
				if (result == null) result = caseSimulator(cdevsSimulator);
				if (result == null) result = caseBasicNode(cdevsSimulator);
				if (result == null) result = caseNode(cdevsSimulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.PDEVS_SIMULATOR: {
				PDEVSSimulator pdevsSimulator = (PDEVSSimulator)theEObject;
				T result = casePDEVSSimulator(pdevsSimulator);
				if (result == null) result = caseSimulator(pdevsSimulator);
				if (result == null) result = caseBasicNode(pdevsSimulator);
				if (result == null) result = caseNode(pdevsSimulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.PSIMULATOR: {
				P_Simulator p_Simulator = (P_Simulator)theEObject;
				T result = caseP_Simulator(p_Simulator);
				if (result == null) result = caseSimulator(p_Simulator);
				if (result == null) result = caseBasicNode(p_Simulator);
				if (result == null) result = caseNode(p_Simulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.BASIC_NODE: {
				BasicNode basicNode = (BasicNode)theEObject;
				T result = caseBasicNode(basicNode);
				if (result == null) result = caseNode(basicNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TreePackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTree(Tree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinator(Coordinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEVS Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEVS Coordinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEVSCoordinator(CDEVSCoordinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDEVS Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDEVS Coordinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDEVSCoordinator(PDEVSCoordinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flat Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flat Coordinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlatCoordinator(FlatCoordinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Coordinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeCoordinator(NodeCoordinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCoordinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCoordinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP_Coordinator(P_Coordinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulator(Simulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CDEVS Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CDEVS Simulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEVSSimulator(CDEVSSimulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDEVS Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDEVS Simulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDEVSSimulator(PDEVSSimulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSimulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSimulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP_Simulator(P_Simulator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicNode(BasicNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TreeSwitch
