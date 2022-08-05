package com.example.jenkinsdemo.dao;

import com.example.jenkinsdemo.model.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();
    void insertEmployee(Employee employee);
}
