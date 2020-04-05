package de.tekup.marketplace;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.tekup.marketplace.models.Product;
import de.tekup.marketplace.repo.ProductRepo;

@SpringBootApplication
public class ProductsMicroserviceApplication {
	@Autowired
	private ProductRepo productRepo;
	@PostConstruct
	public void init () {
		productRepo.saveAll(Stream.of(
				new Product(1, "liv", "Livre de math", 120, 12, 1,1,1,1))
				
				.collect(Collectors.toList()));
				
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProductsMicroserviceApplication.class, args);
	}

}
