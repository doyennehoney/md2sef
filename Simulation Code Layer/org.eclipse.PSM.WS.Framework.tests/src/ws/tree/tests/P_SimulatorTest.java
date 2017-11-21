/**
 */
package ws.tree.tests;

import junit.textui.TestRunner;

import ws.tree.P_Simulator;
import ws.tree.TreeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PSimulator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class P_SimulatorTest extends SimulatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(P_SimulatorTest.class);
	}

	/**
	 * Constructs a new PSimulator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P_SimulatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PSimulator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected P_Simulator getFixture() {
		return (P_Simulator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TreeFactory.eINSTANCE.createP_Simulator());
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

} //P_SimulatorTest
