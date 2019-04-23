package com.avaliacao.br.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date data;
	private String enderecoFesta;
	private String horarioInicio;
	private String horarioFinal;
	private Double valorTotal;
	private Double desconto;

	@OneToOne
	@JoinColumn(name = "id_tema")
	private Tema tema;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Clientes cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getEnderecoFesta() {
		return enderecoFesta;
	}

	public void setEnderecoFesta(String enderecoFesta) {
		this.enderecoFesta = enderecoFesta;
	}

	public String getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public String getHorarioFinal() {
		return horarioFinal;
	}

	public void setHorarioFinal(String horarioFinal) {
		this.horarioFinal = horarioFinal;
	}

	public Double getvalorTotal() {
		return valorTotal;
	}

	public void setvalorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
	public Double getDesconto() {
		return desconto;
	}

	public Evento(Integer id, Date data, String enderecoFesta, String horarioInicio, String horarioFinal,
			Double valorTotal, Tema tema, Clientes cliente) {
		super();
		this.id = id;
		this.data = data;
		this.enderecoFesta = enderecoFesta;
		this.horarioInicio = horarioInicio;
		this.horarioFinal = horarioFinal;
		this.valorTotal = valorTotal;
		this.tema = tema;
		this.cliente = cliente;
	}

	public Evento() {
		super();
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
		Evento other = (Evento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

}
