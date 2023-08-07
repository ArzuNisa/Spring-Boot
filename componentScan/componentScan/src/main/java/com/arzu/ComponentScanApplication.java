package com.arzu;

import com.branch.MyComponent;
import com.branch.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com")
@ComponentScan(basePackageClasses = MyComponent.class)
public class ComponentScanApplication {

	@Autowired
	private MyComponent myComponent;

	@Autowired
	private MyService myService;

	public static void main(String[] args) {
		SpringApplication.run(ComponentScanApplication.class, args);
	}

}
