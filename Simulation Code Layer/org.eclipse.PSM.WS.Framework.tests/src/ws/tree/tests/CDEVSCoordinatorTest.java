/**
 */
package ws.tree.tests;

import junit.textui.TestRunner;

import ws.tree.CDEVSCoordinator;
import ws.tree.TreeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CDEVS Coordinator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDEVSCoordinatorTest extends CoordinatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CDEVSCoordinatorTest.class);
	}

	/**
	 * Constructs a new CDEVS Coordinator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEVSCoordinatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CDEVS Coordinator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CDEVSCoordinator getFixture() {
		return (CDEVSCoordinator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TreeFactory.eINSTANCE.createCDEVSCoordinator());
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

} //CDEVSCoordinatorTest
