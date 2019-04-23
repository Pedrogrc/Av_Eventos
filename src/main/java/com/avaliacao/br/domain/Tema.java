package com.avaliacao.br.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String corDaToalha;

	@ElementCollection
	@CollectionTable(name = "ITENS")
	private Set<String> itens = new HashSet<>();

	@OneToOne(mappedBy = "tema")
	private Evento evento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCorDaToalha() {
		return corDaToalha;
	}

	public void setCorDaToalha(String corDaToalha) {
		this.corDaToalha = corDaToalha;
	}

	public Set<String> getItens() {
		return itens;
	}

	public void setItens(Set<String> itens) {
		this.itens = itens;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Tema(Integer id, String nome, String corDaToalha, Set<String> itens, Evento evento) {
		super();
		this.id = id;
		this.nome = nome;
		this.corDaToalha = corDaToalha;
		this.itens = itens;
		this.evento = evento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tema other = (Tema) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Tema() {

	}

}
