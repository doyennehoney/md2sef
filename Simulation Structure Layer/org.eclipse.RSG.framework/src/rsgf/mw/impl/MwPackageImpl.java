/**
 */
package rsgf.mw.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rsgf.bundle.BundlePackage;

import rsgf.bundle.impl.BundlePackageImpl;

import rsgf.mw.Middleware;
import rsgf.mw.MwFactory;
import rsgf.mw.MwPackage;

import rsgf.skeleton.SkeletonPackage;

import rsgf.skeleton.impl.SkeletonPackageImpl;

import rsgf.tree.TreePackage;

import rsgf.tree.impl.TreePackageImpl;

import rsgf.vm.VmPackage;

import rsgf.vm.impl.VmPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MwPackageImpl extends EPackageImpl implements MwPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass middlewareEClass = null;

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
	 * @see rsgf.mw.MwPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MwPackageImpl() {
		super(eNS_URI, MwFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MwPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MwPackage init() {
		if (isInited) return (MwPackage)EPackage.Registry.INSTANCE.getEPackage(MwPackage.eNS_URI);

		// Obtain or create and register package
		MwPackageImpl theMwPackage = (MwPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MwPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MwPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TreePackageImpl theTreePackage = (TreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) instanceof TreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) : TreePackage.eINSTANCE);
		SkeletonPackageImpl theSkeletonPackage = (SkeletonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SkeletonPackage.eNS_URI) instanceof SkeletonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SkeletonPackage.eNS_URI) : SkeletonPackage.eINSTANCE);
		BundlePackageImpl theBundlePackage = (BundlePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI) instanceof BundlePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI) : BundlePackage.eINSTANCE);
		VmPackageImpl theVmPackage = (VmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VmPackage.eNS_URI) instanceof VmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VmPackage.eNS_URI) : VmPackage.eINSTANCE);

		// Create package meta-data objects
		theMwPackage.createPackageContents();
		theTreePackage.createPackageContents();
		theSkeletonPackage.createPackageContents();
		theBundlePackage.createPackageContents();
		theVmPackage.createPackageContents();

		// Initialize created meta-data
		theMwPackage.initializePackageContents();
		theTreePackage.initializePackageContents();
		theSkeletonPackage.initializePackageContents();
		theBundlePackage.initializePackageContents();
		theVmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMwPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MwPackage.eNS_URI, theMwPackage);
		return theMwPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiddleware() {
		return middlewareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiddleware_Process() {
		return (EReference)middlewareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiddleware_Uses() {
		return (EReference)middlewareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMiddleware__Bind() {
		return middlewareEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMiddleware__Establish() {
		return middlewareEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMiddleware__Send() {
		return middlewareEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MwFactory getMwFactory() {
		return (MwFactory)getEFactoryInstance();
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
		middlewareEClass = createEClass(MIDDLEWARE);
		createEReference(middlewareEClass, MIDDLEWARE__PROCESS);
		createEReference(middlewareEClass, MIDDLEWARE__USES);
		createEOperation(middlewareEClass, MIDDLEWARE___BIND);
		createEOperation(middlewareEClass, MIDDLEWARE___ESTABLISH);
		createEOperation(middlewareEClass, MIDDLEWARE___SEND);
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
		BundlePackage theBundlePackage = (BundlePackage)EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI);
		VmPackage theVmPackage = (VmPackage)EPackage.Registry.INSTANCE.getEPackage(VmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(middlewareEClass, Middleware.class, "Middleware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiddleware_Process(), theBundlePackage.getProcess(), null, "process", null, 1, -1, Middleware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMiddleware_Uses(), theVmPackage.getVM(), null, "uses", null, 0, 1, Middleware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMiddleware__Bind(), null, "bind", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMiddleware__Establish(), null, "establish", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMiddleware__Send(), null, "send", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MwPackageImpl
