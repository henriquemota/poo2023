package exericio5;

public class Teste {

	public static void main(String[] args) {
		
		/*
		AssistenteAdministrativo obj1 = new AssistenteAdministrativo();
		Tecnico obj2 = new Tecnico();
		
		obj1.setMatricula(123);
		obj1.setNome("Joao");
		
		obj2.setMatricula(321);
		obj2.setNome("Pedro");
		
		System.out.println("O assistente é " + obj1.toString());
		System.out.println("O técnico é " + obj2.toString());
		*/
		
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		
		System.out.println("cachorro: " + c.latir());
		System.out.println("cachorro: " + c.caminhar());
		
		System.out.println("gato: " + g.miar());
		System.out.println("gato: " + g.caminhar());		
		
	}

}
