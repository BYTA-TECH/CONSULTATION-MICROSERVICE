package com.bytatech.ayoos.consultation.service.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bytatech.ayoos.consultation.client.activiti.api.TasksApi;
import com.bytatech.ayoos.consultation.client.activiti.model.DataResponse;
import com.bytatech.ayoos.consultation.service.ConsultationQueryService; 
@Service
public class ConsultationQueryServiceImpl implements ConsultationQueryService	{
	@Autowired
	  private TasksApi tasksApi;
	@Override
	public ResponseEntity<DataResponse> getTasks(String name, String nameLike, String description, String priority,
			String minimumPriority, String maximumPriority, String assignee, String assigneeLike, String owner,
			String ownerLike, String unassigned, String delegationState, String candidateUser, String candidateGroup,
			String candidateGroups, String involvedUser, String taskDefinitionKey, String taskDefinitionKeyLike,
			String processInstanceId, String processInstanceBusinessKey, String processInstanceBusinessKeyLike,
			@Valid String processDefinitionId, @Valid String processDefinitionKey,
			@Valid String processDefinitionKeyLike, @Valid String processDefinitionName,
			@Valid String processDefinitionNameLike, @Valid String executionId, @Valid String createdOn,
			@Valid String createdBefore, @Valid String createdAfter, @Valid String dueOn, @Valid String dueBefore,
			@Valid String dueAfter, @Valid Boolean withoutDueDate, @Valid Boolean excludeSubTasks,
			@Valid Boolean active, @Valid Boolean includeTaskLocalVariables, @Valid Boolean includeProcessVariables,
			@Valid String tenantId, @Valid String tenantIdLike, @Valid Boolean withoutTenantId,
			@Valid String candidateOrAssigned, @Valid String category) {
		
		return tasksApi.getTasks(name, nameLike, description, priority, minimumPriority, maximumPriority, assignee, assigneeLike, owner, ownerLike, unassigned, delegationState, candidateUser, candidateGroup, candidateGroups, involvedUser, taskDefinitionKey, taskDefinitionKeyLike, processInstanceId, processInstanceBusinessKey, processInstanceBusinessKeyLike, processDefinitionId, processDefinitionKey, processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike, executionId, createdOn, createdBefore, createdAfter, dueOn, dueBefore, dueAfter, withoutDueDate, excludeSubTasks, active, includeTaskLocalVariables, includeProcessVariables, tenantId, tenantIdLike, withoutTenantId, candidateOrAssigned, category);
	}
}
