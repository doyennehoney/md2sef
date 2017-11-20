/**
 */
package Model.provider;


import Model.CoupledDEVS;
import Model.DEVSFactory;
import Model.DEVSPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Model.CoupledDEVS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoupledDEVSItemProvider extends DEVSItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledDEVSItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DEVSPackage.Literals.COUPLED_DEVS__SUB_MODELS);
			childrenFeatures.add(DEVSPackage.Literals.COUPLED_DEVS__EICS);
			childrenFeatures.add(DEVSPackage.Literals.COUPLED_DEVS__ICS);
			childrenFeatures.add(DEVSPackage.Literals.COUPLED_DEVS__EOCS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CoupledDEVS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CoupledDEVS"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CoupledDEVS)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CoupledDEVS_type") :
			getString("_UI_CoupledDEVS_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CoupledDEVS.class)) {
			case DEVSPackage.COUPLED_DEVS__SUB_MODELS:
			case DEVSPackage.COUPLED_DEVS__EICS:
			case DEVSPackage.COUPLED_DEVS__ICS:
			case DEVSPackage.COUPLED_DEVS__EOCS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DEVSPackage.Literals.COUPLED_DEVS__SUB_MODELS,
				 DEVSFactory.eINSTANCE.createAtomicDEVS()));

		newChildDescriptors.add
			(createChildParameter
				(DEVSPackage.Literals.COUPLED_DEVS__SUB_MODELS,
				 DEVSFactory.eINSTANCE.createCoupledDEVS()));

		newChildDescriptors.add
			(createChildParameter
				(DEVSPackage.Literals.COUPLED_DEVS__EICS,
				 DEVSFactory.eINSTANCE.createEIC()));

		newChildDescriptors.add
			(createChildParameter
				(DEVSPackage.Literals.COUPLED_DEVS__ICS,
				 DEVSFactory.eINSTANCE.createIC()));

		newChildDescriptors.add
			(createChildParameter
				(DEVSPackage.Literals.COUPLED_DEVS__EOCS,
				 DEVSFactory.eINSTANCE.createEOC()));
	}

}
