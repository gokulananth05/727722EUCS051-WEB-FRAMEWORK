package com.example.gokulcw1.gokulmodel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Table(name = "employee")
@Transactional
public class gokulEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long employeeId;
    String employeeName;
    int age;
    Long mobile;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payrollId")
    gokulPayroll payroll;
    
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public gokulPayroll getPayroll() {
        return payroll;
    }

    public void setPayroll(gokulPayroll payroll) {
        this.payroll = payroll;
    }

}
