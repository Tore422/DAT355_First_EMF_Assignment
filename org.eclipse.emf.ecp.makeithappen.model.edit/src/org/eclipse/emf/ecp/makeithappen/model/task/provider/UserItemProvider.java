/**
 * Copyright (c) 2011-2014 EclipseSource Muenchen GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * EclipseSource Munich - initial API and implementation
 */
package org.eclipse.emf.ecp.makeithappen.model.task.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecp.makeithappen.model.task.TaskPackage;
import org.eclipse.emf.ecp.makeithappen.model.task.User;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.ecp.makeithappen.model.task.User} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UserItemProvider
	extends ItemProviderAdapter
	implements
	IEditingDomainItemProvider,
	ITreeItemContentProvider,
	IItemLabelProvider,
	IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UserItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFirstNamePropertyDescriptor(object);
			addLastNamePropertyDescriptor(object);
			addGenderPropertyDescriptor(object);
			addActivePropertyDescriptor(object);
			addTimeOfRegistrationPropertyDescriptor(object);
			addWeightPropertyDescriptor(object);
			addHeigthPropertyDescriptor(object);
			addNationalityPropertyDescriptor(object);
			addDateOfBirthPropertyDescriptor(object);
			addEmailPropertyDescriptor(object);
			addTasksPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the First Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addFirstNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_User_firstName_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_User_firstName_feature", "_UI_User_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TaskPackage.Literals.USER__FIRST_NAME,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Last Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addLastNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_User_lastName_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_User_lastName_feature", "_UI_User_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TaskPackage.Literals.USER__LAST_NAME,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Gender feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addGenderPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_User_gender_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_User_gender_feature", "_UI_User_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TaskPackage.Literals.USER__GENDER,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_User_active_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_User_active_feature", "_UI_User_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TaskPackage.Literals.USER__ACTIVE,
				true,
				false,
				false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Time Of Registration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addTimeOfRegistrationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_User_timeOfRegistration_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_User_timeOfRegistration_feature", "_UI_User_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TaskPackage.Literals.USER__TIME_OF_REGISTRATION,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Date Of Birth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addDateOfBirthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_User_dateOfBirth_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_User_dateOfBirth_feature", "_UI_User_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TaskPackage.Literals.USER__DATE_OF_BIRTH,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_User_email_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_User_email_feature", "_UI_User_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TaskPackage.Literals.USER__EMAIL,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_User_weight_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_User_weight_feature", "_UI_User_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TaskPackage.Literals.USER__WEIGHT,
				true,
				false,
				false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Heigth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addHeigthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_User_heigth_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_User_heigth_feature", "_UI_User_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TaskPackage.Literals.USER__HEIGTH,
				true,
				false,
				false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Nationality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addNationalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_User_nationality_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_User_nationality_feature", "_UI_User_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TaskPackage.Literals.USER__NATIONALITY,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Tasks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addTasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_User_tasks_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_User_tasks_feature", "_UI_User_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TaskPackage.Literals.USER__TASKS,
				true,
				false,
				true,
				null,
				null,
				null));
	}

	/**
	 * This returns User.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param object the object
	 * @return User.gif
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/User.png")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param object the object whose label text is needed.
	 * @return the label text for the adapted class
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		final User user = (User) object;
		final String firstName = user.getFirstName();
		final String lastName = user.getLastName();
		String ret = ""; //$NON-NLS-1$
		if (firstName != null && !firstName.equals("")) { //$NON-NLS-1$
			ret = ret + firstName;
		}
		if (lastName != null && !lastName.equals("")) { //$NON-NLS-1$
			if (!ret.equals("")) { //$NON-NLS-1$
				ret = ret + " "; //$NON-NLS-1$
			}
			ret = ret + lastName;
		}
		return ret;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(User.class)) {
		case TaskPackage.USER__FIRST_NAME:
		case TaskPackage.USER__LAST_NAME:
		case TaskPackage.USER__GENDER:
		case TaskPackage.USER__ACTIVE:
		case TaskPackage.USER__TIME_OF_REGISTRATION:
		case TaskPackage.USER__WEIGHT:
		case TaskPackage.USER__HEIGTH:
		case TaskPackage.USER__NATIONALITY:
		case TaskPackage.USER__DATE_OF_BIRTH:
		case TaskPackage.USER__EMAIL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TaskEditPlugin.INSTANCE;
	}

}