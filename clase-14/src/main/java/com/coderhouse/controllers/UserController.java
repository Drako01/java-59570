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

import com.coderhouse.models.User;
import com.coderhouse.services.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/users")
@Tag(name = "Gestion de Users", description = "Endpoints para Gestionar Users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Operation(summary = "Obtener la Lista de todos los Users")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de Users obtenida correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = User.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content)
	})
	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<User>> getAllUsers() {
		try {
			List<User> users = userService.getAllUsers();
			return ResponseEntity.ok(users);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}

	@Operation(summary = "Obtener User por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "User encontrado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = User.class)) }),
			@ApiResponse(responseCode = "404", description = "User no encontrado", content = @Content) })
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<User> getUserById(@PathVariable String id) {
		try {
			User user = userService.getUserById(id);
			return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}

	@Operation(summary = "Agregar un nuevo User")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "User agregado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = User.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@PostMapping(value = "/", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<User> adduser(@RequestBody User user) {
		try {
			User newUser = userService.addUser(user);
			return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}

	@Operation(summary = "Editar un User existente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "User editado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = User.class)) }),
			@ApiResponse(responseCode = "404", description = "User no encontrado", content = @Content) })
	@PutMapping(value = "/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User user) {
		try {
			user.setId(id);
			User updateUser = userService.updateUser(user);
			return ResponseEntity.ok(updateUser);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}

	@Operation(summary = "Eliminar un User existente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "User eliminado correctamente", content = @Content),
			@ApiResponse(responseCode = "404", description = "User no encontrado", content = @Content) })
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable String id) {
		try {
			userService.deleteUser(id);
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}
}