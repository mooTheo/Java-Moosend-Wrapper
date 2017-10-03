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
 * ReplyToEmail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:06:19.511Z")
public class ReplyToEmail {
  @SerializedName("CreatedOn")
  private String createdOn = null;

  @SerializedName("DkimPublic")
  private String dkimPublic = null;

  @SerializedName("DkimVerified")
  private Boolean dkimVerified = null;

  @SerializedName("Email")
  private String email = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("SpfVerified")
  private Boolean spfVerified = null;

  public ReplyToEmail createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public ReplyToEmail dkimPublic(String dkimPublic) {
    this.dkimPublic = dkimPublic;
    return this;
  }

   /**
   * 
   * @return dkimPublic
  **/
  @ApiModelProperty(value = "")
  public String getDkimPublic() {
    return dkimPublic;
  }

  public void setDkimPublic(String dkimPublic) {
    this.dkimPublic = dkimPublic;
  }

  public ReplyToEmail dkimVerified(Boolean dkimVerified) {
    this.dkimVerified = dkimVerified;
    return this;
  }

   /**
   * 
   * @return dkimVerified
  **/
  @ApiModelProperty(value = "")
  public Boolean getDkimVerified() {
    return dkimVerified;
  }

  public void setDkimVerified(Boolean dkimVerified) {
    this.dkimVerified = dkimVerified;
  }

  public ReplyToEmail email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ReplyToEmail ID(String ID) {
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

  public ReplyToEmail isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * 
   * @return isEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public ReplyToEmail name(String name) {
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

  public ReplyToEmail spfVerified(Boolean spfVerified) {
    this.spfVerified = spfVerified;
    return this;
  }

   /**
   * 
   * @return spfVerified
  **/
  @ApiModelProperty(value = "")
  public Boolean getSpfVerified() {
    return spfVerified;
  }

  public void setSpfVerified(Boolean spfVerified) {
    this.spfVerified = spfVerified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplyToEmail replyToEmail = (ReplyToEmail) o;
    return Objects.equals(this.createdOn, replyToEmail.createdOn) &&
        Objects.equals(this.dkimPublic, replyToEmail.dkimPublic) &&
        Objects.equals(this.dkimVerified, replyToEmail.dkimVerified) &&
        Objects.equals(this.email, replyToEmail.email) &&
        Objects.equals(this.ID, replyToEmail.ID) &&
        Objects.equals(this.isEnabled, replyToEmail.isEnabled) &&
        Objects.equals(this.name, replyToEmail.name) &&
        Objects.equals(this.spfVerified, replyToEmail.spfVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, dkimPublic, dkimVerified, email, ID, isEnabled, name, spfVerified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplyToEmail {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    dkimPublic: ").append(toIndentedString(dkimPublic)).append("\n");
    sb.append("    dkimVerified: ").append(toIndentedString(dkimVerified)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    spfVerified: ").append(toIndentedString(spfVerified)).append("\n");
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

