package com.example.uahaneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UaHanEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UaHanEurekaApplication.class, args);
    }

}
