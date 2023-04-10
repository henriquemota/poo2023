package br.estacio.exercicio2;

public class Automovel {
	
	public static final byte GASOLINA = 1;
	public static final byte ALCOOL = 2;
	public static final byte DIESEL = 3;
	public static final byte GAS = 4;
	
	protected String placa;
	protected String modelo;
	protected byte combustivel;
	protected String cor;
	protected short ano;
	protected double custo = 0;
	
	public Automovel(String placa, String modelo, byte combustivel, short ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.combustivel = combustivel;
		this.ano = ano;
		this.calcularCusto();
		this.calcularImposto();
	}
	
	public String getCusto() {
		return ((Double)this.custo).toString();
	}
	
	protected void calcularImposto() {
		this.custo += this.custo * 0.30;
	}
	
	protected void calcularCusto() {
		switch (this.combustivel) {
		case Automovel.GASOLINA: 
			this.custo = 12000;
			break;			
		case Automovel.ALCOOL: 
			this.custo = 10500;
			break;			
		case Automovel.DIESEL: 
			this.custo = 11000;
			break;			
		case Automovel.GAS: 
			this.custo = 13000;
			break;			
		default:
			this.custo = 0;
			break;			
		}
	}
	
}
