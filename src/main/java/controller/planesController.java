package controller;


import entitys.Planes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/apivuelos")
public class planesController {
    @Autowired
    private planesService planesService;

    @GetMapping("/planes")
    List<Planes> getPlanes(){
        return (List<Planes>) planesService.findAll();
    }

    @GetMapping("/planes/{id}")
    Optional<Planes> getPlane(int id){
        return planesService.findById((long) id);
    }

    @PostMapping("/planes")
    Planes postPlanes(@RequestBody Planes plane){
        return planesService.save(Plane);
    }
}