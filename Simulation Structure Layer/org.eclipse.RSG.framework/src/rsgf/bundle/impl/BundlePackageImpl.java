/**
 */
package rsgf.bundle.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rsgf.bundle.Bundle;
import rsgf.bundle.BundleFactory;
import rsgf.bundle.BundlePackage;

import rsgf.bundle.util.BundleValidator;

import rsgf.mw.MwPackage;

import rsgf.mw.impl.MwPackageImpl;

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
public class BundlePackageImpl extends EPackageImpl implements BundlePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

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
	 * @see rsgf.bundle.BundlePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BundlePackageImpl() {
		super(eNS_URI, BundleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BundlePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BundlePackage init() {
		if (isInited) return (BundlePackage)EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI);

		// Obtain or create and register package
		BundlePackageImpl theBundlePackage = (BundlePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BundlePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BundlePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TreePackageImpl theTreePackage = (TreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) instanceof TreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) : TreePackage.eINSTANCE);
		SkeletonPackageImpl theSkeletonPackage = (SkeletonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SkeletonPackage.eNS_URI) instanceof SkeletonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SkeletonPackage.eNS_URI) : SkeletonPackage.eINSTANCE);
		VmPackageImpl theVmPackage = (VmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VmPackage.eNS_URI) instanceof VmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VmPackage.eNS_URI) : VmPackage.eINSTANCE);
		MwPackageImpl theMwPackage = (MwPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MwPackage.eNS_URI) instanceof MwPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MwPackage.eNS_URI) : MwPackage.eINSTANCE);

		// Create package meta-data objects
		theBundlePackage.createPackageContents();
		theTreePackage.createPackageContents();
		theSkeletonPackage.createPackageContents();
		theVmPackage.createPackageContents();
		theMwPackage.createPackageContents();

		// Initialize created meta-data
		theBundlePackage.initializePackageContents();
		theTreePackage.initializePackageContents();
		theSkeletonPackage.initializePackageContents();
		theVmPackage.initializePackageContents();
		theMwPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBundlePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return BundleValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBundlePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BundlePackage.eNS_URI, theBundlePackage);
		return theBundlePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundle() {
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundle_ID() {
		return (EAttribute)bundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Skeleton() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Process() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_ID() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Nodes() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Middleware() {
		return (EReference)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleFactory getBundleFactory() {
		return (BundleFactory)getEFactoryInstance();
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
		bundleEClass = createEClass(BUNDLE);
		createEAttribute(bundleEClass, BUNDLE__ID);
		createEReference(bundleEClass, BUNDLE__SKELETON);
		createEReference(bundleEClass, BUNDLE__PROCESS);

		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__ID);
		createEReference(processEClass, PROCESS__NODES);
		createEReference(processEClass, PROCESS__MIDDLEWARE);
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
		SkeletonPackage theSkeletonPackage = (SkeletonPackage)EPackage.Registry.INSTANCE.getEPackage(SkeletonPackage.eNS_URI);
		TreePackage theTreePackage = (TreePackage)EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI);
		MwPackage theMwPackage = (MwPackage)EPackage.Registry.INSTANCE.getEPackage(MwPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(bundleEClass, Bundle.class, "Bundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundle_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Skeleton(), theSkeletonPackage.getSkeleton(), null, "skeleton", null, 1, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Process(), this.getProcess(), null, "Process", null, 1, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processEClass, rsgf.bundle.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_ID(), ecorePackage.getEString(), "ID", null, 1, 1, rsgf.bundle.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Nodes(), theTreePackage.getNode(), null, "nodes", null, 1, -1, rsgf.bundle.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_Middleware(), theMwPackage.getMiddleware(), null, "middleware", null, 1, 1, rsgf.bundle.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (bundleEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueBundleID AllRootsFromSkeletonAreNotInBundle AllRootsFromTreeAreNotInBundle AllCoordinatorsAreNotInBundle AllSimulatorsAreNotInBundle IDCanNotBeEmpty"
		   });	
		addAnnotation
		  (processEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueProcessID UniqueNodes ProcessIsNotInBundle IDCanNotBeEmpty"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (bundleEClass, 
		   source, 
		   new String[] {
			 "UniqueBundleID", "self.ID\n\t\t\t\t->forAll(n | Bundle.allInstances().ID\n\t\t\t\t\t->count(n) = 1)",
			 "AllRootsFromSkeletonAreNotInBundle", "self.Process.nodes\n\t\t\t\t->includesAll(self.skeleton.rootskel)",
			 "AllRootsFromTreeAreNotInBundle", "self.Process.nodes\n\t\t\t\t->includes(self.skeleton.tree.Root)",
			 "AllCoordinatorsAreNotInBundle", "self.Process.nodes\n\t\t\t\t->includesAll(self.skeleton.tree.Coordinator)",
			 "AllSimulatorsAreNotInBundle", "self.Process.nodes\n\t\t\t\t->includesAll(self.skeleton.tree.Simulator)",
			 "IDCanNotBeEmpty", "\n\t\t\t\tself.ID.size() > 0"
		   });	
		addAnnotation
		  (processEClass, 
		   source, 
		   new String[] {
			 "UniqueProcessID", "self.ID\n\t\t\t\t->forAll(n | Process.allInstances().ID\n\t\t\t\t\t->count(n) = 1)",
			 "UniqueNodes", "self.nodes\n\t\t\t\t->forAll(n | Process.allInstances().nodes\n\t\t\t\t\t->count(n) = 1)",
			 "ProcessIsNotInBundle", "Bundle.allInstances().Process\n\t\t\t\t->includes(self)",
			 "IDCanNotBeEmpty", "\n\t\t\t\tself.ID.size() > 0"
		   });
	}

} //BundlePackageImpl
