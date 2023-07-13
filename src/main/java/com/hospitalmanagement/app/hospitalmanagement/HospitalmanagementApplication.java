package com.hospitalmanagement.app.hospitalmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class HospitalmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalmanagementApplication.class, args);
    }

}
