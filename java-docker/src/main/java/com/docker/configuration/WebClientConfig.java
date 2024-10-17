package com.docker.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClientExterno(WebClient.Builder builder) {
        return builder.baseUrl("https://api.restful-api.dev").build();
    }

    @Bean
    public WebClient webClientInterno(WebClient.Builder builder) {
        return builder.baseUrl("http://localhost:8081").build();
    }
}
