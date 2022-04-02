package com.airline.reservation.services;

import org.springframework.data.domain.Page;

import com.airline.reservation.model.Aircraft;

import java.util.List;

public interface AircraftService {
    public abstract Page<Aircraft> getAllAircraftsPaged(int pageNum);
    public abstract List<Aircraft> getAllAircrafts();
    public abstract Aircraft getAircraftById(Long aircraftId);
    public abstract Aircraft saveAircraft(Aircraft aircraft);
    public abstract void deleteAircraftById(Long aircraftId);
}
