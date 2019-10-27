package com.sunxiang.ch31eurekaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ch31eurekaconfig {

    public static void main(String[] args) {
        SpringApplication.run(Ch31eurekaconfig.class);
        System.out.println("       .__     ________  ____ \n" +
                "  ____ |  |__  \\_____  \\/_   |\n" +
                "_/ ___\\|  |  \\  /  ____/ |   |\n" +
                "\\  \\___|   Y  \\/       \\ |   |\n" +
                " \\___  >___|  /\\_______ \\|___|\n" +
                "     \\/     \\/         \\/     ");
    }
}
