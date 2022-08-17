package com.Java_React.Java_React.services;

import com.Java_React.Java_React.entities.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> getAll();

    Customer getById(Long id);
    void remove(Long id);
    void save(Customer customer);
}
