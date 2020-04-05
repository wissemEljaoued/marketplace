package de.tekup.marketplace.models;


import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  
@Entity
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "label", unique = true, table = "products")
	private String label;
	@Column(name = "description", unique = false, table = "products")
	private String description;
	
	@Column(name = "price", unique = false, table = "products")
	private long price;
	
	@Column(name = "qty", unique = false, table = "products")
	private long qty;
	
	
	@Column(name = "marque_id", unique = true, table = "products")
	private long marqueId;
	
	@Column(name = "subCategory_id", unique = true, table = "products")
	private long subCategoryId;
	
	@Column(name = "provider_id", unique = true, table = "products")
	private long providerId;
	
	@Column(name = "customer_id", unique = true, table = "products")
	private long customerId;
	
	@Column(name = "tag_id", unique = true, table = "products")
	private long tagId;
	
	
}
