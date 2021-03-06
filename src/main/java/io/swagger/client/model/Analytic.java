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
 * Analytic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:06:19.511Z")
public class Analytic {
  @SerializedName("Context")
  private String context = null;

  @SerializedName("ContextDescription")
  private String contextDescription = null;

  @SerializedName("ContextName")
  private String contextName = null;

  @SerializedName("TotalCount")
  private Double totalCount = null;

  @SerializedName("UniqueCount")
  private Double uniqueCount = null;

  public Analytic context(String context) {
    this.context = context;
    return this;
  }

   /**
   * 
   * @return context
  **/
  @ApiModelProperty(value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public Analytic contextDescription(String contextDescription) {
    this.contextDescription = contextDescription;
    return this;
  }

   /**
   * 
   * @return contextDescription
  **/
  @ApiModelProperty(value = "")
  public String getContextDescription() {
    return contextDescription;
  }

  public void setContextDescription(String contextDescription) {
    this.contextDescription = contextDescription;
  }

  public Analytic contextName(String contextName) {
    this.contextName = contextName;
    return this;
  }

   /**
   * 
   * @return contextName
  **/
  @ApiModelProperty(value = "")
  public String getContextName() {
    return contextName;
  }

  public void setContextName(String contextName) {
    this.contextName = contextName;
  }

  public Analytic totalCount(Double totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 
   * @return totalCount
  **/
  @ApiModelProperty(value = "")
  public Double getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Double totalCount) {
    this.totalCount = totalCount;
  }

  public Analytic uniqueCount(Double uniqueCount) {
    this.uniqueCount = uniqueCount;
    return this;
  }

   /**
   * 
   * @return uniqueCount
  **/
  @ApiModelProperty(value = "")
  public Double getUniqueCount() {
    return uniqueCount;
  }

  public void setUniqueCount(Double uniqueCount) {
    this.uniqueCount = uniqueCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Analytic analytic = (Analytic) o;
    return Objects.equals(this.context, analytic.context) &&
        Objects.equals(this.contextDescription, analytic.contextDescription) &&
        Objects.equals(this.contextName, analytic.contextName) &&
        Objects.equals(this.totalCount, analytic.totalCount) &&
        Objects.equals(this.uniqueCount, analytic.uniqueCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, contextDescription, contextName, totalCount, uniqueCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Analytic {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    contextDescription: ").append(toIndentedString(contextDescription)).append("\n");
    sb.append("    contextName: ").append(toIndentedString(contextName)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    uniqueCount: ").append(toIndentedString(uniqueCount)).append("\n");
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

