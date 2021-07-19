package com.devashish.e_learning.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

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
    private Long courseid;

    private Long course_fee;

    private String course_resources;

    private String course_desc;

    private String course_name;

    // @ManyToOne(
    //     fetch = FetchType.LAZY,
    //     cascade = CascadeType.ALL
    // )
    // private Users users;
}
