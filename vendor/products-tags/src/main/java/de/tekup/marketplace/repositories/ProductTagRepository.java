package de.tekup.marketplace.repositories;

import de.tekup.marketplace.entities.dao.ProductTag;
import de.tekup.marketplace.entities.dao.ProductTagId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTagRepository extends JpaRepository<ProductTag, ProductTagId> {
}
