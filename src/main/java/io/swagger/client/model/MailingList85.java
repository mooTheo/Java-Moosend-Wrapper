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
 * MailingList85
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:06:19.511Z")
public class MailingList85 {
  @SerializedName("MailingListID")
  private String mailingListID = null;

  @SerializedName("SegmentID")
  private Double segmentID = null;

  public MailingList85 mailingListID(String mailingListID) {
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

  public MailingList85 segmentID(Double segmentID) {
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
    MailingList85 mailingList85 = (MailingList85) o;
    return Objects.equals(this.mailingListID, mailingList85.mailingListID) &&
        Objects.equals(this.segmentID, mailingList85.segmentID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailingListID, segmentID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailingList85 {\n");
    
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

