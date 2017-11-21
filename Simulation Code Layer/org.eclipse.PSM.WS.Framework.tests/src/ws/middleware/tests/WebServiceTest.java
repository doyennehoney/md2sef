/**
 */
package ws.middleware.tests;

import junit.textui.TestRunner;

import ws.middleware.MiddlewareFactory;
import ws.middleware.WebService;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Web Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebServiceTest extends MiddlewareTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WebServiceTest.class);
	}

	/**
	 * Constructs a new Web Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Web Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WebService getFixture() {
		return (WebService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiddlewareFactory.eINSTANCE.createWebService());
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

} //WebServiceTest
