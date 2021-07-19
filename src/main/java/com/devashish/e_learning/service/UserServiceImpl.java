package com.devashish.e_learning.service;

import java.util.Optional;

import com.devashish.e_learning.entity.Course;
import com.devashish.e_learning.entity.Users;
import com.devashish.e_learning.repository.CourseRepository;
import com.devashish.e_learning.repository.UserRepository;
import com.devashish.e_learning.requests.EnrollRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired CourseRepository courseRepository;
    @Override
    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users getUserById(Long id) {
        return userRepository.findByuserid(id).get(0);
    }

    @Override
    public Users enroll(EnrollRequest enrollRequest) {
        Optional<Users> user = userRepository.findById(enrollRequest.getUserid());
        Optional<Course> course = courseRepository.findById(enrollRequest.getCourseid());
        if(user.isPresent() && course.isPresent()){
            user.get().getCourses().add(course.get());
            userRepository.save(user.get());
            return user.get();
        }
        return user.get();
    }
    
}
