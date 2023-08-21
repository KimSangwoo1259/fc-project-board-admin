package com.example.fcprojectboardadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FcProjectBoardAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(FcProjectBoardAdminApplication.class, args);
    }

}
