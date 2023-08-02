package com.arzu.dependencyInjectionf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInjectionfApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionfApplication.class, args);
	}

	@Bean
	public SecondClass getSecondClass(){
		return new SecondClass();
	}


}
