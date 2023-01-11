package com.edutecno.PruebaTDFront.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BusquedaDTO {

	private Integer categoryId;
	private int brandId;
	
	
	
	public  BusquedaDTO (Integer categoryId) {
		this.categoryId = categoryId;
		
	}
	

}
