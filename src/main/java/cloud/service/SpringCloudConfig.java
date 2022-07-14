package cloud.service;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
	
	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/ms-one/**")
                		.filters(f -> f.addResponseHeader("jayesh1", "patil1"))
                        .uri("http://localhost:8081"))

                .route(r -> r
                		.path("/ms-two/**")
                		.filters(f -> f.addResponseHeader("jayesh2", "patil2"))
                        .uri("http://localhost:8082"))
                .build();
    }
	
	

}
