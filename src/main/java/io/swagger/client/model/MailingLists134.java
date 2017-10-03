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
import io.swagger.client.model.MailingList69;
import java.io.IOException;

/**
 * MailingLists134
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:06:19.511Z")
public class MailingLists134 {
  @SerializedName("Campaign")
  private String campaign = null;

  @SerializedName("MailingList")
  private MailingList69 mailingList = null;

  @SerializedName("Segment")
  private String segment = null;

  public MailingLists134 campaign(String campaign) {
    this.campaign = campaign;
    return this;
  }

   /**
   * 
   * @return campaign
  **/
  @ApiModelProperty(value = "")
  public String getCampaign() {
    return campaign;
  }

  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }

  public MailingLists134 mailingList(MailingList69 mailingList) {
    this.mailingList = mailingList;
    return this;
  }

   /**
   * Get mailingList
   * @return mailingList
  **/
  @ApiModelProperty(value = "")
  public MailingList69 getMailingList() {
    return mailingList;
  }

  public void setMailingList(MailingList69 mailingList) {
    this.mailingList = mailingList;
  }

  public MailingLists134 segment(String segment) {
    this.segment = segment;
    return this;
  }

   /**
   * 
   * @return segment
  **/
  @ApiModelProperty(value = "")
  public String getSegment() {
    return segment;
  }

  public void setSegment(String segment) {
    this.segment = segment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailingLists134 mailingLists134 = (MailingLists134) o;
    return Objects.equals(this.campaign, mailingLists134.campaign) &&
        Objects.equals(this.mailingList, mailingLists134.mailingList) &&
        Objects.equals(this.segment, mailingLists134.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, mailingList, segment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailingLists134 {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    mailingList: ").append(toIndentedString(mailingList)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
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

