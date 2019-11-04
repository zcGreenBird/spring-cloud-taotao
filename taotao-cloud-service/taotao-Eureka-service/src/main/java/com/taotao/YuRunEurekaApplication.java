package com.taotao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class YuRunEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(YuRunEurekaApplication.class, args);
    }
}
