package com.devashish.e_learning.service;

import java.util.List;

import com.devashish.e_learning.entity.Contact;
import com.devashish.e_learning.repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getContacts(Long id) {
        return contactRepository.findByUserid(id);
    }
    
}
