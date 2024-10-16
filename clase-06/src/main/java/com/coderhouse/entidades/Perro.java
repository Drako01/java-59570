package com.coderhouse.entidades;

public class Perro extends AnimalTerreste {

	@Override
	public void emitirSonido() {
		System.out.println(getNombre() + " esta ladrando");
	}

	@Override
	public void moverse() {
		System.out.println(getNombre() + " camino");
	}

	@Override
	public void comer() {
		System.out.println(getNombre() + " comio");
	}
	
	public boolean amigable() {
		return true;		
	}
}
