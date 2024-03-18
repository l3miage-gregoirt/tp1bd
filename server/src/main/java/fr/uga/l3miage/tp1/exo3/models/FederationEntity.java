package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class FederationEntity {
    @Id
    private String name;

    private Boolean isFageMembership;

    @ManyToOne
    private AssociationEntity association;
}
