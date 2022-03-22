package services;

import entitys.Flights;

import java.util.List;
import java.util.Optional;

public interface flightsService {
    List<Flights> getFlights();
    Optional<Flights> getFlight(int id);
    List<Flights> postFlights(Flights flight);
}