package com.coderhouse;

import com.coderhouse.sobrecarga.Impresora;

//import com.coderhouse.abstractas.Vehiculo;
//import com.coderhouse.entidades.AnimalTerreste;
//import com.coderhouse.entidades.Auto;
//import com.coderhouse.entidades.Perro;
//import com.coderhouse.interfaces.SerVivoInterface;

public class Main {

	public static void main(String[] args) {
		
//		Perro miPerro = new Perro();
//		
//		
//		miPerro.setNombre("Firulay");
//		miPerro.setEdad(5);
//		
//		System.out.println(miPerro);
//		
//		miPerro.amigable();
//		miPerro.comer();
//		miPerro.emitirSonido();
//		miPerro.moverse();
//		
//		System.out.println("La ubicacion de " + miPerro.getNombre() +
//				" esta en el " + SerVivoInterface.UBICACION);
//
//		String ubicacion = AnimalTerreste.UBICACION;		
//		
//		Auto miAuto = new Auto();
//		
//		miAuto.apagar();
//		miAuto.enciender();
//		miAuto.mover();
//		miAuto.setRuedas(4);
//		miAuto.mostrarCantidadDeRuedas();
		
		Impresora miImpresora = new Impresora();
		
		miImpresora.imprimir(10);
		
		miImpresora.imprimir(10, 20);
		
		miImpresora.imprimir("Texto para Imprimir");
		
		int[] enteros = {1 , 2 , 3 , 4};
		miImpresora.imprimir(enteros);
		
		miImpresora.imprimir("Texto para Imprimir", "Hola gente");
		
	}

}
