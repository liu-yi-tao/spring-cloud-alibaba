package com.exe.config;

import com.config.CustomLoadBalancerConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import com.config.CustomLoadBalancerConfiguration;

/**
 * @create 2022-11-24 15:52
 */
@Configuration
@LoadBalancerClients(@LoadBalancerClient(value = "order-service", configuration = CustomLoadBalancerConfiguration.class))
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
