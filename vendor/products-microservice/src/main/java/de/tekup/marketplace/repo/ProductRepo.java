package de.tekup.marketplace.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.tekup.marketplace.models.Product;
@RepositoryRestResource(collectionResourceRel = "produit", path = "produit")
public interface ProductRepo extends JpaRepository<Product, Long> {

	
	//find by product by label
	public Product findByLabel(@Param("label") String label);
}
