package de.tekup.marketplace.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


import de.tekup.marketplace.models.Tag;

public interface TagRepo extends JpaRepository<Tag, Long>{
	
	//find by tag by label
		public Tag findByLabel(@Param("label") String label);

}
