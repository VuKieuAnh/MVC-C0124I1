package org.example.demo.service;

import org.example.demo.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void createCustomer(Customer customer);
}
