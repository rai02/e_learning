package com.devashish.e_learning.repository;

import com.devashish.e_learning.entity.Feedback;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback,Long>{
    
}
