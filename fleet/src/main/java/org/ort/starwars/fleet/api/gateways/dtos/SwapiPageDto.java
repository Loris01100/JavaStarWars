package org.ort.starwars.fleet.api.gateways.dtos;

import java.util.List;

public class SwapiPageDto {
    
    private String next;
    private List<SwapiStarshipDto> results;

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public List<SwapiStarshipDto> getResults() {
        return results;
    }

    public void setResults(List<SwapiStarshipDto> results) {
        this.results = results;
    }
}