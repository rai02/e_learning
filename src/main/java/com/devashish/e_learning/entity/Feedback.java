package com.devashish.e_learning.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "Feedback")
public class Feedback {
    /*
        FeedbackId Long
        name String
        email String
        userID Long
        feedback String
    */
    @Id
    private Long feedback_id;

    private String name;

    private String email;

    private Long userId;

    private String feedback;

}
