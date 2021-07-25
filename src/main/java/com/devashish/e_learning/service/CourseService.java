package com.devashish.e_learning.service;

import java.util.List;

import com.devashish.e_learning.entity.Course;

public interface CourseService {

    Course saveCourse(Course course);

    List<Course> getCourses();
    
}
