package calculadora.view;

import javax.swing.*;

public abstract class Base extends JFrame {
	
	public Base(String title, int width, int height) {
		this.setTitle(title);
		this.setSize(width, height);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

}
