/**
 */
package ws.tree.tests;

import junit.textui.TestRunner;

import ws.tree.NodeCoordinator;
import ws.tree.TreeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Coordinator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeCoordinatorTest extends CoordinatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeCoordinatorTest.class);
	}

	/**
	 * Constructs a new Node Coordinator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeCoordinatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node Coordinator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NodeCoordinator getFixture() {
		return (NodeCoordinator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TreeFactory.eINSTANCE.createNodeCoordinator());
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

} //NodeCoordinatorTest
