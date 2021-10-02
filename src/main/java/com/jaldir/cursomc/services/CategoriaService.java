package com.jaldir.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaldir.cursomc.domain.Categoria;
import com.jaldir.cursomc.repositories.CategoriaRepository;
import com.jaldir.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = Optional.empty();
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " +
		Categoria.class.getName()));
		}

	public CategoriaRepository getRepo() {
		return repo;
	}

	public void setRepo(CategoriaRepository repo) {
		this.repo = repo;
	}
	
}
