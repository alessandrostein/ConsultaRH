package br.org.catolicasc.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "cursoStatus")
public enum CursoStatusEnum {

	@XmlEnumValue("concluido")
	CONCLUIDO,

	@XmlEnumValue("cursando")
	CURSANDO,

	@XmlEnumValue("desistiu")
	DESISTIU;

}
