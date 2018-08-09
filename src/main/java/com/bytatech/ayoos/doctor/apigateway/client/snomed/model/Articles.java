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

import java.time.ZonedDateTime;
import java.util.List;



/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */
public class  Articles{

	private String author;
	private String tittle;
	private String description;
	private String url;
	private String urlToImage;
	private ZonedDateTime publishedAt;
	
	
	/*public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrlToImage() {
		return urlToImage;
	}
	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}
	public ZonedDateTime getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(ZonedDateTime publishedAt) {
		this.publishedAt = publishedAt;
	}
	@Override
	public String toString() {
		return "Articles [author=" + author + ", tittle=" + tittle + ", description=" + description + ", url=" + url
				+ ", urlToImage=" + urlToImage + ", publishedAt=" + publishedAt + "]";
	}
	
}

