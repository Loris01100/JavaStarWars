package org.ort.starwars.fleet.infra.repositories;

import org.ort.starwars.fleet.domain.models.entities.Mission;
import org.ort.starwars.fleet.domain.ports.in.IMissionPort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends CrudRepository<Mission, Long>, IMissionPort {
}