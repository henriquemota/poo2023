package database.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Aluno {
	
	private String nome, matricula;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Aluno() {}
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public void salvar() {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String strcon = "jdbc:mysql://localhost/estacio?user=root&password=";
            Connection cx = DriverManager.getConnection(strcon);
            Statement st = cx.createStatement();
            String sql = "insert into alunos (nome, matricula) values ('" + this.nome + "', '" + this.matricula + "');";
            st.executeUpdate(sql);
    		st.close();
            cx.close(); 
        } catch (Exception ex) {
        	System.out.println("SQLException: " + ex.getMessage());
        }
	}
	
}
