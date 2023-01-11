package com.edutecno.PruebaTDFront.Controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edutecno.PruebaTDFront.DTO.BusquedaDTO;
import com.edutecno.PruebaTDFront.DTO.ProductsDTO;
import com.edutecno.PruebaTDFront.DTO.StoresDTO;
import com.edutecno.PruebaTDFront.Service.ProductsDTOService;
import com.edutecno.PruebaTDFront.Service.StockService;
import com.edutecno.PruebaTDFront.Service.StoresDTOService;


@Controller
public class HomeController {

	
	@Autowired
	ProductsDTOService productsDTOService;
	
	@Autowired
	StoresDTOService storesDTOService;
	
	@Autowired
	StockService stockService;
	
	@GetMapping("/home")
	public ModelAndView home() {
	
		ModelAndView modelAndView = new ModelAndView("home");
		
		List<ProductsDTO> productos = productsDTOService.findAll();
		//catProductosID.sort(Comparator.comparing(ProductsDTO::getCategoryId));
		
		
		List<ProductsDTO> brand = productsDTOService.findAll();
		//brandID.sort(Comparator.comparing(ProductsDTO::getBrandId));
		
		
		List<StoresDTO> stores = storesDTOService.findByAll();
		//stores.sort(Comparator.comparing(StoresDTO::getStoreName));


		for (ProductsDTO productsDTO : productos) {
			System.out.println(productsDTO.getCategoryId());
			System.out.println("-------------------");
			System.out.println(productsDTO.getBrandId());
		}
		
		System.out.println("-------------------");
		
		for (StoresDTO storesDTO : stores) {
			System.out.println(storesDTO.getStoreName());
		}
		
	modelAndView.addObject("productos", productos);
	modelAndView.addObject("brand", brand);
	modelAndView.addObject("stores", stores);
	
			
		return modelAndView;
	}
	
	@PostMapping("/{id}")
	public ModelAndView buscar (@PathVariable("id") Integer id) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		List<ProductsDTO> categorias = productsDTOService.findByCategoryId(id);
		
		
		
		
		
		modelAndView.addObject("categorias", categorias);
		
		return modelAndView;
		
		
	
}
}
