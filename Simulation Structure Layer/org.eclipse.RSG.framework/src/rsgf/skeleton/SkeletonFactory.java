/**
 */
package rsgf.skeleton;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rsgf.skeleton.SkeletonPackage
 * @generated
 */
public interface SkeletonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SkeletonFactory eINSTANCE = rsgf.skeleton.impl.SkeletonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Skeleton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skeleton</em>'.
	 * @generated
	 */
	Skeleton createSkeleton();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SkeletonPackage getSkeletonPackage();

} //SkeletonFactory
