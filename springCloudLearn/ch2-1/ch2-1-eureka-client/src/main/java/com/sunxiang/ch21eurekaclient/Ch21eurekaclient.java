package com.sunxiang.ch21eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ch21eurekaclient {

    public static void main(String[] args) {
        SpringApplication.run(Ch21eurekaclient.class);
        System.out.println("       .__     ________  ____ \n" +
                "  ____ |  |__  \\_____  \\/_   |\n" +
                "_/ ___\\|  |  \\  /  ____/ |   |\n" +
                "\\  \\___|   Y  \\/       \\ |   |\n" +
                " \\___  >___|  /\\_______ \\|___|\n" +
                "     \\/     \\/         \\/     ");
    }
}
