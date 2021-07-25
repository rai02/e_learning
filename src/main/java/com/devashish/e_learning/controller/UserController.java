package com.devashish.e_learning.controller;

import java.util.List;

import com.devashish.e_learning.entity.Contact;
import com.devashish.e_learning.entity.Users;
import com.devashish.e_learning.requests.EnrollRequest;
import com.devashish.e_learning.service.ContactService;
import com.devashish.e_learning.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
    /*
        -> saveUser (Endpoint: /elearning) [PostMapping]
    */
    
    @Autowired
    private UserService userService;

    @Autowired
    private ContactService contactService; 
    
    @PostMapping("/users")
    public Users saveUser(@RequestBody Users user){
        return userService.saveUser(user);
    }

    @GetMapping("/users/{id}")
    public Users getUserById(@PathVariable Long id ){
        return userService.getUserById(id);
    }

    @PutMapping("/users/enroll/")
    public Users enroll(@RequestBody EnrollRequest enrollRequest){
        return userService.enroll(enrollRequest);
    }

    @GetMapping("/users/contacts/{id}")
    public List<Contact> getContacts(@PathVariable Long id) {
        return contactService.getContacts(id);
    }
    

}
