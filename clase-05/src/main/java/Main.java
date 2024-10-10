//import com.coderhouse.herencia.Gato;
//import com.coderhouse.herencia.Perro;

/*
import com.coderhouse.banco.Persona;
import com.coderhouse.banco.Cuenta;
import com.coderhouse.banco.CuentaCorriente;
import com.coderhouse.banco.CajaDeAhorro;
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {

	public static void main(String[] args) {
		/*
		Perro unPerro = new Perro();
		Gato unGato = new Gato();
		Perro otroPerro = new Perro();
		Perro nuevoPerro = otroPerro;
		
		unPerro.setNombre("Firulai");
		unPerro.setEdad(4);
		unPerro.setMamifero(true);
		unPerro.setRaza("Caniche");
		unPerro.setAlimentacion("Alimento balanceado para Perros");
		
		otroPerro.setNombre("Pluto");
		otroPerro.setEdad(6);
		otroPerro.setMamifero(true);
		otroPerro.setRaza("Yorky");
		otroPerro.setAlimentacion("Alimento balanceado para Perros");
		
		System.out.println(unPerro);
		unPerro.comer();
		unPerro.caminar();
		unPerro.hacerSonido();
		unPerro.saltar();
		
		System.out.println(otroPerro);
		otroPerro.comer();
		otroPerro.caminar();
		otroPerro.hacerSonido();
		otroPerro.saltar();
		
		unGato.setNombre("Michi");
		unGato.setEdad(6);
		unGato.setMamifero(true);
		unGato.setRaza("Gato");
		unGato.setAlimentacion("Alimento balanceado para Gatos");
		
		System.out.println(unGato);
		unGato.comer();
		unGato.caminar();
		unGato.hacerSonido();
		unGato.dormir();
		
		if(unPerro.equals(otroPerro)) {
			System.out.println("Ambos perros son Iguales segun equals()");
		} else {
			System.out.println("Ambos perros NO son Iguales segun equals()");
		}
		
		if(unPerro.hashCode() == otroPerro.hashCode()) {			
			System.out.println("Ambos perros son Iguales segun hashCode()");
		} else {
			System.out.println("Ambos perros NO son Iguales segun hashCode()");
		}
		
		if(nuevoPerro.equals(otroPerro)) {
			System.out.println("Ambos perros son Iguales segun equals()");
		} else {
			System.out.println("Ambos perros NO son Iguales segun equals()");
		}
		
		if(nuevoPerro.hashCode() == otroPerro.hashCode()) {			
			System.out.println("Ambos perros son Iguales segun hashCode()");
		} else {
			System.out.println("Ambos perros NO son Iguales segun hashCode()");
		}
		*/
		
		/*
		Persona unaPersona = new Persona();
		unaPersona.setTitular("Andres");
		unaPersona.setDni(22333666);
		
		System.out.println(unaPersona);
		
		Cuenta cuentaCorriente = new CuentaCorriente();
		cuentaCorriente.setTitular(unaPersona);
		cuentaCorriente.setNumero(123456);
		cuentaCorriente.setSaldo(1200.50d);
		cuentaCorriente.abrirCuenta();
		
		System.out.println(cuentaCorriente);
		
		Cuenta cajaDeAhorros = new CajaDeAhorro();
		cajaDeAhorros.setTitular(unaPersona);
		cajaDeAhorros.setNumero(321654);
		cajaDeAhorros.setSaldo(563.45d);
		cajaDeAhorros.abrirCuenta();
		
		System.out.println(cajaDeAhorros);
		*/
		/*
		try {		
			
			double resultado = 10 / 0;
			
			System.out.println("El resultado es: " + resultado);
			
		} catch(ArithmeticException e) {
			System.err.println("Error, No se puede dividir por Cero");
		}
		
		*/
		/*
		try {
			Class.forName("com.coderhouse.ClaseInexistente");
			
		} catch ( ClassNotFoundException  e) {
			System.err.println("Error, La Clase ClaseInexistente no existe");
		}
		
		int x = 10;
		int y = 0;
		dividir(x , y);
		*/



		try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mi_base_datos", "usuario", "contraseña");
        } catch (SQLException e) {
            System.out.println("Error: No se pudo conectar a la base de datos.");
        }
		
	}

	private static void dividir(int x, int y) {
		try {
			System.out.println( x / y );
		} catch(ArithmeticException e) {
			System.err.println("Error, No se puede dividir por Cero");
		}
	}
}
