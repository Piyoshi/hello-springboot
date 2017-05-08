package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication implements CommandLineRunner {
	@Autowired
	private GreetingService greetingService;

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(greetingService.greet());
	}
}
