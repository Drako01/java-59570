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

import com.coderhouse.dtos.AsignacionCategoriaDTO;
import com.coderhouse.models.Curso;
import com.coderhouse.services.CursoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/cursos")
@Tag(name = "Gestión de Cursos", description = "Endpoints para gestionar cursos")
public class CursoController {

	@Autowired
	private CursoService cursoService;

	@Operation(summary = "Obtener lista de cursos")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de cursos obtenida correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Curso>> getAllCursos() {
		try {
			List<Curso> cursos = cursoService.getAllCursos();
			return ResponseEntity.ok(cursos);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Mostrar cursos por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Curso encontrado correctamente", content = @Content),
			@ApiResponse(responseCode = "404", description = "Curso no encontrado", content = @Content) })
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Curso> getCursoById(@PathVariable Long id) {
		try {
			Curso curso = cursoService.getCursoById(id);
			return ResponseEntity.ok(curso);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Agregar un nuevo curso")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Curso agregado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Curso> createCurso(@RequestBody Curso curso) {
		try {
			Curso createdCurso = cursoService.createCurso(curso);
			return ResponseEntity.status(HttpStatus.CREATED).body(createdCurso);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Editar un curso segun su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Curso editado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@PutMapping(value = "/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Curso> updateCurso(@PathVariable Long id, @RequestBody Curso cursoDetails) {
		try {
			Curso updatedCurso = cursoService.updateCurso(id, cursoDetails);
			return ResponseEntity.ok(updatedCurso);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Eliminar un curso existente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Curso eliminado correctamente", content = @Content),
			@ApiResponse(responseCode = "404", description = "Curso no encontrado", content = @Content) })
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteCurso(@PathVariable Long id) {
		try {
			cursoService.deleteCurso(id);
			return ResponseEntity.noContent().build();
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Asignación de una Categoría al curso")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Categoría asignada correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@PostMapping(value = "/asignar-categoria", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Curso> asignarCategoriaACurso(@RequestBody AsignacionCategoriaDTO asignacionDTO){
		try {
			
			Curso cursoActualizado = cursoService.asignarCategoriaACurso(
					asignacionDTO.getCursoId(),
					asignacionDTO.getCategoriaId()
					);
			return ResponseEntity.ok(cursoActualizado);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
}
