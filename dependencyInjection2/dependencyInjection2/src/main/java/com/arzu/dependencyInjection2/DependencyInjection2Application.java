package com.arzu.dependencyInjection2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInjection2Application {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjection2Application.class, args);
	}

	@Bean("WORD")
	public WordFileReader getWordFileReader(){
		return new WordFileReader();
	}
}
