package com.devashish.e_learning.repository;

import com.devashish.e_learning.entity.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
