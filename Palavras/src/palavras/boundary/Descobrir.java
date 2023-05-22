package palavras.boundary;

import java.awt.*;
import javax.swing.*;

public class Descobrir extends Base {
	
	JTextField txt;
	JButton btn;
	JLabel lbl;

	public Descobrir(String palavra) {
		super("Descobrir");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(400,400);
		this.setVisible(true);
		
		JPanel content = (JPanel)this.getContentPane();
		content.setLayout(new BorderLayout());

		// painel 1
		JPanel panel1 = new JPanel(new FlowLayout());
		char[] arr = new char[palavra.length()];
		for (int i = 0; i < palavra.length(); i++) {
			txt = new JTextField(2);
			txt.setEnabled(false);
			panel1.add(txt);			
		}
		
		// painel 2
		JPanel panel2 = new JPanel(new FlowLayout());
		txt = new JTextField(5);
		btn = new JButton("Ok");
		panel2.add(txt);
		panel2.add(btn);
		
		// painel 3
		JPanel panel3 = new JPanel(new GridLayout(0,2));
		lbl = new JLabel("Erros: 0");
		panel3.add(lbl);
		lbl = new JLabel("Palavras");
		panel3.add(lbl);
		
		
		// inclui os paineis
		content.add(panel1, BorderLayout.NORTH);
		content.add(panel2, BorderLayout.CENTER);
		content.add(panel3, BorderLayout.SOUTH);

	}
}
