package br.org.catolicasc.model;

public class Curso {

	private int id;
	private float cargaHoraria;
	private CursoTipoEnum tipo;
	private int instituicao_id;
	private CursoStatusEnum status;

	public Curso() {
		super();
	}

	public Curso(int id, float cargaHoraria, CursoTipoEnum tipo,
			int instituicao_id, CursoStatusEnum status) {
		super();
		this.id = id;
		this.cargaHoraria = cargaHoraria;
		this.tipo = tipo;
		this.instituicao_id = instituicao_id;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(float cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public CursoTipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(CursoTipoEnum tipo) {
		this.tipo = tipo;
	}

	public int getInstituicao_id() {
		return instituicao_id;
	}

	public void setInstituicao_id(int instituicao_id) {
		this.instituicao_id = instituicao_id;
	}

	public CursoStatusEnum getStatus() {
		return status;
	}

	public void setStatus(CursoStatusEnum status) {
		this.status = status;
	}

}
