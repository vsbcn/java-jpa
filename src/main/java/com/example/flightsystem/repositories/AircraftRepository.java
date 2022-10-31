package com.example.flightsystem.repositories;

import com.example.flightsystem.models.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AircraftRepository extends JpaRepository<Aircraft, String> {
    List<Aircraft> findByAircraftTypeContaining(String aircraftType);
}
