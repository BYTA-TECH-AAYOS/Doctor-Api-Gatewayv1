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
public class LocationCommandResource {
	@Autowired
	private LocationResourceApi locationResourceApi;
	private final Logger log = LoggerFactory.getLogger(LocationCommandResource.class);

	@PostMapping("/locations")
    
    public void createLocation(@RequestBody LocationDTO locationDTO) {
		 log.debug("REST request to save Location : {}", locationDTO);
		locationResourceApi.createLocationUsingPOST(locationDTO);

	}

	 @PutMapping("/locations")
	   
	    public void updateLocation(@RequestBody LocationDTO locationDTO){
		 log.debug("REST request to update Location : {}", locationDTO);
		 locationResourceApi.updateLocationUsingPUT(locationDTO);
	}
	
	 @DeleteMapping("/locations/{id}")
	    public void deleteLocation(@PathVariable Long id) {
		 log.debug("REST request to delete Location : {}", id);
		 locationResourceApi.deleteLocationUsingDELETE(id);
       
    }

}
