package com.example.flightsystem.repositories;

import com.example.flightsystem.models.Customer;
import com.example.flightsystem.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, String> {
    List<Flight> findByFlightNumber(String flightNumber);
    List<Flight> findByFlightMileageGreaterThan(short flightMileage);
}
