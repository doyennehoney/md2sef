/**
 */
package ws.tree;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ws.tree.TreePackage
 * @generated
 */
public interface TreeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TreeFactory eINSTANCE = ws.tree.impl.TreeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree</em>'.
	 * @generated
	 */
	Tree createTree();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinator</em>'.
	 * @generated
	 */
	Coordinator createCoordinator();

	/**
	 * Returns a new object of class '<em>CDEVS Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDEVS Coordinator</em>'.
	 * @generated
	 */
	CDEVSCoordinator createCDEVSCoordinator();

	/**
	 * Returns a new object of class '<em>PDEVS Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PDEVS Coordinator</em>'.
	 * @generated
	 */
	PDEVSCoordinator createPDEVSCoordinator();

	/**
	 * Returns a new object of class '<em>Flat Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flat Coordinator</em>'.
	 * @generated
	 */
	FlatCoordinator createFlatCoordinator();

	/**
	 * Returns a new object of class '<em>Node Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Coordinator</em>'.
	 * @generated
	 */
	NodeCoordinator createNodeCoordinator();

	/**
	 * Returns a new object of class '<em>PCoordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCoordinator</em>'.
	 * @generated
	 */
	P_Coordinator createP_Coordinator();

	/**
	 * Returns a new object of class '<em>CDEVS Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDEVS Simulator</em>'.
	 * @generated
	 */
	CDEVSSimulator createCDEVSSimulator();

	/**
	 * Returns a new object of class '<em>PDEVS Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PDEVS Simulator</em>'.
	 * @generated
	 */
	PDEVSSimulator createPDEVSSimulator();

	/**
	 * Returns a new object of class '<em>PSimulator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PSimulator</em>'.
	 * @generated
	 */
	P_Simulator createP_Simulator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TreePackage getTreePackage();

} //TreeFactory
