package com.edutecno.PruebaTDFront.Service;

import java.util.List;


import com.edutecno.PruebaTDFront.DTO.StoresDTO;

public interface StoresDTOService {

	
	public List<StoresDTO> findByStoreId (Integer storeId);
	public List<StoresDTO> findByAll();
}
