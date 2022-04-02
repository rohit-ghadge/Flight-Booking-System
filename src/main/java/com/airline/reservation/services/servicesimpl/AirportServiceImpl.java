package com.airline.reservation.services.servicesimpl;

import com.airline.reservation.model.Airport;
import com.airline.reservation.repository.AirportRepository;
import com.airline.reservation.services.AirportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportService {

    private AirportRepository airportRepository;

    @Autowired
    public AirportServiceImpl(AirportRepository airportRepository){
        this.airportRepository = airportRepository;
    }

    @Override
    public Page<Airport> getAllAirportsPaged(int pageNum) {
        return airportRepository.findAll(PageRequest.of(pageNum,5, Sort.by("airportName")));
    }

    @Override
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    @Override
    public Airport getAirportById(Integer airportId) {
        return airportRepository.findById(airportId).orElse(null);
    }

    @Override
    public Airport saveAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public void deleteAirport(Integer airportId) {
        airportRepository.deleteById(airportId);
    }
}
