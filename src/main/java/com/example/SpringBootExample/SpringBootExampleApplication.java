package com.example.SpringBootExample;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.SpringBootExample.Service.UserService;

@SpringBootApplication
@EnableScheduling
@EnableEurekaServer
public class SpringBootExampleApplication {
	
	@Autowired
	UserService service;

	public static void main(String[] args) {
		System.out.println("SpringBootEaxample Application Starting");
		SpringApplication.run(SpringBootExampleApplication.class, args);
		System.out.println("SpringBootEaxample Application Started");
	}
	
	@PostConstruct
    private void init() {
		service.saveInitialUser();
    }

}
