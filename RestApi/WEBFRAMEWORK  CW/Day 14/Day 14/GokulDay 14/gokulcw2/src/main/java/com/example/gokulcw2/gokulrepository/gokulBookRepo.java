package com.example.gokulcw2.gokulrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gokulcw2.gokulmodel.gokulBook;

@Repository
public interface gokulBookRepo extends JpaRepository<gokulBook,Integer> {
    
}
