package com.example.leoq2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.leoq2.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
