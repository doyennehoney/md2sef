/**
 */
package rsgf.tree.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import rsgf.tree.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see rsgf.tree.TreePackage
 * @generated
 */
public class TreeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TreeValidator INSTANCE = new TreeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "rsgf.tree";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TreePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TreePackage.TREE:
				return validateTree((Tree)value, diagnostics, context);
			case TreePackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case TreePackage.ROOT:
				return validateRoot((Root)value, diagnostics, context);
			case TreePackage.BASIC_NODE:
				return validateBasicNode((BasicNode)value, diagnostics, context);
			case TreePackage.COORDINATOR:
				return validateCoordinator((Coordinator)value, diagnostics, context);
			case TreePackage.CDEVS_COORDINATOR:
				return validateCDEVSCoordinator((CDEVSCoordinator)value, diagnostics, context);
			case TreePackage.PDEVS_COORDINATOR:
				return validatePDEVSCoordinator((PDEVSCoordinator)value, diagnostics, context);
			case TreePackage.FLAT_COORDINATOR:
				return validateFlatCoordinator((FlatCoordinator)value, diagnostics, context);
			case TreePackage.NODE_COORDINATOR:
				return validateNodeCoordinator((NodeCoordinator)value, diagnostics, context);
			case TreePackage.PCOORDINATOR:
				return validateP_Coordinator((P_Coordinator)value, diagnostics, context);
			case TreePackage.SIMULATOR:
				return validateSimulator((Simulator)value, diagnostics, context);
			case TreePackage.CDEVS_SIMULATOR:
				return validateCDEVSSimulator((CDEVSSimulator)value, diagnostics, context);
			case TreePackage.PDEVS_SIMULATOR:
				return validatePDEVSSimulator((PDEVSSimulator)value, diagnostics, context);
			case TreePackage.PSIMULATOR:
				return validateP_Simulator((P_Simulator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTree(Tree tree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tree, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tree, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tree, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tree, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tree, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tree, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tree, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tree, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tree, diagnostics, context);
		if (result || diagnostics != null) result &= validateTree_UniqueTreeID(tree, diagnostics, context);
		if (result || diagnostics != null) result &= validateTree_IDCanNotBeEmpty(tree, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueTreeID constraint of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TREE__UNIQUE_TREE_ID__EEXPRESSION = "self.ID\n" +
		"\t\t\t\t->forAll(n | Tree.allInstances().ID\n" +
		"\t\t\t\t\t->count(n) = 1)";

	/**
	 * Validates the UniqueTreeID constraint of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTree_UniqueTreeID(Tree tree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TreePackage.Literals.TREE,
				 tree,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueTreeID",
				 TREE__UNIQUE_TREE_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IDCanNotBeEmpty constraint of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TREE__ID_CAN_NOT_BE_EMPTY__EEXPRESSION = "\n" +
		"\t\t\t\tself.ID.size() > 0";

	/**
	 * Validates the IDCanNotBeEmpty constraint of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTree_IDCanNotBeEmpty(Tree tree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TreePackage.Literals.TREE,
				 tree,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IDCanNotBeEmpty",
				 TREE__ID_CAN_NOT_BE_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(node, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueID constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__UNIQUE_ID__EEXPRESSION = "self.ID\n" +
		"\t\t\t\t->forAll(n | Node.allInstances().ID\n" +
		"\t\t\t\t\t->count(n) = 1)";

	/**
	 * Validates the UniqueID constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_UniqueID(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TreePackage.Literals.NODE,
				 node,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueID",
				 NODE__UNIQUE_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IDCanNotBeEmpty constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__ID_CAN_NOT_BE_EMPTY__EEXPRESSION = "\n" +
		"\t\t\t\tself.ID.size() > 0";

	/**
	 * Validates the IDCanNotBeEmpty constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_IDCanNotBeEmpty(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TreePackage.Literals.NODE,
				 node,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IDCanNotBeEmpty",
				 NODE__ID_CAN_NOT_BE_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoot(Root root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(root, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(root, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(root, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(root, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(root, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(root, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicNode(BasicNode basicNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(basicNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(basicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(basicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(basicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(basicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(basicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(basicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(basicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(basicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(basicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(basicNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicNode_MustBeAChild(basicNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MustBeAChild constraint of '<em>Basic Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASIC_NODE__MUST_BE_ACHILD__EEXPRESSION = "Coordinator.allInstances().children\n" +
		"\t\t\t\t->includes(self) or Root.allInstances().child\n" +
		"\t\t\t\t->includes(self)";

	/**
	 * Validates the MustBeAChild constraint of '<em>Basic Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicNode_MustBeAChild(BasicNode basicNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TreePackage.Literals.BASIC_NODE,
				 basicNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MustBeAChild",
				 BASIC_NODE__MUST_BE_ACHILD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinator(Coordinator coordinator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coordinator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicNode_MustBeAChild(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_UniqueChildren(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_ChildrenCantIncludeSelf(coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_CantOccurAsChildOfRootAndCoordinator(coordinator, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueChildren constraint of '<em>Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COORDINATOR__UNIQUE_CHILDREN__EEXPRESSION = "self.children\n" +
		"\t\t\t\t->forAll(n | Coordinator.allInstances().children\n" +
		"\t\t\t\t\t->count(n) = 1)";

	/**
	 * Validates the UniqueChildren constraint of '<em>Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinator_UniqueChildren(Coordinator coordinator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TreePackage.Literals.COORDINATOR,
				 coordinator,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueChildren",
				 COORDINATOR__UNIQUE_CHILDREN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ChildrenCantIncludeSelf constraint of '<em>Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COORDINATOR__CHILDREN_CANT_INCLUDE_SELF__EEXPRESSION = "self.children\n" +
		"\t\t\t\t->excludes(self)";

	/**
	 * Validates the ChildrenCantIncludeSelf constraint of '<em>Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinator_ChildrenCantIncludeSelf(Coordinator coordinator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TreePackage.Literals.COORDINATOR,
				 coordinator,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ChildrenCantIncludeSelf",
				 COORDINATOR__CHILDREN_CANT_INCLUDE_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CantOccurAsChildOfRootAndCoordinator constraint of '<em>Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COORDINATOR__CANT_OCCUR_AS_CHILD_OF_ROOT_AND_COORDINATOR__EEXPRESSION = "not (Coordinator.allInstances().children\n" +
		"\t\t\t\t->includes(self) and Root.allInstances().child\n" +
		"\t\t\t\t->includes(self))";

	/**
	 * Validates the CantOccurAsChildOfRootAndCoordinator constraint of '<em>Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinator_CantOccurAsChildOfRootAndCoordinator(Coordinator coordinator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TreePackage.Literals.COORDINATOR,
				 coordinator,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CantOccurAsChildOfRootAndCoordinator",
				 COORDINATOR__CANT_OCCUR_AS_CHILD_OF_ROOT_AND_COORDINATOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCDEVSCoordinator(CDEVSCoordinator cdevsCoordinator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cdevsCoordinator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicNode_MustBeAChild(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_UniqueChildren(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_ChildrenCantIncludeSelf(cdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_CantOccurAsChildOfRootAndCoordinator(cdevsCoordinator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePDEVSCoordinator(PDEVSCoordinator pdevsCoordinator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pdevsCoordinator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicNode_MustBeAChild(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_UniqueChildren(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_ChildrenCantIncludeSelf(pdevsCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_CantOccurAsChildOfRootAndCoordinator(pdevsCoordinator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlatCoordinator(FlatCoordinator flatCoordinator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(flatCoordinator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicNode_MustBeAChild(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_UniqueChildren(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_ChildrenCantIncludeSelf(flatCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_CantOccurAsChildOfRootAndCoordinator(flatCoordinator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeCoordinator(NodeCoordinator nodeCoordinator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nodeCoordinator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicNode_MustBeAChild(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_UniqueChildren(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_ChildrenCantIncludeSelf(nodeCoordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_CantOccurAsChildOfRootAndCoordinator(nodeCoordinator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP_Coordinator(P_Coordinator p_Coordinator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(p_Coordinator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicNode_MustBeAChild(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_UniqueChildren(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_ChildrenCantIncludeSelf(p_Coordinator, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoordinator_CantOccurAsChildOfRootAndCoordinator(p_Coordinator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimulator(Simulator simulator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simulator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicNode_MustBeAChild(simulator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCDEVSSimulator(CDEVSSimulator cdevsSimulator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cdevsSimulator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(cdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(cdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(cdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicNode_MustBeAChild(cdevsSimulator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePDEVSSimulator(PDEVSSimulator pdevsSimulator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pdevsSimulator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(pdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(pdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(pdevsSimulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicNode_MustBeAChild(pdevsSimulator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP_Simulator(P_Simulator p_Simulator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(p_Simulator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(p_Simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(p_Simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(p_Simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(p_Simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(p_Simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(p_Simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(p_Simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(p_Simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_UniqueID(p_Simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_IDCanNotBeEmpty(p_Simulator, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicNode_MustBeAChild(p_Simulator, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TreeValidator
