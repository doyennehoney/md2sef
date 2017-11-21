/**
 */
package rsgf.vm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rsgf.vm.VM#getID <em>ID</em>}</li>
 *   <li>{@link rsgf.vm.VM#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see rsgf.vm.VmPackage#getVM()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueVMID IDCanNotBeEmpty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueVMID='self.ID\n\t\t\t\t->forAll(n | VM.allInstances().ID\n\t\t\t\t\t->count(n) = 1)' IDCanNotBeEmpty='\n\t\t\t\tself.ID.size() > 0'"
 * @generated
 */
public interface VM extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see rsgf.vm.VmPackage#getVM_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link rsgf.vm.VM#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see rsgf.vm.VmPackage#getVM_Protocol()
	 * @model required="true"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link rsgf.vm.VM#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

} // VM
