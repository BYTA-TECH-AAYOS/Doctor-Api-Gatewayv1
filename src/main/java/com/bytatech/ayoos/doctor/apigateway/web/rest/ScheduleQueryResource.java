/**
 * 
 */
package com.bytatech.ayoos.doctor.apigateway.web.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.ScheduleResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.ScheduleDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author rafeek
 *
 */
@RestController
@RequestMapping("/api")
public class ScheduleQueryResource {
	@Autowired
	private ScheduleResourceApi scheduleResourceApi;
	 private final Logger log = LoggerFactory.getLogger(ScheduleQueryResource.class);
	@GetMapping("/_search/schedules")

	public ResponseEntity<List<ScheduleDTO>> searchSchedules(@RequestParam String query, int page, int size,
		
		ArrayList<String> sort) {
		log.debug("REST request to search for a page of Schedules for query {}", query);
		return scheduleResourceApi.searchSchedulesUsingGET(query, page, size, sort);
	}
}
