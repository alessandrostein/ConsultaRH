package br.org.catolicasc.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "cursoTipo")
public enum CursoTipoEnum {

	@XmlEnumValue("profissionalizante")
	PROFISSIONALIZANTE,

	@XmlEnumValue("tecnico")
	TECNICO,

	@XmlEnumValue("superior")
	SUPERIOR,

	@XmlEnumValue("posGraduacao")
	POSGRADUACAO,

	@XmlEnumValue("idioma")
	IDIOMA;

}
