package services;

import entitys.Planes;
import entitys.Passengers;

import java.util.List;
import java.util.Optional;

public interface planesService {
    List<Planes> getPlanes();
    Optional<Planes> getPlanes(int id);
    Optional<Planes> getPassengers(int id);
    List<Planes> postPlanes(Planes planes);
}
