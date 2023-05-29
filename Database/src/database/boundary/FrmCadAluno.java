package database.boundary;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import database.model.Aluno;

public class FrmCadAluno extends InterfaceBase {
	
	public FrmCadAluno() {
		super("Cadastro de alunos");
		
		JTextField txtNome, txtMatricula;
		JButton btnSalvar;
		JPanel panel = (JPanel)this.getContentPane();
		panel.setLayout(new FlowLayout());
		
		txtNome = new JTextField(10);
		txtMatricula = new JTextField(10);
		btnSalvar = new JButton("Salvar");
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Aluno aluno = new Aluno(txtNome.getText(), txtMatricula.getText());
					aluno.salvar();
					JOptionPane.showMessageDialog(null, "Dados gravados com sucesso.");
					txtNome.setText("");
					txtMatricula.setText("");					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Erro ao gravar os dados.");					
				}
				
			}
		});
		
		panel.add(txtNome);
		panel.add(txtMatricula);
		panel.add(btnSalvar);
		
		this.pack();
		this.setVisible(true);
	}

}
