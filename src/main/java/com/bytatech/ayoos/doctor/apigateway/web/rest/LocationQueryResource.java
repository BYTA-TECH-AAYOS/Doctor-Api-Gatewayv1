/**
 * 
 */
package com.bytatech.ayoos.doctor.apigateway.web.rest;

import java.util.ArrayList;import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.LocationResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.LocationDTO;
import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author rafeek
 *
 */
@RestController
@RequestMapping("/api")
public class LocationQueryResource {
	@Autowired
	private LocationResourceApi locationResourceApi;
	private final Logger log = LoggerFactory.getLogger(LocationQueryResource.class);
	@GetMapping("/_search/locations")
    @Timed
    public ResponseEntity<List<LocationDTO>> searchLocations(@RequestParam String query, int page, int size,
			ArrayList<String> sort) {
		log.debug("REST request to search for a page of Locations for query {}", query);
		return locationResourceApi.searchLocationsUsingGET(query, page, size, sort);
	}
}
