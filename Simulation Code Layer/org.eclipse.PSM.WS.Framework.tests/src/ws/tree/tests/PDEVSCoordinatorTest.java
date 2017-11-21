/**
 */
package ws.tree.tests;

import junit.textui.TestRunner;

import ws.tree.PDEVSCoordinator;
import ws.tree.TreeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PDEVS Coordinator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PDEVSCoordinatorTest extends CoordinatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PDEVSCoordinatorTest.class);
	}

	/**
	 * Constructs a new PDEVS Coordinator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDEVSCoordinatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PDEVS Coordinator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PDEVSCoordinator getFixture() {
		return (PDEVSCoordinator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TreeFactory.eINSTANCE.createPDEVSCoordinator());
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

} //PDEVSCoordinatorTest
