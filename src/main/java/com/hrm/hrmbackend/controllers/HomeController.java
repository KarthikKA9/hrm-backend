package com.hrm.hrmbackend.controllers;

import com.hrm.hrmbackend.models.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    List<Employee> employeeList = new ArrayList<>();
    @GetMapping("/")
    public String helloWorld()
    {
        return "<h1>Welcome to My World xyz</h1>";
    }
    @GetMapping("/getEmployees")
    public List<Employee> getEmployees()
    {
        return employeeList;
    }
    @PostMapping("/addEmployee")
    public List<Employee> addEmployee()
    {
        employeeList.add(new Employee("Ram", 123, "Male", 99000));
        employeeList.add(new Employee("Sita", 234, "Female", 150000));
        return employeeList;
    }
}
