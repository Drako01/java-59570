package com.coderhouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderhouse.models.Curso;

public interface CursosRepository  extends JpaRepository<Curso, Long> {}