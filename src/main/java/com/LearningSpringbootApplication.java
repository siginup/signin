package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages= {"com.Controller"})
public class LearningSpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(LearningSpringbootApplication.class, args);
	}

}