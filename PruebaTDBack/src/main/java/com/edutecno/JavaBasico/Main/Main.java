package com.edutecno.JavaBasico.Main;

import java.util.ArrayList;
import java.util.List;

import com.edutecno.JavaBasico.Main.Services.CalculadoraCompleja;
import com.edutecno.JavaBasico.Main.Services.CalculadoraSimple;

public class Main {

	public static void main(String[] args) {

		int min = 0;
		int max = 50;
		CalculadoraSimple simple = new CalculadoraSimple();
		CalculadoraCompleja compleja = new CalculadoraCompleja();
		
		ArrayList<Integer> montos = new ArrayList();
	
	for (int i = 0; i < 5; i++) {
		int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
		montos.add(random_int);
		System.out.println("los random son = " + montos );
		
	}
	
	
	List<Integer> beneficioSimple = simple.calcula(montos);
	List<Integer> beneficioComplejo = compleja.calcula(montos);
	
	
	System.out.println("El resultado de calculadora simple es " + beneficioSimple);
	System.out.println("El resultado de calculadora compleja es " + beneficioComplejo);
	
		
		
		
	
	}

}
