package br.estacio.classebce.bondary;

import java.awt.*;

import javax.swing.*;

public abstract class FormCrud extends FormBase {
	
	public FormCrud(String nome, String[] components) {
		super(nome);
		
		JLabel label;
		JTextField text;
		JPanel panel = (JPanel)this.getContentPane();
		panel.setLayout(new GridLayout(components.length + 1, 0));
		JPanel internalPanel;
		
		for (int i = 0; i < components.length; i++) {
			internalPanel = new JPanel(new BorderLayout());
			label = new JLabel();
			label.setText(components[i]);
			text = new JTextField("", 20);
			internalPanel.add(label, BorderLayout.WEST);
			internalPanel.add(text, BorderLayout.EAST);
			panel.add(internalPanel);
		}
		
		internalPanel = new JPanel(new FlowLayout());
		internalPanel.add(new JButton("Confirmar"));
		internalPanel.add(new JButton("Excluir"));
		internalPanel.add(new JButton("Cancelar"));
		panel.add(internalPanel);
		
		this.pack();
	}

}
