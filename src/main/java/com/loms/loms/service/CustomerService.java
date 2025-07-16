package com.loms.loms.service;

import com.loms.loms.model.Customer;
import com.loms.loms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Get all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Get customer by ID
    public Optional<Customer> getCustomerById(int id) {
        return customerRepository.findById(id);
    }

    // Create or update customer
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Delete customer by ID
//    public void deleteCustomer(int id) {
//        customerRepository.deleteById(id);
//    }

    // Find customer by email
    public Customer getCustomerByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    // Find customers by name
    public List<Customer> getCustomersByName(String name) {
        return customerRepository.findByName(name);
    }
}
