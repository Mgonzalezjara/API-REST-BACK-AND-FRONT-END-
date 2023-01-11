package com.edutecno.PruebaTDFront.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.edutecno.PruebaTDFront.DTO.ProductsDTO;


@Service
public class ProductsDTOServiceImpl implements ProductsDTOService {

	@Value("${endpoints.stores}")
	private String storesEndpoint;
	
	@Value("${endpoints.products}")
	private String productsEndpoint;
	
	@Value("${endpoints.products}")
	private String stocksEndpoint;
	
	@Autowired
	public RestTemplate restTemplate;
	
	@Override
	public List<ProductsDTO> findAll() {
	String url = productsEndpoint;
		
		// create headers
	    HttpHeaders headers = new HttpHeaders();

	    // create request
	    HttpEntity<?> request = new HttpEntity<Object>(headers);
	    
		
	    // make a request
	    ResponseEntity<List<ProductsDTO>> response = restTemplate.exchange(url,
	    		HttpMethod.GET,
	    		request ,
	    		new ParameterizedTypeReference<List<ProductsDTO>>() {}); //que nos retorna la rpta
	    
		return response.getBody();
	}

	@Override
	public List<ProductsDTO> findByCategoryId(Integer categoryId) {
		String url = productsEndpoint + "/" + categoryId;
		
		// create headers
	    HttpHeaders headers = new HttpHeaders();

	    // create request
	    HttpEntity<?> request = new HttpEntity<Object>(headers);
	    
		
	    // make a request
	    ResponseEntity<List<ProductsDTO>> response = restTemplate.exchange(url,
	    		HttpMethod.GET,
	    		request ,
	    		new ParameterizedTypeReference<List<ProductsDTO>>() {}); //que nos retorna la rpta
	    
		return response.getBody();
	}

	@Override
	public List<ProductsDTO> findByBrandId(Integer brandId) {
		String url = productsEndpoint + "/" + brandId;
		
		// create headers
	    HttpHeaders headers = new HttpHeaders();

	    // create request
	    HttpEntity<?> request = new HttpEntity<Object>(headers);
	    
		
	    // make a request
	    ResponseEntity<List<ProductsDTO>> response = restTemplate.exchange(url,
	    		HttpMethod.GET,
	    		request ,
	    		new ParameterizedTypeReference<List<ProductsDTO>>() {}); //que nos retorna la rpta
	    
		return response.getBody();
	}

}
