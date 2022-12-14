package com.Java_React.Java_React.services;

import com.Java_React.Java_React.entities.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getAll();

    Employee getById(Long id);
    void remove(Long id);
    void save(Employee employee);
}
