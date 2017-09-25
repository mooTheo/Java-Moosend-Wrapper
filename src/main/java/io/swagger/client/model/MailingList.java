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
import io.swagger.client.model.CustomFieldsDefinition;
import io.swagger.client.model.ImportOperation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MailingList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T09:37:52.408Z")
public class MailingList {
  @SerializedName("ActiveMemberCount")
  private Double activeMemberCount = null;

  @SerializedName("BouncedMemberCount")
  private Double bouncedMemberCount = null;

  @SerializedName("CreatedBy")
  private String createdBy = null;

  @SerializedName("CreatedOn")
  private String createdOn = null;

  @SerializedName("CustomFieldsDefinition")
  private List<CustomFieldsDefinition> customFieldsDefinition = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ImportOperation")
  private ImportOperation importOperation = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("RemovedMemberCount")
  private Double removedMemberCount = null;

  @SerializedName("Status")
  private Double status = null;

  @SerializedName("UnsubscribedMemberCount")
  private Double unsubscribedMemberCount = null;

  @SerializedName("UpdatedBy")
  private String updatedBy = null;

  @SerializedName("UpdatedOn")
  private String updatedOn = null;

  public MailingList activeMemberCount(Double activeMemberCount) {
    this.activeMemberCount = activeMemberCount;
    return this;
  }

   /**
   * 
   * @return activeMemberCount
  **/
  @ApiModelProperty(value = "")
  public Double getActiveMemberCount() {
    return activeMemberCount;
  }

  public void setActiveMemberCount(Double activeMemberCount) {
    this.activeMemberCount = activeMemberCount;
  }

  public MailingList bouncedMemberCount(Double bouncedMemberCount) {
    this.bouncedMemberCount = bouncedMemberCount;
    return this;
  }

   /**
   * 
   * @return bouncedMemberCount
  **/
  @ApiModelProperty(value = "")
  public Double getBouncedMemberCount() {
    return bouncedMemberCount;
  }

  public void setBouncedMemberCount(Double bouncedMemberCount) {
    this.bouncedMemberCount = bouncedMemberCount;
  }

  public MailingList createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public MailingList createdOn(String createdOn) {
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

  public MailingList customFieldsDefinition(List<CustomFieldsDefinition> customFieldsDefinition) {
    this.customFieldsDefinition = customFieldsDefinition;
    return this;
  }

  public MailingList addCustomFieldsDefinitionItem(CustomFieldsDefinition customFieldsDefinitionItem) {
    if (this.customFieldsDefinition == null) {
      this.customFieldsDefinition = new ArrayList<CustomFieldsDefinition>();
    }
    this.customFieldsDefinition.add(customFieldsDefinitionItem);
    return this;
  }

   /**
   * 
   * @return customFieldsDefinition
  **/
  @ApiModelProperty(value = "")
  public List<CustomFieldsDefinition> getCustomFieldsDefinition() {
    return customFieldsDefinition;
  }

  public void setCustomFieldsDefinition(List<CustomFieldsDefinition> customFieldsDefinition) {
    this.customFieldsDefinition = customFieldsDefinition;
  }

  public MailingList ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * 
   * @return ID
  **/
  @ApiModelProperty(value = "")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public MailingList importOperation(ImportOperation importOperation) {
    this.importOperation = importOperation;
    return this;
  }

   /**
   * Get importOperation
   * @return importOperation
  **/
  @ApiModelProperty(value = "")
  public ImportOperation getImportOperation() {
    return importOperation;
  }

  public void setImportOperation(ImportOperation importOperation) {
    this.importOperation = importOperation;
  }

  public MailingList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MailingList removedMemberCount(Double removedMemberCount) {
    this.removedMemberCount = removedMemberCount;
    return this;
  }

   /**
   * 
   * @return removedMemberCount
  **/
  @ApiModelProperty(value = "")
  public Double getRemovedMemberCount() {
    return removedMemberCount;
  }

  public void setRemovedMemberCount(Double removedMemberCount) {
    this.removedMemberCount = removedMemberCount;
  }

  public MailingList status(Double status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Double getStatus() {
    return status;
  }

  public void setStatus(Double status) {
    this.status = status;
  }

  public MailingList unsubscribedMemberCount(Double unsubscribedMemberCount) {
    this.unsubscribedMemberCount = unsubscribedMemberCount;
    return this;
  }

   /**
   * 
   * @return unsubscribedMemberCount
  **/
  @ApiModelProperty(value = "")
  public Double getUnsubscribedMemberCount() {
    return unsubscribedMemberCount;
  }

  public void setUnsubscribedMemberCount(Double unsubscribedMemberCount) {
    this.unsubscribedMemberCount = unsubscribedMemberCount;
  }

  public MailingList updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * 
   * @return updatedBy
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public MailingList updatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * 
   * @return updatedOn
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailingList mailingList = (MailingList) o;
    return Objects.equals(this.activeMemberCount, mailingList.activeMemberCount) &&
        Objects.equals(this.bouncedMemberCount, mailingList.bouncedMemberCount) &&
        Objects.equals(this.createdBy, mailingList.createdBy) &&
        Objects.equals(this.createdOn, mailingList.createdOn) &&
        Objects.equals(this.customFieldsDefinition, mailingList.customFieldsDefinition) &&
        Objects.equals(this.ID, mailingList.ID) &&
        Objects.equals(this.importOperation, mailingList.importOperation) &&
        Objects.equals(this.name, mailingList.name) &&
        Objects.equals(this.removedMemberCount, mailingList.removedMemberCount) &&
        Objects.equals(this.status, mailingList.status) &&
        Objects.equals(this.unsubscribedMemberCount, mailingList.unsubscribedMemberCount) &&
        Objects.equals(this.updatedBy, mailingList.updatedBy) &&
        Objects.equals(this.updatedOn, mailingList.updatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeMemberCount, bouncedMemberCount, createdBy, createdOn, customFieldsDefinition, ID, importOperation, name, removedMemberCount, status, unsubscribedMemberCount, updatedBy, updatedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailingList {\n");
    
    sb.append("    activeMemberCount: ").append(toIndentedString(activeMemberCount)).append("\n");
    sb.append("    bouncedMemberCount: ").append(toIndentedString(bouncedMemberCount)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    customFieldsDefinition: ").append(toIndentedString(customFieldsDefinition)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    importOperation: ").append(toIndentedString(importOperation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    removedMemberCount: ").append(toIndentedString(removedMemberCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    unsubscribedMemberCount: ").append(toIndentedString(unsubscribedMemberCount)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
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
