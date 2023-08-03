package com.arzu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/application-context")
    public void examples() {
        /*  String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/

/*        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);*/

/*
        MyComponent myComponent = (MyComponent) applicationContext.getBean("myComponent");
        System.out.println(myComponent.getName()); */

/*
        MyComponent myComponent = applicationContext.getBean(MyComponent.class);
        System.out.println(myComponent.getName()); */

/*      Class<?> myComponentClass = applicationContext.getType("myComponent");
        System.out.println(myComponentClass.getSimpleName()); */


/*      boolean myComponent = applicationContext.containsBean("myComponent");
        System.out.println(myComponent);*/




    }


}
