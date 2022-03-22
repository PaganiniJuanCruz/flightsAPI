package controller;

import entitys.Flights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apivuelos")
public class flightsController {
    @Autowired
    private flightsService flightsService;

    @GetMapping("/flights")
    List<Flights> getFlights(){
        return (List<Flights>) flightsService.findAll();
    }

    @PostMapping("/flights")
    List<Flights> postFlights(Flights flight){
        return (List<Flights>) flightsService.save(flight);
    }

    @GetMapping("/flights/{id}")
    Optional<Flights> getFlight(int id){
        return flightsService.findById((long) id);
    }
}
