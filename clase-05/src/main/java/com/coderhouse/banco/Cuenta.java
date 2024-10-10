package com.coderhouse.banco;

public class Cuenta {

	private int numero;
	private double saldo;
	private Persona titular;
	
	
	public void abrirCuenta() {
		System.out.println(getTitular() + " abrio una Cuenta");
	}
	
	public void verSaldo(){
		System.out.println("El saldo de la cuenta es: " + getSaldo());
	}
	
	public void transferir() {
		System.out.println(getTitular() + " hizo una transferencia");
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getTitular() {
		return this.titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
	
}
