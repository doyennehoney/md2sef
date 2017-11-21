/**
 */
package ws.tree.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ws.middleware.provider.PsmEditPlugin;

import ws.tree.Tree;
import ws.tree.TreeFactory;
import ws.tree.TreePackage;

/**
 * This is the item provider adapter for a {@link ws.tree.Tree} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TreeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeItemProvider(AdapterFactory adapterFactory) {
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

			addIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Tree_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Tree_ID_feature", "_UI_Tree_type"),
				 TreePackage.Literals.TREE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(TreePackage.Literals.TREE__ROOT);
			childrenFeatures.add(TreePackage.Literals.TREE__COORDINATOR);
			childrenFeatures.add(TreePackage.Literals.TREE__SIMULATOR);
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
	 * This returns Tree.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Tree"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Tree)object).getID();
		return label == null || label.length() == 0 ?
			getString("_UI_Tree_type") :
			getString("_UI_Tree_type") + " " + label;
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

		switch (notification.getFeatureID(Tree.class)) {
			case TreePackage.TREE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TreePackage.TREE__ROOT:
			case TreePackage.TREE__COORDINATOR:
			case TreePackage.TREE__SIMULATOR:
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
				(TreePackage.Literals.TREE__ROOT,
				 TreeFactory.eINSTANCE.createRoot()));

		newChildDescriptors.add
			(createChildParameter
				(TreePackage.Literals.TREE__COORDINATOR,
				 TreeFactory.eINSTANCE.createCoordinator()));

		newChildDescriptors.add
			(createChildParameter
				(TreePackage.Literals.TREE__COORDINATOR,
				 TreeFactory.eINSTANCE.createCDEVSCoordinator()));

		newChildDescriptors.add
			(createChildParameter
				(TreePackage.Literals.TREE__COORDINATOR,
				 TreeFactory.eINSTANCE.createPDEVSCoordinator()));

		newChildDescriptors.add
			(createChildParameter
				(TreePackage.Literals.TREE__COORDINATOR,
				 TreeFactory.eINSTANCE.createFlatCoordinator()));

		newChildDescriptors.add
			(createChildParameter
				(TreePackage.Literals.TREE__COORDINATOR,
				 TreeFactory.eINSTANCE.createNodeCoordinator()));

		newChildDescriptors.add
			(createChildParameter
				(TreePackage.Literals.TREE__COORDINATOR,
				 TreeFactory.eINSTANCE.createP_Coordinator()));

		newChildDescriptors.add
			(createChildParameter
				(TreePackage.Literals.TREE__SIMULATOR,
				 TreeFactory.eINSTANCE.createCDEVSSimulator()));

		newChildDescriptors.add
			(createChildParameter
				(TreePackage.Literals.TREE__SIMULATOR,
				 TreeFactory.eINSTANCE.createPDEVSSimulator()));

		newChildDescriptors.add
			(createChildParameter
				(TreePackage.Literals.TREE__SIMULATOR,
				 TreeFactory.eINSTANCE.createP_Simulator()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PsmEditPlugin.INSTANCE;
	}

}
