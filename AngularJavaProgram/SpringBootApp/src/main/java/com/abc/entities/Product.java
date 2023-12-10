package com.abc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	private int productID;
	private String productName;
	private int productCost;

}
