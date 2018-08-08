/*
* Copyright 2002-2016 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.bytatech.ayoos.doctor.apigateway.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.doctor.apigateway.client.snomed.api.MultipleMedicalFilterApi;
import com.bytatech.ayoos.doctor.apigateway.client.snomed.model.SearchResponse;
import com.codahale.metrics.annotation.Timed;

/**
 * TODO Provide a detail on the term which searched on different filtering
 * mechanism like disease,examinations,drugs etc. use in doctor home page to
 * search.
 * 
 * @author MayaSanjeev mayabytatech, maya.k.k@lxisoft.com
 */
@RestController
@RequestMapping("/api")
public class MultipleMedicalFilterQueryResponse {
	@Autowired
	MultipleMedicalFilterApi multipleMedicalFilterApi;

	
	public MultipleMedicalFilterQueryResponse(MultipleMedicalFilterApi multipleMedicalFilterApi) {
		super();
		this.multipleMedicalFilterApi = multipleMedicalFilterApi;
	}


	/**
	 * GET /medicalfilter : get drug,disease,examination etc regarding the search term.
	 *
	 * @param String
	 * @return the ResponseEntity with status 200 (OK) and the list of patients
	 *         in body
	 */
	@GetMapping("/snomed/medicalfilter")
	@Timed
	public ResponseEntity<List<SearchResponse>> getMultipleMedicalFilterOfSingleTerm(@RequestParam String term) {
		String state = "active";
		String perspective = "full";
		String acceptability = "preferred";
		Integer returnlimit = 15;
		String groupbyconcept = "false";
		String refsetid = "null";
		String parentid = "null";
		ResponseEntity<List<SearchResponse>> response = multipleMedicalFilterApi.getMultipleMedicalFilterOfSingleTerm(term, state, perspective, acceptability, returnlimit, groupbyconcept, refsetid, parentid);
			
		return response;
	}

}
