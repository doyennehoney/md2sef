/**
 */
package ws.tree.tests;

import junit.textui.TestRunner;

import ws.tree.PDEVSSimulator;
import ws.tree.TreeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PDEVS Simulator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PDEVSSimulatorTest extends SimulatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PDEVSSimulatorTest.class);
	}

	/**
	 * Constructs a new PDEVS Simulator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDEVSSimulatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PDEVS Simulator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PDEVSSimulator getFixture() {
		return (PDEVSSimulator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TreeFactory.eINSTANCE.createPDEVSSimulator());
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

} //PDEVSSimulatorTest
