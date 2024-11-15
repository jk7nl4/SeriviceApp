package org.example.configserever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigSereverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSereverApplication.class, args);
    }

}
