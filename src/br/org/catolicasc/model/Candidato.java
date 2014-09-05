package br.org.catolicasc.model;

public class Candidato {

	private int id;
	private String nome;
	private CandidatoEscolaridadeEnum escolaridade;
	private int idade;
	private float pretencaoSalarial;
	private CandidatoStatusEnum status;
	private String autoAvaliacao;

	public Candidato() {
		super();
	}

	public Candidato(int id, String nome,
			CandidatoEscolaridadeEnum escolaridade, int idade,
			float pretencaoSalarial, CandidatoStatusEnum status,
			String autoAvaliacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.escolaridade = escolaridade;
		this.idade = idade;
		this.pretencaoSalarial = pretencaoSalarial;
		this.status = status;
		this.autoAvaliacao = autoAvaliacao;
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

}
