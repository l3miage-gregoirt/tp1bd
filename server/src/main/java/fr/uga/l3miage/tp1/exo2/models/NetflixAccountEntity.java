package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.typeAccount;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {
    @Id
    private Long bigint;

    @Column(name="nombre de devices")
    private Integer nb_devices;

    @Column(name="type du compte")
    @Enumerated(EnumType.ORDINAL)
    private typeAccount typeAccount;

    @OneToOne
    private NetflixUserEntity user;
}

