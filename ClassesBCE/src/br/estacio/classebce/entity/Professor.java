package br.estacio.classebce.entity;

public class Professor extends EntityBase {

	protected String matricula;
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return this.matricula;
	}
}
