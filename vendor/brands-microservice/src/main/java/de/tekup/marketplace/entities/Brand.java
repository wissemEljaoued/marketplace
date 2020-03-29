package de.tekup.marketplace.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "label", length = 40, unique = true, table = "brands")
    private String label;

    @Column(name = "vendor_id", unique = false, table = "brands")
    private long vendorId;
}
