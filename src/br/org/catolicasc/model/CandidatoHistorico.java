package br.org.catolicasc.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class CandidatoHistorico {

	private int id;
	private int candidato_id;
	private float reumeracao;
	private int cidade_id;
	private int atividade_id;
	
	@XmlJavaTypeAdapter(AdaptadorDate.class)
	private Date dataAdmisao;
	
	@XmlJavaTypeAdapter(AdaptadorDate.class)
	private Date dataDemisao;

	@XmlElementWrapper(name = "cursos")
	@XmlElement(name = "curso")
	private List<Curso> cursos;

	public CandidatoHistorico() {
		super();
	}

	public CandidatoHistorico(int id, int candidato_id, float reumeracao,
			int cidade_id, int atividade_id, Date dataAdmisao,
			Date dataDemisao, List<Curso> cursos) {
		super();
		this.id = id;
		this.candidato_id = candidato_id;
		this.reumeracao = reumeracao;
		this.cidade_id = cidade_id;
		this.atividade_id = atividade_id;
		this.dataAdmisao = dataAdmisao;
		this.dataDemisao = dataDemisao;
		this.cursos = cursos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCandidato_id() {
		return candidato_id;
	}

	public void setCandidato_id(int candidato_id) {
		this.candidato_id = candidato_id;
	}

	public float getReumeracao() {
		return reumeracao;
	}

	public void setReumeracao(float reumeracao) {
		this.reumeracao = reumeracao;
	}

	public int getCidade_id() {
		return cidade_id;
	}

	public void setCidade_id(int cidade_id) {
		this.cidade_id = cidade_id;
	}

	public int getAtividade_id() {
		return atividade_id;
	}

	public void setAtividade_id(int atividade_id) {
		this.atividade_id = atividade_id;
	}

	public Date getDataAdmisao() {
		return dataAdmisao;
	}

	public void setDataAdmisao(Date dataAdmisao) {
		this.dataAdmisao = dataAdmisao;
	}

	public Date getDataDemisao() {
		return dataDemisao;
	}

	public void setDataDemisao(Date dataDemisao) {
		this.dataDemisao = dataDemisao;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

}
