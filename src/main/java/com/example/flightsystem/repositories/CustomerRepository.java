package com.example.flightsystem.repositories;

import com.example.flightsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByCustomerName(String customerName);
    List<Customer> findByCustomerStatus(String customerStatus);
}
