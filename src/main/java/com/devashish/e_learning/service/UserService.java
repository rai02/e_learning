package com.devashish.e_learning.service;

import com.devashish.e_learning.entity.Users;


public interface UserService {

    Users saveUser(Users user);

    Users getUserById(Long id);

}
