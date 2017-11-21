/**
 */
package ws.middleware.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ws.middleware.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiddlewareFactoryImpl extends EFactoryImpl implements MiddlewareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiddlewareFactory init() {
		try {
			MiddlewareFactory theMiddlewareFactory = (MiddlewareFactory)EPackage.Registry.INSTANCE.getEFactory(MiddlewarePackage.eNS_URI);
			if (theMiddlewareFactory != null) {
				return theMiddlewareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MiddlewareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiddlewareFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MiddlewarePackage.WEB_SERVICE: return createWebService();
			case MiddlewarePackage.VM: return createVM();
			case MiddlewarePackage.PROCESSOR: return createProcessor();
			case MiddlewarePackage.SERVICE_IMPL: return createServiceImpl();
			case MiddlewarePackage.STUB: return createStub();
			case MiddlewarePackage.REPOSITORY: return createRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebService createWebService() {
		WebServiceImpl webService = new WebServiceImpl();
		return webService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VM createVM() {
		VMImpl vm = new VMImpl();
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceImpl createServiceImpl() {
		ServiceImplImpl serviceImpl = new ServiceImplImpl();
		return serviceImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stub createStub() {
		StubImpl stub = new StubImpl();
		return stub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiddlewarePackage getMiddlewarePackage() {
		return (MiddlewarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MiddlewarePackage getPackage() {
		return MiddlewarePackage.eINSTANCE;
	}

} //MiddlewareFactoryImpl
