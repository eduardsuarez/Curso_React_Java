package com.Java_React.Java_React.controllers;

import com.Java_React.Java_React.entities.Employee;
import com.Java_React.Java_React.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService service;

    @GetMapping("/api/employees")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/employee/{id}")
    public Employee getById(@PathVariable("id") String id) {

        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/deleteEmpl/{id}")
    public void remove(@PathVariable("id") String id) {
        service.remove(Long.parseLong(id));
    }

    @PostMapping("/api/saveEmpl")
    public void save(@RequestBody Employee employee) {
        service.save(employee);

    }
}
