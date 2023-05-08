package br.estacio.classebce.bondary;

public class FormProfessor extends FormCrud {

	private static String[] components = {"id", "nome", "matricula"};
	
	public FormProfessor() {
		super("Cadastro de professores", components);
	}

}
