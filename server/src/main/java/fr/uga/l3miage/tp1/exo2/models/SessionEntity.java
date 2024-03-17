package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
public class SessionEntity {
    @Id
    private UUID idSession;

    @Column
    private String lastCommand;

    @Column
    private String currentDir;

    @Column
    private Boolean lock;

    @OneToOne
    private UserEntity idUser;

}
