package com.coderhouse.banco;

public class CajaDeAhorro extends Cuenta {

	@Override
	public void abrirCuenta() {
		System.out.println(getTitular() + " abrio una Caja de Ahorro Simple");
	}
}
