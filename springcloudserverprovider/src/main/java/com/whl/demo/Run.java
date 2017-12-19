package com.whl.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Run {
    public static void  main(String[] args){
        new SpringApplicationBuilder(Run.class).web(true).run(args);
    }
}
