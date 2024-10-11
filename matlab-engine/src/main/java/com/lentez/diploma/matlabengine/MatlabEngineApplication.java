package com.lentez.diploma.matlabengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MatlabEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(MatlabEngineApplication.class, args);
    }

}
