/**
 */
package rsgf.tree.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rsgf.bundle.BundlePackage;

import rsgf.bundle.impl.BundlePackageImpl;

import rsgf.mw.MwPackage;

import rsgf.mw.impl.MwPackageImpl;

import rsgf.skeleton.SkeletonPackage;

import rsgf.skeleton.impl.SkeletonPackageImpl;

import rsgf.tree.BasicNode;
import rsgf.tree.CDEVSCoordinator;
import rsgf.tree.CDEVSSimulator;
import rsgf.tree.Coordinator;
import rsgf.tree.FlatCoordinator;
import rsgf.tree.Node;
import rsgf.tree.NodeCoordinator;
import rsgf.tree.PDEVSCoordinator;
import rsgf.tree.PDEVSSimulator;
import rsgf.tree.P_Coordinator;
import rsgf.tree.P_Simulator;
import rsgf.tree.Root;
import rsgf.tree.Simulator;
import rsgf.tree.Tree;
import rsgf.tree.TreeFactory;
import rsgf.tree.TreePackage;

import rsgf.tree.util.TreeValidator;

import rsgf.vm.VmPackage;

import rsgf.vm.impl.VmPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TreePackageImpl extends EPackageImpl implements TreePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdevsCoordinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdevsCoordinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatCoordinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeCoordinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p_CoordinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdevsSimulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdevsSimulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass p_SimulatorEClass = null;

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
	 * @see rsgf.tree.TreePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TreePackageImpl() {
		super(eNS_URI, TreeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TreePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TreePackage init() {
		if (isInited) return (TreePackage)EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI);

		// Obtain or create and register package
		TreePackageImpl theTreePackage = (TreePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TreePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TreePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SkeletonPackageImpl theSkeletonPackage = (SkeletonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SkeletonPackage.eNS_URI) instanceof SkeletonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SkeletonPackage.eNS_URI) : SkeletonPackage.eINSTANCE);
		BundlePackageImpl theBundlePackage = (BundlePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI) instanceof BundlePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI) : BundlePackage.eINSTANCE);
		VmPackageImpl theVmPackage = (VmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VmPackage.eNS_URI) instanceof VmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VmPackage.eNS_URI) : VmPackage.eINSTANCE);
		MwPackageImpl theMwPackage = (MwPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MwPackage.eNS_URI) instanceof MwPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MwPackage.eNS_URI) : MwPackage.eINSTANCE);

		// Create package meta-data objects
		theTreePackage.createPackageContents();
		theSkeletonPackage.createPackageContents();
		theBundlePackage.createPackageContents();
		theVmPackage.createPackageContents();
		theMwPackage.createPackageContents();

		// Initialize created meta-data
		theTreePackage.initializePackageContents();
		theSkeletonPackage.initializePackageContents();
		theBundlePackage.initializePackageContents();
		theVmPackage.initializePackageContents();
		theMwPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTreePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TreeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTreePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TreePackage.eNS_URI, theTreePackage);
		return theTreePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTree() {
		return treeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTree_ID() {
		return (EAttribute)treeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTree_Root() {
		return (EReference)treeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTree_Coordinator() {
		return (EReference)treeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTree_Simulator() {
		return (EReference)treeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_ID() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Child() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicNode() {
		return basicNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicNode_ModelName() {
		return (EAttribute)basicNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinator() {
		return coordinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinator_Children() {
		return (EReference)coordinatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDEVSCoordinator() {
		return cdevsCoordinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDEVSCoordinator() {
		return pdevsCoordinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlatCoordinator() {
		return flatCoordinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeCoordinator() {
		return nodeCoordinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP_Coordinator() {
		return p_CoordinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulator() {
		return simulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDEVSSimulator() {
		return cdevsSimulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDEVSSimulator() {
		return pdevsSimulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP_Simulator() {
		return p_SimulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeFactory getTreeFactory() {
		return (TreeFactory)getEFactoryInstance();
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
		treeEClass = createEClass(TREE);
		createEAttribute(treeEClass, TREE__ID);
		createEReference(treeEClass, TREE__ROOT);
		createEReference(treeEClass, TREE__COORDINATOR);
		createEReference(treeEClass, TREE__SIMULATOR);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__ID);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__CHILD);

		basicNodeEClass = createEClass(BASIC_NODE);
		createEAttribute(basicNodeEClass, BASIC_NODE__MODEL_NAME);

		coordinatorEClass = createEClass(COORDINATOR);
		createEReference(coordinatorEClass, COORDINATOR__CHILDREN);

		cdevsCoordinatorEClass = createEClass(CDEVS_COORDINATOR);

		pdevsCoordinatorEClass = createEClass(PDEVS_COORDINATOR);

		flatCoordinatorEClass = createEClass(FLAT_COORDINATOR);

		nodeCoordinatorEClass = createEClass(NODE_COORDINATOR);

		p_CoordinatorEClass = createEClass(PCOORDINATOR);

		simulatorEClass = createEClass(SIMULATOR);

		cdevsSimulatorEClass = createEClass(CDEVS_SIMULATOR);

		pdevsSimulatorEClass = createEClass(PDEVS_SIMULATOR);

		p_SimulatorEClass = createEClass(PSIMULATOR);
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
		rootEClass.getESuperTypes().add(this.getNode());
		basicNodeEClass.getESuperTypes().add(this.getNode());
		coordinatorEClass.getESuperTypes().add(this.getBasicNode());
		cdevsCoordinatorEClass.getESuperTypes().add(this.getCoordinator());
		pdevsCoordinatorEClass.getESuperTypes().add(this.getCoordinator());
		flatCoordinatorEClass.getESuperTypes().add(this.getCoordinator());
		nodeCoordinatorEClass.getESuperTypes().add(this.getCoordinator());
		p_CoordinatorEClass.getESuperTypes().add(this.getCoordinator());
		simulatorEClass.getESuperTypes().add(this.getBasicNode());
		cdevsSimulatorEClass.getESuperTypes().add(this.getSimulator());
		pdevsSimulatorEClass.getESuperTypes().add(this.getSimulator());
		p_SimulatorEClass.getESuperTypes().add(this.getSimulator());

		// Initialize classes, features, and operations; add parameters
		initEClass(treeEClass, Tree.class, "Tree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTree_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTree_Root(), this.getRoot(), null, "Root", null, 1, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTree_Coordinator(), this.getCoordinator(), null, "Coordinator", null, 0, -1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTree_Simulator(), this.getSimulator(), null, "Simulator", null, 1, -1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Child(), this.getBasicNode(), null, "child", null, 1, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicNodeEClass, BasicNode.class, "BasicNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicNode_ModelName(), ecorePackage.getEString(), "modelName", null, 0, 1, BasicNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinatorEClass, Coordinator.class, "Coordinator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinator_Children(), this.getBasicNode(), null, "children", null, 1, -1, Coordinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cdevsCoordinatorEClass, CDEVSCoordinator.class, "CDEVSCoordinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pdevsCoordinatorEClass, PDEVSCoordinator.class, "PDEVSCoordinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flatCoordinatorEClass, FlatCoordinator.class, "FlatCoordinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeCoordinatorEClass, NodeCoordinator.class, "NodeCoordinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(p_CoordinatorEClass, P_Coordinator.class, "P_Coordinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simulatorEClass, Simulator.class, "Simulator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdevsSimulatorEClass, CDEVSSimulator.class, "CDEVSSimulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pdevsSimulatorEClass, PDEVSSimulator.class, "PDEVSSimulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(p_SimulatorEClass, P_Simulator.class, "P_Simulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (treeEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueTreeID IDCanNotBeEmpty"
		   });	
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueID IDCanNotBeEmpty"
		   });	
		addAnnotation
		  (basicNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "MustBeAChild"
		   });	
		addAnnotation
		  (coordinatorEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueChildren ChildrenCantIncludeSelf CantOccurAsChildOfRootAndCoordinator"
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
		  (treeEClass, 
		   source, 
		   new String[] {
			 "UniqueTreeID", "self.ID\n\t\t\t\t->forAll(n | Tree.allInstances().ID\n\t\t\t\t\t->count(n) = 1)",
			 "IDCanNotBeEmpty", "\n\t\t\t\tself.ID.size() > 0"
		   });	
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "UniqueID", "self.ID\n\t\t\t\t->forAll(n | Node.allInstances().ID\n\t\t\t\t\t->count(n) = 1)",
			 "IDCanNotBeEmpty", "\n\t\t\t\tself.ID.size() > 0"
		   });	
		addAnnotation
		  (basicNodeEClass, 
		   source, 
		   new String[] {
			 "MustBeAChild", "Coordinator.allInstances().children\n\t\t\t\t->includes(self) or Root.allInstances().child\n\t\t\t\t->includes(self)"
		   });	
		addAnnotation
		  (coordinatorEClass, 
		   source, 
		   new String[] {
			 "UniqueChildren", "self.children\n\t\t\t\t->forAll(n | Coordinator.allInstances().children\n\t\t\t\t\t->count(n) = 1)",
			 "ChildrenCantIncludeSelf", "self.children\n\t\t\t\t->excludes(self)",
			 "CantOccurAsChildOfRootAndCoordinator", "not (Coordinator.allInstances().children\n\t\t\t\t->includes(self) and Root.allInstances().child\n\t\t\t\t->includes(self))"
		   });
	}

} //TreePackageImpl
