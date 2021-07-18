package com.devashish.e_learning.repository;

import java.util.List;

import com.devashish.e_learning.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long>{
    // public List<Users> findByuser_id(Long id);
    List<Users> findByname(String name);
    List<Users> findByphone(String phone);
    List<Users> findByuserid(Long id);
}
