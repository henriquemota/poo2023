package aluno;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Aluno aluno1, aluno2;
		aluno1 = new Aluno();
		aluno2 = new Aluno("Joao", 20);
		
		System.out.println("Olá " 
				+ aluno2.getNome() + ", sua idade é " 
				+ aluno2.getIdade());
		
		
		System.out.print("Informe o nome do aluno1 ");
		aluno1.setNome(in.nextLine());

		System.out.print("Informe a idade do aluno1 ");
		aluno1.setIdade(in.nextInt());
		
		System.out.println("Olá " 
				+ aluno1.getNome() + ", sua idade é " 
				+ aluno1.getIdade());
		
		in.close();
	}

}
