/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.metadatasharing.updater.impl;

import org.openmrs.annotation.OpenmrsProfile;
import org.openmrs.scheduler.SchedulerService;
import org.openmrs.scheduler.TaskDefinition;

@OpenmrsProfile(openmrsPlatformVersion = "2.0.*")
public class SchedulerCompatibility2_0 implements SchedulerCompatibility {

	@Override
	public void saveTask(SchedulerService service, TaskDefinition taskDefinition) {
		service.saveTaskDefinition(taskDefinition);
	}
}
