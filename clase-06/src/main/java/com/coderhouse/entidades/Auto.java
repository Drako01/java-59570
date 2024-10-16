package com.coderhouse.entidades;

import com.coderhouse.abstractas.Vehiculo;

public class Auto extends Vehiculo {

	@Override
	public void enciender() {
		System.out.println("El auto enciende");

	}

	@Override
	public void apagar() {
		System.out.println("El auto se apaga");

	}

	@Override
	public void mover() {
		System.out.println("El auto se mueve");

	}
		
	
}
