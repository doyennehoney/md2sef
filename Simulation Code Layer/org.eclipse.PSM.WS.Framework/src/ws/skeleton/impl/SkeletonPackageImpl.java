/**
 */
package ws.skeleton.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ws.bundle.BundlePackage;

import ws.bundle.impl.BundlePackageImpl;

import ws.middleware.MiddlewarePackage;

import ws.middleware.impl.MiddlewarePackageImpl;

import ws.skeleton.Skeleton;
import ws.skeleton.SkeletonFactory;
import ws.skeleton.SkeletonPackage;

import ws.tree.TreePackage;

import ws.tree.impl.TreePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkeletonPackageImpl extends EPackageImpl implements SkeletonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skeletonEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ws.skeleton.SkeletonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SkeletonPackageImpl() {
		super(eNS_URI, SkeletonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SkeletonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SkeletonPackage init() {
		if (isInited) return (SkeletonPackage)EPackage.Registry.INSTANCE.getEPackage(SkeletonPackage.eNS_URI);

		// Obtain or create and register package
		SkeletonPackageImpl theSkeletonPackage = (SkeletonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SkeletonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SkeletonPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MiddlewarePackageImpl theMiddlewarePackage = (MiddlewarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MiddlewarePackage.eNS_URI) instanceof MiddlewarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MiddlewarePackage.eNS_URI) : MiddlewarePackage.eINSTANCE);
		TreePackageImpl theTreePackage = (TreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) instanceof TreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) : TreePackage.eINSTANCE);
		BundlePackageImpl theBundlePackage = (BundlePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI) instanceof BundlePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI) : BundlePackage.eINSTANCE);

		// Create package meta-data objects
		theSkeletonPackage.createPackageContents();
		theMiddlewarePackage.createPackageContents();
		theTreePackage.createPackageContents();
		theBundlePackage.createPackageContents();

		// Initialize created meta-data
		theSkeletonPackage.initializePackageContents();
		theMiddlewarePackage.initializePackageContents();
		theTreePackage.initializePackageContents();
		theBundlePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSkeletonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SkeletonPackage.eNS_URI, theSkeletonPackage);
		return theSkeletonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkeleton() {
		return skeletonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkeleton_ID() {
		return (EAttribute)skeletonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkeleton_Tree() {
		return (EReference)skeletonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkeleton_Rootskel() {
		return (EReference)skeletonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkeletonFactory getSkeletonFactory() {
		return (SkeletonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		skeletonEClass = createEClass(SKELETON);
		createEAttribute(skeletonEClass, SKELETON__ID);
		createEReference(skeletonEClass, SKELETON__TREE);
		createEReference(skeletonEClass, SKELETON__ROOTSKEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TreePackage theTreePackage = (TreePackage)EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(skeletonEClass, Skeleton.class, "Skeleton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkeleton_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Skeleton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkeleton_Tree(), theTreePackage.getTree(), null, "tree", null, 0, 1, Skeleton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkeleton_Rootskel(), theTreePackage.getRoot(), null, "rootskel", null, 1, -1, Skeleton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SkeletonPackageImpl
