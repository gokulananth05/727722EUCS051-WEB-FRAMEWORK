package com.example.gokulcw1.gokulservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gokulcw1.gokulmodel.gokulPayroll;
import com.example.gokulcw1.gokulrepository.gokulPayrollRepo;

@Service
public class gokulPayrollService {
    @Autowired
    gokulPayrollRepo payrollRepo;

    public gokulPayroll addPayroll(Long id,gokulPayroll payroll)
    {
        gokulPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else
        return null;
    }

    public Optional<gokulPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
