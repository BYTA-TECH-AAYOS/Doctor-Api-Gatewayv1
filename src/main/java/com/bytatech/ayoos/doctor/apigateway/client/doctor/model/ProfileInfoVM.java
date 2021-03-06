package com.bytatech.ayoos.doctor.apigateway.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProfileInfoVM
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-08-06T12:17:49.149+05:30[Asia/Kolkata]")

public class ProfileInfoVM   {
  @JsonProperty("activeProfiles")
  @Valid
  private List<String> activeProfiles = null;

  @JsonProperty("ribbonEnv")
  private String ribbonEnv = null;

  public ProfileInfoVM activeProfiles(List<String> activeProfiles) {
    this.activeProfiles = activeProfiles;
    return this;
  }

  public ProfileInfoVM addActiveProfilesItem(String activeProfilesItem) {
    if (this.activeProfiles == null) {
      this.activeProfiles = new ArrayList<String>();
    }
    this.activeProfiles.add(activeProfilesItem);
    return this;
  }

  /**
   * Get activeProfiles
   * @return activeProfiles
  **/
  @ApiModelProperty(value = "")


  public List<String> getActiveProfiles() {
    return activeProfiles;
  }

  public void setActiveProfiles(List<String> activeProfiles) {
    this.activeProfiles = activeProfiles;
  }

  public ProfileInfoVM ribbonEnv(String ribbonEnv) {
    this.ribbonEnv = ribbonEnv;
    return this;
  }

  /**
   * Get ribbonEnv
   * @return ribbonEnv
  **/
  @ApiModelProperty(value = "")


  public String getRibbonEnv() {
    return ribbonEnv;
  }

  public void setRibbonEnv(String ribbonEnv) {
    this.ribbonEnv = ribbonEnv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileInfoVM profileInfoVM = (ProfileInfoVM) o;
    return Objects.equals(this.activeProfiles, profileInfoVM.activeProfiles) &&
        Objects.equals(this.ribbonEnv, profileInfoVM.ribbonEnv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeProfiles, ribbonEnv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileInfoVM {\n");
    
    sb.append("    activeProfiles: ").append(toIndentedString(activeProfiles)).append("\n");
    sb.append("    ribbonEnv: ").append(toIndentedString(ribbonEnv)).append("\n");
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

