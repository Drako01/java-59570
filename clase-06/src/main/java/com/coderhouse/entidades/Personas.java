package com.coderhouse.entidades;

import com.coderhouse.interfaces.AccionesInterface;
import com.coderhouse.interfaces.SerVivoInterface;

public class Personas implements SerVivoInterface, AccionesInterface{

	@Override
	public void emitirSonido() {}

	@Override
	public void moverse() {}

	@Override
	public void comer() {}

	@Override
	public boolean estaVivo() {
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
