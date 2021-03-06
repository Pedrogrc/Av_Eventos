package com.avaliacao.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avaliacao.br.domain.Clientes;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Integer>{

}
