package com.edutecno.PruebaTDBack.Service;

import java.util.List;

import com.edutecno.PruebaTDBack.Model.Stocks;

public interface StocksService {

	
	List<Stocks> findAll();
	List<Stocks> findByProductId (Integer productId);
}
