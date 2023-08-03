package com.arzu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecondController {

    @Autowired
    private MyComponent myComponent;

    @GetMapping("/second-controller")
    private String getNameOfComponent(){
        return this.myComponent.getName();
    }

}
