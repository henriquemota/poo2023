package br.estacio;

import br.estacio.polimorfismo.*;
import br.estacio.exercicio2.*;

public class Principal {

	public static void main(String[] args) {
		
		Automovel a1 = new Automovel("PNQ0123", "Gol", Automovel.GASOLINA, (short)2012);
		AutomovelLuxo a2 = new AutomovelLuxo("PNQ0124", "Audi", Automovel.ALCOOL, (short)2018, true, true, true);
		AutomovelLuxo a3 = new AutomovelLuxo("PNQ0125", "Hillux", Automovel.DIESEL, (short)2017, true, true, false);
		AutomovelLuxo a4 = new AutomovelLuxo("PNQ0126", "Mercedes", Automovel.GASOLINA, (short)2017, false, false, false);
		
		System.out.println(a1.getCusto());
		System.out.println(a2.getCusto());
		System.out.println(a3.getCusto());
		System.out.println(a4.getCusto());
		
		/*
		Funcionario f = new Funcionario();
		f.setSalario(1000);
		System.out.println(f.getBonificacao());
		
		Gerente g = new Gerente();
		g.setSalario(1500);
		System.out.println(g.getBonificacao());
		
		Funcionario f1 = g;
		System.out.println(f1.getBonificacao());
	
		
		Bonificacao b = new Bonificacao();
		b.registra(f);
		b.registra(g);
		b.registra(f1);
		
		System.out.println(b.getTotalDeBonificacoes());
		*/	
				
	}

}
