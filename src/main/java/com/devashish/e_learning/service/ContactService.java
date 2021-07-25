package com.devashish.e_learning.service;

import java.util.List;

import com.devashish.e_learning.entity.Contact;

public interface ContactService {

    Contact saveContact(Contact contact);

    List<Contact> getContacts(Long id);
    
}
