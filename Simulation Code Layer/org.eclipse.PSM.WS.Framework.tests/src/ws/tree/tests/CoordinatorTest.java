/**
 */
package ws.tree.tests;

import junit.textui.TestRunner;

import ws.tree.Coordinator;
import ws.tree.TreeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Coordinator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinatorTest extends BasicNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CoordinatorTest.class);
	}

	/**
	 * Constructs a new Coordinator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Coordinator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Coordinator getFixture() {
		return (Coordinator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TreeFactory.eINSTANCE.createCoordinator());
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

} //CoordinatorTest
