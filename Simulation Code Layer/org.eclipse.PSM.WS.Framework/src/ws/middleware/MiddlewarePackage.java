/**
 */
package ws.middleware;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ws.middleware.MiddlewareFactory
 * @model kind="package"
 * @generated
 */
public interface MiddlewarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "middleware";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://psm.org/middleware";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "middleware";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MiddlewarePackage eINSTANCE = ws.middleware.impl.MiddlewarePackageImpl.init();

	/**
	 * The meta object id for the '{@link ws.middleware.impl.MiddlewareImpl <em>Middleware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.middleware.impl.MiddlewareImpl
	 * @see ws.middleware.impl.MiddlewarePackageImpl#getMiddleware()
	 * @generated
	 */
	int MIDDLEWARE = 0;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__USES = 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__PROCESS = 1;

	/**
	 * The number of structural features of the '<em>Middleware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE___BIND = 0;

	/**
	 * The operation id for the '<em>Establish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE___ESTABLISH = 1;

	/**
	 * The operation id for the '<em>Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE___SEND = 2;

	/**
	 * The number of operations of the '<em>Middleware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ws.middleware.impl.WebServiceImpl <em>Web Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.middleware.impl.WebServiceImpl
	 * @see ws.middleware.impl.MiddlewarePackageImpl#getWebService()
	 * @generated
	 */
	int WEB_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__USES = MIDDLEWARE__USES;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__PROCESS = MIDDLEWARE__PROCESS;

	/**
	 * The feature id for the '<em><b>Stubs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__STUBS = MIDDLEWARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Registry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE__REGISTRY = MIDDLEWARE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Web Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE_FEATURE_COUNT = MIDDLEWARE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Bind</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE___BIND = MIDDLEWARE___BIND;

	/**
	 * The operation id for the '<em>Establish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE___ESTABLISH = MIDDLEWARE___ESTABLISH;

	/**
	 * The operation id for the '<em>Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE___SEND = MIDDLEWARE___SEND;

	/**
	 * The number of operations of the '<em>Web Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVICE_OPERATION_COUNT = MIDDLEWARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ws.middleware.impl.VMImpl <em>VM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.middleware.impl.VMImpl
	 * @see ws.middleware.impl.MiddlewarePackageImpl#getVM()
	 * @generated
	 */
	int VM = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__ID = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PROCESSORS = 2;

	/**
	 * The number of structural features of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ws.middleware.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.middleware.impl.ProcessorImpl
	 * @see ws.middleware.impl.MiddlewarePackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ID = 0;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__IP = 1;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Receive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR___RECEIVE = 0;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ws.middleware.ServiceDescription <em>Service Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.middleware.ServiceDescription
	 * @see ws.middleware.impl.MiddlewarePackageImpl#getServiceDescription()
	 * @generated
	 */
	int SERVICE_DESCRIPTION = 7;

	/**
	 * The number of structural features of the '<em>Service Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ws.middleware.impl.ServiceImplImpl <em>Service Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.middleware.impl.ServiceImplImpl
	 * @see ws.middleware.impl.MiddlewarePackageImpl#getServiceImpl()
	 * @generated
	 */
	int SERVICE_IMPL = 4;

	/**
	 * The number of structural features of the '<em>Service Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL_FEATURE_COUNT = SERVICE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Receive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL___RECEIVE = SERVICE_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL_OPERATION_COUNT = SERVICE_DESCRIPTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ws.middleware.impl.StubImpl <em>Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.middleware.impl.StubImpl
	 * @see ws.middleware.impl.MiddlewarePackageImpl#getStub()
	 * @generated
	 */
	int STUB = 5;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB__IMPL = 0;

	/**
	 * The number of structural features of the '<em>Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Receive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB___RECEIVE = 0;

	/**
	 * The number of operations of the '<em>Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUB_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ws.middleware.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.middleware.impl.RepositoryImpl
	 * @see ws.middleware.impl.MiddlewarePackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 6;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SERVICES = 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Lookup</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___LOOKUP = 0;

	/**
	 * The operation id for the '<em>Rebind</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY___REBIND = 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link ws.middleware.Middleware <em>Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Middleware</em>'.
	 * @see ws.middleware.Middleware
	 * @generated
	 */
	EClass getMiddleware();

	/**
	 * Returns the meta object for the reference '{@link ws.middleware.Middleware#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see ws.middleware.Middleware#getUses()
	 * @see #getMiddleware()
	 * @generated
	 */
	EReference getMiddleware_Uses();

	/**
	 * Returns the meta object for the reference list '{@link ws.middleware.Middleware#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process</em>'.
	 * @see ws.middleware.Middleware#getProcess()
	 * @see #getMiddleware()
	 * @generated
	 */
	EReference getMiddleware_Process();

	/**
	 * Returns the meta object for the '{@link ws.middleware.Middleware#bind() <em>Bind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bind</em>' operation.
	 * @see ws.middleware.Middleware#bind()
	 * @generated
	 */
	EOperation getMiddleware__Bind();

	/**
	 * Returns the meta object for the '{@link ws.middleware.Middleware#establish() <em>Establish</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Establish</em>' operation.
	 * @see ws.middleware.Middleware#establish()
	 * @generated
	 */
	EOperation getMiddleware__Establish();

	/**
	 * Returns the meta object for the '{@link ws.middleware.Middleware#send() <em>Send</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send</em>' operation.
	 * @see ws.middleware.Middleware#send()
	 * @generated
	 */
	EOperation getMiddleware__Send();

	/**
	 * Returns the meta object for class '{@link ws.middleware.WebService <em>Web Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Service</em>'.
	 * @see ws.middleware.WebService
	 * @generated
	 */
	EClass getWebService();

	/**
	 * Returns the meta object for the containment reference list '{@link ws.middleware.WebService#getStubs <em>Stubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stubs</em>'.
	 * @see ws.middleware.WebService#getStubs()
	 * @see #getWebService()
	 * @generated
	 */
	EReference getWebService_Stubs();

	/**
	 * Returns the meta object for the reference '{@link ws.middleware.WebService#getRegistry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registry</em>'.
	 * @see ws.middleware.WebService#getRegistry()
	 * @see #getWebService()
	 * @generated
	 */
	EReference getWebService_Registry();

	/**
	 * Returns the meta object for class '{@link ws.middleware.VM <em>VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM</em>'.
	 * @see ws.middleware.VM
	 * @generated
	 */
	EClass getVM();

	/**
	 * Returns the meta object for the attribute '{@link ws.middleware.VM#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ws.middleware.VM#getID()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_ID();

	/**
	 * Returns the meta object for the attribute '{@link ws.middleware.VM#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see ws.middleware.VM#getProtocol()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_Protocol();

	/**
	 * Returns the meta object for the containment reference list '{@link ws.middleware.VM#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see ws.middleware.VM#getProcessors()
	 * @see #getVM()
	 * @generated
	 */
	EReference getVM_Processors();

	/**
	 * Returns the meta object for class '{@link ws.middleware.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see ws.middleware.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link ws.middleware.Processor#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see ws.middleware.Processor#getID()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_ID();

	/**
	 * Returns the meta object for the attribute '{@link ws.middleware.Processor#getIP <em>IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP</em>'.
	 * @see ws.middleware.Processor#getIP()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_IP();

	/**
	 * Returns the meta object for the '{@link ws.middleware.Processor#receive() <em>Receive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive</em>' operation.
	 * @see ws.middleware.Processor#receive()
	 * @generated
	 */
	EOperation getProcessor__Receive();

	/**
	 * Returns the meta object for class '{@link ws.middleware.ServiceImpl <em>Service Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Impl</em>'.
	 * @see ws.middleware.ServiceImpl
	 * @generated
	 */
	EClass getServiceImpl();

	/**
	 * Returns the meta object for the '{@link ws.middleware.ServiceImpl#receive() <em>Receive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive</em>' operation.
	 * @see ws.middleware.ServiceImpl#receive()
	 * @generated
	 */
	EOperation getServiceImpl__Receive();

	/**
	 * Returns the meta object for class '{@link ws.middleware.Stub <em>Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stub</em>'.
	 * @see ws.middleware.Stub
	 * @generated
	 */
	EClass getStub();

	/**
	 * Returns the meta object for the reference '{@link ws.middleware.Stub#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impl</em>'.
	 * @see ws.middleware.Stub#getImpl()
	 * @see #getStub()
	 * @generated
	 */
	EReference getStub_Impl();

	/**
	 * Returns the meta object for the '{@link ws.middleware.Stub#receive() <em>Receive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive</em>' operation.
	 * @see ws.middleware.Stub#receive()
	 * @generated
	 */
	EOperation getStub__Receive();

	/**
	 * Returns the meta object for class '{@link ws.middleware.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see ws.middleware.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link ws.middleware.Repository#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see ws.middleware.Repository#getServices()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Services();

	/**
	 * Returns the meta object for the '{@link ws.middleware.Repository#lookup() <em>Lookup</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lookup</em>' operation.
	 * @see ws.middleware.Repository#lookup()
	 * @generated
	 */
	EOperation getRepository__Lookup();

	/**
	 * Returns the meta object for the '{@link ws.middleware.Repository#rebind() <em>Rebind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rebind</em>' operation.
	 * @see ws.middleware.Repository#rebind()
	 * @generated
	 */
	EOperation getRepository__Rebind();

	/**
	 * Returns the meta object for class '{@link ws.middleware.ServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Description</em>'.
	 * @see ws.middleware.ServiceDescription
	 * @generated
	 */
	EClass getServiceDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MiddlewareFactory getMiddlewareFactory();

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
		 * The meta object literal for the '{@link ws.middleware.impl.MiddlewareImpl <em>Middleware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.middleware.impl.MiddlewareImpl
		 * @see ws.middleware.impl.MiddlewarePackageImpl#getMiddleware()
		 * @generated
		 */
		EClass MIDDLEWARE = eINSTANCE.getMiddleware();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDDLEWARE__USES = eINSTANCE.getMiddleware_Uses();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDDLEWARE__PROCESS = eINSTANCE.getMiddleware_Process();

		/**
		 * The meta object literal for the '<em><b>Bind</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIDDLEWARE___BIND = eINSTANCE.getMiddleware__Bind();

		/**
		 * The meta object literal for the '<em><b>Establish</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIDDLEWARE___ESTABLISH = eINSTANCE.getMiddleware__Establish();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIDDLEWARE___SEND = eINSTANCE.getMiddleware__Send();

		/**
		 * The meta object literal for the '{@link ws.middleware.impl.WebServiceImpl <em>Web Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.middleware.impl.WebServiceImpl
		 * @see ws.middleware.impl.MiddlewarePackageImpl#getWebService()
		 * @generated
		 */
		EClass WEB_SERVICE = eINSTANCE.getWebService();

		/**
		 * The meta object literal for the '<em><b>Stubs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICE__STUBS = eINSTANCE.getWebService_Stubs();

		/**
		 * The meta object literal for the '<em><b>Registry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVICE__REGISTRY = eINSTANCE.getWebService_Registry();

		/**
		 * The meta object literal for the '{@link ws.middleware.impl.VMImpl <em>VM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.middleware.impl.VMImpl
		 * @see ws.middleware.impl.MiddlewarePackageImpl#getVM()
		 * @generated
		 */
		EClass VM = eINSTANCE.getVM();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__ID = eINSTANCE.getVM_ID();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__PROTOCOL = eINSTANCE.getVM_Protocol();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM__PROCESSORS = eINSTANCE.getVM_Processors();

		/**
		 * The meta object literal for the '{@link ws.middleware.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.middleware.impl.ProcessorImpl
		 * @see ws.middleware.impl.MiddlewarePackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__ID = eINSTANCE.getProcessor_ID();

		/**
		 * The meta object literal for the '<em><b>IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__IP = eINSTANCE.getProcessor_IP();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSOR___RECEIVE = eINSTANCE.getProcessor__Receive();

		/**
		 * The meta object literal for the '{@link ws.middleware.impl.ServiceImplImpl <em>Service Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.middleware.impl.ServiceImplImpl
		 * @see ws.middleware.impl.MiddlewarePackageImpl#getServiceImpl()
		 * @generated
		 */
		EClass SERVICE_IMPL = eINSTANCE.getServiceImpl();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_IMPL___RECEIVE = eINSTANCE.getServiceImpl__Receive();

		/**
		 * The meta object literal for the '{@link ws.middleware.impl.StubImpl <em>Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.middleware.impl.StubImpl
		 * @see ws.middleware.impl.MiddlewarePackageImpl#getStub()
		 * @generated
		 */
		EClass STUB = eINSTANCE.getStub();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUB__IMPL = eINSTANCE.getStub_Impl();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUB___RECEIVE = eINSTANCE.getStub__Receive();

		/**
		 * The meta object literal for the '{@link ws.middleware.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.middleware.impl.RepositoryImpl
		 * @see ws.middleware.impl.MiddlewarePackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__SERVICES = eINSTANCE.getRepository_Services();

		/**
		 * The meta object literal for the '<em><b>Lookup</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPOSITORY___LOOKUP = eINSTANCE.getRepository__Lookup();

		/**
		 * The meta object literal for the '<em><b>Rebind</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REPOSITORY___REBIND = eINSTANCE.getRepository__Rebind();

		/**
		 * The meta object literal for the '{@link ws.middleware.ServiceDescription <em>Service Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ws.middleware.ServiceDescription
		 * @see ws.middleware.impl.MiddlewarePackageImpl#getServiceDescription()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTION = eINSTANCE.getServiceDescription();

	}

} //MiddlewarePackage
