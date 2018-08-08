package com.bytatech.ayoos.doctor.apigateway.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DoctorDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-08-06T12:17:49.149+05:30[Asia/Kolkata]")

public class DoctorDTO   {
  @JsonProperty("consultationFee")
  private Double consultationFee = null;

  @JsonProperty("contactInfoId")
  private Long contactInfoId = null;

  @JsonProperty("doctorId")
  private Long doctorId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("imageContentType")
  private String imageContentType = null;

  @JsonProperty("locationId")
  private Long locationId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("specialisation")
  private String specialisation = null;

  public DoctorDTO consultationFee(Double consultationFee) {
    this.consultationFee = consultationFee;
    return this;
  }

  /**
   * Get consultationFee
   * @return consultationFee
  **/
  @ApiModelProperty(value = "")


  public Double getConsultationFee() {
    return consultationFee;
  }

  public void setConsultationFee(Double consultationFee) {
    this.consultationFee = consultationFee;
  }

  public DoctorDTO contactInfoId(Long contactInfoId) {
    this.contactInfoId = contactInfoId;
    return this;
  }

  /**
   * Get contactInfoId
   * @return contactInfoId
  **/
  @ApiModelProperty(value = "")


  public Long getContactInfoId() {
    return contactInfoId;
  }

  public void setContactInfoId(Long contactInfoId) {
    this.contactInfoId = contactInfoId;
  }

  public DoctorDTO doctorId(Long doctorId) {
    this.doctorId = doctorId;
    return this;
  }

  /**
   * Get doctorId
   * @return doctorId
  **/
  @ApiModelProperty(value = "")


  public Long getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(Long doctorId) {
    this.doctorId = doctorId;
  }

  public DoctorDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DoctorDTO image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public DoctorDTO imageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
    return this;
  }

  /**
   * Get imageContentType
   * @return imageContentType
  **/
  @ApiModelProperty(value = "")


  public String getImageContentType() {
    return imageContentType;
  }

  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }

  public DoctorDTO locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(value = "")


  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public DoctorDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DoctorDTO specialisation(String specialisation) {
    this.specialisation = specialisation;
    return this;
  }

  /**
   * Get specialisation
   * @return specialisation
  **/
  @ApiModelProperty(value = "")


  public String getSpecialisation() {
    return specialisation;
  }

  public void setSpecialisation(String specialisation) {
    this.specialisation = specialisation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoctorDTO doctorDTO = (DoctorDTO) o;
    return Objects.equals(this.consultationFee, doctorDTO.consultationFee) &&
        Objects.equals(this.contactInfoId, doctorDTO.contactInfoId) &&
        Objects.equals(this.doctorId, doctorDTO.doctorId) &&
        Objects.equals(this.id, doctorDTO.id) &&
        Objects.equals(this.image, doctorDTO.image) &&
        Objects.equals(this.imageContentType, doctorDTO.imageContentType) &&
        Objects.equals(this.locationId, doctorDTO.locationId) &&
        Objects.equals(this.name, doctorDTO.name) &&
        Objects.equals(this.specialisation, doctorDTO.specialisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultationFee, contactInfoId, doctorId, id, image, imageContentType, locationId, name, specialisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoctorDTO {\n");
    
    sb.append("    consultationFee: ").append(toIndentedString(consultationFee)).append("\n");
    sb.append("    contactInfoId: ").append(toIndentedString(contactInfoId)).append("\n");
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    specialisation: ").append(toIndentedString(specialisation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

