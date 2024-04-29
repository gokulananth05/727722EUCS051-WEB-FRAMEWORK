package com.example.gokulcw1.gokulcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gokulcw1.gokulmodel.gokulEmployee;
import com.example.gokulcw1.gokulservice.gokulEmployeeService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@Tag(name = "employee controller", description = "emp controller spin")
public class gokulEmployeeController {
    @Autowired
    gokulEmployeeService employeeService;

    @PostMapping("/employee")
    public gokulEmployee addEmployee(@RequestBody gokulEmployee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employee")
    public List<gokulEmployee> getMethodName() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{employeeId}")
    public Optional<gokulEmployee> getMethodName(@PathVariable Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }
    
}
