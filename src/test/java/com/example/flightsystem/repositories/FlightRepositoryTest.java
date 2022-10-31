package com.example.flightsystem.repositories;

import com.example.flightsystem.models.Customer;
import com.example.flightsystem.models.Flight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FlightRepositoryTest {
    @Autowired
    private FlightRepository flightRepository;
    private Flight flight1;
    private Flight flight2;
    private Flight flight3;

    @BeforeEach
    void setUp() {
        flight1 = flightRepository.save(new Flight("DL143","Boeing 747", (short) 2078));
        flight2 = flightRepository.save(new Flight("DL222","Airbus", (short) 1500));
        flight3 = flightRepository.save(new Flight("DL37","Boeing 777", (short) 2500));
    }

    @AfterEach
    void tearDown() {
        flightRepository.deleteAll();
    }

    @Test
    void testFindAll() {
        List<Flight> flightList = flightRepository.findAll();
        for (Flight flight : flightList) {
            System.out.println(flight);
        }
    }

    @Test
    void testFindByFlightNumber() {
        List<Flight> flightList = flightRepository.findByFlightNumber("DL222");

        assertEquals(1, flightList.size());
        assertEquals("DL222", flightList.get(0).getFlightNumber());
    }

    @Test
    void findByFlightMileageGreaterThan() {
        List<Flight> flightList2 = flightRepository.findByFlightMileageGreaterThan((short) 1500);

        assertEquals(2, flightList2.size());
        assertEquals((short) 2078, flightList2.get(0).getFlightMileage());
        assertEquals((short) 2500, flightList2.get(1).getFlightMileage());
    }
}