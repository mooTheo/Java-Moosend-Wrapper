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
import io.swagger.client.model.Context37;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AddingMultipleSubscribersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T09:37:52.408Z")
public class AddingMultipleSubscribersResponse {
  @SerializedName("Code")
  private Double code = null;

  @SerializedName("Context")
  private List<Context37> context = null;

  @SerializedName("Error")
  private String error = null;

  public AddingMultipleSubscribersResponse code(Double code) {
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @ApiModelProperty(value = "")
  public Double getCode() {
    return code;
  }

  public void setCode(Double code) {
    this.code = code;
  }

  public AddingMultipleSubscribersResponse context(List<Context37> context) {
    this.context = context;
    return this;
  }

  public AddingMultipleSubscribersResponse addContextItem(Context37 contextItem) {
    if (this.context == null) {
      this.context = new ArrayList<Context37>();
    }
    this.context.add(contextItem);
    return this;
  }

   /**
   * 
   * @return context
  **/
  @ApiModelProperty(value = "")
  public List<Context37> getContext() {
    return context;
  }

  public void setContext(List<Context37> context) {
    this.context = context;
  }

  public AddingMultipleSubscribersResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * 
   * @return error
  **/
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddingMultipleSubscribersResponse addingMultipleSubscribersResponse = (AddingMultipleSubscribersResponse) o;
    return Objects.equals(this.code, addingMultipleSubscribersResponse.code) &&
        Objects.equals(this.context, addingMultipleSubscribersResponse.context) &&
        Objects.equals(this.error, addingMultipleSubscribersResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, context, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddingMultipleSubscribersResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

