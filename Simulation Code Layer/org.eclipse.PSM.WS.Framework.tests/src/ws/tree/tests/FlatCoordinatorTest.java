/**
 */
package ws.tree.tests;

import junit.textui.TestRunner;

import ws.tree.FlatCoordinator;
import ws.tree.TreeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Flat Coordinator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlatCoordinatorTest extends CoordinatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlatCoordinatorTest.class);
	}

	/**
	 * Constructs a new Flat Coordinator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatCoordinatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Flat Coordinator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FlatCoordinator getFixture() {
		return (FlatCoordinator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TreeFactory.eINSTANCE.createFlatCoordinator());
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

} //FlatCoordinatorTest
