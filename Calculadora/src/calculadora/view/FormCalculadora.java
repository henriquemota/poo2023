package calculadora.view;

import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;
import javax.swing.*;

public class FormCalculadora extends Base implements ActionListener {
	
	float mem = 0;
	String operador = "";
	JTextField txtResultado;
	
	public FormCalculadora() {
		super("Calculadora", 800, 600);
		JPanel internal = (JPanel)this.getContentPane();
		internal.setLayout(new BorderLayout());
		
		JPanel resultado = new JPanel(new FlowLayout());
		txtResultado = new JTextField(20);
		resultado.add(txtResultado);		
		
		JPanel botoes = new JPanel(new GridLayout(0,4));
		String [] values = {"9","8","7", "+","6","5","4", "-","3","2","1","*","0","CE","=", "/"};
		JButton btn;
		for (int i = 0; i < values.length; i++) {
			btn = new JButton(values[i]);
			btn.addActionListener(this);
			botoes.add(btn);
		}
		
		internal.add(resultado, BorderLayout.PAGE_START);
		internal.add(botoes, BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton)e.getSource();
		String value = btn.getText();
		switch (value) {
			case "CE":
				txtResultado.setText("");
				operador = "";
				mem = 0;
				break;
			case "=":
				if (operador == "+") 
					txtResultado.setText( Float.toString(mem + Float.parseFloat(txtResultado.getText()))  );
				else if (operador == "-") 
					txtResultado.setText( Float.toString(mem - Float.parseFloat(txtResultado.getText()))  );
				else if (operador == "*") 
					txtResultado.setText( Float.toString(mem * Float.parseFloat(txtResultado.getText()))  );
				else if (operador == "/") 
					txtResultado.setText( Float.toString(mem / Float.parseFloat(txtResultado.getText()))  );
				mem = 0;
				operador = "";
				break;
			case "+":
			case "-":
			case "*":
			case "/":
				mem = Float.parseFloat(txtResultado.getText());
				operador = value;
				txtResultado.setText("");
				break;
			default:
				txtResultado.setText(txtResultado.getText() + value);
				break;
		}
	}
}
