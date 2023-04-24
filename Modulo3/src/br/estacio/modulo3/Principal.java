package br.estacio.modulo3;

public class Principal {

	public static void main(String[] args) {
		TVLCDConcreta tv1 = new TVLCDConcreta();
		TVPlasma tv2 = new TVPlasma();
		
		tv1.ligar();
		tv1.ligarTimer();
		tv1.desligar();
		
		tv2.ligar();
		tv2.ligarTimer();
		tv2.desligar();

	}

}
