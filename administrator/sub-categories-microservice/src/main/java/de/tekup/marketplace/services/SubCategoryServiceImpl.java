package de.tekup.marketplace.services;

import de.tekup.marketplace.entities.SubCategory;
import de.tekup.marketplace.openfeign.CategoryClient;
import de.tekup.marketplace.repositories.SubCategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

    private final CategoryClient categoryClient;
    private final SubCategoryRepository subCategoryRepository;

    public SubCategoryServiceImpl(CategoryClient categoryClient, SubCategoryRepository subCategoryRepository) {
        this.categoryClient = categoryClient;
        this.subCategoryRepository = subCategoryRepository;
    }

    @Override
    public SubCategory save(SubCategory subCategory) {
        /*
        * Validate the id of the category
        */
        if (this.categoryClient.findById(subCategory.getCategoryId()).isPresent())
            return this.subCategoryRepository.save(subCategory);
        return null;
    }
}
