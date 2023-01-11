package com.edutecno.PruebaTDBack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.PruebaTDBack.Model.Stores;
import com.edutecno.PruebaTDBack.Service.StoresServiceImpl;

@RestController
@RequestMapping ("api/v1/stores")
public class StoresController {

	
	@Autowired
	StoresServiceImpl storesServiceImpl;
	
	@GetMapping ("/{storeid}")
	@ResponseStatus(HttpStatus.OK)
	public List<Stores> findByStoreId(@PathVariable Integer storeid) {
		// TODO Auto-generated method stub
		return storesServiceImpl.findByStoreId(storeid);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Stores> findByAll() {
		// TODO Auto-generated method stub
		return storesServiceImpl.findByAll();
	}
}
