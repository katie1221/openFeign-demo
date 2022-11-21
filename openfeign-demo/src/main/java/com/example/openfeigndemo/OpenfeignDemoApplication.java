package com.example.openfeigndemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableFeignClients:开启OpenFeign注解支持
 */
@SpringBootApplication
@EnableFeignClients
class OpenfeignDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenfeignDemoApplication.class, args);
    }

}
