/*
 * Moosend API
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ImportOperation19
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:06:19.511Z")
public class ImportOperation19 {
  @SerializedName("CompletedOn")
  private String completedOn = null;

  @SerializedName("CreatedOn")
  private String createdOn = null;

  @SerializedName("DataHash")
  private String dataHash = null;

  @SerializedName("EmailNotify")
  private String emailNotify = null;

  @SerializedName("ID")
  private Double ID = null;

  @SerializedName("Mappings")
  private String mappings = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("SkipNewMembers")
  private Boolean skipNewMembers = null;

  @SerializedName("StartedOn")
  private String startedOn = null;

  @SerializedName("Success")
  private Boolean success = null;

  @SerializedName("TotalDuplicate")
  private Double totalDuplicate = null;

  @SerializedName("TotalIgnored")
  private Double totalIgnored = null;

  @SerializedName("TotalInserted")
  private Double totalInserted = null;

  @SerializedName("TotalInvalid")
  private Double totalInvalid = null;

  @SerializedName("TotalMembers")
  private Double totalMembers = null;

  @SerializedName("TotalUnsubscribed")
  private Double totalUnsubscribed = null;

  @SerializedName("TotalUpdated")
  private Double totalUpdated = null;

  public ImportOperation19 completedOn(String completedOn) {
    this.completedOn = completedOn;
    return this;
  }

   /**
   * 
   * @return completedOn
  **/
  @ApiModelProperty(value = "")
  public String getCompletedOn() {
    return completedOn;
  }

  public void setCompletedOn(String completedOn) {
    this.completedOn = completedOn;
  }

  public ImportOperation19 createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public ImportOperation19 dataHash(String dataHash) {
    this.dataHash = dataHash;
    return this;
  }

   /**
   * 
   * @return dataHash
  **/
  @ApiModelProperty(value = "")
  public String getDataHash() {
    return dataHash;
  }

  public void setDataHash(String dataHash) {
    this.dataHash = dataHash;
  }

  public ImportOperation19 emailNotify(String emailNotify) {
    this.emailNotify = emailNotify;
    return this;
  }

   /**
   * 
   * @return emailNotify
  **/
  @ApiModelProperty(value = "")
  public String getEmailNotify() {
    return emailNotify;
  }

  public void setEmailNotify(String emailNotify) {
    this.emailNotify = emailNotify;
  }

  public ImportOperation19 ID(Double ID) {
    this.ID = ID;
    return this;
  }

   /**
   * 
   * @return ID
  **/
  @ApiModelProperty(value = "")
  public Double getID() {
    return ID;
  }

  public void setID(Double ID) {
    this.ID = ID;
  }

  public ImportOperation19 mappings(String mappings) {
    this.mappings = mappings;
    return this;
  }

   /**
   * 
   * @return mappings
  **/
  @ApiModelProperty(value = "")
  public String getMappings() {
    return mappings;
  }

  public void setMappings(String mappings) {
    this.mappings = mappings;
  }

  public ImportOperation19 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ImportOperation19 skipNewMembers(Boolean skipNewMembers) {
    this.skipNewMembers = skipNewMembers;
    return this;
  }

   /**
   * 
   * @return skipNewMembers
  **/
  @ApiModelProperty(value = "")
  public Boolean getSkipNewMembers() {
    return skipNewMembers;
  }

  public void setSkipNewMembers(Boolean skipNewMembers) {
    this.skipNewMembers = skipNewMembers;
  }

  public ImportOperation19 startedOn(String startedOn) {
    this.startedOn = startedOn;
    return this;
  }

   /**
   * 
   * @return startedOn
  **/
  @ApiModelProperty(value = "")
  public String getStartedOn() {
    return startedOn;
  }

  public void setStartedOn(String startedOn) {
    this.startedOn = startedOn;
  }

  public ImportOperation19 success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * 
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ImportOperation19 totalDuplicate(Double totalDuplicate) {
    this.totalDuplicate = totalDuplicate;
    return this;
  }

   /**
   * 
   * @return totalDuplicate
  **/
  @ApiModelProperty(value = "")
  public Double getTotalDuplicate() {
    return totalDuplicate;
  }

  public void setTotalDuplicate(Double totalDuplicate) {
    this.totalDuplicate = totalDuplicate;
  }

  public ImportOperation19 totalIgnored(Double totalIgnored) {
    this.totalIgnored = totalIgnored;
    return this;
  }

   /**
   * 
   * @return totalIgnored
  **/
  @ApiModelProperty(value = "")
  public Double getTotalIgnored() {
    return totalIgnored;
  }

  public void setTotalIgnored(Double totalIgnored) {
    this.totalIgnored = totalIgnored;
  }

  public ImportOperation19 totalInserted(Double totalInserted) {
    this.totalInserted = totalInserted;
    return this;
  }

   /**
   * 
   * @return totalInserted
  **/
  @ApiModelProperty(value = "")
  public Double getTotalInserted() {
    return totalInserted;
  }

  public void setTotalInserted(Double totalInserted) {
    this.totalInserted = totalInserted;
  }

  public ImportOperation19 totalInvalid(Double totalInvalid) {
    this.totalInvalid = totalInvalid;
    return this;
  }

   /**
   * 
   * @return totalInvalid
  **/
  @ApiModelProperty(value = "")
  public Double getTotalInvalid() {
    return totalInvalid;
  }

  public void setTotalInvalid(Double totalInvalid) {
    this.totalInvalid = totalInvalid;
  }

  public ImportOperation19 totalMembers(Double totalMembers) {
    this.totalMembers = totalMembers;
    return this;
  }

   /**
   * 
   * @return totalMembers
  **/
  @ApiModelProperty(value = "")
  public Double getTotalMembers() {
    return totalMembers;
  }

  public void setTotalMembers(Double totalMembers) {
    this.totalMembers = totalMembers;
  }

  public ImportOperation19 totalUnsubscribed(Double totalUnsubscribed) {
    this.totalUnsubscribed = totalUnsubscribed;
    return this;
  }

   /**
   * 
   * @return totalUnsubscribed
  **/
  @ApiModelProperty(value = "")
  public Double getTotalUnsubscribed() {
    return totalUnsubscribed;
  }

  public void setTotalUnsubscribed(Double totalUnsubscribed) {
    this.totalUnsubscribed = totalUnsubscribed;
  }

  public ImportOperation19 totalUpdated(Double totalUpdated) {
    this.totalUpdated = totalUpdated;
    return this;
  }

   /**
   * 
   * @return totalUpdated
  **/
  @ApiModelProperty(value = "")
  public Double getTotalUpdated() {
    return totalUpdated;
  }

  public void setTotalUpdated(Double totalUpdated) {
    this.totalUpdated = totalUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportOperation19 importOperation19 = (ImportOperation19) o;
    return Objects.equals(this.completedOn, importOperation19.completedOn) &&
        Objects.equals(this.createdOn, importOperation19.createdOn) &&
        Objects.equals(this.dataHash, importOperation19.dataHash) &&
        Objects.equals(this.emailNotify, importOperation19.emailNotify) &&
        Objects.equals(this.ID, importOperation19.ID) &&
        Objects.equals(this.mappings, importOperation19.mappings) &&
        Objects.equals(this.message, importOperation19.message) &&
        Objects.equals(this.skipNewMembers, importOperation19.skipNewMembers) &&
        Objects.equals(this.startedOn, importOperation19.startedOn) &&
        Objects.equals(this.success, importOperation19.success) &&
        Objects.equals(this.totalDuplicate, importOperation19.totalDuplicate) &&
        Objects.equals(this.totalIgnored, importOperation19.totalIgnored) &&
        Objects.equals(this.totalInserted, importOperation19.totalInserted) &&
        Objects.equals(this.totalInvalid, importOperation19.totalInvalid) &&
        Objects.equals(this.totalMembers, importOperation19.totalMembers) &&
        Objects.equals(this.totalUnsubscribed, importOperation19.totalUnsubscribed) &&
        Objects.equals(this.totalUpdated, importOperation19.totalUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedOn, createdOn, dataHash, emailNotify, ID, mappings, message, skipNewMembers, startedOn, success, totalDuplicate, totalIgnored, totalInserted, totalInvalid, totalMembers, totalUnsubscribed, totalUpdated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportOperation19 {\n");
    
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    dataHash: ").append(toIndentedString(dataHash)).append("\n");
    sb.append("    emailNotify: ").append(toIndentedString(emailNotify)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    skipNewMembers: ").append(toIndentedString(skipNewMembers)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    totalDuplicate: ").append(toIndentedString(totalDuplicate)).append("\n");
    sb.append("    totalIgnored: ").append(toIndentedString(totalIgnored)).append("\n");
    sb.append("    totalInserted: ").append(toIndentedString(totalInserted)).append("\n");
    sb.append("    totalInvalid: ").append(toIndentedString(totalInvalid)).append("\n");
    sb.append("    totalMembers: ").append(toIndentedString(totalMembers)).append("\n");
    sb.append("    totalUnsubscribed: ").append(toIndentedString(totalUnsubscribed)).append("\n");
    sb.append("    totalUpdated: ").append(toIndentedString(totalUpdated)).append("\n");
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

