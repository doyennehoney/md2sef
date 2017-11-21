/**
 */
package ws.middleware.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ws.middleware.MiddlewareFactory;
import ws.middleware.ServiceImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ws.middleware.ServiceImpl#receive() <em>Receive</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ServiceImplTest extends TestCase {

	/**
	 * The fixture for this Service Impl test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceImplTest.class);
	}

	/**
	 * Constructs a new Service Impl test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceImplTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Impl test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServiceImpl fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Impl test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl getFixture() {
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
		setFixture(MiddlewareFactory.eINSTANCE.createServiceImpl());
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

	/**
	 * Tests the '{@link ws.middleware.ServiceImpl#receive() <em>Receive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ws.middleware.ServiceImpl#receive()
	 * @generated
	 */
	public void testReceive() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ServiceImplTest
