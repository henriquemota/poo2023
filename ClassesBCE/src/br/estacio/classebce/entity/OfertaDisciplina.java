package br.estacio.classebce.entity;

public class OfertaDisciplina extends EntityBase {
	
	protected Professor professor;
	protected Disciplina disciplina;
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Professor getProfessor() {
		return this.professor;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Disciplina getDisciplina() {
		return this.disciplina;
	}

}
