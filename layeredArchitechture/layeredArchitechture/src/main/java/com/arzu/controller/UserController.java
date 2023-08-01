package com.arzu.controller;

import com.arzu.dto.User;
import com.arzu.servis.UserService;
import com.arzu.servis.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    private UserService userService;

/*
  private UserService userService = new UserServiceImpl();
Interface can hold objects of classes that implement it (polymorphism)
*/

    @GetMapping(path = "/users/{userId}")
    public User getUserById(@PathVariable("userId") Long userId) {
        return userService.getUserById(userId);
    }



}
