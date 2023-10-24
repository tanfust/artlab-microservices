package com.example.api_gateway_server;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/users/**")
                        .uri("http://localhost:3000/"))
                .route(r -> r.path("/Article/**")
                        .uri("http://localhost:8001/"))
                .route(r -> r.path("/auction/**")
                        .uri("http://localhost:8002/"))
                .build();
       
    }
}
