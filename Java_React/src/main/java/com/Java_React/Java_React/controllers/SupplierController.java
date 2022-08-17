package com.Java_React.Java_React.controllers;


import com.Java_React.Java_React.entities.Supplier;

import com.Java_React.Java_React.services.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {
    @Autowired
    private ISupplierService service;

    @GetMapping("/api/suppliers")
    public List<Supplier> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/supplier/{id}")
    public Supplier getById(@PathVariable("id") String id) {

        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/deleteSupl/{id}")
    public void remove(@PathVariable("id") String id) {
        service.remove(Long.parseLong(id));
    }

    @PostMapping("/api/saveSupl")
    public void save(@RequestBody Supplier supplier) {
        service.save(supplier);

    }
}
