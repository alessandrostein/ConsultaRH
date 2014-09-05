package br.org.catolicasc.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "escolaridade")
public enum CandidatoEscolaridadeEnum {

	@XmlEnumValue("ensinoFundamental")
	ENSINO_FUNDAMENTAL,

	@XmlEnumValue("ensinoMedio")
	ENSINO_MEDIO,

	@XmlEnumValue("ensinoGraduacao")
	ENSINO_GRADUACAO;
}
