package com.avaliacao.br.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaliacao.br.domain.Evento;
import com.avaliacao.br.repositories.EventoRepository;
import com.avaliacao.br.services.exceptions.ObjectNotFoundException;

@Service
public class AvaliacaoService {

	@Autowired
	private EventoRepository eventorepo;

	public List<Evento> listartodos() {
		return eventorepo.findAll();
	}

	public Evento buscarId(Integer id) {
		Optional<Evento> obj = eventorepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Evento não encontrado!"));
	}

	public void delete(Integer id) {
		buscarId(id);
		eventorepo.deleteById(id);

	}

	public void update(Evento obj, Integer id) {

		buscarId(id);
		obj.setId(id);
		eventorepo.save(obj);

	}

	public void insert(Evento obj) {
		obj.setId(null);
		eventorepo.save(obj);
	}

}
