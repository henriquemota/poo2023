package br.estacio.cadastros;

public class PessoaFisica extends Pessoa {
	
	protected String CPF;
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public String getCPF() {
		return this.CPF;
	}
	
	public String toString() {
		return super.toString() + "; CPF: " + this.CPF;
	}

}
