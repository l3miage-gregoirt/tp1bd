package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;

@Entity
@Table(name = "brand_miage")
public class BrandMiageEntity {
    @Id
    private String company_name;

    @Column(length = 11)
    private String siretNumber;

    @Column
    private BrandType type;

    @ManyToOne
    private ProductEntity product;
}
