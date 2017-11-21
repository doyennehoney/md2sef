/**
 */
package ws.middleware.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ws.middleware.MiddlewareFactory;
import ws.middleware.VM;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>VM</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VMTest extends TestCase {

	/**
	 * The fixture for this VM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VM fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VMTest.class);
	}

	/**
	 * Constructs a new VM test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this VM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VM fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this VM test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VM getFixture() {
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
		setFixture(MiddlewareFactory.eINSTANCE.createVM());
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

} //VMTest
