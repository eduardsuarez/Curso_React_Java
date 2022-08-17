package com.Java_React.Java_React.services;


import com.Java_React.Java_React.entities.Supplier;

import java.util.List;

public interface ISupplierService {

    List<Supplier> getAll();

    Supplier getById(Long id);
    void remove(Long id);
    void save(Supplier supplier);
}
