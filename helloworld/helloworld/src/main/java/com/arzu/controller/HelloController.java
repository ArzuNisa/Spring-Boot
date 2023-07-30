package com.arzu.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    //  

//@GetMapping(path = "/hello")
@RequestMapping(path = "/hello" , method = RequestMethod.GET) //no difference with the default code above, the above is preferred for readability
    public String sayHello(){
        return "Hello World!";
    }

@PostMapping("/save")
public String save(){
    return "Data saved!";
}

@DeleteMapping("/delete")
public String delete(){
    return "Data deleted!";
}


}
