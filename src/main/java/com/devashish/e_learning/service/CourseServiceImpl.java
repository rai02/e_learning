package com.devashish.e_learning.service;

import java.util.List;

import com.devashish.e_learning.entity.Course;
import com.devashish.e_learning.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;


    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }


    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }
    
}
