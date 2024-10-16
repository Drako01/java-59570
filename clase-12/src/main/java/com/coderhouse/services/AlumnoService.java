package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.dtos.InscripcionDTO;
import com.coderhouse.models.Alumno;
import com.coderhouse.models.Curso;
import com.coderhouse.repositories.AlumnoRepository;
import com.coderhouse.repositories.CursosRepository;

import jakarta.transaction.Transactional;

@Service
public class AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;

	@Autowired
	private CursosRepository cursoRepository;

	public List<Alumno> getAllAlumnos() {
		return alumnoRepository.findAll();
	}

	public Alumno findById(Long id) {
		return alumnoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Alumno no encontrado"));
	}

	@Transactional
	public Alumno saveAlumno(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	@Transactional
	public Alumno updateAlumno(Long id, Alumno alumnoDetails) {
		Alumno alumno = alumnoRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Alumno no encontrado"));

		alumno.setNombre(alumnoDetails.getNombre());
		alumno.setApellido(alumnoDetails.getApellido());

		if (alumnoDetails.getDni() != 0) {
			alumno.setDni(alumnoDetails.getDni());
		}

		if (alumnoDetails.getLegajo() != null && !alumnoDetails.getLegajo().isEmpty()) {
			alumno.setLegajo(alumnoDetails.getLegajo());
		}

		return alumnoRepository.save(alumno);
	}

	public void deleteAlumno(Long id) {
		if (!alumnoRepository.existsById(id)) {
			throw new IllegalArgumentException("Alumno no encontrado");
		}
		alumnoRepository.deleteById(id);

	}

	@Transactional
	public Alumno inscribirAlumnoACursos(InscripcionDTO inscripcionDTO) {
		Alumno alumno = alumnoRepository.findById(inscripcionDTO.getAlumnoId())
				.orElseThrow(() -> new IllegalArgumentException("Alumno no encontrado"));
		for (Long cursoId : inscripcionDTO.getCursoIds()) {
			Curso curso = cursoRepository.findById(cursoId)
					.orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));
			alumno.getCursos().add(curso);
			curso.getAlumnos().add(alumno);
			cursoRepository.save(curso);
		}
		
		return alumnoRepository.save(alumno);
		
	}
}
