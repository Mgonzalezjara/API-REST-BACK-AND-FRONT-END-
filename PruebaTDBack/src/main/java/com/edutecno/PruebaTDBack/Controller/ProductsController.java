package com.edutecno.PruebaTDBack.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.PruebaTDBack.Model.Products;
import com.edutecno.PruebaTDBack.Service.ProductsServiceImpl;

@RestController
@RequestMapping ("api/v1/products")
public class ProductsController {

	
	@Autowired
	ProductsServiceImpl productsServiceImpl;
	
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Products> findAll() {
		// TODO Auto-generated method stub
		return productsServiceImpl.findAll();
	}

	@GetMapping("/{categoryid}")
	@ResponseStatus(HttpStatus.OK)
	public List<Products> findByCategoryId(@PathVariable Integer categoryid) {
		// TODO Auto-generated method stub
		return productsServiceImpl.findByCategoryId(categoryid);
	}

	@GetMapping("/brand/{brandid}")
	@ResponseStatus(HttpStatus.OK)
	public List<Products> findByBrandId(@PathVariable  Integer brandid) {
		// TODO Auto-generated method stub
		return productsServiceImpl.findByBrandId(brandid);
	}
}
