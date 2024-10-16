package com.coderhouse.sobrecarga;

public class Impresora {
	
	
	// Sobrecarga de Metodos
	public void imprimir(int numero) {
		System.out.println("Imprimiendo el numero " + numero);
	}
	
	public void imprimir(int numeroA, int numeroB) {
		System.out.println("Imprimiendo los numeros " + numeroA + " y el numero " + numeroB );
	}

	public void imprimir(String texto) {
		System.out.println("Imprimiendo el texto " + texto);
	}
	
	public void imprimir(String textoA, String textoB) {
		System.out.println("Imprimiendo el texto " + textoA + " Imprimiendo el texto " + textoB );
	}
	
	public void imprimir(int[] numeros) {
		System.out.println("Imprimiendo el Array de Numeros: ");
		for (int numero : numeros) {
			System.out.println(numero + "\n");
		}
		
	}
	
}
