package com.coderhouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.models.Alumno;
import com.coderhouse.repositories.AlumnoRepository;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

	@Autowired
	private AlumnoRepository alumnoRepository;

	@GetMapping
	public List<Alumno> getAllAlumnos() {
		return alumnoRepository.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Alumno> getAlumnoById(@PathVariable Long id) {
		if (alumnoRepository.existsById(id)) {
			Alumno alumno = alumnoRepository.findById(id).get();
			return ResponseEntity.ok(alumno);
		} else {
			return ResponseEntity.notFound().build();
		}

	}
	
	@PostMapping
	public Alumno createAlumno(@RequestBody Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

}
