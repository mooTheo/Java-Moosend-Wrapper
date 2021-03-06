# CampaignsApi

All URIs are relative to *https://api.moosend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aBTestCampaignSummary**](CampaignsApi.md#aBTestCampaignSummary) | **GET** /campaigns/{CampaignID}/view_ab_summary.{Format} | AB Test Campaign Summary
[**activityByLocation**](CampaignsApi.md#activityByLocation) | **GET** /campaigns/{CampaignID}/stats/countries.{Format} | Activity By Location
[**campaignSummary**](CampaignsApi.md#campaignSummary) | **GET** /campaigns/{CampaignID}/view_summary.{Format} | Campaign Summary
[**cloningAnExistingCampaign**](CampaignsApi.md#cloningAnExistingCampaign) | **POST** /campaigns/{CampaignID}/clone.{Format} | Cloning An Existing Campaign
[**creatingADraftCampaign**](CampaignsApi.md#creatingADraftCampaign) | **POST** /campaigns/create.{Format} | Creating A Draft Campaign
[**deletingACampaign**](CampaignsApi.md#deletingACampaign) | **DELETE** /campaigns/{CampaignID}/delete.{Format} | Deleting A Campaign
[**getAllCampaigns**](CampaignsApi.md#getAllCampaigns) | **GET** /campaigns.{Format} | Get All Campaigns
[**getCampaignStatisticsWithPagingFiltered**](CampaignsApi.md#getCampaignStatisticsWithPagingFiltered) | **GET** /campaigns/{CampaignID}/stats/{Type}.{Format} | Get Campaign Statistics With Paging &amp; Filtered
[**getCampaignsByPage**](CampaignsApi.md#getCampaignsByPage) | **GET** /campaigns/{Page}.{Format} | Get Campaigns By Page
[**getCampaignsByPageAndPagesize**](CampaignsApi.md#getCampaignsByPageAndPagesize) | **GET** /campaigns/{Page}/{PageSize}.{Format} | Get Campaigns By Page And Pagesize
[**gettingAllYourSenders**](CampaignsApi.md#gettingAllYourSenders) | **GET** /senders/find_all.{Format} | Getting All Your Senders
[**gettingCampaignDetails**](CampaignsApi.md#gettingCampaignDetails) | **GET** /campaigns/{CampaignID}/view.{Format} | Getting Campaign Details
[**gettingSenderDetails**](CampaignsApi.md#gettingSenderDetails) | **GET** /senders/find_one.{Format} | Getting Sender Details
[**linkActivity**](CampaignsApi.md#linkActivity) | **GET** /campaigns/{CampaignID}/stats/links.{Format} | Link Activity
[**schedulingACampaign**](CampaignsApi.md#schedulingACampaign) | **POST** /campaigns/{CampaignID}/schedule.{Format} | Scheduling A Campaign
[**sendingACampaign**](CampaignsApi.md#sendingACampaign) | **POST** /campaigns/{CampaignID}/send.{Format} | Sending a campaign
[**testingACampaign**](CampaignsApi.md#testingACampaign) | **POST** /campaigns/{CampaignID}/send_test.{Format} | Testing a campaign
[**unschedulingACampaign**](CampaignsApi.md#unschedulingACampaign) | **POST** /campaigns/{CampaignID}/unschedule.{Format} | Unscheduling a campaign
[**updatingADraftCampaign**](CampaignsApi.md#updatingADraftCampaign) | **POST** /campaigns/{CampaignID}/update.{Format} | Updating A Draft Campaign


<a name="aBTestCampaignSummary"></a>
# **aBTestCampaignSummary**
> AbTestCampaignSummaryResponse aBTestCampaignSummary(format, apikey, campaignID)

AB Test Campaign Summary

Provides a basic summary of the results for a sent AB test campaign, separately for each version (A and B), such as the number of recipients, opens, clicks, bounces, unsubscribes, forwards etc to date.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **campaignID** | **String**| The ID of the requested AB test campaign |

### Return type

[**AbTestCampaignSummaryResponse**](AbTestCampaignSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="activityByLocation"></a>
# **activityByLocation**
> ActivityByLocationResponse activityByLocation(format, apikey, campaignID)

Activity By Location

Returns a detailed report of your campaign opens (unique and total) by country.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String campaignID = "campaignID_example"; // String | The ID of the requested campaign
try {
    ActivityByLocationResponse result = apiInstance.activityByLocation(format, apikey, campaignID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#activityByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **campaignID** | **String**| The ID of the requested campaign |

### Return type

[**ActivityByLocationResponse**](ActivityByLocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="campaignSummary"></a>
# **campaignSummary**
> CampaignSummaryResponse campaignSummary(format, apikey, campaignID)

Campaign Summary

Provides a basic summary of the results for any sent campaign such as the number of recipients, opens, clicks, bounces, unsubscribes, forwards etc. to date.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String campaignID = "campaignID_example"; // String | The ID of the requested campaign
try {
    CampaignSummaryResponse result = apiInstance.campaignSummary(format, apikey, campaignID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#campaignSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **campaignID** | **String**| The ID of the requested campaign |

### Return type

[**CampaignSummaryResponse**](CampaignSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloningAnExistingCampaign"></a>
# **cloningAnExistingCampaign**
> CloningAnExistingCampaignResponse cloningAnExistingCampaign(format, campaignID, apikey)

Cloning An Existing Campaign

Creates an exact copy of an existing campaign. The new campaign is created as a draft.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String campaignID = "campaignID_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
try {
    CloningAnExistingCampaignResponse result = apiInstance.cloningAnExistingCampaign(format, campaignID, apikey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#cloningAnExistingCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **campaignID** | **String**|  |
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |

### Return type

[**CloningAnExistingCampaignResponse**](CloningAnExistingCampaignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="creatingADraftCampaign"></a>
# **creatingADraftCampaign**
> CreatingADraftCampaignResponse creatingADraftCampaign(format, apikey, body)

Creating A Draft Campaign

Creates a new campaign in your account. This method does not send the campaign, but rather creates it as a draft, ready for sending or testing.  You can choose to send either a regular campaign or an AB split campaign. Campaign content must be specified from a web location.  Ignore ***(A/B Split Campaign Option)*** if you want to create a regular campaign.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
CreatingADraftCampaignRequest body = new CreatingADraftCampaignRequest(); // CreatingADraftCampaignRequest | 
try {
    CreatingADraftCampaignResponse result = apiInstance.creatingADraftCampaign(format, apikey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#creatingADraftCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **body** | [**CreatingADraftCampaignRequest**](CreatingADraftCampaignRequest.md)|  |

### Return type

[**CreatingADraftCampaignResponse**](CreatingADraftCampaignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletingACampaign"></a>
# **deletingACampaign**
> DeletingACampaignResponse deletingACampaign(format, apikey, campaignID)

Deleting A Campaign

Deletes a campaign from your account, draft or even sent.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String campaignID = "campaignID_example"; // String | The ID of the draft campaign to update.
try {
    DeletingACampaignResponse result = apiInstance.deletingACampaign(format, apikey, campaignID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#deletingACampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **campaignID** | **String**| The ID of the draft campaign to update. |

### Return type

[**DeletingACampaignResponse**](DeletingACampaignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllCampaigns"></a>
# **getAllCampaigns**
> GetAllCampaignsResponse getAllCampaigns(format, apikey)

Get All Campaigns

Returns a list of all campaigns in your account with detailed information. Because the results for this call could be quite big, paging information is required as input.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
try {
    GetAllCampaignsResponse result = apiInstance.getAllCampaigns(format, apikey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getAllCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |

### Return type

[**GetAllCampaignsResponse**](GetAllCampaignsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignStatisticsWithPagingFiltered"></a>
# **getCampaignStatisticsWithPagingFiltered**
> GetCampaignStatisticsWithPagingFilteredResponse getCampaignStatisticsWithPagingFiltered(format, apikey, campaignID, type, page, pageSize, from, to)

Get Campaign Statistics With Paging &amp; Filtered

Returns a detailed list of statistics for a given campaign based on activity such as emails sent, opened, bounced, link clicked, etc.  Because the results for this call could be quite big, paging information is required as input.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String campaignID = "campaignID_example"; // String | The ID of the requested AB test campaign
String type = "type_example"; // String | The type of the activity to display results for. This must be one of the following values : * Sent : To get information about when and to which recipients the campaign was sent. * Opened : To get information about who opened the campaign. * LinkClicked : To get information about who clicked on which link. * Forward : To get information about who forwarded the campaign using the relevant link on the email body and when. * Unsubscribed : To get information about who unsubscribed from the campaign by clicking on the unsubscribe link and when. * Bounced : To get information about which email recipients failed to receive the campaign. If not specified, the value Sent will be used by default.
String page = "page_example"; // String | The page number to display results for. If not specified, the first page will be returned.
String pageSize = "pageSize_example"; // String | The maximum number of results per page. This must be a positive integer up to 100. If not specified, 50 results per page will be returned.  If a value greater than 100 is specified, it will be treated as 100.
String from = "from_example"; // String | A date value that specifies since when to start returning results. If omitted, results will be returned from the moment the campaign was sent.
String to = "to_example"; // String | A date value that specifies up to when to return results. If omitted, results will be returned up to date.
try {
    GetCampaignStatisticsWithPagingFilteredResponse result = apiInstance.getCampaignStatisticsWithPagingFiltered(format, apikey, campaignID, type, page, pageSize, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignStatisticsWithPagingFiltered");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **campaignID** | **String**| The ID of the requested AB test campaign |
 **type** | **String**| The type of the activity to display results for. This must be one of the following values : * Sent : To get information about when and to which recipients the campaign was sent. * Opened : To get information about who opened the campaign. * LinkClicked : To get information about who clicked on which link. * Forward : To get information about who forwarded the campaign using the relevant link on the email body and when. * Unsubscribed : To get information about who unsubscribed from the campaign by clicking on the unsubscribe link and when. * Bounced : To get information about which email recipients failed to receive the campaign. If not specified, the value Sent will be used by default. | [enum: Sent, Opened, LinkClicked, Forward, Unsubscribed, Bounced]
 **page** | **String**| The page number to display results for. If not specified, the first page will be returned. | [optional]
 **pageSize** | **String**| The maximum number of results per page. This must be a positive integer up to 100. If not specified, 50 results per page will be returned.  If a value greater than 100 is specified, it will be treated as 100. | [optional]
 **from** | **String**| A date value that specifies since when to start returning results. If omitted, results will be returned from the moment the campaign was sent. | [optional]
 **to** | **String**| A date value that specifies up to when to return results. If omitted, results will be returned up to date. | [optional]

### Return type

[**GetCampaignStatisticsWithPagingFilteredResponse**](GetCampaignStatisticsWithPagingFilteredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignsByPage"></a>
# **getCampaignsByPage**
> GetCampaignsByPageResponse getCampaignsByPage(format, apikey, page)

Get Campaigns By Page

Returns a list of all campaigns in your account with detailed information. Because the results for this call could be quite big, paging information is required as input.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
Double page = 3.4D; // Double | The page number to display results for.
try {
    GetCampaignsByPageResponse result = apiInstance.getCampaignsByPage(format, apikey, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignsByPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **page** | **Double**| The page number to display results for. |

### Return type

[**GetCampaignsByPageResponse**](GetCampaignsByPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignsByPageAndPagesize"></a>
# **getCampaignsByPageAndPagesize**
> GetCampaignsByPageAndPagesizeResponse getCampaignsByPageAndPagesize(format, apikey, page, pageSize, shortBy, sortMethod)

Get Campaigns By Page And Pagesize

Returns a list of all campaigns in your account with detailed information. Because the results for this call could be quite big, paging information is required as input.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
Double page = 3.4D; // Double | The page number to display results for.
Double pageSize = 3.4D; // Double | The maximum number of results per page.  This must be a positive integer up to 100. If not specified, 50 results per page will be returned.  If a value greater than 100 is specified, it will be treated as 100.
String shortBy = "shortBy_example"; // String | The name of the campaign property to sort results by. If not specified, results will be sorted by the CreatedOn property
String sortMethod = "sortMethod_example"; // String | The method to sort results: ASC for ascending, DESC for descending. If not specified, `ASC` will be assumed
try {
    GetCampaignsByPageAndPagesizeResponse result = apiInstance.getCampaignsByPageAndPagesize(format, apikey, page, pageSize, shortBy, sortMethod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignsByPageAndPagesize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **page** | **Double**| The page number to display results for. |
 **pageSize** | **Double**| The maximum number of results per page.  This must be a positive integer up to 100. If not specified, 50 results per page will be returned.  If a value greater than 100 is specified, it will be treated as 100. |
 **shortBy** | **String**| The name of the campaign property to sort results by. If not specified, results will be sorted by the CreatedOn property | [optional] [enum: Name, Subject, Status, DeliveredOn, CreatedOn]
 **sortMethod** | **String**| The method to sort results: ASC for ascending, DESC for descending. If not specified, &#x60;ASC&#x60; will be assumed | [optional] [enum: ASC, DESC]

### Return type

[**GetCampaignsByPageAndPagesizeResponse**](GetCampaignsByPageAndPagesizeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gettingAllYourSenders"></a>
# **gettingAllYourSenders**
> GettingAllYourSendersResponse gettingAllYourSenders(format, apikey)

Getting All Your Senders

Gets a list of your active senders in your account. You may specify any email address of these senders when sending a campaign.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
try {
    GettingAllYourSendersResponse result = apiInstance.gettingAllYourSenders(format, apikey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#gettingAllYourSenders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |

### Return type

[**GettingAllYourSendersResponse**](GettingAllYourSendersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gettingCampaignDetails"></a>
# **gettingCampaignDetails**
> GettingCampaignDetailsResponse gettingCampaignDetails(format, apikey, campaignID)

Getting Campaign Details

Returns a complete set of properties that describe the requested campaign in detail. No statistics are included in the result.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String campaignID = "campaignID_example"; // String | The ID of the requested campaign
try {
    GettingCampaignDetailsResponse result = apiInstance.gettingCampaignDetails(format, apikey, campaignID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#gettingCampaignDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **campaignID** | **String**| The ID of the requested campaign |

### Return type

[**GettingCampaignDetailsResponse**](GettingCampaignDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gettingSenderDetails"></a>
# **gettingSenderDetails**
> GettingSenderDetailsResponse gettingSenderDetails(format, email, apikey)

Getting Sender Details

Returns basic information for the specified sender identified by its email address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String email = "email_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
try {
    GettingSenderDetailsResponse result = apiInstance.gettingSenderDetails(format, email, apikey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#gettingSenderDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **email** | **String**|  |
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |

### Return type

[**GettingSenderDetailsResponse**](GettingSenderDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="linkActivity"></a>
# **linkActivity**
> LinkActivityResponse linkActivity(format, apikey, campaignID)

Link Activity

Returns a list with your campaign links and how many clicks have been made by your recipients, either unique or total.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String campaignID = "campaignID_example"; // String | The ID of the requested campaign
try {
    LinkActivityResponse result = apiInstance.linkActivity(format, apikey, campaignID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#linkActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **campaignID** | **String**| The ID of the requested campaign |

### Return type

[**LinkActivityResponse**](LinkActivityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="schedulingACampaign"></a>
# **schedulingACampaign**
> SchedulingACampaignResponse schedulingACampaign(format, apikey, campaignID, body)

Scheduling A Campaign

Assigns a scheduled date and time at which the campaign will be delivered.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String campaignID = "campaignID_example"; // String | The ID of the campaign to be scheduled
SchedulingACampaignRequest body = new SchedulingACampaignRequest(); // SchedulingACampaignRequest | 
try {
    SchedulingACampaignResponse result = apiInstance.schedulingACampaign(format, apikey, campaignID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#schedulingACampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **campaignID** | **String**| The ID of the campaign to be scheduled |
 **body** | [**SchedulingACampaignRequest**](SchedulingACampaignRequest.md)|  |

### Return type

[**SchedulingACampaignResponse**](SchedulingACampaignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendingACampaign"></a>
# **sendingACampaign**
> SendingACampaignResponse sendingACampaign(format, apikey, campaignID)

Sending a campaign

Sends an existing draft campaign to all recipients specified in its mailing list. The campaign is sent immediatelly.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String campaignID = "campaignID_example"; // String | The ID of the draft campaign to be sent.
try {
    SendingACampaignResponse result = apiInstance.sendingACampaign(format, apikey, campaignID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#sendingACampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **campaignID** | **String**| The ID of the draft campaign to be sent. |

### Return type

[**SendingACampaignResponse**](SendingACampaignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testingACampaign"></a>
# **testingACampaign**
> TestingACampaignResponse testingACampaign(format, apikey, campaignID, body)

Testing a campaign

Sends a test email of a draft campaign to a list of email addresses you specify for previewing.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String campaignID = "campaignID_example"; // String | The ID of the draft campaign to be tested.
TestingACampaignRequest body = new TestingACampaignRequest(); // TestingACampaignRequest | 
try {
    TestingACampaignResponse result = apiInstance.testingACampaign(format, apikey, campaignID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#testingACampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **campaignID** | **String**| The ID of the draft campaign to be tested. |
 **body** | [**TestingACampaignRequest**](TestingACampaignRequest.md)|  |

### Return type

[**TestingACampaignResponse**](TestingACampaignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unschedulingACampaign"></a>
# **unschedulingACampaign**
> UnschedulingACampaignResponse unschedulingACampaign(format, apikey, campaignID)

Unscheduling a campaign

Removes a previously defined scheduled date and time from a campaign, so that it will be delivered immediately if already queued or when sent.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String campaignID = "campaignID_example"; // String | The ID of the campaign to be scheduled
try {
    UnschedulingACampaignResponse result = apiInstance.unschedulingACampaign(format, apikey, campaignID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#unschedulingACampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **campaignID** | **String**| The ID of the campaign to be scheduled |

### Return type

[**UnschedulingACampaignResponse**](UnschedulingACampaignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatingADraftCampaign"></a>
# **updatingADraftCampaign**
> UpdatingADraftCampaignResponse updatingADraftCampaign(format, apikey, campaignID, body)

Updating A Draft Campaign

Updates properties of an existing draft A/B campaign in your account. Non-draft campaigns cannot be updated. Ignore ***(A/B Split Campaign Option)*** if you want to create a regular campaign.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CampaignsApi;


CampaignsApi apiInstance = new CampaignsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String campaignID = "campaignID_example"; // String | The ID of the draft campaign to update.
UpdatingADraftCampaignRequest body = new UpdatingADraftCampaignRequest(); // UpdatingADraftCampaignRequest | 
try {
    UpdatingADraftCampaignResponse result = apiInstance.updatingADraftCampaign(format, apikey, campaignID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#updatingADraftCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **campaignID** | **String**| The ID of the draft campaign to update. |
 **body** | [**UpdatingADraftCampaignRequest**](UpdatingADraftCampaignRequest.md)|  |

### Return type

[**UpdatingADraftCampaignResponse**](UpdatingADraftCampaignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

