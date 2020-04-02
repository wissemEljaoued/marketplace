package de.tekup.marketplace.repositories;

import de.tekup.marketplace.entities.dao.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
