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

import org.springframework.cloud.netflix.feign.FeignClient;

import com.bytatech.ayoos.doctor.apigateway.client.doctor.ClientConfiguration;

/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */

@FeignClient(name="${googlemedicalnewsapi.name:googlemedicalnewsapi}", url="${googlemedicalnewsapi.url:http://newsapi.org}", configuration = ClientConfiguration.class)
public interface GoogleMedicalNewsApiClient extends GoogleMedicalNewsApi{

}
