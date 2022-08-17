package com.Java_React.Java_React.services;

import com.Java_React.Java_React.entities.Customer;
import com.Java_React.Java_React.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> getAll(){

        return (List<Customer>) repository.findAll();

    }

    @Override
    public Customer getById(Long id) {
        return (Customer) repository.findById(id).get();
    }

    @Override
    public void remove(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

    @Override
    public void save(Customer customer){
        repository.save(customer);
    }
}
