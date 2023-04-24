package br.estacio.modulo3;

public abstract class TVLCD implements TV {
	
	public abstract void ligarTimer();

	@Override
	public void ligar() {
		System.out.println("liguei");
	}
	@Override
	public void desligar() {
		System.out.println("desliguei");
		
	}
	@Override
	public void aumentarVolume(int valor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void diminuirVolume(int valor) {
		// TODO Auto-generated method stub
		
	}
}
