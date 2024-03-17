package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "netflix_user")
public class NetflixUserEntity {
    @Id
    private Long bigint;

    @Column
    private String uuid;

    @Column
    private String lastname;

    @Column
    private String firstname;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private Sex sex;

    @Column
    private LocalDate birthDate;

}




