package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "netflix_user")
public class NetflixUserEntity {
    @Id
    private Long bigint;

    @Column(name="id de l'utilisateur")
    private String uuid;

    @Column(name="nom de famille")
    private String lastname;

    @Column(name = "Prenom")
    private String firstname;

    @Column(name ="sexe")
    @Enumerated(EnumType.ORDINAL)
    private Sex sex;

    @Column(name ="date de naissance")
    private LocalDate birthDate;

}




