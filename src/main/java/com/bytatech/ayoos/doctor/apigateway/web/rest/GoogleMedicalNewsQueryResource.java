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
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.ayoos.doctor.apigateway.client.snomed.api.GoogleMedicalNewsApi;
import com.bytatech.ayoos.doctor.apigateway.client.snomed.model.Articles;
import com.bytatech.ayoos.doctor.apigateway.client.snomed.model.GoogleMedicalNews;

/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */

@RestController
@RequestMapping("/api")
public class GoogleMedicalNewsQueryResource {

	@Autowired
	GoogleMedicalNewsApi googleApi;

	public GoogleMedicalNewsQueryResource(GoogleMedicalNewsApi googleApi) {
		super();
		this.googleApi = googleApi;
	}
	
	@GetMapping("/googleMedicalNews")
	public  ResponseEntity<GoogleMedicalNews> getMedicalNews(){
		
		 String sources="medical-news-today";
		String apiKey="001701e121ff44edb9ea842a0986fe8a";
		return googleApi.getMedicalNews(sources,apiKey);
	}
	
}
