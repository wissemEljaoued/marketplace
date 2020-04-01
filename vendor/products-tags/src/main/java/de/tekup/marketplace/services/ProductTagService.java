package de.tekup.marketplace.services;

import de.tekup.marketplace.entities.dao.ProductTag;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ProductTagService {
    ProductTag save(ProductTag productTag);

    Optional<ProductTag> findById(long productId, long tagId);
}
