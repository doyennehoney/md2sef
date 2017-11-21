/**
 */
package ws.skeleton.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ws.skeleton.Skeleton;
import ws.skeleton.SkeletonFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Skeleton</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkeletonTest extends TestCase {

	/**
	 * The fixture for this Skeleton test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Skeleton fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SkeletonTest.class);
	}

	/**
	 * Constructs a new Skeleton test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkeletonTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Skeleton test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Skeleton fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Skeleton test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Skeleton getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SkeletonFactory.eINSTANCE.createSkeleton());
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

} //SkeletonTest
