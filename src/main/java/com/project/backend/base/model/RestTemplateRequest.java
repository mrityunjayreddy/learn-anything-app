package com.project.backend.base.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;

@Getter
@Setter
@Builder
@ToString
public class RestTemplateRequest<T,K> {

    private String correlationId;
    private String url;
    private HttpMethod httpMethod;
    private HttpEntity<K> httpEntity;
    private MultiValueMap<String,String> queryMap;
    private Class<T> responseClass;
    private boolean isRetry;
}
