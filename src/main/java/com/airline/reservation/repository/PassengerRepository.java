package com.airline.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airline.reservation.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
