package com.revature.rms.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AuthMicroserviceConfig {
    public static void main(String[] args) {
        SpringApplication.run(AuthMicroserviceConfig.class, args);
    }
}
