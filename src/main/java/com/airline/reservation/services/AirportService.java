package com.airline.reservation.services;

import org.springframework.data.domain.Page;

import com.airline.reservation.model.Aircraft;
import com.airline.reservation.model.Airport;

import java.util.List;

public interface AirportService {
    public abstract Page<Airport> getAllAirportsPaged(int pageNum);
    public abstract List<Airport> getAllAirports();
    public abstract Airport getAirportById(Integer airportId);
    public abstract Airport saveAirport(Airport airport);
    public abstract void deleteAirport(Integer airpportId);
}
