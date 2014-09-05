package br.org.catolicasc.dao;

import java.util.ArrayList;
import java.util.List;

import br.org.catolicasc.model.Candidato;

public class CandidatoDAO {
	
	static List<Candidato> candidatos = new ArrayList<Candidato>();

	public List<Candidato> obterCandidatos(){
		return candidatos;
	}
	
	public Candidato obterCandidato(int candidato_id){
		Candidato retorno = null;

		for (Candidato candidato : candidatos) {
			if (candidato.getId() == candidato_id) {
				retorno = candidato;
			}
		}

		return retorno;
	}
	
	public void adicionarCandidato(Candidato candidato){
		candidatos.add(candidato);
	}
}
