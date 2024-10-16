package com.coderhouse.dtos;

import java.util.List;

public class InscripcionDTO {

	private Long alumnoId;
	private List<Long> cursoIds;

	public Long getAlumnoId() {
		return alumnoId;
	}

	public void setAlumnoId(Long alumnoId) {
		this.alumnoId = alumnoId;
	}

	public List<Long> getCursoIds() {
		return cursoIds;
	}

	public void setCursoIds(List<Long> cursoIds) {
		this.cursoIds = cursoIds;
	}

}
