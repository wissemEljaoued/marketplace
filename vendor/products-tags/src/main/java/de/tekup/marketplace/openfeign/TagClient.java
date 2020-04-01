package de.tekup.marketplace.openfeign;

import de.tekup.marketplace.entities.dto.Tag;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "tags", url = "")
public interface TagClient {
    @GetMapping("/tags/{id}")
    Optional<Tag> findById(@PathVariable long id);
}
