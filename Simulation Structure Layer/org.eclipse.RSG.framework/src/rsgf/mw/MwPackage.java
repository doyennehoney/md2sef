/**
 */
package rsgf.mw;

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
 * @see rsgf.mw.MwFactory
 * @model kind="package"
 * @generated
 */
public interface MwPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mw";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://devs.org/Middleware";

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
	MwPackage eINSTANCE = rsgf.mw.impl.MwPackageImpl.init();

	/**
	 * The meta object id for the '{@link rsgf.mw.impl.MiddlewareImpl <em>Middleware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rsgf.mw.impl.MiddlewareImpl
	 * @see rsgf.mw.impl.MwPackageImpl#getMiddleware()
	 * @generated
	 */
	int MIDDLEWARE = 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__USES = 1;

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
	 * Returns the meta object for class '{@link rsgf.mw.Middleware <em>Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Middleware</em>'.
	 * @see rsgf.mw.Middleware
	 * @generated
	 */
	EClass getMiddleware();

	/**
	 * Returns the meta object for the reference list '{@link rsgf.mw.Middleware#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process</em>'.
	 * @see rsgf.mw.Middleware#getProcess()
	 * @see #getMiddleware()
	 * @generated
	 */
	EReference getMiddleware_Process();

	/**
	 * Returns the meta object for the reference '{@link rsgf.mw.Middleware#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see rsgf.mw.Middleware#getUses()
	 * @see #getMiddleware()
	 * @generated
	 */
	EReference getMiddleware_Uses();

	/**
	 * Returns the meta object for the '{@link rsgf.mw.Middleware#bind() <em>Bind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bind</em>' operation.
	 * @see rsgf.mw.Middleware#bind()
	 * @generated
	 */
	EOperation getMiddleware__Bind();

	/**
	 * Returns the meta object for the '{@link rsgf.mw.Middleware#establish() <em>Establish</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Establish</em>' operation.
	 * @see rsgf.mw.Middleware#establish()
	 * @generated
	 */
	EOperation getMiddleware__Establish();

	/**
	 * Returns the meta object for the '{@link rsgf.mw.Middleware#send() <em>Send</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send</em>' operation.
	 * @see rsgf.mw.Middleware#send()
	 * @generated
	 */
	EOperation getMiddleware__Send();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MwFactory getMwFactory();

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
		 * The meta object literal for the '{@link rsgf.mw.impl.MiddlewareImpl <em>Middleware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rsgf.mw.impl.MiddlewareImpl
		 * @see rsgf.mw.impl.MwPackageImpl#getMiddleware()
		 * @generated
		 */
		EClass MIDDLEWARE = eINSTANCE.getMiddleware();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDDLEWARE__PROCESS = eINSTANCE.getMiddleware_Process();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDDLEWARE__USES = eINSTANCE.getMiddleware_Uses();

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

	}

} //MwPackage
