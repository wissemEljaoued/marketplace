package de.tekup.marketplace.repositories;

import de.tekup.marketplace.entities.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "subcategories", collectionResourceRel = "subcategories")
public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
}
