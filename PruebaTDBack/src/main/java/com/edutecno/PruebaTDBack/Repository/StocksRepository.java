package com.edutecno.PruebaTDBack.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutecno.PruebaTDBack.Model.Stocks;

public interface StocksRepository extends JpaRepository<Stocks, Integer> {

	
	public List<Stocks> findByProductId (Integer productId);
}
