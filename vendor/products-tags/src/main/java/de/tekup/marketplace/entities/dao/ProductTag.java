package de.tekup.marketplace.entities.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "products_tags")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductTag {

    @EmbeddedId
    private ProductTagId productTagId;
}
