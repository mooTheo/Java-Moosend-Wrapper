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
 * UpdatingASegmentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:06:19.511Z")
public class UpdatingASegmentRequest {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("MatchType")
  private String matchType = null;

  public UpdatingASegmentRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the segment.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the segment.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdatingASegmentRequest matchType(String matchType) {
    this.matchType = matchType;
    return this;
  }

   /**
   * Specifies how the segment&#39;s criteria will match together. This must be one of the following values. If not specified, &#x60;All&#x60; will be assumed.
   * @return matchType
  **/
  @ApiModelProperty(value = "Specifies how the segment's criteria will match together. This must be one of the following values. If not specified, `All` will be assumed.")
  public String getMatchType() {
    return matchType;
  }

  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatingASegmentRequest updatingASegmentRequest = (UpdatingASegmentRequest) o;
    return Objects.equals(this.name, updatingASegmentRequest.name) &&
        Objects.equals(this.matchType, updatingASegmentRequest.matchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, matchType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatingASegmentRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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

