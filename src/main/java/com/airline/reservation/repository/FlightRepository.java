package com.airline.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline.reservation.model.Airport;
import com.airline.reservation.model.Flight;
import com.airline.reservation.model.Passenger;

import java.time.LocalDate;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findAllByDepartureAirportEqualsAndDestinationAirportEqualsAndDepartureDateEquals(Airport depAirport, Airport destAirport, LocalDate depDate);

}
