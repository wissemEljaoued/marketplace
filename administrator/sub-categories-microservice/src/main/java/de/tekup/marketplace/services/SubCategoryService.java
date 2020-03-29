package de.tekup.marketplace.services;

import de.tekup.marketplace.entities.SubCategory;
import org.springframework.stereotype.Service;

@Service
public interface SubCategoryService {
    SubCategory save(SubCategory subCategory);
}
