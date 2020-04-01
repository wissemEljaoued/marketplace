package de.tekup.marketplace.entities.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ProductTagId implements Serializable {

    @Column(name = "product_id")
    private long productId;

    @Column(name = "tag_id")
    private long tagId;
}
