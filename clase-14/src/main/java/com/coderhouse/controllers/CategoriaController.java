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

import com.coderhouse.models.Categoria;
import com.coderhouse.models.Curso;
import com.coderhouse.services.CategoriaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/categorias")
@Tag(name = "Gestión de Categorias", description = "Endpoints para gestionar Categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@Operation(summary = "Obtener lista de Categorias")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de Categorias obtenida correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Categoria>> getAllCategorias() {
		try {
			List<Categoria> categorias = categoriaService.findAll();
			return ResponseEntity.ok(categorias);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Mostrar categoria por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Categoria encontrada correctamente", content = @Content),
			@ApiResponse(responseCode = "404", description = "Categoria no encontrada", content = @Content) })
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Categoria> getCategoriaById(@PathVariable long id) {
		try {
			Categoria categoria = categoriaService.getCategoriaById(id);
			return ResponseEntity.ok(categoria);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Agregar una nueva Categoria")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Categoria agregada correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria) {
		try {
			Categoria createdCategoria = categoriaService.createCategoria(categoria);
			return ResponseEntity.status(HttpStatus.CREATED).body(createdCategoria);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Editar una Categoría segun su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Categoría editada correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Categoria.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@PutMapping(value = "/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Categoria> updateCategoria(@PathVariable Long id, 
			@RequestBody Categoria categoriaDetails) {
		try {
			Categoria updatedCategoria = categoriaService.updateCategoria(id, categoriaDetails);
			return ResponseEntity.ok(updatedCategoria);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@Operation(summary = "Eliminar una Categoría existente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Categoría eliminada correctamente", content = @Content),
			@ApiResponse(responseCode = "404", description = "Categoría no encontrada", content = @Content) })
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteCategoria(@PathVariable Long id) {
		try {
			if (categoriaService.existsById(id)) {
				categoriaService.deleteById(id);
				return ResponseEntity.noContent().build();
			} else {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
