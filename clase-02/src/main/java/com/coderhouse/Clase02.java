package com.coderhouse;

public class Clase02 {

	public static void main(String[] args) {
		/*
		 * int numeroA = 1; int numeroB = 2;
		 * 
		 * System.out.println(numeroA + " mayor que " + numeroB + " ?");
		 * 
		 * if(numeroA > numeroB) { /// (Condicion) > true o false
		 * System.out.println("El numeroA es mayor que el NumeroB"); } else { // sino
		 * System.out.println("El numeroB es mayor que el NumeroA"); }
		 * System.out.println("Si se llego hasta aca, es porque el if fue ejecutado");
		 */

		// Calculadora
		/*
		 * float numeroA = 1.0f; float numeroB = 0.0f; float resultado = numeroA /
		 * numeroB;
		 * 
		 * if(numeroB != 0) { // false System.out.println("El resultado es: " +
		 * resultado); } else { System.out.println("No se puede Dividir por cero"); }
		 */
		/*
		 * int ingreseSuNumero = 2;
		 * 
		 * if(ingreseSuNumero > 0) {
		 * System.out.println("El numero ingresado es Positivo"); } else
		 * if(ingreseSuNumero < 0) {
		 * System.out.println("El numero ingresado es Negativo"); } else if
		 * (ingreseSuNumero == 0){ System.out.println("El numero ingresado es Cero"); }
		 * else { System.out.println("El dato ingresado No es un Numero"); }
		 */

		// Validar dia de la Semana usando if else if
		/*
		 * int numeroDeDia = 16;
		 * 
		 * if (numeroDeDia == 1) { System.out.println("El Dia actual es Lunes"); } else
		 * if (numeroDeDia == 2) { System.out.println("El Dia actual es Martes"); } else
		 * if (numeroDeDia == 3) { System.out.println("El Dia actual es Miercoles"); }
		 * else if (numeroDeDia == 4) { System.out.println("El Dia actual es Jueves"); }
		 * else if (numeroDeDia == 5) { System.out.println("El Dia actual es Viernes");
		 * } else if (numeroDeDia == 6) { System.out.println("El Dia actual es Sabado");
		 * } else if (numeroDeDia == 7) {
		 * System.out.println("El Dia actual es Domingo"); } else {
		 * System.out.println("El Dia que Ingreso no existe"); }
		 */

		// Switch
		/*
		 * int numeroDeDia = 5; String nombreDelDia;
		 * 
		 * switch (numeroDeDia) { case 1: nombreDelDia = "Lunes";
		 * System.out.println("El dia se la semana correspondiente al numero " +
		 * numeroDeDia + " es el " + nombreDelDia); break; case 2: nombreDelDia =
		 * "Martes"; System.out.println("El dia se la semana correspondiente al numero "
		 * + numeroDeDia + " es el " + nombreDelDia); break; case 3: nombreDelDia =
		 * "Miercoles";
		 * System.out.println("El dia se la semana correspondiente al numero " +
		 * numeroDeDia + " es el " + nombreDelDia); break; case 4: nombreDelDia =
		 * "Jueves"; System.out.println("El dia se la semana correspondiente al numero "
		 * + numeroDeDia + " es el " + nombreDelDia); break; case 5: nombreDelDia =
		 * "Viernes";
		 * System.out.println("El dia se la semana correspondiente al numero " +
		 * numeroDeDia + " es el " + nombreDelDia); break; case 6: nombreDelDia =
		 * "Sabado"; System.out.println("El dia se la semana correspondiente al numero "
		 * + numeroDeDia + " es el " + nombreDelDia); break; case 7: nombreDelDia =
		 * "Domingo";
		 * System.out.println("El dia se la semana correspondiente al numero " +
		 * numeroDeDia + " es el " + nombreDelDia); break; default: nombreDelDia =
		 * "Dia Invalido";
		 * System.out.println("El dia se la semana correspondiente al numero " +
		 * numeroDeDia + " es el " + nombreDelDia); break; }
		 * 
		 * /*System.out.println("El dia se la semana correspondiente al numero " +
		 * numeroDeDia + " es el " + nombreDelDia);
		 */
		// System.out.println("Fin de la Ejecucion");
		/*
		String dia = "Sábado";

		switch (dia.toLowerCase()) {
		case "lunes":
			System.out.println("Hoy es " + dia);
			break;
		case "martes":
			System.out.println("Hoy es " + dia);
			break;
		case "miercoles":
			System.out.println("Hoy es " + dia);
			break;
		case "jueves":
			System.out.println("Hoy es " + dia);
			break;
		case "viernes":
			System.out.println("Hoy es " + dia);
			break;
		case "sabado":
			System.out.println("Hoy es " + dia);
			break;
		case "domingo":
			System.out.println("Hoy es " + dia);
			break;
		default: System.out.println("Dia Invalido o no lo escribio bien, puso: " + dia);
			break;
		}*/
		
		// Operador Ternario
		/*
		int numeroA = 10;
		int numeroB = 2;
		
		boolean condicion = numeroA < numeroB; // o true o false
		boolean resultado = condicion ? true : false;
		System.out.println("La condicion es " + resultado);
		
		String mensaje = (numeroA < numeroB)? "mensaje true" : "mensaje false";
		System.out.println(mensaje);*/
		
		//Numeros Aleatoreos
		/*
		double randon = 0.0d;
		
		randon = Math.random();
		
		System.out.println("El numero Generado es: " + randon);*/
		
		int minimo =1;
		int maximo = 100;
		
		int rango = maximo - minimo + 1;
		
		int randon = 0;
		
		randon = (int) (Math.random() * rango ) + minimo;
		System.out.println("El numero Generado es: " + randon);
		
		
	}

}
