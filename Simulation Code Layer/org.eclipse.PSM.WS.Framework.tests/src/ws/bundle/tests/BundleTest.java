/**
 */
package ws.bundle.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ws.bundle.Bundle;
import ws.bundle.BundleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleTest extends TestCase {

	/**
	 * The fixture for this Bundle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bundle fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BundleTest.class);
	}

	/**
	 * Constructs a new Bundle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Bundle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Bundle fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Bundle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bundle getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BundleFactory.eINSTANCE.createBundle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BundleTest
