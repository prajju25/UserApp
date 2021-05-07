package com.example.SpringBootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableEurekaServer
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		System.out.println("SpringBootEaxample Application Starting");
		SpringApplication.run(SpringBootExampleApplication.class, args);
		System.out.println("SpringBootEaxample Application Started");
	}

}
