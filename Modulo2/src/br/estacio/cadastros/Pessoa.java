package br.estacio.cadastros;

public class Pessoa {
	
	public Pessoa() {}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	protected String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String toString() {
		// return getClass().getName() + "@" + Integer.toHexString(hashCode()) + "\nNome: " + this.nome; 
		return super.toString() + "\nNome: " + this.nome; 
	}
}
