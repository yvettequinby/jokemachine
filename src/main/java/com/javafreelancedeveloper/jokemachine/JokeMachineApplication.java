package com.javafreelancedeveloper.jokemachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:joke-machine-spring-config.xml")
public class JokeMachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokeMachineApplication.class, args);
	}
}
