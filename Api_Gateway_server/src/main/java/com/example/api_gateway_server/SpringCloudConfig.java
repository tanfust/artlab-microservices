package com.example.api_gateway_server;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        //List microservices
    //Micro-service 1 (example)
        return builder.routes()
                .route(r -> r.path("PATH_DE_MS")
                        .uri("URI_DE_MS")
                ).build();
    }
}
