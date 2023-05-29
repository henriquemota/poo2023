package database.boundary;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

import database.model.Aluno;

public class FrmListAluno extends InterfaceBase {
	
	public FrmListAluno() {
		super("Listagem de alunos");
		
		try {
			ArrayList<Aluno> alunos = Aluno.listar();
			JPanel panel;
			
			panel = (JPanel)this.getContentPane();
			panel.setLayout(new GridLayout(alunos.size(), alunos.size()));
			
			for (int i = 0; i < alunos.size(); i++) {
				Aluno a  = alunos.get(i);
				panel.add(new JLabel(a.getNome()));
				panel.add(new JTextField(5));
			}
			
			this.setVisible(true);
			this.pack();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erros");
		}
	}

}
