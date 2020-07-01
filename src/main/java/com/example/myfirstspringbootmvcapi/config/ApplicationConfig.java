package com.example.myfirstspringbootmvcapi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = 
{"com.example.myfirstspringbootmvcapi.controller",})
public class ApplicationConfig {
	
	public static void main(String[] args) {
        SpringApplication.run(ApplicationConfig.class, args);
    }

}
