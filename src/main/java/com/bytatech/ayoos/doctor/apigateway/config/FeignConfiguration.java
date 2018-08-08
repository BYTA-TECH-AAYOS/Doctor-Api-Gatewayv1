package com.bytatech.ayoos.doctor.apigateway.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.bytatech.ayoos.doctor.apigateway")
public class FeignConfiguration {

}
