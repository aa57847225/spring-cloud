package com.whl.demo.service;

import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements HelloService{

    public String hello() {
        return "this is hystrix";
    }
}
