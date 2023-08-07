package com.arzu.componentScan2;

import com.arzu.branch.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@ComponentScan(basePackages = "com.arzu.branch", includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Anytry.class) )
//@ComponentScan(basePackages = "com.arzu.branch", includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MyClass3.class))
//@ComponentScan(basePackages = "com.arzu.branch", useDefaultFilters = false, includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*[12]"))
//@ComponentScan(basePackages = "com.arzu.branch", useDefaultFilters = false, includeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "com.arzu.branch.*"))
//@ComponentScan(basePackages = "com.arzu.branch", useDefaultFilters = false, includeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "com.arzu.branch.*"), excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MyClass2.class))
@ComponentScan(basePackages = "com.arzu.branch", useDefaultFilters = false, includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyCustomFilter.class))

public class MyConfiguration {

   /* @Autowired
    private MyClass1 myClass1;

    @Autowired
    private MyClass2 myClass2;

    @Autowired
    private MyClass3 myClass3;

    @Autowired
    private MyClass4 myClass4;*/

    /*@Autowired
    private MyClass1 myClass1;*/

    /*@Autowired
    private MyClass3 myClass3;*/

    @Autowired
    private MyClass2 myClass2;

}
