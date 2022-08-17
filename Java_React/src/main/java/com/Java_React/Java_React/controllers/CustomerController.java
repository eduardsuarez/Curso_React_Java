package com.Java_React.Java_React.controllers;


import com.Java_React.Java_React.entities.Customer;
import com.Java_React.Java_React.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @GetMapping("/api/customers")
    public List<Customer> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/customer/{id}")
    public Customer getById(@PathVariable("id") String id) {
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/delete/{id}")
    public void remove(@PathVariable("id") String id){
        service.remove(Long.parseLong(id));
    }

    @PostMapping("/api/save")
    public void save(@RequestBody Customer customer){
        service.save(customer);

    }
}
