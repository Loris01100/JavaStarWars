package org.ort.starwars.fleet.infra.controllers;

import org.ort.starwars.fleet.application.jobs.Etl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarshipController {
    private final Etl etl;
    
    public StarshipController(Etl etl) {
        this.etl = etl;
    }
    
    @GetMapping("/import-starships")
    public String importStarships() {
        etl.run();
        return "Import terminé !";
    }
}
