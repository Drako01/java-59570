package com.coderhouse.abstractas;

public abstract class Vehiculo {

	protected String marca;
	protected String modelo;
	protected String color;
	protected Integer ruedas;

	protected abstract void enciender();

	protected abstract void apagar();

	protected abstract void mover();

	public void mostrarCantidadDeRuedas() {
		System.out.println("Mi Auto tiene " + getRuedas() + " Ruedas");
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getRuedas() {
		return this.ruedas;
	}

	public void setRuedas(Integer ruedas) {
		this.ruedas = ruedas;
	}

	
}
