package com.github.kokochi.link.developers.sdk.api.factory;

import com.github.kokochi.link.developers.sdk.model.dto.ApiKeySecret;

import java.net.http.HttpClient;

public class ApiClientFactoryConfig {
    public ApiClientFactoryConfig(String apiBaseUrl, ApiKeySecret apiKeySecret) {
        this.apiBaseUrl = apiBaseUrl;
        this.apiKeySecret = apiKeySecret;
    }

    String apiBaseUrl;
    ApiKeySecret apiKeySecret;
//    HttpClient client;
//    Boolean enableResponseValidation;
//    Long requestTimeout;
//    Boolean enableLogging;
    // KOTLIN::CHECK
}
