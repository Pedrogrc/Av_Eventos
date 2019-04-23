package com.avaliacao.br.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.br.domain.Evento;
import com.avaliacao.br.services.AvaliacaoService;

@RestController
@RequestMapping(value = "/eventos")
public class AvaliacaoResource {

	@Autowired
	private AvaliacaoService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Evento>> listarTodos() {

		List<Evento> lista = service.listartodos();

		return ResponseEntity.ok(lista);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Evento> buscar(@PathVariable Integer id) {

		Evento obj = service.buscarId(id);
		return ResponseEntity.ok(obj);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {

		service.delete(id);
		return ResponseEntity.noContent().build();

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Evento obj, @PathVariable Integer id) {
		service.update(obj, id);
		return ResponseEntity.noContent().build();

	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Evento obj) {
		service.insert(obj);
		return ResponseEntity.noContent().build();

	}

}
