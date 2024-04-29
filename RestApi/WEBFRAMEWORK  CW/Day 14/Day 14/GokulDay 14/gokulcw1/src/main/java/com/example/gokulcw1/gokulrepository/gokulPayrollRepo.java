package com.example.gokulcw1.gokulrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gokulcw1.gokulmodel.gokulPayroll;

@Repository
public interface gokulPayrollRepo extends JpaRepository<gokulPayroll,Long> {
    
}
