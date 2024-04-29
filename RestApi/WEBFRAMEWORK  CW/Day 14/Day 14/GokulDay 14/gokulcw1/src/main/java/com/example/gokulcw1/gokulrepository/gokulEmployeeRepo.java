package com.example.gokulcw1.gokulrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.denicw1.gokulmodel.gokulEmployee;


@Repository
public interface gokulEmployeeRepo extends JpaRepository<gokulEmployee,Long> {
}
