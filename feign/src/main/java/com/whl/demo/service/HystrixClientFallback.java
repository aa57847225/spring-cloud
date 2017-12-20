package com.whl.demo.service;

import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements HelloService,UserService{

    public String hello() {
        return "this is hystrix";
    }

    public String getUserInfo() {
        return "this is userInfo hystrix";
    }
}
