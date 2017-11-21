/**
 */
package ws.tree.tests;

import junit.textui.TestRunner;

import ws.tree.P_Coordinator;
import ws.tree.TreeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCoordinator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class P_CoordinatorTest extends CoordinatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(P_CoordinatorTest.class);
	}

	/**
	 * Constructs a new PCoordinator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_CoordinatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCoordinator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected P_Coordinator getFixture() {
		return (P_Coordinator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TreeFactory.eINSTANCE.createP_Coordinator());
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

} //P_CoordinatorTest
