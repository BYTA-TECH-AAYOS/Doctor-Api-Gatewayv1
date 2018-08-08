/**
 * 
 */
package com.bytatech.ayoos.doctor.apigateway.web.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.DoctorResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.DoctorDTO;


/**
 * @author rafeek
 *
 */
@RestController
@RequestMapping("/api")
public class DoctorQueryResource {
	@Autowired
	private DoctorResourceApi doctorResourceApi;
	 private final Logger log = LoggerFactory.getLogger(DoctorQueryResource.class);
	@GetMapping("/_search/doctors")
	public ResponseEntity<List<DoctorDTO>> searchDoctors(@RequestParam String query, int page, int size,ArrayList<String> sort) {
		log.debug("REST request to search for a page of Doctors for query {}", query);
		return doctorResourceApi.searchDoctorsUsingGET(query, page, size, sort);
	}

}
