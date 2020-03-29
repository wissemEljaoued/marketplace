package de.tekup.marketplace.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sub_categories")
@Data
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "label", unique = true, length = 30, table = "sub_categories")
    private String label;

    @Column(name = "category_id", unique = false, table = "sub_categories")
    private long categoryId;
}
