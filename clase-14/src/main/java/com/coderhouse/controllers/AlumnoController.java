package com.coderhouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.dtos.InscripcionDTO;
import com.coderhouse.models.Alumno;
import com.coderhouse.services.AlumnoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/alumnos")
@Tag(name = "Gestion de Alumnos", description = "Endpoints para Gestionar Alumnos")
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;

	@Operation(summary = "Obtener la Lista de todos los Alumnos")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de alumnos obtenida correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content)
	})
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Alumno>> getAllAlumnos() {
		try {
			List<Alumno> alumnos = alumnoService.getAllAlumnos();
			return ResponseEntity.ok(alumnos);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@Operation(summary = "Obtener alumno por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Alumno encontrado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class)) }),
			@ApiResponse(responseCode = "404", description = "Alumno no encontrado", content = @Content) })
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Alumno> getAlumnoById(@PathVariable long id) {
		try {
			Alumno alumno = alumnoService.findById(id);
			return ResponseEntity.ok(alumno);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Agregar un nuevo alumno")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Alumno agregado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumno) {
		try {
			Alumno createdAlumno = alumnoService.saveAlumno(alumno);
			return ResponseEntity.ok(createdAlumno);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Editar un alumno existente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Alumno editado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class)) }),
			@ApiResponse(responseCode = "404", description = "Alumno no encontrado", content = @Content) })
	@PutMapping(value = "/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Alumno> updateAlumnoById(@PathVariable Long id, @RequestBody Alumno alumnoDetails) {
		try {
			Alumno updatedAlumno = alumnoService.updateAlumno(id, alumnoDetails);
			return ResponseEntity.ok(updatedAlumno);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Eliminar un alumno existente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Alumno eliminado correctamente", content = @Content),
			@ApiResponse(responseCode = "404", description = "Alumno no encontrado", content = @Content) })
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteAlumno(@PathVariable Long id) {
		try {
			alumnoService.deleteAlumno(id);
			return ResponseEntity.noContent().build();
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Inscribir a un alumno en uno o varios Cursos")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Alumno inscripto correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class)) }),
			@ApiResponse(responseCode = "404", description = "Alumno no encontrado", content = @Content) })
	@PostMapping("/inscribir")
	public ResponseEntity<Alumno> inscribirAlumnoACursos(@RequestBody InscripcionDTO inscripcionDTO){
		try {			
			Alumno alumno = alumnoService.inscribirAlumnoACursos(inscripcionDTO);
			return ResponseEntity.ok(alumno); 	
		} catch (IllegalArgumentException e) {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
