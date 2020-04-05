package de.tekup.marketplace.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekup.marketplace.models.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long> {
	
	

}
