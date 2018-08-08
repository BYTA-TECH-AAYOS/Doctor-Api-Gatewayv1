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
package com.bytatech.ayoos.doctor.apigateway.client.snomed.model;

/**
 * POJO for capturing search response of snomed ct search for anything and everything related to medical definitions and terminology.
 * 
 * @author MayaSanjeev mayabytatech, maya.k.k@lxisoft.com
 */
public class SearchResponse {

	private String hierachy;
	private String isPreferredTerm;
	private String conceptState;
	private String conceptFsn;
	private String definitionStatus;
	private String conceptId;
	private String typeId;
	private String term;
	private String id;
	private String activeStatus;
	private String moduleId;

	
	
	

	public String getHierachy() {
		return hierachy;
	}





	public void setHierachy(String hierachy) {
		this.hierachy = hierachy;
	}





	public String getIsPreferredTerm() {
		return isPreferredTerm;
	}





	public void setIsPreferredTerm(String isPreferredTerm) {
		this.isPreferredTerm = isPreferredTerm;
	}





	public String getConceptState() {
		return conceptState;
	}





	public void setConceptState(String conceptState) {
		this.conceptState = conceptState;
	}





	public String getConceptFsn() {
		return conceptFsn;
	}





	public void setConceptFsn(String conceptFsn) {
		this.conceptFsn = conceptFsn;
	}





	public String getDefinitionStatus() {
		return definitionStatus;
	}





	public void setDefinitionStatus(String definitionStatus) {
		this.definitionStatus = definitionStatus;
	}





	public String getConceptId() {
		return conceptId;
	}





	public void setConceptId(String conceptId) {
		this.conceptId = conceptId;
	}





	public String getTypeId() {
		return typeId;
	}





	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}





	public String getTerm() {
		return term;
	}





	public void setTerm(String term) {
		this.term = term;
	}





	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getActiveStatus() {
		return activeStatus;
	}





	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}





	public String getModuleId() {
		return moduleId;
	}





	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}





	@Override
	public String toString() {
		return "DetailSearchResponse [hierachy=" + hierachy + ", isPreferredTerm=" + isPreferredTerm + ", conceptState="
				+ conceptState + ", conceptFsn=" + conceptFsn + ", definitionStatus=" + definitionStatus
				+ ", conceptId=" + conceptId + ", typeId=" + typeId + ", term=" + term + ", id=" + id
				+ ", activeStatus=" + activeStatus + ", moduleId=" + moduleId + "]";
	}

}
