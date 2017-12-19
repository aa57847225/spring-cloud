package com.whl.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        System.out.println("/hello host:"+instance.getHost()+",serviceId:"+instance.getServiceId());
        return "Hello World";
    }
}
