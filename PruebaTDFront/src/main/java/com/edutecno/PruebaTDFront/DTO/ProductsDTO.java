package com.edutecno.PruebaTDFront.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsDTO {
	
	private Integer productId;
	
	 
	private String productName;
	
	
	private Integer brandId;
	
	 
	private Integer categoryId;
	
	
	private Integer modelYear;
	
	
	private double listPrice;

}
