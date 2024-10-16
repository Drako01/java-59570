package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.modelos.Alumno;
import com.coderhouse.modelos.Curso;

@SpringBootApplication
public class Clase08Application implements CommandLineRunner {
	
	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Clase08Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			Curso curso1 = new Curso("HTML");
			Curso curso2 = new Curso("CSS");
			Curso curso3 = new Curso("Java");

			Alumno alumno1 = new Alumno("Alejandro", "Di Stefano", 22555666, "L2255566");
			Alumno alumno2 = new Alumno("Agustin", "Barraza", 33555666, "L33555666");
			Alumno alumno3 = new Alumno("Bruno", "Lezama", 44555666, "L44555666");

			dao.createAlumno(alumno1);
			dao.createAlumno(alumno2);
			dao.createAlumno(alumno3);

			dao.createCurso(curso1);
			dao.createCurso(curso2);
			dao.createCurso(curso3);

		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
