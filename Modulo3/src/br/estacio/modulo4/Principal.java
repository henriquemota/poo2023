package br.estacio.modulo4;

import java.awt.BorderLayout;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {		
		JFrame janela1 = new JanelaBase("Janela 1");
		JFrame janela2 = new JanelaBase("Janela 2");
		JLabel label = new JLabel("Rotulo da janela");
		JButton button = new JButton("Botao da janela");
		
		janela1.getContentPane().add(label, BorderLayout.CENTER);
		janela2.getContentPane().add(button, BorderLayout.CENTER);
		
	
		janela1.setVisible(true);
		janela2.setVisible(true);
	}

}
