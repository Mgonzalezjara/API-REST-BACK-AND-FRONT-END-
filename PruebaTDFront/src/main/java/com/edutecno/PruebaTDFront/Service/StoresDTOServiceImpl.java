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
import com.edutecno.PruebaTDFront.DTO.StoresDTO;

@Service
public class StoresDTOServiceImpl implements StoresDTOService {

	
	
	@Value("${endpoints.stores}")
	private String storesEndpoint;
	
	@Value("${endpoints.products}")
	private String productsEndpoint;
	
	@Autowired
	public RestTemplate restTemplate;
	
	
	
	@Override
	public List<StoresDTO> findByStoreId(Integer storeId) {
      String url = storesEndpoint + "/" + storeId;
		
		//create headers
		
		HttpHeaders headers = new HttpHeaders();
		
		
		// create request
		
		HttpEntity<?> request = new HttpEntity<Object>(headers);
		
		//make response
		
		ResponseEntity<List<StoresDTO>> response = restTemplate.exchange(url, 
				HttpMethod.GET, 
				request,
				new ParameterizedTypeReference<List<StoresDTO>>() {
		});
		return response.getBody();
		
	}

	@Override
	public List<StoresDTO> findByAll() {
		String url = storesEndpoint;
		
		//create headers
		
		HttpHeaders headers = new HttpHeaders();
		
		
		// create request
		
		HttpEntity<?> request = new HttpEntity<Object>(headers);
		
		//make response
		
		ResponseEntity<List<StoresDTO>> response = restTemplate.exchange(url, 
				HttpMethod.GET, 
				request,
				new ParameterizedTypeReference<List<StoresDTO>>() {
		});
		
		//
		
		return response.getBody();
	}

}
