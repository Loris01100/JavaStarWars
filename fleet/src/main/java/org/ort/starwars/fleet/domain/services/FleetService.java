package org.ort.starwars.fleet.domain.services;

import org.ort.starwars.fleet.domain.models.entities.Mission;
import org.ort.starwars.fleet.domain.models.entities.Starship;
import org.ort.starwars.fleet.domain.repositories.MissionRepository;
import org.ort.starwars.fleet.domain.repositories.StarshipRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class FleetService {
    
    private final StarshipRepository starshipRepository;
    private final MissionRepository missionRepository;
    
    public FleetService(StarshipRepository starshipRepository, MissionRepository missionRepository) {
        this.starshipRepository = starshipRepository;
        this.missionRepository = missionRepository;
    }
    
    // Méthodes pour les Starships
    public List<Starship> getAllStarships() {
        Iterable<Starship> iterable = starshipRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
    }
    
    public Starship getStarshipById(@NonNull Long id) {
        return starshipRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Vaisseau non trouvé"));
    }
    
    public Starship createStarship(@NonNull Starship starship) {
        return starshipRepository.save(starship);
    }
    
    public Starship updateStarship(@NonNull Long id, @NonNull Starship starship) {
        Starship existing = getStarshipById(id);
        existing.setName(starship.getName());
        existing.setCategory(starship.getCategory());
        existing.setLength(starship.getLength());
        existing.setCrew(starship.getCrew());
        existing.setPassengers(starship.getPassengers());
        existing.setCount(starship.getCount());
        return starshipRepository.save(existing);
    }
    
    public void deleteStarship(@NonNull Long id) {
        starshipRepository.deleteById(id);
    }
    
    // Méthodes pour les Missions
    public List<Mission> getAllMissions() {
        Iterable<Mission> iterable = missionRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
    }
    
    public Mission getMissionById(@NonNull Long id) {
        return missionRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Mission non trouvée"));
    }
    
    public Mission createMission(@NonNull Mission mission) {
        return missionRepository.save(mission);
    }
    
    public Mission forMission(@NonNull Mission mission) {
        return missionRepository.save(mission);
    }
}