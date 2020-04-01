package de.tekup.marketplace.openfeign;

import de.tekup.marketplace.entities.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "products", url = "")
public interface ProductClient {
    @GetMapping("/products/{id}")
    Optional<Product> findById(@PathVariable long id);

}
