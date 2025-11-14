package org.ort.starwars.fleet.infra.gateways;

import org.ort.starwars.fleet.infra.gateways.dtos.SwapiPageDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SwapiService {
    
    private final RestTemplate restTemplate;
    private static final String SWAPI_URL = "https://swapi.dev/api/starships/";
    
    public SwapiService() {
        this.restTemplate = new RestTemplate();
    }
    
    public SwapiPageDto getStarships() {
        return restTemplate.getForObject(SWAPI_URL, SwapiPageDto.class);
    }
}