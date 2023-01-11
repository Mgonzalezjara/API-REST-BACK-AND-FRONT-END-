package com.edutecno.JavaBasico.Main.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class CalculadoraCompleja implements CalculadoraStockSeguridad {

	@Override
	public List<Integer> calcula(List<Integer> entrada) {
List<Integer> resultado = new ArrayList<Integer>();
		
		for (int i = 0; i < entrada.size(); i++) {
			
			int stock;
			
			
			if (entrada.get(i) > 20) {
				stock = (int) (2 + Math.round(entrada.get(i)*0.1));
				resultado.add(stock);
				
				
			} else if (entrada.get(i)> 10) {
				stock = (int) (2 + Math.round(entrada.get(i)*0.05));
				resultado.add(stock);
			
			} else  {
				resultado.add(2);
			
			} 
		}
		
		
		return resultado;
	}


}