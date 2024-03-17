package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Entity
public class UserEntity {
    @Id
    private Long idUser;

    @Column
    private Boolean SSO;

    @Column
    private OffsetDateTime lastConnexion;
}
