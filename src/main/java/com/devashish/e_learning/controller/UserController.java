package com.devashish.e_learning.controller;

import com.devashish.e_learning.entity.Users;
import com.devashish.e_learning.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    /*
        -> saveUser (Endpoint: /elearning) [PostMapping]
    */
    
    @Autowired
    private UserService userService;
    
    @PostMapping("/users")
    public Users saveUser(@RequestBody Users user){
        return userService.saveUser(user);
    }

    @GetMapping("/users/{id}")
    public Users getUserById(@PathVariable Long id ){
        return userService.getUserById(id);
    }

}
