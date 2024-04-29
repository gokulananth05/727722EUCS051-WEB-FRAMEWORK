package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.GokulEmployee;
import com.example.ce1.service.DpakEmployeeService;

@RestController
public class GokulEmployeeController {
    @Autowired
    DpakEmployeeService employeeService;

    @PostMapping("/employee")
    public GokulEmployee setMethod(@RequestBody GokulEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<GokulEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<GokulEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
