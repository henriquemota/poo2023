package br.estacio.polimorfismo;

public class Funcionario {

	protected double salario;
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario () {
		return this.salario;
	}
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
}
