import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Database {

	public static void main(String[] args) {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String strcon = "jdbc:mysql://localhost/estacio?user=root&password=";
            Connection cx = DriverManager.getConnection(strcon);
            Statement st = cx.createStatement();
            st.executeUpdate("INSERT INTO usuarios (nome) VALUES ('henrique')");
    		st.close();
            cx.close(); 
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso.");
        } catch (Exception ex) {
        	
        	System.out.println("SQLException: " + ex.getMessage());
        }		

	}

}
