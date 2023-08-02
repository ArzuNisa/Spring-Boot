package com.arzu;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public MyComponent() {
        System.out.println("MyComponent bean initialized!");
    }
    public String getName() {
        return "MyComponent";
    }
}
