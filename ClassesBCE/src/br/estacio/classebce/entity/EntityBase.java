package br.estacio.classebce.entity;

public abstract class EntityBase {
	
	protected int ID;
	protected String nome;
	
	public void setID(int id) {
		this.ID = id;
	}
	public int getID() {
		return this.ID;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getNome() {
		return this.nome;	
	}

}
