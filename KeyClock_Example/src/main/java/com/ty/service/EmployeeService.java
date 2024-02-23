package com.ty.service;

import com.ty.model.Employee;
import com.ty.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee saveEmployee(Employee employee)
    {
       return employeeRepo.save(employee);
    }
    public Employee getEmployeeById(String id)
    {
        Optional<Employee> opt=employeeRepo.findById(id);
        if(opt!=null)
        {
            Employee employee=opt.get();
            return employee;
        }
        else return null;
    }

    public List<Employee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public String deleteEmployee(String id)
    {
        Optional<Employee> opt=employeeRepo.findById(id);
        if(opt!=null)
        {
            Employee employee=opt.get();
            employeeRepo.delete(employee);
            return "deleted";
        }
        else return "No data Found Of particular id";

    }
}
