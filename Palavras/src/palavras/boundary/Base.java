package palavras.boundary;

import javax.swing.*;

public abstract class Base extends JFrame {
	
	public Base(String title) {
		this.setTitle(title);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
	}

}
