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
import io.swagger.client.model.Context;
import java.io.IOException;

/**
 * GettingAllActiveMailingListsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T09:37:52.408Z")
public class GettingAllActiveMailingListsResponse {
  @SerializedName("Code")
  private Double code = null;

  @SerializedName("Context")
  private Context context = null;

  @SerializedName("Error")
  private String error = null;

  public GettingAllActiveMailingListsResponse code(Double code) {
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

  public GettingAllActiveMailingListsResponse context(Context context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public GettingAllActiveMailingListsResponse error(String error) {
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
    GettingAllActiveMailingListsResponse gettingAllActiveMailingListsResponse = (GettingAllActiveMailingListsResponse) o;
    return Objects.equals(this.code, gettingAllActiveMailingListsResponse.code) &&
        Objects.equals(this.context, gettingAllActiveMailingListsResponse.context) &&
        Objects.equals(this.error, gettingAllActiveMailingListsResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, context, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GettingAllActiveMailingListsResponse {\n");
    
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

