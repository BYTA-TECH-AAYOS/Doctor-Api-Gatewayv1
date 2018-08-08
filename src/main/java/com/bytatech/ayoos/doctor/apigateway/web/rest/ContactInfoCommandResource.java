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

import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.ContactInfoResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.api.DoctorResourceApi;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.ContactInfoDTO;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.model.DoctorDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rafeek
 *
 */
/**
 * REST controller for managing ContactInfo.
 */
@RestController
@RequestMapping("/api")
public class ContactInfoCommandResource {

	private final Logger log = LoggerFactory.getLogger(ContactInfoCommandResource.class);

	@Autowired
	private ContactInfoResourceApi contactInfoResourceApi;

	/**
	 * POST /contact-infos : Create a new contactInfo.
	 *
	 * @param contactInfoDTO
	 *            the contactInfoDTO to create
	 * @return the ResponseEntity with status 201 (Created) and with body the new
	 *         contactInfoDTO, or with status 400 (Bad Request) if the contactInfo
	 *         has already an ID
	 * @throws URISyntaxException
	 *             if the Location URI syntax is incorrect
	 */
	@PostMapping("/contact-infos")

	public ResponseEntity<ContactInfoDTO> createContactInfo(@RequestBody ContactInfoDTO contactInfoDTO)
			{
		log.debug("REST request to save ContactInfo : {}", contactInfoDTO);
		
		return contactInfoResourceApi.createContactInfoUsingPOST(contactInfoDTO);
	}

	/**
	 * PUT /contact-infos : Updates an existing contactInfo.
	 *
	 * @param contactInfoDTO
	 *            the contactInfoDTO to update
	 * @return the ResponseEntity with status 200 (OK) and with body the updated
	 *         contactInfoDTO, or with status 400 (Bad Request) if the
	 *         contactInfoDTO is not valid, or with status 500 (Internal Server
	 *         Error) if the contactInfoDTO couldn't be updated
	 * 
	 *             
	 */
	@PutMapping("/contact-infos")

	public ResponseEntity<ContactInfoDTO> updateContactInfo(@RequestBody ContactInfoDTO contactInfoDTO)
			{
		log.debug("REST request to update ContactInfo : {}", contactInfoDTO);
		return contactInfoResourceApi.updateContactInfoUsingPUT(contactInfoDTO);
	}

	/**
     * DELETE  /contact-infos/:id : delete the "id" contactInfo.
     *
     * @param id the id of the contactInfoDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/contact-infos/{id}")
    
    public ResponseEntity<Void> deleteContactInfo(@PathVariable Long id) {
        log.debug("REST request to delete ContactInfo : {}", id);
        
        return contactInfoResourceApi.deleteContactInfoUsingDELETE(id);
    }

}