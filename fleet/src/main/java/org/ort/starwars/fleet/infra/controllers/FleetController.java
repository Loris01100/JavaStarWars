package org.ort.starwars.fleet.infra.controllers;

import java.util.List;

import org.ort.starwars.fleet.domain.models.entities.Mission;
import org.ort.starwars.fleet.domain.models.entities.Starship;
import org.ort.starwars.fleet.domain.services.FleetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class FleetController {
    
    
    @Autowired
    private FleetService fleetService;

    @PostMapping("/fleet")
    public Mission post(@RequestBody @NonNull Mission mission) {
        return fleetService.forMission(mission);
    }

    @GetMapping("/fleet/starships")
    public List<Starship> getAllStarships() {
        return fleetService.getAllStarships();
    }
}