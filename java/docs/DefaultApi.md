# DefaultApi

All URIs are relative to *http://hostname2/ajax*

Method | HTTP request | Description
------------- | ------------- | -------------
[**3b0c08c566d34d1bBe802051668924f0**](DefaultApi.md#3b0c08c566d34d1bBe802051668924f0) | **GET** /edq-getaddress | Hybris Get Address
[**94ab679a473e48e985e863c9dc0c3c31**](DefaultApi.md#94ab679a473e48e985e863c9dc0c3c31) | **GET** /edq-search | Hybris Address Search


<a name="3b0c08c566d34d1bBe802051668924f0"></a>
# **3b0c08c566d34d1bBe802051668924f0**
> 3b0c08c566d34d1bBe802051668924f0(moniker)

Hybris Get Address



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String moniker = "KOR|382b1089-7e96-4e59-89c3-a3e28a99ea97|ADRKOR/IMAAAMAAEMAA]MAAAMAAQMAAAMAAUMAA}IAAAMAA}IAA}QAAA]AAQ]AAeYAAuYAAEYAAqYAA}IAA}IAAAMAA}IAAUMAAEMAA]MAAeUAAUQAA}QAAyQAA]QAAQQAA}QAAyQAA]QAAQQAAEQAAUQAAuIAAIUAA}QAAAIAAq]AAAIAAAMAAYMAAEMAAYMAAQMAA"; // String | 
try {
    apiInstance.3b0c08c566d34d1bBe802051668924f0(moniker);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#3b0c08c566d34d1bBe802051668924f0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moniker** | **String**|  | [optional] [default to KOR|382b1089-7e96-4e59-89c3-a3e28a99ea97|ADRKOR/IMAAAMAAEMAA]MAAAMAAQMAAAMAAUMAA}IAAAMAA}IAA}QAAA]AAQ]AAeYAAuYAAEYAAqYAA}IAA}IAAAMAA}IAAUMAAEMAA]MAAeUAAUQAA}QAAyQAA]QAAQQAA}QAAyQAA]QAAQQAAEQAAUQAAuIAAIUAA}QAAAIAAq]AAAIAAAMAAYMAAEMAAYMAAQMAA]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="94ab679a473e48e985e863c9dc0c3c31"></a>
# **94ab679a473e48e985e863c9dc0c3c31**
> 94ab679a473e48e985e863c9dc0c3c31(country, line1, postcode)

Hybris Address Search



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String country = "KOR"; // String | 
String line1 = "517YEONGDONGDAE-RO"; // String | 
String postcode = "06164"; // String | 
try {
    apiInstance.94ab679a473e48e985e863c9dc0c3c31(country, line1, postcode);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#94ab679a473e48e985e863c9dc0c3c31");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**|  | [optional] [default to KOR]
 **line1** | **String**|  | [optional] [default to 517YEONGDONGDAE-RO]
 **postcode** | **String**|  | [optional] [default to 06164]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

