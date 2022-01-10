package com.github.kokochi.link.developers.sdk.api.factory;

import com.github.kokochi.link.developers.sdk.api.ApiClient;
import com.github.kokochi.link.developers.sdk.api.ApiClientImpl;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class ApiClientFactory {

    public ApiClient build(ApiClientFactoryConfig config) {
        HttpClient httpClient = HttpClientBuilder.create().build();
        return new ApiClientImpl(baseUrl(config.apiBaseUrl),httpClient, config.apiKeySecret);
    }
    // KOTLIN::CHECK

    private String baseUrl(String apiBaseUrl) {
        return apiBaseUrl.endsWith("/") ? apiBaseUrl.substring(0, apiBaseUrl.length()-1) : apiBaseUrl;
    }
}
