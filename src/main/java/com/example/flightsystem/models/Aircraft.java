package com.example.flightsystem.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aircrafts")
public class Aircraft {
    @Id
    @Column (name = "aircraft_type")
    private String aircraftType;
    @Column (name = "aircraft_seats")
    private short aircraftSeats;

    public Aircraft() {
    }

    public Aircraft(String aircraftType, short aircraftSeats) {
        this.aircraftType = aircraftType;
        this.aircraftSeats = aircraftSeats;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public short getAircraftSeats() {
        return aircraftSeats;
    }

    public void setAircraftSeats(short aircraftSeats) {
        this.aircraftSeats = aircraftSeats;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftType='" + aircraftType + '\'' +
                ", aircraftSeats=" + aircraftSeats +
                '}';
    }
}
