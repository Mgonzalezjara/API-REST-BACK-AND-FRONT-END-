package com.edutecno.PruebaTDBack.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutecno.PruebaTDBack.Model.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer> {

	
	public List<Products> findByCategoryId (Integer categoryId);
	
	
	public List<Products> findByBrandId (Integer brandId);

}
