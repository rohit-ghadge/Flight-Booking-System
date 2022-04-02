package com.airline.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airline.reservation.model.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
}
