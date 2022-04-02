package com.airline.reservation.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Aircraft {
    @Id
    @GeneratedValue
    private long aircraftId;
    private String manufacturer;
    private String model;
    private Integer numberOfSeats;


    @OneToMany(mappedBy = "aircraft")
    private List<Flight> flights = new ArrayList<>();
}
