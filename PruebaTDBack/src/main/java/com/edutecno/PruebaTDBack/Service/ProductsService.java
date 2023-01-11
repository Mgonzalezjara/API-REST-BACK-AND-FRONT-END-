package com.edutecno.PruebaTDBack.Service;

import java.util.List;
import java.util.Optional;

import com.edutecno.PruebaTDBack.Model.Products;


public interface ProductsService {

	
	List<Products> findAll();
	List<Products> findByCategoryId(Integer categoryId);
	List<Products> findByBrandId(Integer brandId);
}
