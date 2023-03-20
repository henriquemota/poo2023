package exericio5;

public abstract class Animal {
	
	protected int velocidade = 0;

	public String caminhar() {
		this.velocidade = 10;
		return "Estou caminhando";
	}
}
