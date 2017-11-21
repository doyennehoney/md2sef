/**
 */
package rsgf.skeleton.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import rsgf.skeleton.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see rsgf.skeleton.SkeletonPackage
 * @generated
 */
public class SkeletonValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SkeletonValidator INSTANCE = new SkeletonValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "rsgf.skeleton";

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
	public SkeletonValidator() {
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
	  return SkeletonPackage.eINSTANCE;
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
			case SkeletonPackage.SKELETON:
				return validateSkeleton((Skeleton)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkeleton(Skeleton skeleton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(skeleton, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(skeleton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(skeleton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(skeleton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(skeleton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(skeleton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(skeleton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(skeleton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(skeleton, diagnostics, context);
		if (result || diagnostics != null) result &= validateSkeleton_uniqueID(skeleton, diagnostics, context);
		if (result || diagnostics != null) result &= validateSkeleton_IDCanNotBeEmpty(skeleton, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueID constraint of '<em>Skeleton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SKELETON__UNIQUE_ID__EEXPRESSION = "self.ID\n" +
		"\t\t\t\t->forAll(n | Skeleton.allInstances().ID\n" +
		"\t\t\t\t\t->count(n) = 1)";

	/**
	 * Validates the uniqueID constraint of '<em>Skeleton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkeleton_uniqueID(Skeleton skeleton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SkeletonPackage.Literals.SKELETON,
				 skeleton,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueID",
				 SKELETON__UNIQUE_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IDCanNotBeEmpty constraint of '<em>Skeleton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SKELETON__ID_CAN_NOT_BE_EMPTY__EEXPRESSION = "\n" +
		"\t\t\t\tself.ID.size() > 0";

	/**
	 * Validates the IDCanNotBeEmpty constraint of '<em>Skeleton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSkeleton_IDCanNotBeEmpty(Skeleton skeleton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SkeletonPackage.Literals.SKELETON,
				 skeleton,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IDCanNotBeEmpty",
				 SKELETON__ID_CAN_NOT_BE_EMPTY__EEXPRESSION,
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

} //SkeletonValidator
