package com.devashish.e_learning.service;

import com.devashish.e_learning.entity.Feedback;
import com.devashish.e_learning.repository.FeedbackRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceimpl implements FeedbackService{

    @Autowired
    private FeedbackRepository feedbackRepository;
    @Override
    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }
    
}
