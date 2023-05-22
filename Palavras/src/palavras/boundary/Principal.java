package palavras.boundary;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Principal extends Base {
	
	private static String palavra = "";
	
	public static String getPalavra() {
		return Principal.palavra;
	}
	public static void setPalavra(String palavra) {
		Principal.palavra = palavra;
	}
	
	public Principal() {
		super("Adivinha palavra");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = (JPanel)this.getContentPane();
		panel.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Informar palavra");
		JButton btn2 = new JButton("Adivinhar");
		
		btn1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String valor = JOptionPane.showInputDialog("Informe a palavra");
				setPalavra(valor);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Descobrir(Principal.palavra);
			}
		});
		
		panel.add(btn1);
		panel.add(btn2);
		
		this.setVisible(true);
	}
	
	
}
