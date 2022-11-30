package com.example.bookstoreapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import javax.ws.rs.Path;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class BookStoreApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApiGatewayApplication.class, args);
    }

}
