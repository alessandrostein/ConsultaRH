package br.org.catolicasc.model;

public class Instituicao {

	private int id;
	private int cidade_id;

	public Instituicao() {
		super();
	}

	public Instituicao(int id, int cidade_id) {
		super();
		this.id = id;
		this.cidade_id = cidade_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCidade_id() {
		return cidade_id;
	}

	public void setCidade_id(int cidade_id) {
		this.cidade_id = cidade_id;
	}

}
