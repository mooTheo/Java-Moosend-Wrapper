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
 * CustomField
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-13T14:09:10.814Z")
public class CustomField {
  @SerializedName("CustomFieldID")
  private String customFieldID = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Value")
  private String value = null;

  public CustomField customFieldID(String customFieldID) {
    this.customFieldID = customFieldID;
    return this;
  }

   /**
   * 
   * @return customFieldID
  **/
  @ApiModelProperty(value = "")
  public String getCustomFieldID() {
    return customFieldID;
  }

  public void setCustomFieldID(String customFieldID) {
    this.customFieldID = customFieldID;
  }

  public CustomField name(String name) {
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

  public CustomField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomField customField = (CustomField) o;
    return Objects.equals(this.customFieldID, customField.customFieldID) &&
        Objects.equals(this.name, customField.name) &&
        Objects.equals(this.value, customField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldID, name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomField {\n");
    
    sb.append("    customFieldID: ").append(toIndentedString(customFieldID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

