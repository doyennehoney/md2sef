/**
 */
package rsgf.skeleton.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rsgf.skeleton.Skeleton;
import rsgf.skeleton.SkeletonPackage;

import rsgf.tree.Root;
import rsgf.tree.Tree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skeleton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rsgf.skeleton.impl.SkeletonImpl#getID <em>ID</em>}</li>
 *   <li>{@link rsgf.skeleton.impl.SkeletonImpl#getTree <em>Tree</em>}</li>
 *   <li>{@link rsgf.skeleton.impl.SkeletonImpl#getRootskel <em>Rootskel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkeletonImpl extends MinimalEObjectImpl.Container implements Skeleton {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTree() <em>Tree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTree()
	 * @generated
	 * @ordered
	 */
	protected Tree tree;

	/**
	 * The cached value of the '{@link #getRootskel() <em>Rootskel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootskel()
	 * @generated
	 * @ordered
	 */
	protected EList<Root> rootskel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkeletonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkeletonPackage.Literals.SKELETON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SkeletonPackage.SKELETON__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree getTree() {
		if (tree != null && tree.eIsProxy()) {
			InternalEObject oldTree = (InternalEObject)tree;
			tree = (Tree)eResolveProxy(oldTree);
			if (tree != oldTree) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SkeletonPackage.SKELETON__TREE, oldTree, tree));
			}
		}
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree basicGetTree() {
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTree(Tree newTree) {
		Tree oldTree = tree;
		tree = newTree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SkeletonPackage.SKELETON__TREE, oldTree, tree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Root> getRootskel() {
		if (rootskel == null) {
			rootskel = new EObjectContainmentEList<Root>(Root.class, this, SkeletonPackage.SKELETON__ROOTSKEL);
		}
		return rootskel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SkeletonPackage.SKELETON__ROOTSKEL:
				return ((InternalEList<?>)getRootskel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SkeletonPackage.SKELETON__ID:
				return getID();
			case SkeletonPackage.SKELETON__TREE:
				if (resolve) return getTree();
				return basicGetTree();
			case SkeletonPackage.SKELETON__ROOTSKEL:
				return getRootskel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SkeletonPackage.SKELETON__ID:
				setID((String)newValue);
				return;
			case SkeletonPackage.SKELETON__TREE:
				setTree((Tree)newValue);
				return;
			case SkeletonPackage.SKELETON__ROOTSKEL:
				getRootskel().clear();
				getRootskel().addAll((Collection<? extends Root>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SkeletonPackage.SKELETON__ID:
				setID(ID_EDEFAULT);
				return;
			case SkeletonPackage.SKELETON__TREE:
				setTree((Tree)null);
				return;
			case SkeletonPackage.SKELETON__ROOTSKEL:
				getRootskel().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SkeletonPackage.SKELETON__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SkeletonPackage.SKELETON__TREE:
				return tree != null;
			case SkeletonPackage.SKELETON__ROOTSKEL:
				return rootskel != null && !rootskel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SkeletonImpl
