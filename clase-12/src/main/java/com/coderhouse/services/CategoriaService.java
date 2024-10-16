package com.coderhouse.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Categoria;
import com.coderhouse.repositories.CategoriaRepository;

import jakarta.transaction.Transactional;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}

	public Categoria getCategoriaById(Long id) {
		return categoriaRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Categoria no encontrado"));

	}

	public boolean existsById(Long id) {
        return categoriaRepository.existsById(id);
    }
	
	@Transactional
	public Categoria createCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	@Transactional
	public Categoria updateCategoria(Long id, Categoria categoraDetails) {
		Categoria categoria = categoriaRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Categoria no fue encontrada"));
		categoria.setNombre(categoraDetails.getNombre());
		return categoriaRepository.save(categoria);

	}

	public void deleteById(Long id) {
		categoriaRepository.deleteById(id);
	}

}
