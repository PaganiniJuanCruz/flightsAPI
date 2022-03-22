package repository;

import entitys.Flights;
import org.springframework.data.jpa.repository.JpaRepository;

public interface flightsRepository extends JpaRepository<Flights, Long> {
}
