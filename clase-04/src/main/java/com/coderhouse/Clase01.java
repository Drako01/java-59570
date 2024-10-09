package com.coderhouse;

import com.coderhouse.objetos.Perro;

public class Clase01 {

	public static void main(String[] args) throws Exception {
		/*
		Perro primerPerro = new Perro();
		
		primerPerro.nombre = "Firulay";
		primerPerro.color = "Marron";
		primerPerro.edad = 3;
		primerPerro.raza = "Caniche";
		primerPerro.tamanio = "Chico";
		
		primerPerro.setNombre("Firulay");
		primerPerro.setColor("Marron");
		
		primerPerro.ladrar();
		primerPerro.caminar();
		*/
		
		/*
		String[] nombres = new String[] {
				"Lorena",
				"Alejandro",
				"Tristan",
				"Luis",
				"Valentin",
				"Angel"
		};
		
		imprimirListaDeNombres(nombres);
		
		sumarNumeros(5, 66);
		*/
		
		Perro primerPerro = new Perro();
		
		try {
			
		
		primerPerro.setNombre("Firulay");
		primerPerro.setColor("Marron");
		primerPerro.setRaza("Caniche");
		primerPerro.setTamanio("Chico");
		primerPerro.setEdad(10);
		
		//System.out.println("Perro: " + primerPerro);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	/*
	private static void imprimirListaDeNombres(String[] nombresDePersonas) {
		for (String nombre : nombresDePersonas) {
			System.out.println("Nombre: " + nombre);
		}
	}
	
	private static void sumarNumeros(int numeroA, int numeroB) {
		System.out.println("La suma entre " + numeroA + " y " + numeroB + " es de: " + (numeroA + numeroB));
	};
	*/	
		double radio = 4d;
		
		System.out.println("El area del Circulo con radio\n " + radio + " es igual a: " 
							+ calcularAreaDeUnCurculo(radio));
		
	
	}
	static final double PI;
	static final double PO;
	static {PI = 3.141592653589793237; PO = 4.32;};
	
	private static double calcularAreaDeUnCurculo(double radio) {
		return PI * Math.pow(radio, 2);
	}
	
}
