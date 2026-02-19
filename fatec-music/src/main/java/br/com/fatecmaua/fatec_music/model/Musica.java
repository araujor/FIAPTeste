package br.com.fatecmaua.fatec_music.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "musica")
public class Musica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "fk_banda")
	private Banda fk_banda;
	private String nome;
	private String genero;
	private LocalDate data_lancamento;
	private Double duracao;
	private boolean internacional;

	public Musica() {

	}

	public Musica(Long id, Banda fk_banda, String nome, String genero, LocalDate data_lancamento, Double duracao,
			boolean internacional) {
		super();
		this.id = id;
		this.fk_banda = fk_banda;
		this.nome = nome;
		this.genero = genero;
		this.data_lancamento = data_lancamento;
		this.duracao = duracao;
		this.internacional = internacional;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Banda getFk_banda() {
		return fk_banda;
	}

	public void setFk_banda(Banda fk_banda) {
		this.fk_banda = fk_banda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getData_lancamento() {
		return data_lancamento;
	}

	public void setData_lancamento(LocalDate data_lancamento) {
		this.data_lancamento = data_lancamento;
	}

	public Double getDuracao() {
		return duracao;
	}

	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}

	public boolean isInternacional() {
		return internacional;
	}

	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}

}
