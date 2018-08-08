package com.bytatech.ayoos.doctor.apigateway.client.doctor.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import com.bytatech.ayoos.doctor.apigateway.client.doctor.ClientConfiguration;

@FeignClient(name="${doctor.name:doctor}", url="${doctor.url:35.237.64.155:8081/}", configuration = ClientConfiguration.class)
public interface SessionResourceApiClient extends SessionResourceApi {
}