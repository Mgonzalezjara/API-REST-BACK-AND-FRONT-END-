package com.edutecno.PruebaTDBack.Service;

import java.util.List;

import com.edutecno.PruebaTDBack.Model.Stores;

public interface StoreService {

	
	
	List<Stores> findByStoreId (Integer storeId);
	List<Stores> findByAll();
}
