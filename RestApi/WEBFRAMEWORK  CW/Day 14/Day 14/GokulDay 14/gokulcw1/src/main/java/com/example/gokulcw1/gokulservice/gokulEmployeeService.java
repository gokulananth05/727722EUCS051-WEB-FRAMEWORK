package com.example.gokulcw1.gokulservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gokulcw1.gokulmodel.gokulEmployee;
import com.example.gokulcw1.gokulrepository.gokulEmployeeRepo;

@Service

public class gokulEmployeeService {
    @Autowired
    gokulEmployeeRepo employeeRepo;

    public gokulEmployee addEmployee(gokulEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<gokulEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<gokulEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
