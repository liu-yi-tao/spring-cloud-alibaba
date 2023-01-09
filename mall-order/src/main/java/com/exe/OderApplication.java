package com.exe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @create 2022-11-19 10:28
 */
@SpringBootApplication
public class OderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OderApplication.class, args);
    }
}
