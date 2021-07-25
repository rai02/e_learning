package com.devashish.e_learning.repository;

import java.util.List;

import com.devashish.e_learning.entity.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long>{
    List<Contact> findByUserid(Long userid);
}
