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
 * RemovingMultipleSubscribersRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-13T14:09:10.814Z")
public class RemovingMultipleSubscribersRequest {
  @SerializedName("Emails")
  private String emails = null;

  public RemovingMultipleSubscribersRequest emails(String emails) {
    this.emails = emails;
    return this;
  }

   /**
   * A list of email addresses to be removed, separated with a comma (,).
   * @return emails
  **/
  @ApiModelProperty(required = true, value = "A list of email addresses to be removed, separated with a comma (,).")
  public String getEmails() {
    return emails;
  }

  public void setEmails(String emails) {
    this.emails = emails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemovingMultipleSubscribersRequest removingMultipleSubscribersRequest = (RemovingMultipleSubscribersRequest) o;
    return Objects.equals(this.emails, removingMultipleSubscribersRequest.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemovingMultipleSubscribersRequest {\n");
    
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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

