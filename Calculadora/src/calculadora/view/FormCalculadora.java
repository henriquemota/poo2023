package calculadora.view;

import java.awt.*;
import java.util.Iterator;

import javax.swing.*;

public class FormCalculadora extends Base {
	
	public FormCalculadora() {
		super("Calculadora", 800, 600);
		JPanel internal = (JPanel)this.getContentPane();
		internal.setLayout(new BorderLayout());
		
		JPanel resultado = new JPanel(new FlowLayout());
		JTextField txtResultado = new JTextField(20);
		resultado.add(txtResultado);		
		
		JPanel botoes = new JPanel(new GridLayout(0,4));
		String [] values = {"9","8","7", "+","6","5","4", "-","3","2","1","*","0","CE","=", "/"};
		JButton btn;
		for (int i = 0; i < values.length; i++) {
			btn = new JButton(values[i]);
			botoes.add(btn);
		}
		
		internal.add(resultado, BorderLayout.PAGE_START);
		internal.add(botoes, BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
	}

}
