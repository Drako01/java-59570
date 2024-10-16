package com.coderhouse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.modelos.Alumno;
import com.coderhouse.modelos.Categoria;
import com.coderhouse.modelos.Curso;

@SpringBootApplication
public class Clase09Application implements CommandLineRunner {
	
	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Clase09Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			Categoria categoria1 = new Categoria("Programacion FrontEnd");
			Categoria categoria2 = new Categoria("Programacion BackEnd");
			
			
			Curso curso1 = new Curso("HTML", categoria1);
			Curso curso2 = new Curso("CSS", categoria1);
			Curso curso3 = new Curso("Java", categoria2);
			
			Alumno alumno1 = new Alumno("Alejandro", "Di Stefano", 22555666, "L2255566");
			Alumno alumno2 = new Alumno("Agustin", "Barraza", 33555666, "L33555666");
			Alumno alumno3 = new Alumno("Bruno", "Lezama", 44555666, "L44555666");

			dao.createCategoria(categoria1);
			dao.createCategoria(categoria2);
			
			dao.createAlumno(alumno1);
			dao.createAlumno(alumno2);
			dao.createAlumno(alumno3);

			dao.createCurso(curso1);
			dao.createCurso(curso2);
			dao.createCurso(curso3);
			
			System.out.println("Mostrar lista de Categorias");
			List<Categoria> categorias = dao.getAllCategorias();
			categorias.forEach(categoria -> System.out.println(categoria.toString()));
			System.out.println("-----------------------------");
			
			System.out.println("Mostrar lista de Cursos");
			List<Curso> cursos = dao.getAllCursos();
			cursos.forEach(curso -> System.out.println(curso.toString()));
			System.out.println("-----------------------------");
			
			System.out.println("Mostrar lista de los Alumnos");
			List<Alumno> slumnos = dao.getAllAlumnos();
			slumnos.forEach(slumno -> System.out.println(slumno.toString()));
			System.out.println("-----------------------------");
			
			
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno1.getId());
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno2.getId());
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno3.getId());
			
			dao.inscribirAlumnoEnCurso(curso2.getId(), alumno2.getId());
			dao.inscribirAlumnoEnCurso(curso2.getId(), alumno3.getId());
							
			dao.inscribirAlumnoEnCurso(curso3.getId(), alumno2.getId());
			

		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
