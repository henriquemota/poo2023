package palavras.boundary;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Descobrir extends Base {
	
	private String palavra = "";
	private JTextField txt;
	private JButton btn;
	private JLabel lbl;
	private JPanel content, panel1, panel2, panel3;

	public Descobrir(String palavra) {
		super("Descobrir");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(400,400);
		this.setVisible(true);
		
		this.palavra = palavra;
		
		this.content = (JPanel)this.getContentPane();
		this.content.setLayout(new BorderLayout());

		// painel 1
		this.panel1 = new JPanel(new FlowLayout());
		char[] arr = new char[palavra.length()];
		for (int i = 0; i < palavra.length(); i++) {
			txt = new JTextField(4);
			this.panel1.add(txt);			
		}
		
		// painel 2
		this.panel2 = new JPanel(new FlowLayout());
		txt = new JTextField(5);
		btn = new JButton("Ok");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Component[] components = panel1.getComponents();
				for (int i = 0; i < palavra.length(); i++) {
					char letra = txt.getText().charAt(0);
					if (palavra.charAt(i) == letra) {
						((JTextField)components[i]).setText(String.valueOf(letra));
						txt.setText("");
					}
				}				
			}
		});
		
		this.panel2.add(txt);
		this.panel2.add(btn);
		
		// painel 3
		this.panel3 = new JPanel(new GridLayout(0,2));
		lbl = new JLabel("Erros: 0");
		this.panel3.add(lbl);
		lbl = new JLabel("Palavras");
		this.panel3.add(lbl);
				
		// inclui os paineis
		this.content.add(this.panel1, BorderLayout.NORTH);
		this.content.add(this.panel2, BorderLayout.CENTER);
		this.content.add(this.panel3, BorderLayout.SOUTH);
	}
	
	private void verificarPalavra(char letra) {
		Component[] components = this.panel1.getComponents();
		for (int i = 0; i < this.palavra.length(); i++) {
			if (this.palavra.charAt(i) == letra) {
				((JTextField)components[i]).setText(String.valueOf(letra));;
			}
		}
	}



	
}
