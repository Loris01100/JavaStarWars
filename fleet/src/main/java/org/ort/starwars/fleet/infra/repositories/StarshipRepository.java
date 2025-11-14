package org.ort.starwars.fleet.infra.repositories;

import org.ort.starwars.fleet.domain.models.entities.Starship;
import org.ort.starwars.fleet.domain.ports.in.IStarshipPort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarshipRepository extends CrudRepository<Starship, Long>, IStarshipPort {
}
