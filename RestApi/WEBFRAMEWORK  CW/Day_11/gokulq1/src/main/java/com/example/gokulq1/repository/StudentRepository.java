package com.example.gokulq1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gokulq1.model.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
    
}