package com.greeting.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingAppApplication {

	public static void main(String[] args) {
		System.out.println("Hello from Amol");
		SpringApplication.run(GreetingAppApplication.class, args);
	}

}
