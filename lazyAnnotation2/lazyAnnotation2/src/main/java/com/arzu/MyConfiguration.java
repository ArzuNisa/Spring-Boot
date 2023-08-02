package com.arzu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class MyConfiguration {

    public MyConfiguration() {
        System.out.println("MyConfiguration bean initialized!");
    }

    @Bean
    @Lazy
    public Example1 getExample1() {
        return new Example1();
    }

    @Bean
    @Lazy
    public Example2 getExample2() {
        return new Example2();
    }

}
