package br.estacio.classebce.entity;

public class Turma extends EntityBase {

	protected String codigo;
	protected OfertaDisciplina[] ofertaDisciplina;
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}	
	public String getCodigo() {
		return this.codigo;	
	}
	public OfertaDisciplina[] getOfertaDisciplina() {
		return this.ofertaDisciplina;
	}
}
