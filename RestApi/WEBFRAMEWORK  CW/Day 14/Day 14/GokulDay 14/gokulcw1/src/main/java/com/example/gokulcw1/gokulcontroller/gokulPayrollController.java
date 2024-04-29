package com.example.gokulcw1.gokulcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.gokulcw1.gokulmodel.gokulPayroll;
import com.example.gokulcw1.gokulservice.gokulPayrollService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class gokulPayrollController {
    @Autowired
    gokulPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public gokulPayroll addPayroll(@PathVariable Long employeeId,@RequestBody gokulPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<gokulPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
