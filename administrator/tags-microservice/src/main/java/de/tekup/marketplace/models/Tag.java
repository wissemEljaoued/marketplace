package de.tekup.marketplace.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  
@Entity
@Table(name="tags")
@AllArgsConstructor
@NoArgsConstructor
public class Tag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "label", unique = true, table = "tags")
	private String label;
	
	@Column(name = "product_id", unique = true, table = "tags")
	private long productId;

}
