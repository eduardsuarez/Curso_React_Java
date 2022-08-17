package com.Java_React.Java_React.services;

import com.Java_React.Java_React.entities.Customer;
import com.Java_React.Java_React.entities.Employee;
import com.Java_React.Java_React.entities.Supplier;
import com.Java_React.Java_React.repository.CustomerRepository;
import com.Java_React.Java_React.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class SupplierService implements ISupplierService {

    @Autowired
    private SupplierRepository repository;

    @Override
    public List<Supplier> getAll(){

        return (List<Supplier>) repository.findAll();

    }

    @Override
    public Supplier getById(Long id) {
        return (Supplier) repository.findById(id).get();
    }

    @Override
    public void remove(@PathVariable("id") Long id){
        repository.deleteById(id);
    }

    @Override
    public void save(Supplier supplier){
        repository.save(supplier);
    }
}
