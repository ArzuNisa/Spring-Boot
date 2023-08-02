package com.arzu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    private MyComponent myComponent;

    public MyController(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

}
