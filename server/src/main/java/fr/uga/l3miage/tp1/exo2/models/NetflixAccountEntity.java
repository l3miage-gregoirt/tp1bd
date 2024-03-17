package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.typeAccount;

import javax.persistence.*;

@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {
    @Id
    private Long bigint;

    @Column
    private int nb_devices;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private typeAccount typeAccount;

    @OneToOne
    private NetflixUserEntity user;
}

