package de.tekup.marketplace.openfeign;

import de.tekup.marketplace.entities.Category;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "categories", url = "http://127.0.0.1:10000/")
public interface CategoryClient {

    @GetMapping("/categories/{id}")
    Optional<Category> findById(@PathVariable long id);

}
