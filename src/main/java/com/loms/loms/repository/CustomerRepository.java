package com.loms.loms.repository;

import com.loms.loms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // You can define custom query methods here if needed

    // Example: Find customer by email
    Customer findByEmail(String email);

    // Example: Find customers by name
    List<Customer> findByName(String name);
}
