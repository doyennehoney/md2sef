/**
 */
package rsgf.skeleton;

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
 * @see rsgf.skeleton.SkeletonFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SkeletonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "skeleton";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://devs.org/RevisedSkeleton";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "revisedskeleton";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SkeletonPackage eINSTANCE = rsgf.skeleton.impl.SkeletonPackageImpl.init();

	/**
	 * The meta object id for the '{@link rsgf.skeleton.impl.SkeletonImpl <em>Skeleton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rsgf.skeleton.impl.SkeletonImpl
	 * @see rsgf.skeleton.impl.SkeletonPackageImpl#getSkeleton()
	 * @generated
	 */
	int SKELETON = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON__ID = 0;

	/**
	 * The feature id for the '<em><b>Tree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON__TREE = 1;

	/**
	 * The feature id for the '<em><b>Rootskel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON__ROOTSKEL = 2;

	/**
	 * The number of structural features of the '<em>Skeleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Skeleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKELETON_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link rsgf.skeleton.Skeleton <em>Skeleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skeleton</em>'.
	 * @see rsgf.skeleton.Skeleton
	 * @generated
	 */
	EClass getSkeleton();

	/**
	 * Returns the meta object for the attribute '{@link rsgf.skeleton.Skeleton#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see rsgf.skeleton.Skeleton#getID()
	 * @see #getSkeleton()
	 * @generated
	 */
	EAttribute getSkeleton_ID();

	/**
	 * Returns the meta object for the reference '{@link rsgf.skeleton.Skeleton#getTree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tree</em>'.
	 * @see rsgf.skeleton.Skeleton#getTree()
	 * @see #getSkeleton()
	 * @generated
	 */
	EReference getSkeleton_Tree();

	/**
	 * Returns the meta object for the containment reference list '{@link rsgf.skeleton.Skeleton#getRootskel <em>Rootskel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rootskel</em>'.
	 * @see rsgf.skeleton.Skeleton#getRootskel()
	 * @see #getSkeleton()
	 * @generated
	 */
	EReference getSkeleton_Rootskel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SkeletonFactory getSkeletonFactory();

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
		 * The meta object literal for the '{@link rsgf.skeleton.impl.SkeletonImpl <em>Skeleton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rsgf.skeleton.impl.SkeletonImpl
		 * @see rsgf.skeleton.impl.SkeletonPackageImpl#getSkeleton()
		 * @generated
		 */
		EClass SKELETON = eINSTANCE.getSkeleton();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKELETON__ID = eINSTANCE.getSkeleton_ID();

		/**
		 * The meta object literal for the '<em><b>Tree</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKELETON__TREE = eINSTANCE.getSkeleton_Tree();

		/**
		 * The meta object literal for the '<em><b>Rootskel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKELETON__ROOTSKEL = eINSTANCE.getSkeleton_Rootskel();

	}

} //SkeletonPackage
