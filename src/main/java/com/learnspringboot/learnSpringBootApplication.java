package com.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootConfiguration - used to identify a configuration file and indicates a class that provides Spring Boot configuration
// @EnableAutoConfiguration - can exclude autoconfiguration classes that should not be applied
// @ComponentScan - allows you to specify the package to scan for

public class learnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(learnSpringBootApplication.class, args);
	}

}
