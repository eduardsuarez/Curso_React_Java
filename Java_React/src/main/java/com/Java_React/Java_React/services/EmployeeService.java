package com.Java_React.Java_React.services;

import com.Java_React.Java_React.entities.Employee;

import com.Java_React.Java_React.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getAll(){

        return (List<Employee>) repository.findAll();

    }

    @Override
    public Employee getById(Long id) {
        return (Employee) repository.findById(id).get();
    }

    @Override
    public void remove(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

    @Override
    public void save(Employee employee){
        repository.save(employee);
    }
}
