package com.arzu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
       private MyComponent myComponent;

       @Autowired
       public MyController(@Lazy MyComponent myComponent) {
           this.myComponent = myComponent;
       }

       @GetMapping("/name")
       public String getComponentName() {
           return myComponent.getName();
       }

}
