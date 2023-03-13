package aluno;

public class Aluno {
	
	public Aluno() {}
	public Aluno(String nome) {
		this.nome = nome;
	}
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	private String nome;
	private int idade;
	
	public void setNome(String n) {
		nome = n;
	}
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int i) {
		idade = i;
	}
	public int getIdade() {
		return idade;
	}

}
