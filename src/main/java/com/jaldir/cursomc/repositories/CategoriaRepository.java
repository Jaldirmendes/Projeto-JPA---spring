package com.jaldir.cursomc.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaldir.cursomc.domain.Categoria;


@Repository
public interface  CategoriaRepository extends JpaRepository<Categoria, Integer> {


	List<Categoria> findByNome(String nome);

}
