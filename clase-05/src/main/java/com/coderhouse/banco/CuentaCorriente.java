package com.coderhouse.banco;

public class CuentaCorriente extends Cuenta {

	@Override
	public void abrirCuenta() {
		System.out.println(getTitular() + " abrio una Cuenta Corriente");
	}
}
