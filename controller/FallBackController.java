package com.example.bookstoreapigateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBackController {
    @RequestMapping("/userFallBack")
    public Mono<String> userServiceFallBack(){
        return Mono.just("User Service is taking too long to respond or is down. Please try again later!!");
    }
    @RequestMapping("/bookFallBack")
    public Mono<String> bookServiceFallBack(){
        return Mono.just("Book Service is taking too long to respond or is down. Please try again later!!");
    }
    @RequestMapping("/cartFallBack")
    public Mono<String> cartServiceFallBack(){
        return Mono.just("Cart Service is taking too long to respond or is down. Please try again later!!");
    }
    @RequestMapping("/orderFallBack")
    public Mono<String> orderServiceFallBack(){
        return Mono.just("Order Service is taking too long to respond or is down. Please try again later!!");
    }
    @RequestMapping("/paymentFallBack")
    public Mono<String> paymentServiceFallBack(){
        return Mono.just("Payment Service is taking too long to respond or is down. Please try again later!!");
    }
}
