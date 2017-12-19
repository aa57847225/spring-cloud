package com.whl.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "hello-service",fallback = HystrixClientFallback.class)
public interface HelloService {

    @RequestMapping("/hello")
    String hello();
}
