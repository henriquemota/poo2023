package br.estacio;

import br.estacio.cadastros.*;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Henrique Mota");
		System.out.print(p.toString());
		
		System.out.println("\n____________________\n");
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("João da Silva");
		pf.setCPF("1234567");
		System.out.print(pf.toString());
		
		System.out.println("\n____________________\n");
		
		PessoaJuridica pj = new PessoaJuridica("Estaio", "1277765533");
		System.out.print(pj.toString());
		
		System.out.println("\n____________________\n");
		
		PessoaJuridica pj1 = new PessoaJuridica("Estacio", "3377765533");
		System.out.print(pj1.toString());

		System.out.println("\n____________________\n");
		
		PessoaJuridica pj2 = new PessoaJuridica("Estacio", "3377765533");
		System.out.print(pj2.toString());
		
		System.out.println("\n____________________\n");

		PessoaJuridica pj3 = pj2;
		System.out.print(pj3.toString());

		
	}

}
