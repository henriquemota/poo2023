package br.estacio.cadastros;

public class PessoaJuridica extends Pessoa {
	
	public PessoaJuridica(String nome, String CNPJ) {
		super.nome = nome;
		this.CNPJ = CNPJ;
	}
	
	protected String CNPJ;
	
	public void setCPF(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	
	public String getCNPJ() {
		return this.CNPJ;
	}
	
	public String toString() {
		return super.toString() + "; CNPJ: " + this.CNPJ;
	}
	
	public boolean equals(Object o) {
		return ((PessoaJuridica)o).CNPJ.equals(this.CNPJ);
	}

}
