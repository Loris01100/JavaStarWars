package org.ort.starwars.fleet.api.repositories;

import org.ort.starwars.fleet.api.models.entities.Mission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends CrudRepository<Mission, Long> {
}