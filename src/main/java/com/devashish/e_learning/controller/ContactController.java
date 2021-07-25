package com.devashish.e_learning.controller;

import com.devashish.e_learning.entity.Contact;
import com.devashish.e_learning.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    /*
        -> saveContact (Endpoint: /contact) [PostMapping]
    */
    @Autowired
    private ContactService contactService;

    @PostMapping("contacts/")
    public Contact saveContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);    
    }
}
