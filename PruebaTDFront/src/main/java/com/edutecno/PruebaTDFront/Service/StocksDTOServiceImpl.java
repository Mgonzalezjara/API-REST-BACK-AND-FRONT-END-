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

import com.edutecno.PruebaTDFront.DTO.StocksDTO;
import com.edutecno.PruebaTDFront.DTO.StoresDTO;

@Service
public class StocksDTOServiceImpl implements StockService {

	@Value("${endpoints.stores}")
	private String storesEndpoint;
	
	@Value("${endpoints.products}")
	private String productsEndpoint;
	
	@Value("${endpoints.stocks}")
	private String stocksEndpoint;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<StocksDTO> findAll() {
		String url = stocksEndpoint;
		
		// create headers
	    HttpHeaders headers = new HttpHeaders();

	    // create request
	    HttpEntity<?> request = new HttpEntity<Object>(headers);
	  	
	    // make a request
	    ResponseEntity<List<StocksDTO>> response = restTemplate.exchange(url,
	    		HttpMethod.GET,
	    		request ,
	    		new ParameterizedTypeReference<List<StocksDTO>>() {});
	    
		return response.getBody();
	}

	@Override
	public StocksDTO findByProductId(Integer productID) {
String url = stocksEndpoint;
		
		// create headers
	    HttpHeaders headers = new HttpHeaders();

	    // create request
	    HttpEntity<?> request = new HttpEntity<Object>(headers);
	  	
	    // make a request
	    ResponseEntity<StocksDTO> response = restTemplate.exchange(url,
	    		HttpMethod.GET,
	    		request ,
	    		StocksDTO.class);
	    
		return response.getBody();
	}

	@Override
	public List<StocksDTO> findByStoreId(Integer storeId) {
String url = stocksEndpoint;
		
		// create headers
	    HttpHeaders headers = new HttpHeaders();

	    // create request
	    HttpEntity<?> request = new HttpEntity<Object>(headers);
	  	
	    // make a request
	    ResponseEntity<List<StocksDTO>> response = restTemplate.exchange(url,
	    		HttpMethod.GET,
	    		request ,
	    		new ParameterizedTypeReference<List<StocksDTO>>() {});
	    
		return response.getBody();
	}
}
