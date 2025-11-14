package org.ort.starwars.fleet.domain.ports.in;

import java.util.Optional;

import org.ort.starwars.fleet.domain.models.entities.Mission;

public interface IMissionPort {

    Iterable<Mission> findAll();

    Optional<Mission> findById(Long id);

    Mission save(Mission mission);
    
}
