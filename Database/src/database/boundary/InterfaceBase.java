package database.boundary;

import javax.swing.*;

public abstract class InterfaceBase extends JFrame {
	
	public InterfaceBase(String title) {
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.setSize(800,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
