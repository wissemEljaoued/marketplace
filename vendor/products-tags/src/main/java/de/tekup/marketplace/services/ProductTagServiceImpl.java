package de.tekup.marketplace.services;

import de.tekup.marketplace.entities.dao.ProductTag;
import de.tekup.marketplace.entities.dao.ProductTagId;
import de.tekup.marketplace.entities.dto.Product;
import de.tekup.marketplace.entities.dto.Tag;
import de.tekup.marketplace.exceptions.ProductNotFoundException;
import de.tekup.marketplace.exceptions.TagNotFoundException;
import de.tekup.marketplace.openfeign.ProductClient;
import de.tekup.marketplace.openfeign.TagClient;
import de.tekup.marketplace.repositories.ProductTagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductTagServiceImpl implements ProductTagService {

    private ProductClient productClient;
    private TagClient tagClient;
    private ProductTagRepository productTagRepository;

    @Override
    public ProductTag save(ProductTag productTag) {
        try {
            this.checkProduct(productTag.getProductTagId().getProductId());
            this.checkTag(productTag.getProductTagId().getTagId());
        } catch (ProductNotFoundException | TagNotFoundException e) {
            e.printStackTrace();
        }

        this.productTagRepository.save(productTag);
        return productTag;
    }

    private void checkProduct(long productId) throws ProductNotFoundException {
        Optional<Product> optionalProduct = this.productClient.findById(productId);
        if (!optionalProduct.isPresent())
            throw new ProductNotFoundException(productId);
        return;
    }

    private void checkTag(long tagId) throws TagNotFoundException {
        Optional<Tag> optionalTag = this.tagClient.findById(tagId);
        if (!optionalTag.isPresent())
            throw new TagNotFoundException("Tag with id " + tagId + " Not found");
        return;
    }

    @Override
    public Optional<ProductTag> findById(long productId, long tagId) {
        try {
            this.checkProduct(productId);
            this.checkTag(tagId);
        } catch (ProductNotFoundException | TagNotFoundException e) {
            e.printStackTrace();
        }
        ProductTagId productTagId = new ProductTagId(productId, tagId);

        Optional<ProductTag> optionalProductTag = this.productTagRepository.findById(productTagId);

        return optionalProductTag;
    }
}
