/**
 */
package Model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Model.DEVSPackage
 * @generated
 */
public interface DEVSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DEVSFactory eINSTANCE = Model.impl.DEVSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Atomic DEVS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic DEVS</em>'.
	 * @generated
	 */
	AtomicDEVS createAtomicDEVS();

	/**
	 * Returns a new object of class '<em>Coupled DEVS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled DEVS</em>'.
	 * @generated
	 */
	CoupledDEVS createCoupledDEVS();

	/**
	 * Returns a new object of class '<em>IPort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IPort</em>'.
	 * @generated
	 */
	IPort createIPort();

	/**
	 * Returns a new object of class '<em>OPort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OPort</em>'.
	 * @generated
	 */
	OPort createOPort();

	/**
	 * Returns a new object of class '<em>EIC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EIC</em>'.
	 * @generated
	 */
	EIC createEIC();

	/**
	 * Returns a new object of class '<em>IC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IC</em>'.
	 * @generated
	 */
	IC createIC();

	/**
	 * Returns a new object of class '<em>EOC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EOC</em>'.
	 * @generated
	 */
	EOC createEOC();

	/**
	 * Returns a new object of class '<em>Int Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Transition</em>'.
	 * @generated
	 */
	IntTransition createIntTransition();

	/**
	 * Returns a new object of class '<em>Conf Trans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conf Trans</em>'.
	 * @generated
	 */
	ConfTrans createConfTrans();

	/**
	 * Returns a new object of class '<em>Ext Trans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ext Trans</em>'.
	 * @generated
	 */
	ExtTrans createExtTrans();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Phase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phase</em>'.
	 * @generated
	 */
	Phase createPhase();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DEVSPackage getDEVSPackage();

} //DEVSFactory
