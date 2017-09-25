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
import io.swagger.client.model.MailingList68;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Campaign
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-25T09:37:52.408Z")
public class Campaign {
  @SerializedName("ABCampaignType")
  private Double abCampaignType = null;

  @SerializedName("ABHoursToTest")
  private Double abHoursToTest = null;

  @SerializedName("ABWinner")
  private Double abWinner = null;

  @SerializedName("ABWinnerSelectionType")
  private Double abWinnerSelectionType = null;

  @SerializedName("ConfirmationTo")
  private String confirmationTo = null;

  @SerializedName("CreatedOn")
  private String createdOn = null;

  @SerializedName("DeliveredOn")
  private String deliveredOn = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("IsTransactional")
  private Boolean isTransactional = null;

  @SerializedName("MailingLists")
  private List<MailingList68> mailingLists = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("RecipientsCount")
  private Double recipientsCount = null;

  @SerializedName("ScheduledFor")
  private String scheduledFor = null;

  @SerializedName("ScheduledForTimezone")
  private String scheduledForTimezone = null;

  @SerializedName("SiteName")
  private String siteName = null;

  @SerializedName("Status")
  private Double status = null;

  @SerializedName("Subject")
  private String subject = null;

  @SerializedName("TotalBounces")
  private Double totalBounces = null;

  @SerializedName("TotalComplaints")
  private Double totalComplaints = null;

  @SerializedName("TotalForwards")
  private Double totalForwards = null;

  @SerializedName("TotalLinkClicks")
  private Double totalLinkClicks = null;

  @SerializedName("TotalOpens")
  private Double totalOpens = null;

  @SerializedName("TotalSent")
  private Double totalSent = null;

  @SerializedName("TotalUnsubscribes")
  private Double totalUnsubscribes = null;

  @SerializedName("UniqueForwards")
  private Double uniqueForwards = null;

  @SerializedName("UniqueLinkClicks")
  private Double uniqueLinkClicks = null;

  @SerializedName("UniqueOpens")
  private Double uniqueOpens = null;

  public Campaign abCampaignType(Double abCampaignType) {
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

  public Campaign abHoursToTest(Double abHoursToTest) {
    this.abHoursToTest = abHoursToTest;
    return this;
  }

   /**
   * 
   * @return abHoursToTest
  **/
  @ApiModelProperty(value = "")
  public Double getAbHoursToTest() {
    return abHoursToTest;
  }

  public void setAbHoursToTest(Double abHoursToTest) {
    this.abHoursToTest = abHoursToTest;
  }

  public Campaign abWinner(Double abWinner) {
    this.abWinner = abWinner;
    return this;
  }

   /**
   * 
   * @return abWinner
  **/
  @ApiModelProperty(value = "")
  public Double getAbWinner() {
    return abWinner;
  }

  public void setAbWinner(Double abWinner) {
    this.abWinner = abWinner;
  }

  public Campaign abWinnerSelectionType(Double abWinnerSelectionType) {
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

  public Campaign confirmationTo(String confirmationTo) {
    this.confirmationTo = confirmationTo;
    return this;
  }

   /**
   * 
   * @return confirmationTo
  **/
  @ApiModelProperty(value = "")
  public String getConfirmationTo() {
    return confirmationTo;
  }

  public void setConfirmationTo(String confirmationTo) {
    this.confirmationTo = confirmationTo;
  }

  public Campaign createdOn(String createdOn) {
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

  public Campaign deliveredOn(String deliveredOn) {
    this.deliveredOn = deliveredOn;
    return this;
  }

   /**
   * 
   * @return deliveredOn
  **/
  @ApiModelProperty(value = "")
  public String getDeliveredOn() {
    return deliveredOn;
  }

  public void setDeliveredOn(String deliveredOn) {
    this.deliveredOn = deliveredOn;
  }

  public Campaign ID(String ID) {
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

  public Campaign isTransactional(Boolean isTransactional) {
    this.isTransactional = isTransactional;
    return this;
  }

   /**
   * 
   * @return isTransactional
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsTransactional() {
    return isTransactional;
  }

  public void setIsTransactional(Boolean isTransactional) {
    this.isTransactional = isTransactional;
  }

  public Campaign mailingLists(List<MailingList68> mailingLists) {
    this.mailingLists = mailingLists;
    return this;
  }

  public Campaign addMailingListsItem(MailingList68 mailingListsItem) {
    if (this.mailingLists == null) {
      this.mailingLists = new ArrayList<MailingList68>();
    }
    this.mailingLists.add(mailingListsItem);
    return this;
  }

   /**
   * 
   * @return mailingLists
  **/
  @ApiModelProperty(value = "")
  public List<MailingList68> getMailingLists() {
    return mailingLists;
  }

  public void setMailingLists(List<MailingList68> mailingLists) {
    this.mailingLists = mailingLists;
  }

  public Campaign name(String name) {
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

  public Campaign recipientsCount(Double recipientsCount) {
    this.recipientsCount = recipientsCount;
    return this;
  }

   /**
   * 
   * @return recipientsCount
  **/
  @ApiModelProperty(value = "")
  public Double getRecipientsCount() {
    return recipientsCount;
  }

  public void setRecipientsCount(Double recipientsCount) {
    this.recipientsCount = recipientsCount;
  }

  public Campaign scheduledFor(String scheduledFor) {
    this.scheduledFor = scheduledFor;
    return this;
  }

   /**
   * 
   * @return scheduledFor
  **/
  @ApiModelProperty(value = "")
  public String getScheduledFor() {
    return scheduledFor;
  }

  public void setScheduledFor(String scheduledFor) {
    this.scheduledFor = scheduledFor;
  }

  public Campaign scheduledForTimezone(String scheduledForTimezone) {
    this.scheduledForTimezone = scheduledForTimezone;
    return this;
  }

   /**
   * 
   * @return scheduledForTimezone
  **/
  @ApiModelProperty(value = "")
  public String getScheduledForTimezone() {
    return scheduledForTimezone;
  }

  public void setScheduledForTimezone(String scheduledForTimezone) {
    this.scheduledForTimezone = scheduledForTimezone;
  }

  public Campaign siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

   /**
   * 
   * @return siteName
  **/
  @ApiModelProperty(value = "")
  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public Campaign status(Double status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Double getStatus() {
    return status;
  }

  public void setStatus(Double status) {
    this.status = status;
  }

  public Campaign subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * 
   * @return subject
  **/
  @ApiModelProperty(value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Campaign totalBounces(Double totalBounces) {
    this.totalBounces = totalBounces;
    return this;
  }

   /**
   * 
   * @return totalBounces
  **/
  @ApiModelProperty(value = "")
  public Double getTotalBounces() {
    return totalBounces;
  }

  public void setTotalBounces(Double totalBounces) {
    this.totalBounces = totalBounces;
  }

  public Campaign totalComplaints(Double totalComplaints) {
    this.totalComplaints = totalComplaints;
    return this;
  }

   /**
   * 
   * @return totalComplaints
  **/
  @ApiModelProperty(value = "")
  public Double getTotalComplaints() {
    return totalComplaints;
  }

  public void setTotalComplaints(Double totalComplaints) {
    this.totalComplaints = totalComplaints;
  }

  public Campaign totalForwards(Double totalForwards) {
    this.totalForwards = totalForwards;
    return this;
  }

   /**
   * 
   * @return totalForwards
  **/
  @ApiModelProperty(value = "")
  public Double getTotalForwards() {
    return totalForwards;
  }

  public void setTotalForwards(Double totalForwards) {
    this.totalForwards = totalForwards;
  }

  public Campaign totalLinkClicks(Double totalLinkClicks) {
    this.totalLinkClicks = totalLinkClicks;
    return this;
  }

   /**
   * 
   * @return totalLinkClicks
  **/
  @ApiModelProperty(value = "")
  public Double getTotalLinkClicks() {
    return totalLinkClicks;
  }

  public void setTotalLinkClicks(Double totalLinkClicks) {
    this.totalLinkClicks = totalLinkClicks;
  }

  public Campaign totalOpens(Double totalOpens) {
    this.totalOpens = totalOpens;
    return this;
  }

   /**
   * 
   * @return totalOpens
  **/
  @ApiModelProperty(value = "")
  public Double getTotalOpens() {
    return totalOpens;
  }

  public void setTotalOpens(Double totalOpens) {
    this.totalOpens = totalOpens;
  }

  public Campaign totalSent(Double totalSent) {
    this.totalSent = totalSent;
    return this;
  }

   /**
   * 
   * @return totalSent
  **/
  @ApiModelProperty(value = "")
  public Double getTotalSent() {
    return totalSent;
  }

  public void setTotalSent(Double totalSent) {
    this.totalSent = totalSent;
  }

  public Campaign totalUnsubscribes(Double totalUnsubscribes) {
    this.totalUnsubscribes = totalUnsubscribes;
    return this;
  }

   /**
   * 
   * @return totalUnsubscribes
  **/
  @ApiModelProperty(value = "")
  public Double getTotalUnsubscribes() {
    return totalUnsubscribes;
  }

  public void setTotalUnsubscribes(Double totalUnsubscribes) {
    this.totalUnsubscribes = totalUnsubscribes;
  }

  public Campaign uniqueForwards(Double uniqueForwards) {
    this.uniqueForwards = uniqueForwards;
    return this;
  }

   /**
   * 
   * @return uniqueForwards
  **/
  @ApiModelProperty(value = "")
  public Double getUniqueForwards() {
    return uniqueForwards;
  }

  public void setUniqueForwards(Double uniqueForwards) {
    this.uniqueForwards = uniqueForwards;
  }

  public Campaign uniqueLinkClicks(Double uniqueLinkClicks) {
    this.uniqueLinkClicks = uniqueLinkClicks;
    return this;
  }

   /**
   * 
   * @return uniqueLinkClicks
  **/
  @ApiModelProperty(value = "")
  public Double getUniqueLinkClicks() {
    return uniqueLinkClicks;
  }

  public void setUniqueLinkClicks(Double uniqueLinkClicks) {
    this.uniqueLinkClicks = uniqueLinkClicks;
  }

  public Campaign uniqueOpens(Double uniqueOpens) {
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * 
   * @return uniqueOpens
  **/
  @ApiModelProperty(value = "")
  public Double getUniqueOpens() {
    return uniqueOpens;
  }

  public void setUniqueOpens(Double uniqueOpens) {
    this.uniqueOpens = uniqueOpens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.abCampaignType, campaign.abCampaignType) &&
        Objects.equals(this.abHoursToTest, campaign.abHoursToTest) &&
        Objects.equals(this.abWinner, campaign.abWinner) &&
        Objects.equals(this.abWinnerSelectionType, campaign.abWinnerSelectionType) &&
        Objects.equals(this.confirmationTo, campaign.confirmationTo) &&
        Objects.equals(this.createdOn, campaign.createdOn) &&
        Objects.equals(this.deliveredOn, campaign.deliveredOn) &&
        Objects.equals(this.ID, campaign.ID) &&
        Objects.equals(this.isTransactional, campaign.isTransactional) &&
        Objects.equals(this.mailingLists, campaign.mailingLists) &&
        Objects.equals(this.name, campaign.name) &&
        Objects.equals(this.recipientsCount, campaign.recipientsCount) &&
        Objects.equals(this.scheduledFor, campaign.scheduledFor) &&
        Objects.equals(this.scheduledForTimezone, campaign.scheduledForTimezone) &&
        Objects.equals(this.siteName, campaign.siteName) &&
        Objects.equals(this.status, campaign.status) &&
        Objects.equals(this.subject, campaign.subject) &&
        Objects.equals(this.totalBounces, campaign.totalBounces) &&
        Objects.equals(this.totalComplaints, campaign.totalComplaints) &&
        Objects.equals(this.totalForwards, campaign.totalForwards) &&
        Objects.equals(this.totalLinkClicks, campaign.totalLinkClicks) &&
        Objects.equals(this.totalOpens, campaign.totalOpens) &&
        Objects.equals(this.totalSent, campaign.totalSent) &&
        Objects.equals(this.totalUnsubscribes, campaign.totalUnsubscribes) &&
        Objects.equals(this.uniqueForwards, campaign.uniqueForwards) &&
        Objects.equals(this.uniqueLinkClicks, campaign.uniqueLinkClicks) &&
        Objects.equals(this.uniqueOpens, campaign.uniqueOpens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abCampaignType, abHoursToTest, abWinner, abWinnerSelectionType, confirmationTo, createdOn, deliveredOn, ID, isTransactional, mailingLists, name, recipientsCount, scheduledFor, scheduledForTimezone, siteName, status, subject, totalBounces, totalComplaints, totalForwards, totalLinkClicks, totalOpens, totalSent, totalUnsubscribes, uniqueForwards, uniqueLinkClicks, uniqueOpens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    
    sb.append("    abCampaignType: ").append(toIndentedString(abCampaignType)).append("\n");
    sb.append("    abHoursToTest: ").append(toIndentedString(abHoursToTest)).append("\n");
    sb.append("    abWinner: ").append(toIndentedString(abWinner)).append("\n");
    sb.append("    abWinnerSelectionType: ").append(toIndentedString(abWinnerSelectionType)).append("\n");
    sb.append("    confirmationTo: ").append(toIndentedString(confirmationTo)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    deliveredOn: ").append(toIndentedString(deliveredOn)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    isTransactional: ").append(toIndentedString(isTransactional)).append("\n");
    sb.append("    mailingLists: ").append(toIndentedString(mailingLists)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipientsCount: ").append(toIndentedString(recipientsCount)).append("\n");
    sb.append("    scheduledFor: ").append(toIndentedString(scheduledFor)).append("\n");
    sb.append("    scheduledForTimezone: ").append(toIndentedString(scheduledForTimezone)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    totalBounces: ").append(toIndentedString(totalBounces)).append("\n");
    sb.append("    totalComplaints: ").append(toIndentedString(totalComplaints)).append("\n");
    sb.append("    totalForwards: ").append(toIndentedString(totalForwards)).append("\n");
    sb.append("    totalLinkClicks: ").append(toIndentedString(totalLinkClicks)).append("\n");
    sb.append("    totalOpens: ").append(toIndentedString(totalOpens)).append("\n");
    sb.append("    totalSent: ").append(toIndentedString(totalSent)).append("\n");
    sb.append("    totalUnsubscribes: ").append(toIndentedString(totalUnsubscribes)).append("\n");
    sb.append("    uniqueForwards: ").append(toIndentedString(uniqueForwards)).append("\n");
    sb.append("    uniqueLinkClicks: ").append(toIndentedString(uniqueLinkClicks)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
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

