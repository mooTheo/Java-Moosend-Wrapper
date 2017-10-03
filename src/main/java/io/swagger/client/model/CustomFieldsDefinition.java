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
 * CustomFieldsDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:06:19.511Z")
public class CustomFieldsDefinition {
  @SerializedName("Context")
  private String context = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("IsRequired")
  private Boolean isRequired = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Type")
  private Double type = null;

  public CustomFieldsDefinition context(String context) {
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

  public CustomFieldsDefinition ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * 
   * @return ID
  **/
  @ApiModelProperty(value = "")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public CustomFieldsDefinition isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * 
   * @return isRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public CustomFieldsDefinition name(String name) {
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

  public CustomFieldsDefinition type(Double type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public Double getType() {
    return type;
  }

  public void setType(Double type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldsDefinition customFieldsDefinition = (CustomFieldsDefinition) o;
    return Objects.equals(this.context, customFieldsDefinition.context) &&
        Objects.equals(this.ID, customFieldsDefinition.ID) &&
        Objects.equals(this.isRequired, customFieldsDefinition.isRequired) &&
        Objects.equals(this.name, customFieldsDefinition.name) &&
        Objects.equals(this.type, customFieldsDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, ID, isRequired, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldsDefinition {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

