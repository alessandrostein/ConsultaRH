package br.org.catolicasc.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.org.catolicasc.dao.CandidatoDAO;
import br.org.catolicasc.model.Candidato;

@WebService
public class CandidatosService {

	@WebResult(name = "clientes")
	public List<Candidato> listarCandidatos() {
		CandidatoDAO candidatoDAO = new CandidatoDAO();
		return candidatoDAO.obterCandidatos();
	}

	private CandidatoDAO obterDAO() {
		return new CandidatoDAO();
	}

	public void incluirCandidato(
			@WebParam(name = "candidato") Candidato candidato) {
		obterDAO().adicionarCandidato(candidato);
	}

	// DTO
}
