/**
 */
package rsgf.vm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rsgf.bundle.BundlePackage;

import rsgf.bundle.impl.BundlePackageImpl;

import rsgf.mw.MwPackage;

import rsgf.mw.impl.MwPackageImpl;

import rsgf.skeleton.SkeletonPackage;

import rsgf.skeleton.impl.SkeletonPackageImpl;

import rsgf.tree.TreePackage;

import rsgf.tree.impl.TreePackageImpl;

import rsgf.vm.VmFactory;
import rsgf.vm.VmPackage;

import rsgf.vm.util.VmValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmPackageImpl extends EPackageImpl implements VmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmEClass = null;

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
	 * @see rsgf.vm.VmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VmPackageImpl() {
		super(eNS_URI, VmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VmPackage init() {
		if (isInited) return (VmPackage)EPackage.Registry.INSTANCE.getEPackage(VmPackage.eNS_URI);

		// Obtain or create and register package
		VmPackageImpl theVmPackage = (VmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VmPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TreePackageImpl theTreePackage = (TreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) instanceof TreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) : TreePackage.eINSTANCE);
		SkeletonPackageImpl theSkeletonPackage = (SkeletonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SkeletonPackage.eNS_URI) instanceof SkeletonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SkeletonPackage.eNS_URI) : SkeletonPackage.eINSTANCE);
		BundlePackageImpl theBundlePackage = (BundlePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI) instanceof BundlePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI) : BundlePackage.eINSTANCE);
		MwPackageImpl theMwPackage = (MwPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MwPackage.eNS_URI) instanceof MwPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MwPackage.eNS_URI) : MwPackage.eINSTANCE);

		// Create package meta-data objects
		theVmPackage.createPackageContents();
		theTreePackage.createPackageContents();
		theSkeletonPackage.createPackageContents();
		theBundlePackage.createPackageContents();
		theMwPackage.createPackageContents();

		// Initialize created meta-data
		theVmPackage.initializePackageContents();
		theTreePackage.initializePackageContents();
		theSkeletonPackage.initializePackageContents();
		theBundlePackage.initializePackageContents();
		theMwPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theVmPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return VmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theVmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VmPackage.eNS_URI, theVmPackage);
		return theVmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVM() {
		return vmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_ID() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_Protocol() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmFactory getVmFactory() {
		return (VmFactory)getEFactoryInstance();
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
		vmEClass = createEClass(VM);
		createEAttribute(vmEClass, VM__ID);
		createEAttribute(vmEClass, VM__PROTOCOL);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(vmEClass, rsgf.vm.VM.class, "VM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVM_ID(), ecorePackage.getEString(), "ID", null, 1, 1, rsgf.vm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_Protocol(), ecorePackage.getEString(), "protocol", null, 1, 1, rsgf.vm.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (vmEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueVMID IDCanNotBeEmpty"
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
		  (vmEClass, 
		   source, 
		   new String[] {
			 "UniqueVMID", "self.ID\n\t\t\t\t->forAll(n | VM.allInstances().ID\n\t\t\t\t\t->count(n) = 1)",
			 "IDCanNotBeEmpty", "\n\t\t\t\tself.ID.size() > 0"
		   });
	}

} //VmPackageImpl
