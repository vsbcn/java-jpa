package com.example.flightsystem.repositories;

import com.example.flightsystem.models.Aircraft;
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
    class AircraftRepositoryTest {
        @Autowired
        private AircraftRepository aircraftRepository;
        private Aircraft aircraft1;
        private Aircraft aircraft2;
        private Aircraft aircraft3;

        @BeforeEach
        void setUp() {
            aircraft1 = aircraftRepository.save(new Aircraft("Boeing 747", (short) 470));
            aircraft2 = aircraftRepository.save(new Aircraft("Airbus", (short) 520));
            aircraft3 = aircraftRepository.save(new Aircraft("Boeing 777", (short) 600));
        }

        @AfterEach
        void tearDown() {
        // Aircraft for flights needed.
        }

        @Test
        void testFindAll() {
            List<Aircraft> aircraftList = aircraftRepository.findAll();
            for (Aircraft aircraft : aircraftList) {
                System.out.println(aircraft);
            }
        }
        @Test
        void findByAircraftTypeContaining() {
            List<Aircraft> aircraftList = aircraftRepository.findByAircraftTypeContaining("Boeing 7");

            assertEquals(2, aircraftList.size());
            assertEquals("Boeing 747", aircraftList.get(0).getAircraftType());
        }
    }
