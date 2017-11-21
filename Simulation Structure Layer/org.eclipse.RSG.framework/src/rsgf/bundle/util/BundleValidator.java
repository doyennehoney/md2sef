/**
 */
package rsgf.bundle.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import rsgf.bundle.Bundle;
import rsgf.bundle.BundlePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see rsgf.bundle.BundlePackage
 * @generated
 */
public class BundleValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BundleValidator INSTANCE = new BundleValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "rsgf.bundle";

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
	public BundleValidator() {
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
	  return BundlePackage.eINSTANCE;
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
			case BundlePackage.BUNDLE:
				return validateBundle((Bundle)value, diagnostics, context);
			case BundlePackage.PROCESS:
				return validateProcess((rsgf.bundle.Process)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundle(Bundle bundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bundle, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateBundle_UniqueBundleID(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateBundle_AllRootsFromSkeletonAreNotInBundle(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateBundle_AllRootsFromTreeAreNotInBundle(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateBundle_AllCoordinatorsAreNotInBundle(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateBundle_AllSimulatorsAreNotInBundle(bundle, diagnostics, context);
		if (result || diagnostics != null) result &= validateBundle_IDCanNotBeEmpty(bundle, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueBundleID constraint of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUNDLE__UNIQUE_BUNDLE_ID__EEXPRESSION = "self.ID\n" +
		"\t\t\t\t->forAll(n | Bundle.allInstances().ID\n" +
		"\t\t\t\t\t->count(n) = 1)";

	/**
	 * Validates the UniqueBundleID constraint of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundle_UniqueBundleID(Bundle bundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BundlePackage.Literals.BUNDLE,
				 bundle,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueBundleID",
				 BUNDLE__UNIQUE_BUNDLE_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllRootsFromSkeletonAreNotInBundle constraint of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUNDLE__ALL_ROOTS_FROM_SKELETON_ARE_NOT_IN_BUNDLE__EEXPRESSION = "self.Process.nodes\n" +
		"\t\t\t\t->includesAll(self.skeleton.rootskel)";

	/**
	 * Validates the AllRootsFromSkeletonAreNotInBundle constraint of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundle_AllRootsFromSkeletonAreNotInBundle(Bundle bundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BundlePackage.Literals.BUNDLE,
				 bundle,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllRootsFromSkeletonAreNotInBundle",
				 BUNDLE__ALL_ROOTS_FROM_SKELETON_ARE_NOT_IN_BUNDLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllRootsFromTreeAreNotInBundle constraint of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUNDLE__ALL_ROOTS_FROM_TREE_ARE_NOT_IN_BUNDLE__EEXPRESSION = "self.Process.nodes\n" +
		"\t\t\t\t->includes(self.skeleton.tree.Root)";

	/**
	 * Validates the AllRootsFromTreeAreNotInBundle constraint of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundle_AllRootsFromTreeAreNotInBundle(Bundle bundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BundlePackage.Literals.BUNDLE,
				 bundle,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllRootsFromTreeAreNotInBundle",
				 BUNDLE__ALL_ROOTS_FROM_TREE_ARE_NOT_IN_BUNDLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllCoordinatorsAreNotInBundle constraint of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUNDLE__ALL_COORDINATORS_ARE_NOT_IN_BUNDLE__EEXPRESSION = "self.Process.nodes\n" +
		"\t\t\t\t->includesAll(self.skeleton.tree.Coordinator)";

	/**
	 * Validates the AllCoordinatorsAreNotInBundle constraint of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundle_AllCoordinatorsAreNotInBundle(Bundle bundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BundlePackage.Literals.BUNDLE,
				 bundle,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllCoordinatorsAreNotInBundle",
				 BUNDLE__ALL_COORDINATORS_ARE_NOT_IN_BUNDLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AllSimulatorsAreNotInBundle constraint of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUNDLE__ALL_SIMULATORS_ARE_NOT_IN_BUNDLE__EEXPRESSION = "self.Process.nodes\n" +
		"\t\t\t\t->includesAll(self.skeleton.tree.Simulator)";

	/**
	 * Validates the AllSimulatorsAreNotInBundle constraint of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundle_AllSimulatorsAreNotInBundle(Bundle bundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BundlePackage.Literals.BUNDLE,
				 bundle,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllSimulatorsAreNotInBundle",
				 BUNDLE__ALL_SIMULATORS_ARE_NOT_IN_BUNDLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IDCanNotBeEmpty constraint of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BUNDLE__ID_CAN_NOT_BE_EMPTY__EEXPRESSION = "\n" +
		"\t\t\t\tself.ID.size() > 0";

	/**
	 * Validates the IDCanNotBeEmpty constraint of '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBundle_IDCanNotBeEmpty(Bundle bundle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BundlePackage.Literals.BUNDLE,
				 bundle,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IDCanNotBeEmpty",
				 BUNDLE__ID_CAN_NOT_BE_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(rsgf.bundle.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_UniqueProcessID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_UniqueNodes(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_ProcessIsNotInBundle(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_IDCanNotBeEmpty(process, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueProcessID constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__UNIQUE_PROCESS_ID__EEXPRESSION = "self.ID\n" +
		"\t\t\t\t->forAll(n | Process.allInstances().ID\n" +
		"\t\t\t\t\t->count(n) = 1)";

	/**
	 * Validates the UniqueProcessID constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_UniqueProcessID(rsgf.bundle.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BundlePackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueProcessID",
				 PROCESS__UNIQUE_PROCESS_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueNodes constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__UNIQUE_NODES__EEXPRESSION = "self.nodes\n" +
		"\t\t\t\t->forAll(n | Process.allInstances().nodes\n" +
		"\t\t\t\t\t->count(n) = 1)";

	/**
	 * Validates the UniqueNodes constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_UniqueNodes(rsgf.bundle.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BundlePackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueNodes",
				 PROCESS__UNIQUE_NODES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ProcessIsNotInBundle constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__PROCESS_IS_NOT_IN_BUNDLE__EEXPRESSION = "Bundle.allInstances().Process\n" +
		"\t\t\t\t->includes(self)";

	/**
	 * Validates the ProcessIsNotInBundle constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_ProcessIsNotInBundle(rsgf.bundle.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BundlePackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProcessIsNotInBundle",
				 PROCESS__PROCESS_IS_NOT_IN_BUNDLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IDCanNotBeEmpty constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__ID_CAN_NOT_BE_EMPTY__EEXPRESSION = "\n" +
		"\t\t\t\tself.ID.size() > 0";

	/**
	 * Validates the IDCanNotBeEmpty constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_IDCanNotBeEmpty(rsgf.bundle.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BundlePackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IDCanNotBeEmpty",
				 PROCESS__ID_CAN_NOT_BE_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //BundleValidator
