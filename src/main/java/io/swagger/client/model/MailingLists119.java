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
 * MailingLists119
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T09:37:52.408Z")
public class MailingLists119 {
  @SerializedName("MailingListID")
  private String mailingListID = null;

  @SerializedName("SegmentID")
  private Double segmentID = null;

  public MailingLists119 mailingListID(String mailingListID) {
    this.mailingListID = mailingListID;
    return this;
  }

   /**
   * 
   * @return mailingListID
  **/
  @ApiModelProperty(value = "")
  public String getMailingListID() {
    return mailingListID;
  }

  public void setMailingListID(String mailingListID) {
    this.mailingListID = mailingListID;
  }

  public MailingLists119 segmentID(Double segmentID) {
    this.segmentID = segmentID;
    return this;
  }

   /**
   * 
   * @return segmentID
  **/
  @ApiModelProperty(value = "")
  public Double getSegmentID() {
    return segmentID;
  }

  public void setSegmentID(Double segmentID) {
    this.segmentID = segmentID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailingLists119 mailingLists119 = (MailingLists119) o;
    return Objects.equals(this.mailingListID, mailingLists119.mailingListID) &&
        Objects.equals(this.segmentID, mailingLists119.segmentID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailingListID, segmentID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailingLists119 {\n");
    
    sb.append("    mailingListID: ").append(toIndentedString(mailingListID)).append("\n");
    sb.append("    segmentID: ").append(toIndentedString(segmentID)).append("\n");
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
