package br.org.catolicasc.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Candidato {

	private int id;
	private String nome;
	private CandidatoEscolaridadeEnum escolaridade;
	private int idade;
	private float pretencaoSalarial;
	private CandidatoStatusEnum status;
	private String autoAvaliacao;
	
	@XmlElementWrapper(name = "historicos")
	@XmlElement(name = "historico")
	private List<CandidatoHistorico> historico;

	public Candidato() {
		super();
	}

	public Candidato(int id, String nome,
			CandidatoEscolaridadeEnum escolaridade, int idade,
			float pretencaoSalarial, CandidatoStatusEnum status,
			String autoAvaliacao, List<CandidatoHistorico> historico) {
		super();
		this.id = id;
		this.nome = nome;
		this.escolaridade = escolaridade;
		this.idade = idade;
		this.pretencaoSalarial = pretencaoSalarial;
		this.status = status;
		this.autoAvaliacao = autoAvaliacao;
		this.historico = historico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CandidatoEscolaridadeEnum getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(CandidatoEscolaridadeEnum escolaridade) {
		this.escolaridade = escolaridade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPretencaoSalarial() {
		return pretencaoSalarial;
	}

	public void setPretencaoSalarial(float pretencaoSalarial) {
		this.pretencaoSalarial = pretencaoSalarial;
	}

	public CandidatoStatusEnum getStatus() {
		return status;
	}

	public void setStatus(CandidatoStatusEnum status) {
		this.status = status;
	}

	public String getAutoAvaliacao() {
		return autoAvaliacao;
	}

	public void setAutoAvaliacao(String autoAvaliacao) {
		this.autoAvaliacao = autoAvaliacao;
	}

	public List<CandidatoHistorico> getHistorico() {
		return historico;
	}

	public void setHistorico(List<CandidatoHistorico> historico) {
		this.historico = historico;
	}

}
