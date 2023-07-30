package com.arzu.controller;

import com.arzu.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @PostMapping("users")
    public User saveUser(@RequestBody User user) {
        System.out.println("User saved!");
        return user;
    }

    @PostMapping("users-all")
    public List<User> saveAllUser(@RequestBody List<User> users) {
        System.out.println("All users saved!");

        users.forEach(user -> user.setPassword(""));
        return users;
    }

    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader) {
        return "Your header is : " + myHeader;
    }


}
