package de.tekup.marketplace.api.resources;

import de.tekup.marketplace.entities.dao.ProductTag;
import de.tekup.marketplace.services.ProductTagService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/productstags")
@AllArgsConstructor
public class ProductsTagsResource {

    private ProductTagService productTagServiceImpl;

    @PostMapping
    public ProductTag associateTagToProduct(@RequestBody ProductTag productTag) {
        return this.productTagServiceImpl.save(productTag);
    }

    @GetMapping
    public ProductTag findProductTagByProductTagId(@PathVariable long productId, @PathVariable long tagId) {
        return this.productTagServiceImpl.findById(productId, tagId).get();
    }
}
