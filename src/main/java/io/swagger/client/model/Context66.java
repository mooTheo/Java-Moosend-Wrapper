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
import io.swagger.client.model.Campaign;
import io.swagger.client.model.Paging;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Context66
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:06:19.511Z")
public class Context66 {
  @SerializedName("Campaigns")
  private List<Campaign> campaigns = null;

  @SerializedName("Paging")
  private Paging paging = null;

  public Context66 campaigns(List<Campaign> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  public Context66 addCampaignsItem(Campaign campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<Campaign>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * 
   * @return campaigns
  **/
  @ApiModelProperty(value = "")
  public List<Campaign> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<Campaign> campaigns) {
    this.campaigns = campaigns;
  }

  public Context66 paging(Paging paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @ApiModelProperty(value = "")
  public Paging getPaging() {
    return paging;
  }

  public void setPaging(Paging paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context66 context66 = (Context66) o;
    return Objects.equals(this.campaigns, context66.campaigns) &&
        Objects.equals(this.paging, context66.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, paging);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context66 {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

