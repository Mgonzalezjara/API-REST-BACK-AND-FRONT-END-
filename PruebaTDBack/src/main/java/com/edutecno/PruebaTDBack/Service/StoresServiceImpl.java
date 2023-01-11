package com.edutecno.PruebaTDBack.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.PruebaTDBack.Model.Stores;
import com.edutecno.PruebaTDBack.Repository.StoresRepository;

@Service
public class StoresServiceImpl implements StoreService {

	
	@Autowired
	
	StoresRepository storesRepository;
	@Override
	public List<Stores> findByStoreId(Integer storeId) {
		// TODO Auto-generated method stub
		return storesRepository.findByStoreId(storeId);
	}

	@Override
	public List<Stores> findByAll() {
		// TODO Auto-generated method stub
		return storesRepository.findAll();
	}

}
