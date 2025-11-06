package org.ort.starwars.fleet.api.models.entities;

import org.ort.starwars.fleet.api.models.enums.StarshipType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity

public class Starship {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //caractéristiques du vaisseau
    @Column
    private String name;
    @Enumerated(EnumType.STRING)
    private StarshipType category;
    @Column
    private int length;
    @Column
    private int crew;
    @Column
    private int passengers;

    @Column
    private int count;
}
