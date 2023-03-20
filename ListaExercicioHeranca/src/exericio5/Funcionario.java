package exericio5;

public abstract class Funcionario {
	
	protected int matricula;
	protected String nome;
	
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString() {
		return this.nome + " de matícula " + ((Integer)this.matricula).toString();
	}

}
