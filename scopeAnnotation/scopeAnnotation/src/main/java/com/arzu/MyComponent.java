package com.arzu;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalDateTime;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@RequestScope
@SessionScope
public class MyComponent {

    public MyComponent() {
        System.out.println("MyComponent created at " + LocalDateTime.now());
    }

    public String getName() {
        return "MyComponent";
    }

}
