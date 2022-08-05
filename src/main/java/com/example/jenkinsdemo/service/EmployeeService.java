package com.example.jenkinsdemo.service;

import com.example.jenkinsdemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void insertEmployee(Employee employee);
}
