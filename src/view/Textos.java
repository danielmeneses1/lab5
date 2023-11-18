package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class Textos extends JLabel{
	
	public Textos(String string) {
		Font fonte = new Font("Arial", Font.BOLD, 15);
		this.setText(string);
		this.setPreferredSize(new Dimension(400,60));
		this.setFont(fonte);
		this.setHorizontalTextPosition(JLabel.LEFT);
		this.setVisible(true);
	}
}
