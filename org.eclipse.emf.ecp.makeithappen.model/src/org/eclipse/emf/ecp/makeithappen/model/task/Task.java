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
package org.eclipse.emf.ecp.makeithappen.model.task;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.ecp.makeithappen.model.task.Task#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.ecp.makeithappen.model.task.Task#getDescription <em>Description</em>}</li>
 * <li>{@link org.eclipse.emf.ecp.makeithappen.model.task.Task#getAssignee <em>Assignee</em>}</li>
 * <li>{@link org.eclipse.emf.ecp.makeithappen.model.task.Task#getDueDate <em>Due Date</em>}</li>
 * <li>{@link org.eclipse.emf.ecp.makeithappen.model.task.Task#getSubTasks <em>Sub Tasks</em>}</li>
 * <li>{@link org.eclipse.emf.ecp.makeithappen.model.task.Task#isDone <em>Done</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.makeithappen.model.task.TaskPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.ecp.makeithappen.model.task.TaskPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.makeithappen.model.task.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.ecp.makeithappen.model.task.TaskPackage#getTask_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.makeithappen.model.task.Task#getDescription
	 * <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecp.makeithappen.model.task.User#getTasks
	 * <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(User)
	 * @see org.eclipse.emf.ecp.makeithappen.model.task.TaskPackage#getTask_Assignee()
	 * @see org.eclipse.emf.ecp.makeithappen.model.task.User#getTasks
	 * @model opposite="tasks"
	 * @generated
	 */
	User getAssignee();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.makeithappen.model.task.Task#getAssignee <em>Assignee</em>}'
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(User value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see org.eclipse.emf.ecp.makeithappen.model.task.TaskPackage#getTask_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.makeithappen.model.task.Task#getDueDate <em>Due Date</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sub Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecp.makeithappen.model.task.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Tasks</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Sub Tasks</em>' containment reference list.
	 * @see org.eclipse.emf.ecp.makeithappen.model.task.TaskPackage#getTask_SubTasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getSubTasks();

	/**
	 * Returns the value of the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Done</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Done</em>' attribute.
	 * @see #setDone(boolean)
	 * @see org.eclipse.emf.ecp.makeithappen.model.task.TaskPackage#getTask_Done()
	 * @model
	 * @generated
	 */
	boolean isDone();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.makeithappen.model.task.Task#isDone <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Done</em>' attribute.
	 * @see #isDone()
	 * @generated
	 */
	void setDone(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @model
	 * @generated
	 */
	boolean hasName(DiagnosticChain chain, Map<?, ?> context);

} // Task
