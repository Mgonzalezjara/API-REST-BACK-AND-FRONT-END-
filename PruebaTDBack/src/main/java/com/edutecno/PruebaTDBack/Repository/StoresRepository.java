package com.edutecno.PruebaTDBack.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edutecno.PruebaTDBack.Model.Stores;

public interface StoresRepository extends JpaRepository<Stores, Integer> {

	
	public List<Stores> findByStoreId (Integer storeId);
}
