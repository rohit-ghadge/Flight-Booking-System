package com.airline.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airline.reservation.model.Aircraft;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {
}
