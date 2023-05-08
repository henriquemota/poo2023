package br.estacio.classebce.bondary;

public class FormDisciplina extends FormCrud {
	
	private static String[] components = {"id", "nome", "codigo"};
	
	public FormDisciplina() {
		super("Cadastro de disciplinas", components);
	}

}
