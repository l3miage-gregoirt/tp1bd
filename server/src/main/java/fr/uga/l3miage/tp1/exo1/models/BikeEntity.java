package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="bike_bmw")
public class BikeEntity {
    @Id
    private String immatriculation;

    @Column
    private Integer capacity;

    @Column(name="cylinderNumber")
    @Enumerated(EnumType.ORDINAL)
    private CylinderNumber cylindre;

    @Column
    private Boolean automatic;

    @Column
    private Boolean shifter;

    @Column(name="shifterType")
    @Enumerated(EnumType.STRING)
    private ShifterType shifterT;

    @Column
    private LocalDate circulationDate;
}
