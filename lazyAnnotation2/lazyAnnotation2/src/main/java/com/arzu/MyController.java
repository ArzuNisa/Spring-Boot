package com.arzu;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private Example1 example1;

    public MyController(Example1 example1) {
        this.example1 = example1;
    }
}
