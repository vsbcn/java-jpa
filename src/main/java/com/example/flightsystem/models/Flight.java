package com.example.flightsystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @Column(name ="flight_number")
    private String flightNumber;
    @Column(name ="aircraft_type")
    private String aircraftType;
    @Column(name ="flight_mileage")
    private short flightMileage;

    public Flight() {
    }

    public Flight(String flightNumber, String aircraftType, short flightMileage) {
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.flightMileage = flightMileage;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public short getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(short flightMileage) {
        this.flightMileage = flightMileage;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", flightMileage=" + flightMileage +
                '}';
    }
}
