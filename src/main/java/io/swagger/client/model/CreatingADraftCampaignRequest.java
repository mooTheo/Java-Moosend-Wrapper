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
import io.swagger.client.model.MailingLists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreatingADraftCampaignRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T15:06:19.511Z")
public class CreatingADraftCampaignRequest {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Subject")
  private String subject = null;

  @SerializedName("SenderEmail")
  private String senderEmail = null;

  @SerializedName("ReplyToEmail")
  private String replyToEmail = null;

  @SerializedName("IsAB")
  private String isAB = null;

  @SerializedName("ConfirmationToEmail")
  private String confirmationToEmail = null;

  @SerializedName("WebLocation")
  private String webLocation = null;

  @SerializedName("MailingLists")
  private List<MailingLists> mailingLists = null;

  @SerializedName("SegmentID")
  private String segmentID = null;

  @SerializedName("ABCampaignType")
  private String abCampaignType = null;

  @SerializedName("TrackInGoogleAnalytics")
  private String trackInGoogleAnalytics = null;

  @SerializedName("DontTrackLinkClicks")
  private String dontTrackLinkClicks = null;

  @SerializedName("SubjectB")
  private String subjectB = null;

  @SerializedName("WebLocationB")
  private String webLocationB = null;

  @SerializedName("SenderEmailB")
  private String senderEmailB = null;

  @SerializedName("HoursToTest")
  private String hoursToTest = null;

  @SerializedName("ListPercentage")
  private String listPercentage = null;

  @SerializedName("ABWinnerSelectionType")
  private String abWinnerSelectionType = null;

  public CreatingADraftCampaignRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the campaign.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the campaign.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreatingADraftCampaignRequest subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject line of the new campaign.
   * @return subject
  **/
  @ApiModelProperty(required = true, value = "The subject line of the new campaign.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public CreatingADraftCampaignRequest senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

   /**
   * The sender email of the campaign.
   * @return senderEmail
  **/
  @ApiModelProperty(required = true, value = "The sender email of the campaign.")
  public String getSenderEmail() {
    return senderEmail;
  }

  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  public CreatingADraftCampaignRequest replyToEmail(String replyToEmail) {
    this.replyToEmail = replyToEmail;
    return this;
  }

   /**
   * The email address to which recipients replies will arrive. It must be one of your sender accounts. If not specified, the sender&#39;s email will be assumed.
   * @return replyToEmail
  **/
  @ApiModelProperty(required = true, value = "The email address to which recipients replies will arrive. It must be one of your sender accounts. If not specified, the sender's email will be assumed.")
  public String getReplyToEmail() {
    return replyToEmail;
  }

  public void setReplyToEmail(String replyToEmail) {
    this.replyToEmail = replyToEmail;
  }

  public CreatingADraftCampaignRequest isAB(String isAB) {
    this.isAB = isAB;
    return this;
  }

   /**
   * A flag that defines if a campaign is an AB campaign.
   * @return isAB
  **/
  @ApiModelProperty(required = true, value = "A flag that defines if a campaign is an AB campaign.")
  public String getIsAB() {
    return isAB;
  }

  public void setIsAB(String isAB) {
    this.isAB = isAB;
  }

  public CreatingADraftCampaignRequest confirmationToEmail(String confirmationToEmail) {
    this.confirmationToEmail = confirmationToEmail;
    return this;
  }

   /**
   * The email address to which a confirmation message will be,  sent when the campaign has been successfully sent.
   * @return confirmationToEmail
  **/
  @ApiModelProperty(value = "The email address to which a confirmation message will be,  sent when the campaign has been successfully sent.")
  public String getConfirmationToEmail() {
    return confirmationToEmail;
  }

  public void setConfirmationToEmail(String confirmationToEmail) {
    this.confirmationToEmail = confirmationToEmail;
  }

  public CreatingADraftCampaignRequest webLocation(String webLocation) {
    this.webLocation = webLocation;
    return this;
  }

   /**
   * A url to retrieve the html content for the campaign. We&#39;ll automatically move all CSS inline.
   * @return webLocation
  **/
  @ApiModelProperty(value = "A url to retrieve the html content for the campaign. We'll automatically move all CSS inline.")
  public String getWebLocation() {
    return webLocation;
  }

  public void setWebLocation(String webLocation) {
    this.webLocation = webLocation;
  }

  public CreatingADraftCampaignRequest mailingLists(List<MailingLists> mailingLists) {
    this.mailingLists = mailingLists;
    return this;
  }

  public CreatingADraftCampaignRequest addMailingListsItem(MailingLists mailingListsItem) {
    if (this.mailingLists == null) {
      this.mailingLists = new ArrayList<MailingLists>();
    }
    this.mailingLists.add(mailingListsItem);
    return this;
  }

   /**
   * A list of mailing lists in your account to which the campaign will be sent to.
   * @return mailingLists
  **/
  @ApiModelProperty(value = "A list of mailing lists in your account to which the campaign will be sent to.")
  public List<MailingLists> getMailingLists() {
    return mailingLists;
  }

  public void setMailingLists(List<MailingLists> mailingLists) {
    this.mailingLists = mailingLists;
  }

  public CreatingADraftCampaignRequest segmentID(String segmentID) {
    this.segmentID = segmentID;
    return this;
  }

   /**
   * The ID of a segment in the specified mailing list to filter the recipients with. If not specified, the campaign will be sent to all active subscribers of the mailing list.
   * @return segmentID
  **/
  @ApiModelProperty(value = "The ID of a segment in the specified mailing list to filter the recipients with. If not specified, the campaign will be sent to all active subscribers of the mailing list.")
  public String getSegmentID() {
    return segmentID;
  }

  public void setSegmentID(String segmentID) {
    this.segmentID = segmentID;
  }

  public CreatingADraftCampaignRequest abCampaignType(String abCampaignType) {
    this.abCampaignType = abCampaignType;
    return this;
  }

   /**
   * If you want to send an AB split campaign you should specify this parameter to one of the following values.  * &#x60;Subject&#x60; * &#x60;Sender&#x60; * &#x60;Content&#x60;
   * @return abCampaignType
  **/
  @ApiModelProperty(value = "If you want to send an AB split campaign you should specify this parameter to one of the following values.  * `Subject` * `Sender` * `Content`")
  public String getAbCampaignType() {
    return abCampaignType;
  }

  public void setAbCampaignType(String abCampaignType) {
    this.abCampaignType = abCampaignType;
  }

  public CreatingADraftCampaignRequest trackInGoogleAnalytics(String trackInGoogleAnalytics) {
    this.trackInGoogleAnalytics = trackInGoogleAnalytics;
    return this;
  }

   /**
   * Tracks traffic from your campaign to your site. Note: You need to have Google Analytics configured on your site to use this feature.
   * @return trackInGoogleAnalytics
  **/
  @ApiModelProperty(value = "Tracks traffic from your campaign to your site. Note: You need to have Google Analytics configured on your site to use this feature.")
  public String getTrackInGoogleAnalytics() {
    return trackInGoogleAnalytics;
  }

  public void setTrackInGoogleAnalytics(String trackInGoogleAnalytics) {
    this.trackInGoogleAnalytics = trackInGoogleAnalytics;
  }

  public CreatingADraftCampaignRequest dontTrackLinkClicks(String dontTrackLinkClicks) {
    this.dontTrackLinkClicks = dontTrackLinkClicks;
    return this;
  }

   /**
   * Moosend wraps your own links with its own to enable link click tracking. Check this box if you don&#39;t wish to track link click traffic through Moosend.
   * @return dontTrackLinkClicks
  **/
  @ApiModelProperty(value = "Moosend wraps your own links with its own to enable link click tracking. Check this box if you don't wish to track link click traffic through Moosend.")
  public String getDontTrackLinkClicks() {
    return dontTrackLinkClicks;
  }

  public void setDontTrackLinkClicks(String dontTrackLinkClicks) {
    this.dontTrackLinkClicks = dontTrackLinkClicks;
  }

  public CreatingADraftCampaignRequest subjectB(String subjectB) {
    this.subjectB = subjectB;
    return this;
  }

   /**
   * If you wish to send an AB split campaign with two different versions of the subject line , you must specify the second subject using this parameter. If specified in any other campaign type, it will be ignored.
   * @return subjectB
  **/
  @ApiModelProperty(value = "If you wish to send an AB split campaign with two different versions of the subject line , you must specify the second subject using this parameter. If specified in any other campaign type, it will be ignored.")
  public String getSubjectB() {
    return subjectB;
  }

  public void setSubjectB(String subjectB) {
    this.subjectB = subjectB;
  }

  public CreatingADraftCampaignRequest webLocationB(String webLocationB) {
    this.webLocationB = webLocationB;
    return this;
  }

   /**
   * If you wish to send an AB split campaign with two different versions of the html content, you must specify where the second html content will be retrieved from using this parameter. If specified in any other campaign type, it will be ignored.
   * @return webLocationB
  **/
  @ApiModelProperty(value = "If you wish to send an AB split campaign with two different versions of the html content, you must specify where the second html content will be retrieved from using this parameter. If specified in any other campaign type, it will be ignored.")
  public String getWebLocationB() {
    return webLocationB;
  }

  public void setWebLocationB(String webLocationB) {
    this.webLocationB = webLocationB;
  }

  public CreatingADraftCampaignRequest senderEmailB(String senderEmailB) {
    this.senderEmailB = senderEmailB;
    return this;
  }

   /**
   * If you wish to send an AB split campaign with two different versions of the sender , you must specify the second sender email address using this parameter. This must be one of your sender signatures defined in your account. If specified in any other campaign type, it will be ignored.
   * @return senderEmailB
  **/
  @ApiModelProperty(value = "If you wish to send an AB split campaign with two different versions of the sender , you must specify the second sender email address using this parameter. This must be one of your sender signatures defined in your account. If specified in any other campaign type, it will be ignored.")
  public String getSenderEmailB() {
    return senderEmailB;
  }

  public void setSenderEmailB(String senderEmailB) {
    this.senderEmailB = senderEmailB;
  }

  public CreatingADraftCampaignRequest hoursToTest(String hoursToTest) {
    this.hoursToTest = hoursToTest;
    return this;
  }

   /**
   * If you choose to send an AB campaign type, you must set this parameter to specify how long the test will run, before determining which will be the winning version to be sent to the rest of the recipients. This should be an integer value between 1 and 24. If specified in a regular campaign, it will be ignored.
   * @return hoursToTest
  **/
  @ApiModelProperty(value = "If you choose to send an AB campaign type, you must set this parameter to specify how long the test will run, before determining which will be the winning version to be sent to the rest of the recipients. This should be an integer value between 1 and 24. If specified in a regular campaign, it will be ignored.")
  public String getHoursToTest() {
    return hoursToTest;
  }

  public void setHoursToTest(String hoursToTest) {
    this.hoursToTest = hoursToTest;
  }

  public CreatingADraftCampaignRequest listPercentage(String listPercentage) {
    this.listPercentage = listPercentage;
    return this;
  }

   /**
   * If you choose to send an AB campaign type, you must set this parameter to specify a portion of the target recipients that will receive the test versions. For example, if you specify 10, then 10% of your recipients will receive the A version and another 10% will receive the B version. The specified value should be an integer between 5 and 40. If specified in a regular campaign, it will be ignored. (optional, string)
   * @return listPercentage
  **/
  @ApiModelProperty(value = "If you choose to send an AB campaign type, you must set this parameter to specify a portion of the target recipients that will receive the test versions. For example, if you specify 10, then 10% of your recipients will receive the A version and another 10% will receive the B version. The specified value should be an integer between 5 and 40. If specified in a regular campaign, it will be ignored. (optional, string)")
  public String getListPercentage() {
    return listPercentage;
  }

  public void setListPercentage(String listPercentage) {
    this.listPercentage = listPercentage;
  }

  public CreatingADraftCampaignRequest abWinnerSelectionType(String abWinnerSelectionType) {
    this.abWinnerSelectionType = abWinnerSelectionType;
    return this;
  }

   /**
   * If you choose to send an AB campaign type, you may set this parameter to one of the following values to specify the method to determine the winning version for the test.   If not set, OpenRate will be assumed. If specified in a regular campaign, it will be ignored. * &#x60;OpenRate&#x60; * &#x60;TotalUniqueClicks&#x60;
   * @return abWinnerSelectionType
  **/
  @ApiModelProperty(value = "If you choose to send an AB campaign type, you may set this parameter to one of the following values to specify the method to determine the winning version for the test.   If not set, OpenRate will be assumed. If specified in a regular campaign, it will be ignored. * `OpenRate` * `TotalUniqueClicks`")
  public String getAbWinnerSelectionType() {
    return abWinnerSelectionType;
  }

  public void setAbWinnerSelectionType(String abWinnerSelectionType) {
    this.abWinnerSelectionType = abWinnerSelectionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatingADraftCampaignRequest creatingADraftCampaignRequest = (CreatingADraftCampaignRequest) o;
    return Objects.equals(this.name, creatingADraftCampaignRequest.name) &&
        Objects.equals(this.subject, creatingADraftCampaignRequest.subject) &&
        Objects.equals(this.senderEmail, creatingADraftCampaignRequest.senderEmail) &&
        Objects.equals(this.replyToEmail, creatingADraftCampaignRequest.replyToEmail) &&
        Objects.equals(this.isAB, creatingADraftCampaignRequest.isAB) &&
        Objects.equals(this.confirmationToEmail, creatingADraftCampaignRequest.confirmationToEmail) &&
        Objects.equals(this.webLocation, creatingADraftCampaignRequest.webLocation) &&
        Objects.equals(this.mailingLists, creatingADraftCampaignRequest.mailingLists) &&
        Objects.equals(this.segmentID, creatingADraftCampaignRequest.segmentID) &&
        Objects.equals(this.abCampaignType, creatingADraftCampaignRequest.abCampaignType) &&
        Objects.equals(this.trackInGoogleAnalytics, creatingADraftCampaignRequest.trackInGoogleAnalytics) &&
        Objects.equals(this.dontTrackLinkClicks, creatingADraftCampaignRequest.dontTrackLinkClicks) &&
        Objects.equals(this.subjectB, creatingADraftCampaignRequest.subjectB) &&
        Objects.equals(this.webLocationB, creatingADraftCampaignRequest.webLocationB) &&
        Objects.equals(this.senderEmailB, creatingADraftCampaignRequest.senderEmailB) &&
        Objects.equals(this.hoursToTest, creatingADraftCampaignRequest.hoursToTest) &&
        Objects.equals(this.listPercentage, creatingADraftCampaignRequest.listPercentage) &&
        Objects.equals(this.abWinnerSelectionType, creatingADraftCampaignRequest.abWinnerSelectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subject, senderEmail, replyToEmail, isAB, confirmationToEmail, webLocation, mailingLists, segmentID, abCampaignType, trackInGoogleAnalytics, dontTrackLinkClicks, subjectB, webLocationB, senderEmailB, hoursToTest, listPercentage, abWinnerSelectionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatingADraftCampaignRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    replyToEmail: ").append(toIndentedString(replyToEmail)).append("\n");
    sb.append("    isAB: ").append(toIndentedString(isAB)).append("\n");
    sb.append("    confirmationToEmail: ").append(toIndentedString(confirmationToEmail)).append("\n");
    sb.append("    webLocation: ").append(toIndentedString(webLocation)).append("\n");
    sb.append("    mailingLists: ").append(toIndentedString(mailingLists)).append("\n");
    sb.append("    segmentID: ").append(toIndentedString(segmentID)).append("\n");
    sb.append("    abCampaignType: ").append(toIndentedString(abCampaignType)).append("\n");
    sb.append("    trackInGoogleAnalytics: ").append(toIndentedString(trackInGoogleAnalytics)).append("\n");
    sb.append("    dontTrackLinkClicks: ").append(toIndentedString(dontTrackLinkClicks)).append("\n");
    sb.append("    subjectB: ").append(toIndentedString(subjectB)).append("\n");
    sb.append("    webLocationB: ").append(toIndentedString(webLocationB)).append("\n");
    sb.append("    senderEmailB: ").append(toIndentedString(senderEmailB)).append("\n");
    sb.append("    hoursToTest: ").append(toIndentedString(hoursToTest)).append("\n");
    sb.append("    listPercentage: ").append(toIndentedString(listPercentage)).append("\n");
    sb.append("    abWinnerSelectionType: ").append(toIndentedString(abWinnerSelectionType)).append("\n");
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

