package br.senai.sp.cfp138.restaguide.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Restaurante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Column(columnDefinition = "TEXT")
	private String descricao;
	private String cep;
	private String endereco;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String complemento;
	@Column(columnDefinition = "TEXT")
	private String fotos;
	@ManyToOne
	private TipoRestaurante tipo;
	private boolean espacoInfantil;
	private boolean estacionamento;
	private boolean driveThru;
	private boolean manobrista;
	private boolean delivery;
	private String atracoes;
	private String formasPagamento;
	private String site;
	private String telefone;
	private String redesSociais;
	
	//método que transforma a string em vetor
	public String[] verFotos() {
		return this.fotos.split(";");
	}
}
