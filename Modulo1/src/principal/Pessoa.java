package principal;

public class Pessoa {
	
	// Attributes
	private String nome = "";
	private Integer idade = 0;
	
	// Constructors
	public Pessoa() {
	}	
	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	// Methods
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return this.idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String toString() {
		return this.nome + ", " + this.idade.toString() + " anos";
	}

}
