package com.coderhouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderhouse.models.Categoria;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {}