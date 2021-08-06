package com.sindomim.standalone.bis.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;


//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = "com.sindomim.standalone.bis")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


}
