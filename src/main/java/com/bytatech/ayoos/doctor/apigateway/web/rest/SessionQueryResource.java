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
public class SessionQueryResource {
	@Autowired
	private SessionResourceApi sessionsResourceApi;
	private final Logger log = LoggerFactory.getLogger(SessionQueryResource.class);
	 @GetMapping("/_search/sessions")
	    
	    public ResponseEntity<List<SessionDTO>> searchSessions(@RequestParam String query, int page, int size,
			ArrayList<String> sort) {
		 log.debug("REST request to search for a page of Sessions for query {}", query);
		return sessionsResourceApi.searchSessionsUsingGET(query, page, size, sort);
	}
}
