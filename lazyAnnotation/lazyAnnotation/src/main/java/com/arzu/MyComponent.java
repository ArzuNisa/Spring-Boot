package com.arzu;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyComponent {

    public MyComponent(){
        System.out.println("MyComponent bean initialized!");
    }

}
