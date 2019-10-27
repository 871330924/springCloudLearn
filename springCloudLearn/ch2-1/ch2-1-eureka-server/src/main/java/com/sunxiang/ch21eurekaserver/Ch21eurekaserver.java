package com.sunxiang.ch21eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch21eurekaserver {

    public static void main(String[] args) {
        SpringApplication.run(Ch21eurekaserver.class);
        System.out.println("       .__     ________  ____ \n" +
                "  ____ |  |__  \\_____  \\/_   |\n" +
                "_/ ___\\|  |  \\  /  ____/ |   |\n" +
                "\\  \\___|   Y  \\/       \\ |   |\n" +
                " \\___  >___|  /\\_______ \\|___|\n" +
                "     \\/     \\/         \\/     ");
    }
}
