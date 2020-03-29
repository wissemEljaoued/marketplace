package de.tekup.marketplace.api.resources;

import de.tekup.marketplace.entities.SubCategory;
import de.tekup.marketplace.services.SubCategoryService;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
//@RequestMapping(path = "/")
public class SubCategoryResource {
    private final SubCategoryService subCategoryServiceImpl;

    public SubCategoryResource(SubCategoryService subCategoryServiceImpl) {
        this.subCategoryServiceImpl = subCategoryServiceImpl;
    }

    @PostMapping(path = "/subcategories")
    public SubCategory save(@RequestBody SubCategory subCategory) {
        return this.subCategoryServiceImpl.save(subCategory);
    }
}
