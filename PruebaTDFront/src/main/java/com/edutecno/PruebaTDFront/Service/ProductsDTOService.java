package com.edutecno.PruebaTDFront.Service;

import java.util.List;
import java.util.Optional;


import com.edutecno.PruebaTDFront.DTO.ProductsDTO;

public interface ProductsDTOService {

	
	
	public List<ProductsDTO> findAll();
	public List<ProductsDTO> findByCategoryId(Integer categoryId);
	public List<ProductsDTO> findByBrandId(Integer brandId);
}
