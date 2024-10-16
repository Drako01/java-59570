package com.coderhouse.entidades;

import com.coderhouse.interfaces.AccionesInterface;
import com.coderhouse.interfaces.SerVivoInterface;

public class AnimalTerreste implements SerVivoInterface, AccionesInterface{

	private boolean vivo;

	private String nombre;

	private String raza;

	private Integer edad;

	public void emitirSonido() {}

	public void moverse() {}

	public void comer() {}

	public boolean isVivo() {
		return this.vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Animal [vivo=" + this.vivo + ", nombre=" + this.nombre + ", raza=" + this.raza 
				+ ", edad=" + this.edad + "]";
	}

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		
	}

}
