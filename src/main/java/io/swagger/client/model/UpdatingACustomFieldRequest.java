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
 * UpdatingACustomFieldRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:06:19.511Z")
public class UpdatingACustomFieldRequest {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("CustomFieldType")
  private String customFieldType = null;

  @SerializedName("Options")
  private String options = null;

  @SerializedName("IsRequired")
  private String isRequired = null;

  public UpdatingACustomFieldRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the custom field.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the custom field.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdatingACustomFieldRequest customFieldType(String customFieldType) {
    this.customFieldType = customFieldType;
    return this;
  }

   /**
   * Specifies the data type of the custom field. This must be one of the following values. If omitted, Text will be assumed. * &#x60;Text&#x60; * &#x60;Decimal&#x60; * &#x60;DateTime&#x60; * &#x60;SingleSelectDropdown&#x60; * &#x60;Integer&#x60; * &#x60;CheckBox&#x60;
   * @return customFieldType
  **/
  @ApiModelProperty(value = "Specifies the data type of the custom field. This must be one of the following values. If omitted, Text will be assumed. * `Text` * `Decimal` * `DateTime` * `SingleSelectDropdown` * `Integer` * `CheckBox`")
  public String getCustomFieldType() {
    return customFieldType;
  }

  public void setCustomFieldType(String customFieldType) {
    this.customFieldType = customFieldType;
  }

  public UpdatingACustomFieldRequest options(String options) {
    this.options = options;
    return this;
  }

   /**
   * If you want to create a custom field of type SingleSelectDropdown, you must set this parameter to specify the available options for the user to choose from. Use a comma (,) to separate different options.
   * @return options
  **/
  @ApiModelProperty(value = "If you want to create a custom field of type SingleSelectDropdown, you must set this parameter to specify the available options for the user to choose from. Use a comma (,) to separate different options.")
  public String getOptions() {
    return options;
  }

  public void setOptions(String options) {
    this.options = options;
  }

  public UpdatingACustomFieldRequest isRequired(String isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Specify whether this is field will be mandatory on not, when being used in a subscription form. You should specify a value of either true or false. If omitted, false will be assumed.
   * @return isRequired
  **/
  @ApiModelProperty(value = "Specify whether this is field will be mandatory on not, when being used in a subscription form. You should specify a value of either true or false. If omitted, false will be assumed.")
  public String getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(String isRequired) {
    this.isRequired = isRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatingACustomFieldRequest updatingACustomFieldRequest = (UpdatingACustomFieldRequest) o;
    return Objects.equals(this.name, updatingACustomFieldRequest.name) &&
        Objects.equals(this.customFieldType, updatingACustomFieldRequest.customFieldType) &&
        Objects.equals(this.options, updatingACustomFieldRequest.options) &&
        Objects.equals(this.isRequired, updatingACustomFieldRequest.isRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, customFieldType, options, isRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatingACustomFieldRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customFieldType: ").append(toIndentedString(customFieldType)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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

