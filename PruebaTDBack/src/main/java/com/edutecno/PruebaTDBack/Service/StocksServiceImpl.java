package com.edutecno.PruebaTDBack.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.PruebaTDBack.Model.Stocks;
import com.edutecno.PruebaTDBack.Repository.StocksRepository;

@Service
public class StocksServiceImpl implements StocksService {

	
	@Autowired
	StocksRepository stocksRepository;
	
	@Override
	public List<Stocks> findByProductId(Integer productId) {
		// TODO Auto-generated method stub
		return stocksRepository.findByProductId(productId);
	}

	@Override
	public List<Stocks> findAll() {
		// TODO Auto-generated method stub
		return stocksRepository.findAll();
	}

}
