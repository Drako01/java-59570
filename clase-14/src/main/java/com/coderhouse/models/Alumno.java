package com.coderhouse.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Schema(description = "Modelo de Alumno")
@Entity
@Table(name = "Alumnos")
public class Alumno {
	@Schema(description = "ID del Alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AutoIncremental
	private Long id;
	@Schema(description = "Nombre del Alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "Alejandro")
	private String nombre;
	@Schema(description = "Apellido del Alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "Di Stefano")
	private String apellido;
	@Schema(description = "DNI del Alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "22333666")
	@Column(unique = true, nullable = false)
	private int dni;
	@Schema(description = "Legajo del Alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "L22333666")
	@Column(unique = true, nullable = false)
	private String legajo;

	@Schema(description = "Lista de Cursos en los que se Anotó el Alumno")
	@ManyToMany(mappedBy = "alumnos", fetch = FetchType.EAGER)
	private List<Curso> cursos = new ArrayList<>();
	@Schema(description = "Fecha de Alta del Alumno", example = "2024/11/12")
	private LocalDateTime createdAt = LocalDateTime.now();
}