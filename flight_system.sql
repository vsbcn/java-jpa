CREATE SCHEMA flight_system;
USE flight_system;

CREATE TABLE customers (	
	id INT NOT NULL AUTO_INCREMENT,
    customer_name VARCHAR(255), 
	customer_status VARCHAR(15),
	total_customer_mileage INT,  
    PRIMARY KEY (id)    
);

CREATE TABLE aircrafts (
	aircraft_type VARCHAR(30),
	aircraft_seats SMALLINT,    
    PRIMARY KEY (aircraft_type)   
);

CREATE TABLE flights (	
	aircraft_type VARCHAR(30),
	flight_number VARCHAR(15),
    flight_mileage SMALLINT,   
    PRIMARY KEY (flight_number),
    FOREIGN KEY (aircraft_type) REFERENCES aircrafts(aircraft_type)    
);