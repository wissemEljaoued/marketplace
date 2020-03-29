package de.tekup.marketplace.repositories;

import de.tekup.marketplace.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
