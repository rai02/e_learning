package com.devashish.e_learning.service;

import com.devashish.e_learning.entity.Users;
import com.devashish.e_learning.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users getUserById(Long id) {
        return userRepository.findByuserid(id).get(0);
    }
    
}
