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

import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.DoctorResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.DoctorDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rafeek
 *
 */
@RestController
@RequestMapping("/api")
public class DoctorCommandResource {
	@Autowired
	private DoctorResourceApi doctorResourceApi;
	private final Logger log = LoggerFactory.getLogger(DoctorCommandResource.class);
	@PostMapping("/doctors")
	public void createDoctor(@RequestBody DoctorDTO doctorDTO) {
		 log.debug("REST request to save Doctor : {}", doctorDTO);
		doctorResourceApi.createDoctorUsingPOST(doctorDTO);

	}

	@PutMapping("/doctors")
	public void updateDoctor(@RequestBody DoctorDTO doctorDTO) {
		log.debug("REST request to update Doctor : {}", doctorDTO);
		doctorResourceApi.updateDoctorUsingPUT(doctorDTO);
	}
	
	@DeleteMapping("/doctors/{id}")
    
    public void deleteDoctor(@PathVariable Long id) {
       log.debug("REST request to delete Doctor : {}", id);
		doctorResourceApi.deleteDoctorUsingDELETE(id);
       
    }

}
