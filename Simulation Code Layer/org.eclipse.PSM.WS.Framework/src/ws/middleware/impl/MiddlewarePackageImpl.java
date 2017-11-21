/**
 */
package ws.middleware.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ws.bundle.BundlePackage;

import ws.bundle.impl.BundlePackageImpl;

import ws.middleware.Middleware;
import ws.middleware.MiddlewareFactory;
import ws.middleware.MiddlewarePackage;
import ws.middleware.Processor;
import ws.middleware.Repository;
import ws.middleware.ServiceDescription;
import ws.middleware.ServiceImpl;
import ws.middleware.Stub;
import ws.middleware.WebService;

import ws.skeleton.SkeletonPackage;

import ws.skeleton.impl.SkeletonPackageImpl;

import ws.tree.TreePackage;

import ws.tree.impl.TreePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiddlewarePackageImpl extends EPackageImpl implements MiddlewarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass middlewareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptionEClass = null;

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
	 * @see ws.middleware.MiddlewarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MiddlewarePackageImpl() {
		super(eNS_URI, MiddlewareFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MiddlewarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MiddlewarePackage init() {
		if (isInited) return (MiddlewarePackage)EPackage.Registry.INSTANCE.getEPackage(MiddlewarePackage.eNS_URI);

		// Obtain or create and register package
		MiddlewarePackageImpl theMiddlewarePackage = (MiddlewarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MiddlewarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MiddlewarePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TreePackageImpl theTreePackage = (TreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) instanceof TreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) : TreePackage.eINSTANCE);
		SkeletonPackageImpl theSkeletonPackage = (SkeletonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SkeletonPackage.eNS_URI) instanceof SkeletonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SkeletonPackage.eNS_URI) : SkeletonPackage.eINSTANCE);
		BundlePackageImpl theBundlePackage = (BundlePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI) instanceof BundlePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BundlePackage.eNS_URI) : BundlePackage.eINSTANCE);

		// Create package meta-data objects
		theMiddlewarePackage.createPackageContents();
		theTreePackage.createPackageContents();
		theSkeletonPackage.createPackageContents();
		theBundlePackage.createPackageContents();

		// Initialize created meta-data
		theMiddlewarePackage.initializePackageContents();
		theTreePackage.initializePackageContents();
		theSkeletonPackage.initializePackageContents();
		theBundlePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMiddlewarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MiddlewarePackage.eNS_URI, theMiddlewarePackage);
		return theMiddlewarePackage;
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
	public EReference getMiddleware_Uses() {
		return (EReference)middlewareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiddleware_Process() {
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
	public EClass getWebService() {
		return webServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebService_Stubs() {
		return (EReference)webServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebService_Registry() {
		return (EReference)webServiceEClass.getEStructuralFeatures().get(1);
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
	public EReference getVM_Processors() {
		return (EReference)vmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_ID() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_IP() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessor__Receive() {
		return processorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceImpl() {
		return serviceImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceImpl__Receive() {
		return serviceImplEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStub() {
		return stubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStub_Impl() {
		return (EReference)stubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStub__Receive() {
		return stubEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Services() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRepository__Lookup() {
		return repositoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRepository__Rebind() {
		return repositoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescription() {
		return serviceDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiddlewareFactory getMiddlewareFactory() {
		return (MiddlewareFactory)getEFactoryInstance();
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
		createEReference(middlewareEClass, MIDDLEWARE__USES);
		createEReference(middlewareEClass, MIDDLEWARE__PROCESS);
		createEOperation(middlewareEClass, MIDDLEWARE___BIND);
		createEOperation(middlewareEClass, MIDDLEWARE___ESTABLISH);
		createEOperation(middlewareEClass, MIDDLEWARE___SEND);

		webServiceEClass = createEClass(WEB_SERVICE);
		createEReference(webServiceEClass, WEB_SERVICE__STUBS);
		createEReference(webServiceEClass, WEB_SERVICE__REGISTRY);

		vmEClass = createEClass(VM);
		createEAttribute(vmEClass, VM__ID);
		createEAttribute(vmEClass, VM__PROTOCOL);
		createEReference(vmEClass, VM__PROCESSORS);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__ID);
		createEAttribute(processorEClass, PROCESSOR__IP);
		createEOperation(processorEClass, PROCESSOR___RECEIVE);

		serviceImplEClass = createEClass(SERVICE_IMPL);
		createEOperation(serviceImplEClass, SERVICE_IMPL___RECEIVE);

		stubEClass = createEClass(STUB);
		createEReference(stubEClass, STUB__IMPL);
		createEOperation(stubEClass, STUB___RECEIVE);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__SERVICES);
		createEOperation(repositoryEClass, REPOSITORY___LOOKUP);
		createEOperation(repositoryEClass, REPOSITORY___REBIND);

		serviceDescriptionEClass = createEClass(SERVICE_DESCRIPTION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		webServiceEClass.getESuperTypes().add(this.getMiddleware());
		serviceImplEClass.getESuperTypes().add(this.getServiceDescription());

		// Initialize classes, features, and operations; add parameters
		initEClass(middlewareEClass, Middleware.class, "Middleware", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiddleware_Uses(), this.getVM(), null, "uses", null, 0, 1, Middleware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiddleware_Process(), theBundlePackage.getProcess(), null, "process", null, 1, -1, Middleware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getMiddleware__Bind(), null, "bind", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMiddleware__Establish(), null, "establish", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMiddleware__Send(), null, "send", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(webServiceEClass, WebService.class, "WebService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebService_Stubs(), this.getStub(), null, "stubs", null, 1, -1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWebService_Registry(), this.getRepository(), null, "registry", null, 1, 1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmEClass, ws.middleware.VM.class, "VM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVM_ID(), ecorePackage.getEString(), "ID", null, 1, 1, ws.middleware.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_Protocol(), ecorePackage.getEString(), "protocol", null, 1, 1, ws.middleware.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVM_Processors(), this.getProcessor(), null, "processors", null, 1, -1, ws.middleware.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_IP(), ecorePackage.getEString(), "IP", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProcessor__Receive(), null, "receive", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceImplEClass, ServiceImpl.class, "ServiceImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getServiceImpl__Receive(), null, "receive", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stubEClass, Stub.class, "Stub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStub_Impl(), this.getServiceImpl(), null, "impl", null, 1, 1, Stub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStub__Receive(), null, "receive", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Services(), this.getServiceImpl(), null, "services", null, 1, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRepository__Lookup(), null, "lookup", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRepository__Rebind(), null, "rebind", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceDescriptionEClass, ServiceDescription.class, "ServiceDescription", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MiddlewarePackageImpl
