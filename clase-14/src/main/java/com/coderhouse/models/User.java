package com.coderhouse.models;

import io.swagger.v3.oas.annotations.media.Schema;
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
public class User {
	@Schema(description = "ID del User", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	private String id;
	@Schema(description = "Nombre del User", requiredMode = Schema.RequiredMode.REQUIRED, example = "Usuario")
	private String nombre;
	@Schema(description = "Apellido del User", requiredMode = Schema.RequiredMode.REQUIRED, example = "Test API")
	private String apellido;
	@Schema(description = "Email del User", requiredMode = Schema.RequiredMode.REQUIRED, example = "usuario@test.com")
	private String email;
	@Schema(description = "Fecha de Alta del User", requiredMode = Schema.RequiredMode.AUTO)
	private String creado;
	
	
}