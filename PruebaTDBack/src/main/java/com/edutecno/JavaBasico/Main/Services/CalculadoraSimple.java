package com.edutecno.JavaBasico.Main.Services;

import java.util.ArrayList;
import java.util.List;



public class CalculadoraSimple implements CalculadoraStockSeguridad {

	@Override
	public List<Integer> calcula(List<Integer> valores) {


		int calculo=0;
		List<Integer> montoSeguridad =new ArrayList<Integer>();
		
		for (int i = 0; i < valores.size(); i++) {
			if (valores.get(i) >= 2) {
				montoSeguridad.add(2);
			}
			
	}
		return montoSeguridad;
	}

}
