package br.org.catolicasc.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "candidatoStatus")
public enum CandidatoStatusEnum {

	@XmlEnumValue("empregado")
	EMPREGADO,

	@XmlEnumValue("desempregado")
	DESEMPREGADO,

}
