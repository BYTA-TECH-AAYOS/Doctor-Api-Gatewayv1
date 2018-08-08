package com.bytatech.ayoos.doctor.apigateway.client.snomed;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bytatech.ayoos.doctor.apigateway.client.ExcludeFromComponentScan;

import feign.auth.BasicAuthRequestInterceptor;


/*
@Configuration
@ExcludeFromComponentScan
@EnableConfigurationProperties
public class ClientConfiguration {

  @Value("${bpmn.security.basicAuth.username:}")
  private String basicAuthUsername;

  @Value("${bpmn.security.basicAuth.password:}")
  private String basicAuthPassword;

  @Bean
  @ConditionalOnProperty(name = "bpmn.security.basicAuth.username")
  public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
    return new BasicAuthRequestInterceptor(this.basicAuthUsername, this.basicAuthPassword);
  }

}*/