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
 * UpdatingAMailingListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T09:37:52.408Z")
public class UpdatingAMailingListRequest {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("ConfirmationPage")
  private String confirmationPage = null;

  @SerializedName("RedirectAfterUnsubscribePage")
  private String redirectAfterUnsubscribePage = null;

  public UpdatingAMailingListRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the new mailing list.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the new mailing list.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdatingAMailingListRequest confirmationPage(String confirmationPage) {
    this.confirmationPage = confirmationPage;
    return this;
  }

   /**
   * The URL of the page that will be displayed at the end of the subscription process.
   * @return confirmationPage
  **/
  @ApiModelProperty(value = "The URL of the page that will be displayed at the end of the subscription process.")
  public String getConfirmationPage() {
    return confirmationPage;
  }

  public void setConfirmationPage(String confirmationPage) {
    this.confirmationPage = confirmationPage;
  }

  public UpdatingAMailingListRequest redirectAfterUnsubscribePage(String redirectAfterUnsubscribePage) {
    this.redirectAfterUnsubscribePage = redirectAfterUnsubscribePage;
    return this;
  }

   /**
   * The URL of the page that users will be redirected after unsubscribing from your mailing list.
   * @return redirectAfterUnsubscribePage
  **/
  @ApiModelProperty(value = "The URL of the page that users will be redirected after unsubscribing from your mailing list.")
  public String getRedirectAfterUnsubscribePage() {
    return redirectAfterUnsubscribePage;
  }

  public void setRedirectAfterUnsubscribePage(String redirectAfterUnsubscribePage) {
    this.redirectAfterUnsubscribePage = redirectAfterUnsubscribePage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatingAMailingListRequest updatingAMailingListRequest = (UpdatingAMailingListRequest) o;
    return Objects.equals(this.name, updatingAMailingListRequest.name) &&
        Objects.equals(this.confirmationPage, updatingAMailingListRequest.confirmationPage) &&
        Objects.equals(this.redirectAfterUnsubscribePage, updatingAMailingListRequest.redirectAfterUnsubscribePage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, confirmationPage, redirectAfterUnsubscribePage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatingAMailingListRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    confirmationPage: ").append(toIndentedString(confirmationPage)).append("\n");
    sb.append("    redirectAfterUnsubscribePage: ").append(toIndentedString(redirectAfterUnsubscribePage)).append("\n");
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

