package org.ort.starwars.fleet.api.jobs;

import org.ort.starwars.fleet.api.gateways.SwapiService;
import org.ort.starwars.fleet.api.gateways.dtos.SwapiPageDto;
import org.ort.starwars.fleet.api.models.entities.Starship;
import org.ort.starwars.fleet.api.models.enums.StarshipType;
import org.ort.starwars.fleet.api.repositories.StarshipRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Etl implements Runnable {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Etl.class);
    
    private final StarshipRepository repository;
    private final SwapiService swapiService;
    
    public Etl(StarshipRepository repository, SwapiService swapiService) {
        this.repository = repository;
        this.swapiService = swapiService;
    }
    
    //Permet l'import des vaisseaux depuis l'API SWAPI

    public void run() {
        LOGGER.info("Import des vaisseaux...");
        
        SwapiPageDto page = swapiService.getStarships();
        
        page.getResults()
            .stream()
            .map(dto -> Starship.builder()
                .name(dto.getName())
                .category(StarshipType.FIGHTER)
                .length(parseInt(dto.getLength()))
                .crew(parseInt(dto.getCrew()))
                .passengers(parseInt(dto.getPassengers()))
                .count(1)
                .build())
            .forEach(repository::save);
        
        LOGGER.info("Import terminé");
    }
    
    //permet de gérer les expressions
    private int parseInt(String value) {
        try {
            return Integer.parseInt(value.replace(",", ""));
        } catch (Exception e) {
            return 0;
        }
    }
}