package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.GokulEmployee;
import com.example.ce1.repository.GokulEmployeeRepo;

@Service
public class DpakEmployeeService {
    @Autowired
    GokulEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public GokulEmployee setEmployee(GokulEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<GokulEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<GokulEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
