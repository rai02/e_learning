package com.devashish.e_learning.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "`USERS`",
    uniqueConstraints = @UniqueConstraint(
        name = "unique emailID",
        columnNames = "email"
    ) 
)

public class Users {
    /*
    user_id [Long]
    name [String]
    reg_date [Date]
    address [String]
    password [String]
    email [String]
    phone [String]
    upload_photo [String]
    */

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(
        name = "userid",
        initialValue = 100,
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "userid"
    )
    private Long userid;
    
    private String name;
    
    private Date reg_date;

    private String address;
    
    private String password;
    
    @Column(nullable = false)
    private String email;
    
    private String phone;
    
    private String upload_photo;

    @OneToMany(
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL
    )
    @JoinTable(
        name = "enroll"
    )
    // @JoinTable(
    //     name = "user_course",
    //     joinColumns = {@JoinColumn(name = "userid")},
    //     inverseJoinColumns = {@JoinColumn(name="courseid")}
    // )
    private List<Course> courses;

    
}
