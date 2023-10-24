package com.example.api_gateway_server;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
@Configuration
public class SpringCloudConfig {

//    @Bean
//    public CorsWebFilter corsWebFilter() {
//        CorsConfiguration corsConfig = new CorsConfiguration();
//        corsConfig.addAllowedOrigin("http://localhost:8081");
//        corsConfig.addAllowedMethod("*");
//        corsConfig.addAllowedHeader("*");
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfig);
//
//        return new CorsWebFilter(source);
//    }
//
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
//                .route(r -> r.path("/users/**")
//                        .uri("http://localhost:3000/"))
//                .route(r -> r.path("/Article/**")
//                        .uri("http://blog-management-microservice:8001/"))
//                .route(r -> r.path("/auction/**")
//                        .uri("http://auction-management-microservice:8002/"))
//                .route(r -> r.path("/gallery/**")
//                        .uri("http://Gallery-management-microservice:8006/"))
//                .route(r -> r.path("/order/**")
//                        .uri("http://order-management-microservice:8005/"))
//                .route(r -> r.path("/event/**")
//                        .uri("http://event-management-microservice:8004/"))
                .build();

    }
}
