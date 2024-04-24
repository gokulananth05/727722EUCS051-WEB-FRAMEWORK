package com.example.gokulq1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gokulq1.model.Person;
import com.example.gokulq1.repository.PersonRepo;

@Service
public class PersonService {
    
    @Autowired
    public PersonRepo personRepo;

    public List<Person> getData(){
        return personRepo.findAll();
    }    
    public List<Person> getDataByAge(int age){
        return personRepo.findByStudentAge(age);
    }    
    public Person postData(Person p){
        return personRepo.save(p);
    }

}
