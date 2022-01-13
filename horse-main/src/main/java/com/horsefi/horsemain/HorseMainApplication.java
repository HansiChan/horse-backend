package com.horsefi.horsemain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HorseMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(HorseMainApplication.class, args);
    }

}
