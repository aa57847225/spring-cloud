package com.whl.demo.controller;

import com.whl.demo.service.HelloService;
import com.whl.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        System.out.println("=========feign-consumer===========");
        return helloService.hello();
    }

    @ResponseBody
    @RequestMapping(value = "/get-user-info",method = RequestMethod.GET)
    public String getUserInfo(){
        System.out.println("=========feign-consumer===========");
        return userService.getUserInfo();
    }
}
