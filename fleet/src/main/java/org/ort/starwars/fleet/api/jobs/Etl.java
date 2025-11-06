package org.ort.starwars.fleet.api.jobs;

import org.ort.starwars.fleet.api.repositories.StaffRepository;
import org.ort.starwars.fleet.api.repositories.StarshipRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;

import jakarta.annotation.PostConstruct;

public class Etl implements Runnable {
    
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Etl.class);

    @Autowired
    private StarshipRepository repository;
    @Autowired
    private StaffRepository swapi;

    @PostConstruct
    @Scheduled(fixedRate = 36000000)
    @Transactional

    public void run() {
        // ETL job implementation goes here
    }
    
}
