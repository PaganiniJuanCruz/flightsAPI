package controller;

import entitys.Passengers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apivuelos")
public class passengersController {
    @Autowired
    private passengersService passengersService;

    @GetMapping("/passengers")
    List<Passengers> getPassengers(){
        return passengersService.findAll();
    }

    @GetMapping("/passengers/{id}")
    Optional<Passengers> getPassenger(int id){
        return passengersService.findById((long) id);
    }

    @PostMapping("/passengers")
    Passengers postPassenger(Passengers passenger){
        return passengersService.save(passenger);
    }
}
