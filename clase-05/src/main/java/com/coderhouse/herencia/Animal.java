package com.coderhouse.herencia;

import java.util.Objects;

public class Animal {

	private String nombre;
	private String raza;
	private int edad;
	private boolean mamifero;
	private String alimentacion;
	
	public void caminar() {
		System.out.println(getNombre() + " esta Caminando.!");
	}
	
	public void comer() {
		System.out.println(getNombre() + " esta Comiendo.!");
	}
	
	public void hacerSonido() {
		System.out.println(getNombre() + " esta haciendo un Sonido.!");
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

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isMamifero() {
		return this.mamifero;
	}

	public void setMamifero(boolean mamifero) {
		this.mamifero = mamifero;
	}

	public String getAlimentacion() {
		return this.alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", mamifero=" + mamifero
				+ ", alimentacion=" + alimentacion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(nombre, other.nombre);
	}

	
	
	
	
}
