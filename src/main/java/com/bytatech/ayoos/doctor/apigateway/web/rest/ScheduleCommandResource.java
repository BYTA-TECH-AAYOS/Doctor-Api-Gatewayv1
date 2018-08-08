/**
 * 
 */
package com.bytatech.ayoos.doctor.apigateway.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.ScheduleResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.ScheduleDTO;
import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author rafeek
 *
 */
@RestController
@RequestMapping("/api")
public class ScheduleCommandResource {
	@Autowired
	private ScheduleResourceApi scheduleResourceApi;
	 private final Logger log = LoggerFactory.getLogger(ScheduleCommandResource.class);


	 @PostMapping("/schedules")
     public void createSchedule(@RequestBody ScheduleDTO scheduleDTO) {
		 log.debug("REST request to save Schedule : {}", scheduleDTO);
		 scheduleResourceApi.createScheduleUsingPOST(scheduleDTO);

	}

	 @PutMapping("/schedules")
	    public void updateSchedule(@RequestBody ScheduleDTO scheduleDTO){
		 log.debug("REST request to update Schedule : {}", scheduleDTO);
		 
		 scheduleResourceApi.updateScheduleUsingPUT(scheduleDTO);
	}
	
	 @DeleteMapping("/schedules/{id}")
	 
    public void deleteSchedule(@PathVariable Long id) {
       
		 log.debug("REST request to delete Schedule : {}", id);
		 scheduleResourceApi.deleteScheduleUsingDELETE(id); 
    }

}
