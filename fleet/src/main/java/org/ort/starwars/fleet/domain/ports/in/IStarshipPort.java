package org.ort.starwars.fleet.domain.ports.in;

import java.util.Optional;

import org.ort.starwars.fleet.domain.models.entities.Starship;

public interface IStarshipPort {
    Iterable<Starship> findAll();

    Optional<Starship> findById(Long id);

    Starship save(Starship starship);

    void deleteById(Long id);
}
