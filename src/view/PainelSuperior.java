package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PainelSuperior extends JPanel{
	
	public PainelSuperior() {
		this.setLayout(new FlowLayout (FlowLayout.CENTER,13,13));
		this.setBackground(Color.red);
		this.setBounds(0,0,630,80);
		this.setBorder(BorderFactory.createEtchedBorder());
		this.setVisible(true);
	}

}
