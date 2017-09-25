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
 * UpdatingADraftCampaignResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T09:37:52.408Z")
public class UpdatingADraftCampaignResponse {
  @SerializedName("Code")
  private Integer code = null;

  @SerializedName("Error")
  private String error = null;

  @SerializedName("Context")
  private String context = null;

  public UpdatingADraftCampaignResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public UpdatingADraftCampaignResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * 
   * @return error
  **/
  @ApiModelProperty(required = true, value = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public UpdatingADraftCampaignResponse context(String context) {
    this.context = context;
    return this;
  }

   /**
   * 
   * @return context
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatingADraftCampaignResponse updatingADraftCampaignResponse = (UpdatingADraftCampaignResponse) o;
    return Objects.equals(this.code, updatingADraftCampaignResponse.code) &&
        Objects.equals(this.error, updatingADraftCampaignResponse.error) &&
        Objects.equals(this.context, updatingADraftCampaignResponse.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, error, context);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatingADraftCampaignResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

