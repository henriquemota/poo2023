package database.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Aluno {
	
	private String nome, matricula;
	
	public String getNome() {
		return this.nome;
	} 
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Aluno() {}
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public void salvar() throws Exception {
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
        	throw ex;
        }
	}
	
	public static ArrayList<Aluno> listar() throws Exception {
		try {
			ArrayList<Aluno> alunos = new ArrayList<Aluno>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            String strcon = "jdbc:mysql://localhost/estacio?user=root&password=";
            Connection cx = DriverManager.getConnection(strcon);
            Statement st = cx.createStatement();
			ResultSet rs = st.executeQuery("select * from alunos");
			 while(rs.next()) {
				 alunos.add(new Aluno(rs.getString("nome"), rs.getString("matricula")));
			 }
			return alunos;			
		} catch (Exception e) {
			throw e;
		}
	}
	
}
