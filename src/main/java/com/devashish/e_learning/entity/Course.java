package com.devashish.e_learning.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Course")
public class Course {
    @Id    
    private Long course_id;

    private Long course_fee;

    private String course_resources;

    private String course_desc;

    private String course_name;

}
