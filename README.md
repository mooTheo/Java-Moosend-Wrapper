# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CampaignsApi;

import java.io.File;
import java.util.*;

public class CampaignsApiExample {

    public static void main(String[] args) {
        
        CampaignsApi apiInstance = new CampaignsApi();
        String format = "format_example"; // String | 
        String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
        String campaignID = "campaignID_example"; // String | The ID of the requested AB test campaign
        try {
            AbTestCampaignSummaryResponse result = apiInstance.aBTestCampaignSummary(format, apikey, campaignID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#aBTestCampaignSummary");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.moosend.com/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CampaignsApi* | [**aBTestCampaignSummary**](docs/CampaignsApi.md#aBTestCampaignSummary) | **GET** /campaigns/{CampaignID}/view_ab_summary.{Format} | AB Test Campaign Summary
*CampaignsApi* | [**activityByLocation**](docs/CampaignsApi.md#activityByLocation) | **GET** /campaigns/{CampaignID}/stats/countries.{Format} | Activity By Location
*CampaignsApi* | [**campaignSummary**](docs/CampaignsApi.md#campaignSummary) | **GET** /campaigns/{CampaignID}/view_summary.{Format} | Campaign Summary
*CampaignsApi* | [**cloningAnExistingCampaign**](docs/CampaignsApi.md#cloningAnExistingCampaign) | **POST** /campaigns/{CampaignID}/clone.{Format} | Cloning An Existing Campaign
*CampaignsApi* | [**creatingADraftCampaign**](docs/CampaignsApi.md#creatingADraftCampaign) | **POST** /campaigns/create.{Format} | Creating A Draft Campaign
*CampaignsApi* | [**deletingACampaign**](docs/CampaignsApi.md#deletingACampaign) | **DELETE** /campaigns/{CampaignID}/delete.{Format} | Deleting A Campaign
*CampaignsApi* | [**getAllCampaigns**](docs/CampaignsApi.md#getAllCampaigns) | **GET** /campaigns.{Format} | Get All Campaigns
*CampaignsApi* | [**getCampaignStatisticsWithPagingFiltered**](docs/CampaignsApi.md#getCampaignStatisticsWithPagingFiltered) | **GET** /campaigns/{CampaignID}/stats/{Type}.{Format} | Get Campaign Statistics With Paging &amp; Filtered
*CampaignsApi* | [**getCampaignsByPage**](docs/CampaignsApi.md#getCampaignsByPage) | **GET** /campaigns/{Page}.{Format} | Get Campaigns By Page
*CampaignsApi* | [**getCampaignsByPageAndPagesize**](docs/CampaignsApi.md#getCampaignsByPageAndPagesize) | **GET** /campaigns/{Page}/{PageSize}.{Format} | Get Campaigns By Page And Pagesize
*CampaignsApi* | [**gettingAllYourSenders**](docs/CampaignsApi.md#gettingAllYourSenders) | **GET** /senders/find_all.{Format} | Getting All Your Senders
*CampaignsApi* | [**gettingCampaignDetails**](docs/CampaignsApi.md#gettingCampaignDetails) | **GET** /campaigns/{CampaignID}/view.{Format} | Getting Campaign Details
*CampaignsApi* | [**gettingSenderDetails**](docs/CampaignsApi.md#gettingSenderDetails) | **GET** /senders/find_one.{Format} | Getting Sender Details
*CampaignsApi* | [**linkActivity**](docs/CampaignsApi.md#linkActivity) | **GET** /campaigns/{CampaignID}/stats/links.{Format} | Link Activity
*CampaignsApi* | [**schedulingACampaign**](docs/CampaignsApi.md#schedulingACampaign) | **POST** /campaigns/{CampaignID}/schedule.{Format} | Scheduling A Campaign
*CampaignsApi* | [**sendingACampaign**](docs/CampaignsApi.md#sendingACampaign) | **POST** /campaigns/{CampaignID}/send.{Format} | Sending a campaign
*CampaignsApi* | [**testingACampaign**](docs/CampaignsApi.md#testingACampaign) | **POST** /campaigns/{CampaignID}/send_test.{Format} | Testing a campaign
*CampaignsApi* | [**unschedulingACampaign**](docs/CampaignsApi.md#unschedulingACampaign) | **POST** /campaigns/{CampaignID}/unschedule.{Format} | Unscheduling a campaign
*CampaignsApi* | [**updatingADraftCampaign**](docs/CampaignsApi.md#updatingADraftCampaign) | **POST** /campaigns/{CampaignID}/update.{Format} | Updating A Draft Campaign
*MailingListsApi* | [**creatingACustomField**](docs/MailingListsApi.md#creatingACustomField) | **POST** /lists/{MailingListID}/customfields/create.{Format} | Creating a custom field
*MailingListsApi* | [**creatingAMailingList**](docs/MailingListsApi.md#creatingAMailingList) | **POST** /lists/create.{Format} | Creating a mailing list
*MailingListsApi* | [**deletingAMailingList**](docs/MailingListsApi.md#deletingAMailingList) | **DELETE** /lists/{MailingListID}/delete.{Format} | Deleting a mailing list
*MailingListsApi* | [**gettingAllActiveMailingLists**](docs/MailingListsApi.md#gettingAllActiveMailingLists) | **GET** /lists.{Format} | Getting all active mailing lists
*MailingListsApi* | [**gettingAllActiveMailingListsWithPaging**](docs/MailingListsApi.md#gettingAllActiveMailingListsWithPaging) | **GET** /lists/{Page}/{PageSize}.{Format} | Getting all active mailing lists with paging
*MailingListsApi* | [**gettingMailingListDetails**](docs/MailingListsApi.md#gettingMailingListDetails) | **GET** /lists/{MailingListID}/details.{Format} | Getting mailing list details
*MailingListsApi* | [**removingACustomField**](docs/MailingListsApi.md#removingACustomField) | **DELETE** /lists/{MailingListID}/customfields/{CustomFieldID}/delete.{Format} | Removing a custom field
*MailingListsApi* | [**updatingACustomField**](docs/MailingListsApi.md#updatingACustomField) | **POST** /lists/{MailingListID}/customfields/{CustomFieldID}/update.{Format} | Updating a custom field
*MailingListsApi* | [**updatingAMailingList**](docs/MailingListsApi.md#updatingAMailingList) | **POST** /lists/{MailingListID}/update.{Format} | Updating a mailing list
*SegmentsApi* | [**addingCriteriaToSegments**](docs/SegmentsApi.md#addingCriteriaToSegments) | **POST** /lists/{MailingListID}/segments/{SegmentID}/criteria/add.{Format} | Adding criteria to segments
*SegmentsApi* | [**creatingANewSegment**](docs/SegmentsApi.md#creatingANewSegment) | **POST** /lists/{MailingListID}/segments/create.{Format} | Creating a new segment
*SegmentsApi* | [**deletingASegment**](docs/SegmentsApi.md#deletingASegment) | **DELETE** /lists/{MailingListID}/segments/{SegmentID}/delete.{Format} | Deleting A Segment
*SegmentsApi* | [**gettingSegmentDetails**](docs/SegmentsApi.md#gettingSegmentDetails) | **GET** /lists/{MailingListID}/segments/{SegmentID}/details.{Format} | Getting segment details
*SegmentsApi* | [**gettingSegmentSubscribers**](docs/SegmentsApi.md#gettingSegmentSubscribers) | **GET** /lists/{MailingListID}/segments/{SegmentID}/members.{Format} | Getting segment subscribers
*SegmentsApi* | [**gettingSegments**](docs/SegmentsApi.md#gettingSegments) | **GET** /lists/{MailingListID}/segments.{Format} | Getting segments
*SegmentsApi* | [**updatingASegment**](docs/SegmentsApi.md#updatingASegment) | **POST** /lists/{MailingListID}/segments/{SegmentID}/update.{Format} | Updating a segment
*SegmentsApi* | [**updatingSegmentCriteria**](docs/SegmentsApi.md#updatingSegmentCriteria) | **POST** /lists/{MailingListID}/segments/{SegmentID}/criteria/{CriteriaID}/update.{Format} | Updating segment criteria
*SubscribersApi* | [**addingMultipleSubscribers**](docs/SubscribersApi.md#addingMultipleSubscribers) | **POST** /subscribers/{MailingListID}/subscribe_many.{Format} | Adding multiple subscribers
*SubscribersApi* | [**addingSubscribers**](docs/SubscribersApi.md#addingSubscribers) | **POST** /subscribers/{MailingListID}/subscribe.{Format} | Adding subscribers
*SubscribersApi* | [**getSubscriberByEmailAddress**](docs/SubscribersApi.md#getSubscriberByEmailAddress) | **GET** /subscribers/{MailingListID}/view.{Format} | Get subscriber by email address
*SubscribersApi* | [**getSubscriberById**](docs/SubscribersApi.md#getSubscriberById) | **GET** /subscribers/{MailingListID}/find/{SubscriberID}.{Format} | Get subscriber by id
*SubscribersApi* | [**gettingSubscribers**](docs/SubscribersApi.md#gettingSubscribers) | **GET** /lists/{MailingListID}/subscribers/{Status}.{Format} | Getting subscribers
*SubscribersApi* | [**removingASubscriber**](docs/SubscribersApi.md#removingASubscriber) | **POST** /subscribers/{MailingListID}/remove.{Format} | Removing a subscriber
*SubscribersApi* | [**removingMultipleSubscribers**](docs/SubscribersApi.md#removingMultipleSubscribers) | **POST** /subscribers/{MailingListID}/remove_many.{Format} | Removing multiple subscribers
*SubscribersApi* | [**unsubscribingSubscribersFromAccount**](docs/SubscribersApi.md#unsubscribingSubscribersFromAccount) | **POST** /subscribers/unsubscribe.{Format} | Unsubscribing subscribers from account
*SubscribersApi* | [**unsubscribingSubscribersFromMailingList**](docs/SubscribersApi.md#unsubscribingSubscribersFromMailingList) | **POST** /subscribers/{MailingListID}/unsubscribe.{Format} | Unsubscribing subscribers from mailing list
*SubscribersApi* | [**unsubscribingSubscribersFromMailingListAndASpecifiedCampaign**](docs/SubscribersApi.md#unsubscribingSubscribersFromMailingListAndASpecifiedCampaign) | **POST** /subscribers/{MailingListID}/{CampaignID}/unsubscribe.{Format} | Unsubscribing subscribers from mailing list and a specified campaign
*SubscribersApi* | [**updatingASubscriber**](docs/SubscribersApi.md#updatingASubscriber) | **POST** /subscribers/{MailingListID}/update/{SubscriberID}.{Format} | Updating a subscriber


## Documentation for Models

 - [A](docs/A.md)
 - [ABCampaignData](docs/ABCampaignData.md)
 - [AbTestCampaignSummaryResponse](docs/AbTestCampaignSummaryResponse.md)
 - [ActivityByLocationResponse](docs/ActivityByLocationResponse.md)
 - [AddingCriteriaToSegmentsRequest](docs/AddingCriteriaToSegmentsRequest.md)
 - [AddingCriteriaToSegmentsResponse](docs/AddingCriteriaToSegmentsResponse.md)
 - [AddingMultipleSubscribersRequest](docs/AddingMultipleSubscribersRequest.md)
 - [AddingMultipleSubscribersResponse](docs/AddingMultipleSubscribersResponse.md)
 - [AddingSubscribersRequest](docs/AddingSubscribersRequest.md)
 - [AddingSubscribersResponse](docs/AddingSubscribersResponse.md)
 - [Analytic](docs/Analytic.md)
 - [B](docs/B.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignSummaryResponse](docs/CampaignSummaryResponse.md)
 - [CloningAnExistingCampaignResponse](docs/CloningAnExistingCampaignResponse.md)
 - [Context](docs/Context.md)
 - [Context110](docs/Context110.md)
 - [Context118](docs/Context118.md)
 - [Context132](docs/Context132.md)
 - [Context140](docs/Context140.md)
 - [Context145](docs/Context145.md)
 - [Context148](docs/Context148.md)
 - [Context17](docs/Context17.md)
 - [Context32](docs/Context32.md)
 - [Context37](docs/Context37.md)
 - [Context52](docs/Context52.md)
 - [Context64](docs/Context64.md)
 - [Context66](docs/Context66.md)
 - [Context72](docs/Context72.md)
 - [Context84](docs/Context84.md)
 - [Context89](docs/Context89.md)
 - [Context93](docs/Context93.md)
 - [CreatingACustomFieldRequest](docs/CreatingACustomFieldRequest.md)
 - [CreatingACustomFieldResponse](docs/CreatingACustomFieldResponse.md)
 - [CreatingADraftCampaignRequest](docs/CreatingADraftCampaignRequest.md)
 - [CreatingADraftCampaignResponse](docs/CreatingADraftCampaignResponse.md)
 - [CreatingAMailingListRequest](docs/CreatingAMailingListRequest.md)
 - [CreatingAMailingListResponse](docs/CreatingAMailingListResponse.md)
 - [CreatingANewSegmentRequest](docs/CreatingANewSegmentRequest.md)
 - [CreatingANewSegmentResponse](docs/CreatingANewSegmentResponse.md)
 - [Criterion](docs/Criterion.md)
 - [CustomField](docs/CustomField.md)
 - [CustomField53](docs/CustomField53.md)
 - [CustomFieldsDefinition](docs/CustomFieldsDefinition.md)
 - [DeletingACampaignResponse](docs/DeletingACampaignResponse.md)
 - [DeletingAMailingListResponse](docs/DeletingAMailingListResponse.md)
 - [DeletingASegmentResponse](docs/DeletingASegmentResponse.md)
 - [Format](docs/Format.md)
 - [GetAllCampaignsResponse](docs/GetAllCampaignsResponse.md)
 - [GetCampaignStatisticsResponse](docs/GetCampaignStatisticsResponse.md)
 - [GetCampaignStatisticsWithPagingFilteredResponse](docs/GetCampaignStatisticsWithPagingFilteredResponse.md)
 - [GetCampaignsByPageAndPagesizeResponse](docs/GetCampaignsByPageAndPagesizeResponse.md)
 - [GetCampaignsByPageResponse](docs/GetCampaignsByPageResponse.md)
 - [GetSubscriberByEmailAddressResponse](docs/GetSubscriberByEmailAddressResponse.md)
 - [GetSubscriberByIdResponse](docs/GetSubscriberByIdResponse.md)
 - [GettingAllActiveMailingListsResponse](docs/GettingAllActiveMailingListsResponse.md)
 - [GettingAllActiveMailingListsWithPagingResponse](docs/GettingAllActiveMailingListsWithPagingResponse.md)
 - [GettingAllYourSendersResponse](docs/GettingAllYourSendersResponse.md)
 - [GettingCampaignDetailsResponse](docs/GettingCampaignDetailsResponse.md)
 - [GettingMailingListDetailsResponse](docs/GettingMailingListDetailsResponse.md)
 - [GettingSegmentDetailsResponse](docs/GettingSegmentDetailsResponse.md)
 - [GettingSegmentSubscribersResponse](docs/GettingSegmentSubscribersResponse.md)
 - [GettingSegmentsResponse](docs/GettingSegmentsResponse.md)
 - [GettingSenderDetailsResponse](docs/GettingSenderDetailsResponse.md)
 - [GettingSubscribersResponse](docs/GettingSubscribersResponse.md)
 - [ImportOperation](docs/ImportOperation.md)
 - [ImportOperation19](docs/ImportOperation19.md)
 - [LinkActivityResponse](docs/LinkActivityResponse.md)
 - [MailingList](docs/MailingList.md)
 - [MailingList68](docs/MailingList68.md)
 - [MailingList69](docs/MailingList69.md)
 - [MailingList85](docs/MailingList85.md)
 - [MailingLists](docs/MailingLists.md)
 - [MailingLists119](docs/MailingLists119.md)
 - [MailingLists134](docs/MailingLists134.md)
 - [Paging](docs/Paging.md)
 - [Paging76](docs/Paging76.md)
 - [RemovingACustomFieldResponse](docs/RemovingACustomFieldResponse.md)
 - [RemovingASubscriberRequest](docs/RemovingASubscriberRequest.md)
 - [RemovingASubscriberResponse](docs/RemovingASubscriberResponse.md)
 - [RemovingMultipleSubscribersRequest](docs/RemovingMultipleSubscribersRequest.md)
 - [RemovingMultipleSubscribersResponse](docs/RemovingMultipleSubscribersResponse.md)
 - [ReplyToEmail](docs/ReplyToEmail.md)
 - [SchedulingACampaignRequest](docs/SchedulingACampaignRequest.md)
 - [SchedulingACampaignResponse](docs/SchedulingACampaignResponse.md)
 - [Segment](docs/Segment.md)
 - [Sender](docs/Sender.md)
 - [SendingACampaignResponse](docs/SendingACampaignResponse.md)
 - [ShortBy](docs/ShortBy.md)
 - [SortMethod](docs/SortMethod.md)
 - [Status](docs/Status.md)
 - [Subscriber](docs/Subscriber.md)
 - [Subscribers](docs/Subscribers.md)
 - [Subscribers150](docs/Subscribers150.md)
 - [TestingACampaignRequest](docs/TestingACampaignRequest.md)
 - [TestingACampaignResponse](docs/TestingACampaignResponse.md)
 - [Type](docs/Type.md)
 - [UnschedulingACampaignResponse](docs/UnschedulingACampaignResponse.md)
 - [UnsubscribingSubscribersFromAccountRequest](docs/UnsubscribingSubscribersFromAccountRequest.md)
 - [UnsubscribingSubscribersFromAccountResponse](docs/UnsubscribingSubscribersFromAccountResponse.md)
 - [UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignRequest](docs/UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignRequest.md)
 - [UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignResponse](docs/UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignResponse.md)
 - [UnsubscribingSubscribersFromMailingListRequest](docs/UnsubscribingSubscribersFromMailingListRequest.md)
 - [UnsubscribingSubscribersFromMailingListResponse](docs/UnsubscribingSubscribersFromMailingListResponse.md)
 - [UpdatingACustomFieldRequest](docs/UpdatingACustomFieldRequest.md)
 - [UpdatingACustomFieldResponse](docs/UpdatingACustomFieldResponse.md)
 - [UpdatingADraftCampaignRequest](docs/UpdatingADraftCampaignRequest.md)
 - [UpdatingADraftCampaignResponse](docs/UpdatingADraftCampaignResponse.md)
 - [UpdatingAMailingListRequest](docs/UpdatingAMailingListRequest.md)
 - [UpdatingAMailingListResponse](docs/UpdatingAMailingListResponse.md)
 - [UpdatingASegmentRequest](docs/UpdatingASegmentRequest.md)
 - [UpdatingASegmentResponse](docs/UpdatingASegmentResponse.md)
 - [UpdatingASubscriberRequest](docs/UpdatingASubscriberRequest.md)
 - [UpdatingASubscriberResponse](docs/UpdatingASubscriberResponse.md)
 - [UpdatingSegmentCriteriaRequest](docs/UpdatingSegmentCriteriaRequest.md)
 - [UpdatingSegmentCriteriaResponse](docs/UpdatingSegmentCriteriaResponse.md)
 - [WithStatistics](docs/WithStatistics.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



