package com.edutecno.PruebaTDBack.Model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "products")
public class Products {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id" )
	private Integer productId;
	
	@Column(name = "product_name" )
	private String productName;
	
	@Column(name = "brand_id" )
	private Integer brandId;
	
	@Column(name = "category_id" )
	private Integer categoryId;
	
	@Column(name = "model_year" )
	private Integer modelYear;
	
	@Column(name = "list_price" )
	private double listPrice;
	
}
