package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="product_entity")
public class ProductEntity {
    @Id
    @Column(length = 15)
    private String bar_code_number;

    @Column
    private String name;

    @Column
    private Boolean consumable;

    @OneToMany
    private Set<BrandMiageEntity> brands;
}
