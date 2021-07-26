package com.devashish.e_learning.service;

import java.util.List;

import com.devashish.e_learning.entity.Users;
import com.devashish.e_learning.requests.EnrollRequest;


public interface UserService {

    Users saveUser(Users user);

    Users getUserById(Long id);

    Users enroll(EnrollRequest enrollRequest);

    List<Users> getAllUsers();



}
