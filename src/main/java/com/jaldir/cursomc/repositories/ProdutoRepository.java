package com.jaldir.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaldir.cursomc.domain.Produto;

@Repository
public interface  ProdutoRepository extends JpaRepository<Produto, Integer> {

	
	
}
