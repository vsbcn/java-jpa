package com.example.flightsystem.repositories;

import com.example.flightsystem.models.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;
    private Customer customer1;
    private Customer customer2;
    private Customer customer3;

    @BeforeEach
    void setUp() {
        customer1 = customerRepository.save(new Customer("Ivan", "Silver", 200000));
        customer2 = customerRepository.save(new Customer("Gus", "Gold", 300000));
        customer3 = customerRepository.save(new Customer("Evelyn", "None", 100000));
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void testFindAll() {
        List<Customer> customerList = customerRepository.findAll();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Test
    void testFindByName() {
        List<Customer> customerList = customerRepository.findByCustomerName("Gus");

        assertEquals(1, customerList.size());
        assertEquals("Gold", customerList.get(0).getCustomerStatus());

    }
    @Test
    void testFindByStatus() {
        List<Customer> customerList = customerRepository.findByCustomerStatus("None");

        assertEquals(1, customerList.size());
        assertEquals("None", customerList.get(0).getCustomerStatus());

    }
}