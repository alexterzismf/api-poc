

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for 3b0c08c566d34d1bBe802051668924f0 */
    private com.squareup.okhttp.Call 3b0c08c566d34d1bBe802051668924f0Call(String moniker, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/edq-getaddress".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (moniker != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "moniker", moniker));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Hybris Get Address
     * 
     * @param moniker  (optional, default to KOR|382b1089-7e96-4e59-89c3-a3e28a99ea97|ADRKOR/IMAAAMAAEMAA]MAAAMAAQMAAAMAAUMAA}IAAAMAA}IAA}QAAA]AAQ]AAeYAAuYAAEYAAqYAA}IAA}IAAAMAA}IAAUMAAEMAA]MAAeUAAUQAA}QAAyQAA]QAAQQAA}QAAyQAA]QAAQQAAEQAAUQAAuIAAIUAA}QAAAIAAq]AAAIAAAMAAYMAAEMAAYMAAQMAA)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void 3b0c08c566d34d1bBe802051668924f0(String moniker) throws ApiException {
        3b0c08c566d34d1bBe802051668924f0WithHttpInfo(moniker);
    }

    /**
     * Hybris Get Address
     * 
     * @param moniker  (optional, default to KOR|382b1089-7e96-4e59-89c3-a3e28a99ea97|ADRKOR/IMAAAMAAEMAA]MAAAMAAQMAAAMAAUMAA}IAAAMAA}IAA}QAAA]AAQ]AAeYAAuYAAEYAAqYAA}IAA}IAAAMAA}IAAUMAAEMAA]MAAeUAAUQAA}QAAyQAA]QAAQQAA}QAAyQAA]QAAQQAAEQAAUQAAuIAAIUAA}QAAAIAAq]AAAIAAAMAAYMAAEMAAYMAAQMAA)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> 3b0c08c566d34d1bBe802051668924f0WithHttpInfo(String moniker) throws ApiException {
        com.squareup.okhttp.Call call = 3b0c08c566d34d1bBe802051668924f0Call(moniker, null, null);
        return apiClient.execute(call);
    }

    /**
     * Hybris Get Address (asynchronously)
     * 
     * @param moniker  (optional, default to KOR|382b1089-7e96-4e59-89c3-a3e28a99ea97|ADRKOR/IMAAAMAAEMAA]MAAAMAAQMAAAMAAUMAA}IAAAMAA}IAA}QAAA]AAQ]AAeYAAuYAAEYAAqYAA}IAA}IAAAMAA}IAAUMAAEMAA]MAAeUAAUQAA}QAAyQAA]QAAQQAA}QAAyQAA]QAAQQAAEQAAUQAAuIAAIUAA}QAAAIAAq]AAAIAAAMAAYMAAEMAAYMAAQMAA)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call 3b0c08c566d34d1bBe802051668924f0Async(String moniker, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = 3b0c08c566d34d1bBe802051668924f0Call(moniker, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for 94ab679a473e48e985e863c9dc0c3c31 */
    private com.squareup.okhttp.Call 94ab679a473e48e985e863c9dc0c3c31Call(String country, String line1, String postcode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/edq-search".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        if (line1 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "line1", line1));
        if (postcode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "postcode", postcode));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Hybris Address Search
     * 
     * @param country  (optional, default to KOR)
     * @param line1  (optional, default to 517YEONGDONGDAE-RO)
     * @param postcode  (optional, default to 06164)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void 94ab679a473e48e985e863c9dc0c3c31(String country, String line1, String postcode) throws ApiException {
        94ab679a473e48e985e863c9dc0c3c31WithHttpInfo(country, line1, postcode);
    }

    /**
     * Hybris Address Search
     * 
     * @param country  (optional, default to KOR)
     * @param line1  (optional, default to 517YEONGDONGDAE-RO)
     * @param postcode  (optional, default to 06164)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> 94ab679a473e48e985e863c9dc0c3c31WithHttpInfo(String country, String line1, String postcode) throws ApiException {
        com.squareup.okhttp.Call call = 94ab679a473e48e985e863c9dc0c3c31Call(country, line1, postcode, null, null);
        return apiClient.execute(call);
    }

    /**
     * Hybris Address Search (asynchronously)
     * 
     * @param country  (optional, default to KOR)
     * @param line1  (optional, default to 517YEONGDONGDAE-RO)
     * @param postcode  (optional, default to 06164)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call 94ab679a473e48e985e863c9dc0c3c31Async(String country, String line1, String postcode, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = 94ab679a473e48e985e863c9dc0c3c31Call(country, line1, postcode, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
