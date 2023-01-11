package com.edutecno.PruebaTDBack.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.PruebaTDBack.Model.Products;
import com.edutecno.PruebaTDBack.Repository.ProductsRepository;


@Service
public class ProductsServiceImpl implements ProductsService {

	
	@Autowired
	ProductsRepository productsRepository;
	
	
	@Override
	public List<Products> findAll() {
		// TODO Auto-generated method stub
		return productsRepository.findAll();
	}

	@Override
	public List<Products> findByCategoryId(Integer categoryId) {
		// TODO Auto-generated method stub
		return productsRepository.findByCategoryId(categoryId);
	}

	@Override
	public List<Products> findByBrandId(Integer brandId) {
		// TODO Auto-generated method stub
		return productsRepository.findByBrandId(brandId);
	}

}
