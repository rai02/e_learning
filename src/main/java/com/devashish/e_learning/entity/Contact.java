package com.devashish.e_learning.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Contact")
public class Contact {
    /*
        contact_id Long
        user_id Long
        name String
        email String
        phone String
        message String
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contact_id;

    // @ManyToOne(
    //     cascade = CascadeType.ALL
    // )
    // @JoinColumn(
    //     name = "userid",
    //     referencedColumnName = "userid"
    // )
    // private Users user;

    private Long userid;

    private String name;

    private String email;

    private String phone;

    private String message;



}
