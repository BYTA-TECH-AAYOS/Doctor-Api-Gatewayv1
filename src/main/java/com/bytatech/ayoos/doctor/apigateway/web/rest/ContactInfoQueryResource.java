/**
 * 
 */
package com.bytatech.ayoos.doctor.apigateway.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.ContactInfoResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.DoctorResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.ContactInfoDTO;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.DoctorDTO;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rafeek
 *
 */
@RestController
@RequestMapping("/api")
public class ContactInfoQueryResource {
	private final Logger log = LoggerFactory.getLogger(ContactInfoQueryResource.class);
	@Autowired
	private ContactInfoResourceApi contactInfoResourceApi;
  
	
	@GetMapping("/_search/contact-infos")
	   
	    public ResponseEntity<List<ContactInfoDTO>> searchContactInfos(@RequestParam String query, int page, int size,ArrayList<String> sort) {
	        log.debug("REST request to search for a page of ContactInfos for query {}", query);
	       
	        return contactInfoResourceApi.searchContactInfosUsingGET(query, page, size, sort);
	    }
}
