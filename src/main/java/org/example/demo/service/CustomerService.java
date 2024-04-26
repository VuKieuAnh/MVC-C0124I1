package org.example.demo.service;

import org.example.demo.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer("Khoa", "2001", "Ha Noi"));
        customerList.add(new Customer("Khoa2", "2001", "Ha Noi"));
        customerList.add(new Customer("Khoa3", "2001", "Ha Noi"));
        customerList.add(new Customer("Khoa4", "2001", "Ha Noi"));
    }

    public List<Customer> findAll(){
        return customerList;
    }

    public void createCustomer(Customer customer){
        //them customer vao ds
        customerList.add(customer);
    }
}
