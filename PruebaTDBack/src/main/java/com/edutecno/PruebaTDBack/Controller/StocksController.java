package com.edutecno.PruebaTDBack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.PruebaTDBack.Model.Stocks;
import com.edutecno.PruebaTDBack.Service.StocksServiceImpl;

@RestController
@RequestMapping ("api/v1/stocks")
public class StocksController {

	@Autowired
	StocksServiceImpl stocksServiceImpl;
	

	@GetMapping("/{productid}")
	@ResponseStatus(HttpStatus.OK)
	public List<Stocks> findByProductId(@PathVariable Integer productid) {
		// TODO Auto-generated method stub
		return stocksServiceImpl.findByProductId(productid);
	}


	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Stocks> findAll() {
		// TODO Auto-generated method stub
		return stocksServiceImpl.findAll();
}
	
}
