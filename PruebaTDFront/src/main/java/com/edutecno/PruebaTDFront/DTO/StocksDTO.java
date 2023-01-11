package com.edutecno.PruebaTDFront.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StocksDTO {

	
	
	private Integer storeId;
	
	private Integer productId;
	
	private Integer quantity;
}
