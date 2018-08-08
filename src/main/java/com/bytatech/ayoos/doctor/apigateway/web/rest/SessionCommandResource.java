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

import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.SessionResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.SessionDTO;
import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author rafeek
 *
 */
@RestController
@RequestMapping("/api")
public class SessionCommandResource {
	
	@Autowired
	private SessionResourceApi sessionsResourceApi;
	private final Logger log = LoggerFactory.getLogger(SessionCommandResource.class);

	@PostMapping("/sessions")

	public void createSession(@RequestBody SessionDTO sessionDTO) {
		 log.debug("REST request to save Session : {}", sessionDTO);
		sessionsResourceApi.createSessionUsingPOST(sessionDTO);
	}

	@PutMapping("/sessions")

	public void updateSession(@RequestBody SessionDTO sessionDTO) {
		 log.debug("REST request to update Session : {}", sessionDTO);
		sessionsResourceApi.updateSessionUsingPUT(sessionDTO);
	}

	@DeleteMapping("/sessions/{id}")
	public void deleteSession(@PathVariable Long id) {
		 log.debug("REST request to delete Session : {}", id);
		sessionsResourceApi.deleteSessionUsingDELETE(id);
	}

}
