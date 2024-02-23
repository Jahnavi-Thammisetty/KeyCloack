package com.ty.controller;

import com.ty.model.Employee;
import com.ty.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/saveEmployees")
    @RolesAllowed("daughter")
    public Employee saveEmployee(@RequestBody Employee employee)
    {

        return  employeeService.saveEmployee(employee);
    }
    @GetMapping("/getEmployee")
    @RolesAllowed("daughter")
    public Employee getEmployeeById(@RequestParam String id)
    {
        return employeeService.getEmployeeById(id);
    }
@GetMapping("/getEmployees")
@RolesAllowed("daughter")
    public List<Employee> getEmployees()
    {
        return employeeService.getEmployees();
    }

    @DeleteMapping("/deleteEmployeeById")
    @RolesAllowed("daughter")
    public String deleteEmployee(@RequestParam String id)
    {
      return employeeService.deleteEmployee(id);
    }
}
