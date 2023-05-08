package br.estacio.classebce.bondary;

import javax.swing.*;

public abstract class FormBase extends JFrame {
	
	public FormBase(String title) {
		this.setTitle(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(640, 480);
	}
	
	public FormBase(String title, int width, int height) {
		this.setTitle(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(width, height);
	}

}
