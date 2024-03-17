package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="product_entity")
public class ProductEntity {
    @Id
    @Column(length = 15)
    private String bar_code_number;

    @Column(name = "nom")
    private String name;

    @Column(name = "consomable")
    private Boolean consumable;

    @OneToMany
    private Set<BrandMiageEntity> brands;
}
