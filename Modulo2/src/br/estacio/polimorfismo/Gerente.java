package br.estacio.polimorfismo;

public class Gerente extends Funcionario {
	
	public double getBonificacao() {
		return super.salario * 0.15;
	}

}
