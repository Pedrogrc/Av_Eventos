package com.avaliacao.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avaliacao.br.domain.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer>{

}
