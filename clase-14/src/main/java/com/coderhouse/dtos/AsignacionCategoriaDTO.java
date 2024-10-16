package com.coderhouse.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "Modelo de Asignacion de Categorias DTO")
public class AsignacionCategoriaDTO {
	
	@Schema(description = "Categoria ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	private Long categoriaId;
	@Schema(description = "Curso ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	private Long cursoId;
	
}
