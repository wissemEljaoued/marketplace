package de.tekup.marketplace.repositories;

import de.tekup.marketplace.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
