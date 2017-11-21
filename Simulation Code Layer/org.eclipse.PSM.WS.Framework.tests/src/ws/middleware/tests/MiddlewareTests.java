/**
 */
package ws.middleware.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>middleware</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiddlewareTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MiddlewareTests("middleware Tests");
		suite.addTestSuite(WebServiceTest.class);
		suite.addTestSuite(ProcessorTest.class);
		suite.addTestSuite(ServiceImplTest.class);
		suite.addTestSuite(StubTest.class);
		suite.addTestSuite(RepositoryTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiddlewareTests(String name) {
		super(name);
	}

} //MiddlewareTests
