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
 * ABCampaignData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-13T14:09:10.814Z")
public class ABCampaignData {
  @SerializedName("ABCampaignType")
  private Double abCampaignType = null;

  @SerializedName("ABWinnerSelectionType")
  private Double abWinnerSelectionType = null;

  @SerializedName("DeliveredOnA")
  private String deliveredOnA = null;

  @SerializedName("DeliveredOnB")
  private String deliveredOnB = null;

  @SerializedName("HTMLContentB")
  private String htMLContentB = null;

  @SerializedName("HoursToTest")
  private Double hoursToTest = null;

  @SerializedName("ID")
  private Double ID = null;

  @SerializedName("ListPercentage")
  private Double listPercentage = null;

  @SerializedName("PlainContentB")
  private String plainContentB = null;

  @SerializedName("SenderB")
  private String senderB = null;

  @SerializedName("SubjectB")
  private String subjectB = null;

  @SerializedName("WebLocationB")
  private String webLocationB = null;

  public ABCampaignData abCampaignType(Double abCampaignType) {
    this.abCampaignType = abCampaignType;
    return this;
  }

   /**
   * 
   * @return abCampaignType
  **/
  @ApiModelProperty(value = "")
  public Double getAbCampaignType() {
    return abCampaignType;
  }

  public void setAbCampaignType(Double abCampaignType) {
    this.abCampaignType = abCampaignType;
  }

  public ABCampaignData abWinnerSelectionType(Double abWinnerSelectionType) {
    this.abWinnerSelectionType = abWinnerSelectionType;
    return this;
  }

   /**
   * 
   * @return abWinnerSelectionType
  **/
  @ApiModelProperty(value = "")
  public Double getAbWinnerSelectionType() {
    return abWinnerSelectionType;
  }

  public void setAbWinnerSelectionType(Double abWinnerSelectionType) {
    this.abWinnerSelectionType = abWinnerSelectionType;
  }

  public ABCampaignData deliveredOnA(String deliveredOnA) {
    this.deliveredOnA = deliveredOnA;
    return this;
  }

   /**
   * 
   * @return deliveredOnA
  **/
  @ApiModelProperty(value = "")
  public String getDeliveredOnA() {
    return deliveredOnA;
  }

  public void setDeliveredOnA(String deliveredOnA) {
    this.deliveredOnA = deliveredOnA;
  }

  public ABCampaignData deliveredOnB(String deliveredOnB) {
    this.deliveredOnB = deliveredOnB;
    return this;
  }

   /**
   * 
   * @return deliveredOnB
  **/
  @ApiModelProperty(value = "")
  public String getDeliveredOnB() {
    return deliveredOnB;
  }

  public void setDeliveredOnB(String deliveredOnB) {
    this.deliveredOnB = deliveredOnB;
  }

  public ABCampaignData htMLContentB(String htMLContentB) {
    this.htMLContentB = htMLContentB;
    return this;
  }

   /**
   * 
   * @return htMLContentB
  **/
  @ApiModelProperty(value = "")
  public String getHtMLContentB() {
    return htMLContentB;
  }

  public void setHtMLContentB(String htMLContentB) {
    this.htMLContentB = htMLContentB;
  }

  public ABCampaignData hoursToTest(Double hoursToTest) {
    this.hoursToTest = hoursToTest;
    return this;
  }

   /**
   * 
   * @return hoursToTest
  **/
  @ApiModelProperty(value = "")
  public Double getHoursToTest() {
    return hoursToTest;
  }

  public void setHoursToTest(Double hoursToTest) {
    this.hoursToTest = hoursToTest;
  }

  public ABCampaignData ID(Double ID) {
    this.ID = ID;
    return this;
  }

   /**
   * 
   * @return ID
  **/
  @ApiModelProperty(value = "")
  public Double getID() {
    return ID;
  }

  public void setID(Double ID) {
    this.ID = ID;
  }

  public ABCampaignData listPercentage(Double listPercentage) {
    this.listPercentage = listPercentage;
    return this;
  }

   /**
   * 
   * @return listPercentage
  **/
  @ApiModelProperty(value = "")
  public Double getListPercentage() {
    return listPercentage;
  }

  public void setListPercentage(Double listPercentage) {
    this.listPercentage = listPercentage;
  }

  public ABCampaignData plainContentB(String plainContentB) {
    this.plainContentB = plainContentB;
    return this;
  }

   /**
   * 
   * @return plainContentB
  **/
  @ApiModelProperty(value = "")
  public String getPlainContentB() {
    return plainContentB;
  }

  public void setPlainContentB(String plainContentB) {
    this.plainContentB = plainContentB;
  }

  public ABCampaignData senderB(String senderB) {
    this.senderB = senderB;
    return this;
  }

   /**
   * 
   * @return senderB
  **/
  @ApiModelProperty(value = "")
  public String getSenderB() {
    return senderB;
  }

  public void setSenderB(String senderB) {
    this.senderB = senderB;
  }

  public ABCampaignData subjectB(String subjectB) {
    this.subjectB = subjectB;
    return this;
  }

   /**
   * 
   * @return subjectB
  **/
  @ApiModelProperty(value = "")
  public String getSubjectB() {
    return subjectB;
  }

  public void setSubjectB(String subjectB) {
    this.subjectB = subjectB;
  }

  public ABCampaignData webLocationB(String webLocationB) {
    this.webLocationB = webLocationB;
    return this;
  }

   /**
   * 
   * @return webLocationB
  **/
  @ApiModelProperty(value = "")
  public String getWebLocationB() {
    return webLocationB;
  }

  public void setWebLocationB(String webLocationB) {
    this.webLocationB = webLocationB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ABCampaignData abCampaignData = (ABCampaignData) o;
    return Objects.equals(this.abCampaignType, abCampaignData.abCampaignType) &&
        Objects.equals(this.abWinnerSelectionType, abCampaignData.abWinnerSelectionType) &&
        Objects.equals(this.deliveredOnA, abCampaignData.deliveredOnA) &&
        Objects.equals(this.deliveredOnB, abCampaignData.deliveredOnB) &&
        Objects.equals(this.htMLContentB, abCampaignData.htMLContentB) &&
        Objects.equals(this.hoursToTest, abCampaignData.hoursToTest) &&
        Objects.equals(this.ID, abCampaignData.ID) &&
        Objects.equals(this.listPercentage, abCampaignData.listPercentage) &&
        Objects.equals(this.plainContentB, abCampaignData.plainContentB) &&
        Objects.equals(this.senderB, abCampaignData.senderB) &&
        Objects.equals(this.subjectB, abCampaignData.subjectB) &&
        Objects.equals(this.webLocationB, abCampaignData.webLocationB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abCampaignType, abWinnerSelectionType, deliveredOnA, deliveredOnB, htMLContentB, hoursToTest, ID, listPercentage, plainContentB, senderB, subjectB, webLocationB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABCampaignData {\n");
    
    sb.append("    abCampaignType: ").append(toIndentedString(abCampaignType)).append("\n");
    sb.append("    abWinnerSelectionType: ").append(toIndentedString(abWinnerSelectionType)).append("\n");
    sb.append("    deliveredOnA: ").append(toIndentedString(deliveredOnA)).append("\n");
    sb.append("    deliveredOnB: ").append(toIndentedString(deliveredOnB)).append("\n");
    sb.append("    htMLContentB: ").append(toIndentedString(htMLContentB)).append("\n");
    sb.append("    hoursToTest: ").append(toIndentedString(hoursToTest)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    listPercentage: ").append(toIndentedString(listPercentage)).append("\n");
    sb.append("    plainContentB: ").append(toIndentedString(plainContentB)).append("\n");
    sb.append("    senderB: ").append(toIndentedString(senderB)).append("\n");
    sb.append("    subjectB: ").append(toIndentedString(subjectB)).append("\n");
    sb.append("    webLocationB: ").append(toIndentedString(webLocationB)).append("\n");
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

