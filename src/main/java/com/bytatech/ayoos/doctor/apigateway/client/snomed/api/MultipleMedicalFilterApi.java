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
package com.bytatech.ayoos.doctor.apigateway.client.snomed.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bytatech.ayoos.doctor.apigateway.client.snomed.model.SearchResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-07-30T20:52:32.970+05:30[Asia/Kolkata]")

@Api(value = "MultipleMedicalFilter", description = "the MultipleMedicalFilter API")
public interface MultipleMedicalFilterApi {
	@ApiResponses(value = { 
	        @ApiResponse(code = 200, message = "Indicates the table exists and the table row data is returned", response = SearchResponse.class),
	        @ApiResponse(code = 404, message = "Indicates the requested table does not exist.") })
	    @RequestMapping(value = "/search/search",
	        produces = "application/json", 
	        method = RequestMethod.GET)
	 ResponseEntity<List<SearchResponse>> getMultipleMedicalFilterOfSingleTerm(@ApiParam(value = "term",required=true) @RequestParam("term") String term,
			 @ApiParam(value = "state",required=true ) @RequestParam("state") String state,
			 @ApiParam(value = "perspective",required=true ) @RequestParam("perspective") String perspective,
			 @ApiParam(value = "acceptability",required=true ) @RequestParam("acceptability") String acceptability,
			 @ApiParam(value = "returnlimit",required=true ) @RequestParam("returnlimit") Integer returnlimit,
			 @ApiParam(value = "groupbyconcept",required=true ) @RequestParam("groupbyconcept") String groupbyconcept,
			 @ApiParam(value = "refsetid",required=true ) @RequestParam("refsetid") String refsetid,
			 @ApiParam(value = "parentid",required=true ) @RequestParam("parentid") String parentid
			);
}
