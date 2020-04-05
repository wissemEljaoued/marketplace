package de.tekup.marketplace.models;

import java.util.Date;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  
@Entity
@Table(name="comments")
@AllArgsConstructor
@NoArgsConstructor

public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "content", unique = false, table = "comments")
	private String content;
	
	
	@Column(name = "date", unique = false, table = "comments")
	private Date date;
	
	@Column(name = "customer_id", unique = true, table = "comments")
	private long customerId;
}
