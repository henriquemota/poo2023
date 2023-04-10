package br.estacio.exercicio2;

public class AutomovelLuxo extends Automovel {
	
	protected boolean ar;
	protected boolean direcao;
	protected boolean vidro;

	public AutomovelLuxo(String placa, String modelo, byte combustivel, short ano, boolean ar, boolean direcao, boolean vidro) {
		super(placa, modelo, combustivel, ano);
		this.ar = ar;
		this.direcao = direcao;
		this.vidro = vidro;
		this.calcularCusto();
		this.calcularImposto();
	}
	
	protected void calcularCusto() {
		super.calcularCusto();
		if (ar) super.custo += 2000;
		if (direcao) super.custo += 1500;
		if (vidro) super.custo += 800;
	}
}
