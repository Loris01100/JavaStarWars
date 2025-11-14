package org.ort.starwars.fleet.infra.repositories;

import org.ort.starwars.fleet.domain.models.entities.Staff;
import org.ort.starwars.fleet.domain.ports.in.IStaffPort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends CrudRepository<Staff, Long>, IStaffPort {
	
}
