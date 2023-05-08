package br.estacio.classebce.bondary;

public class FormAluno extends FormCrud {
	
	private static String[] components = {"id", "nome", "matricula"};
	
	public FormAluno() {
		super("Cadastro de alunos", components);
	}

}
