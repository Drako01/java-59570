package com.coderhouse.dtos;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "Modelo de Inscripción de Alumnos DTO")
public class InscripcionDTO {
	@Schema(description = "Alumno ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	private Long alumnoId;
	@Schema(description = "Curso ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	private List<Long> cursoIds;
}
