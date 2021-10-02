package com.jaldir.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaldir.cursomc.domain.Endereco;

@Repository
public interface  EnderecoRepository extends JpaRepository<Endereco, Integer> {

	
	
}
