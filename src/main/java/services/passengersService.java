package services;

import entitys.Passengers;

import java.util.List;
import java.util.Optional;

public interface passengersService {
    List<Passengers> getPassengers();
    Optional<Passengers> getPassenger(int Passenger);
    Passengers postPassenger(Passengers passenger);
}
