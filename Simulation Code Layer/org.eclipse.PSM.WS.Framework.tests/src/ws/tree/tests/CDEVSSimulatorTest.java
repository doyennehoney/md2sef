/**
 */
package ws.tree.tests;

import junit.textui.TestRunner;

import ws.tree.CDEVSSimulator;
import ws.tree.TreeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>CDEVS Simulator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDEVSSimulatorTest extends SimulatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CDEVSSimulatorTest.class);
	}

	/**
	 * Constructs a new CDEVS Simulator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDEVSSimulatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this CDEVS Simulator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CDEVSSimulator getFixture() {
		return (CDEVSSimulator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TreeFactory.eINSTANCE.createCDEVSSimulator());
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

} //CDEVSSimulatorTest
