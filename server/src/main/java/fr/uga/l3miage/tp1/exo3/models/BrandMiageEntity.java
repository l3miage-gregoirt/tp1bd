package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="brand_miage")
public class BrandMiageEntity {
    @Id
    private String company_name;

    @Column(length = 11)
    private String siretNumber;

    @Column
    private String type;
}
