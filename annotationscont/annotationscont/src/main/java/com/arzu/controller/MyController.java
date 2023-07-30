package com.arzu.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    //localhost:8080/api/message1/it is my message
    @GetMapping({"/message1","/message1/{m}"})
    public String getMyMassage(@PathVariable(value = "m", required = false) String message) {
        return "Your message is : " + message;
    }


    //localhost:8080/api/message2?m=it is my massage
    @GetMapping(path = "/message2")
    public String getMyMessage(@RequestParam(value = "m", required = false, defaultValue = "my default message") String message) {
        return "Your message is : " + message;
    }

}
