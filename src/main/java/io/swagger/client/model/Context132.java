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
import io.swagger.client.model.A;
import io.swagger.client.model.B;
import java.io.IOException;

/**
 * Context132
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T09:37:52.408Z")
public class Context132 {
  @SerializedName("A")
  private A A = null;

  @SerializedName("B")
  private B B = null;

  @SerializedName("CampaignID")
  private String campaignID = null;

  public Context132 A(A A) {
    this.A = A;
    return this;
  }

   /**
   * Get A
   * @return A
  **/
  @ApiModelProperty(value = "")
  public A getA() {
    return A;
  }

  public void setA(A A) {
    this.A = A;
  }

  public Context132 B(B B) {
    this.B = B;
    return this;
  }

   /**
   * Get B
   * @return B
  **/
  @ApiModelProperty(value = "")
  public B getB() {
    return B;
  }

  public void setB(B B) {
    this.B = B;
  }

  public Context132 campaignID(String campaignID) {
    this.campaignID = campaignID;
    return this;
  }

   /**
   * 
   * @return campaignID
  **/
  @ApiModelProperty(value = "")
  public String getCampaignID() {
    return campaignID;
  }

  public void setCampaignID(String campaignID) {
    this.campaignID = campaignID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context132 context132 = (Context132) o;
    return Objects.equals(this.A, context132.A) &&
        Objects.equals(this.B, context132.B) &&
        Objects.equals(this.campaignID, context132.campaignID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(A, B, campaignID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context132 {\n");
    
    sb.append("    A: ").append(toIndentedString(A)).append("\n");
    sb.append("    B: ").append(toIndentedString(B)).append("\n");
    sb.append("    campaignID: ").append(toIndentedString(campaignID)).append("\n");
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
