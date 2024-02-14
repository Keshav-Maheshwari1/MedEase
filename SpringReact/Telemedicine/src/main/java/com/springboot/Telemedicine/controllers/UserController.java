package com.springboot.Telemedicine.controllers;


import com.springboot.Telemedicine.entites.User;
import com.springboot.Telemedicine.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Register")
public class UserController {

    // Create a new user
    @Autowired
    UserService userService;

    @PostMapping
    public User create(@RequestBody User user) {
        return userService.add(user);
    }

}
