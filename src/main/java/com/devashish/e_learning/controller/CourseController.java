package com.devashish.e_learning.controller;

import java.util.List;

import com.devashish.e_learning.entity.Course;
import com.devashish.e_learning.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping("/course")
    public Course saveCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @GetMapping("/course")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    
}
