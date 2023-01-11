package com.edutecno.PruebaTDFront.Service;

import java.util.List;

import com.edutecno.PruebaTDFront.DTO.StocksDTO;
import com.edutecno.PruebaTDFront.DTO.StoresDTO;



public interface StockService {
	

	List<StocksDTO> findByStoreId (Integer storeId);
	List<StocksDTO> findAll();
	StocksDTO findByProductId(Integer productID);

}
