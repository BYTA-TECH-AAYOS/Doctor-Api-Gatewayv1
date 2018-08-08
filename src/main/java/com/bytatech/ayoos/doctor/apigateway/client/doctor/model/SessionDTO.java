package com.bytatech.ayoos.doctor.apigateway.client.doctor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SessionDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-08-06T12:17:49.149+05:30[Asia/Kolkata]")

public class SessionDTO   {
  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("interval")
  private OffsetDateTime interval = null;

  @JsonProperty("scheduleId")
  private Long scheduleId = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("status")
  private Boolean status = null;

  public SessionDTO endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public SessionDTO id(Long id) {
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

  public SessionDTO interval(OffsetDateTime interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getInterval() {
    return interval;
  }

  public void setInterval(OffsetDateTime interval) {
    this.interval = interval;
  }

  public SessionDTO scheduleId(Long scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  /**
   * Get scheduleId
   * @return scheduleId
  **/
  @ApiModelProperty(value = "")


  public Long getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(Long scheduleId) {
    this.scheduleId = scheduleId;
  }

  public SessionDTO startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public SessionDTO status(Boolean status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionDTO sessionDTO = (SessionDTO) o;
    return Objects.equals(this.endTime, sessionDTO.endTime) &&
        Objects.equals(this.id, sessionDTO.id) &&
        Objects.equals(this.interval, sessionDTO.interval) &&
        Objects.equals(this.scheduleId, sessionDTO.scheduleId) &&
        Objects.equals(this.startTime, sessionDTO.startTime) &&
        Objects.equals(this.status, sessionDTO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, id, interval, scheduleId, startTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionDTO {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

