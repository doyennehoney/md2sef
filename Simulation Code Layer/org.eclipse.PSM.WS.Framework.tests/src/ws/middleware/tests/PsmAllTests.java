/**
 */
package ws.middleware.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import ws.bundle.tests.BundleTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Psm</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsmAllTests extends TestSuite {

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
		TestSuite suite = new PsmAllTests("Psm Tests");
		suite.addTest(MiddlewareTests.suite());
		suite.addTest(BundleTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsmAllTests(String name) {
		super(name);
	}

} //PsmAllTests
