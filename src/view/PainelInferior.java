package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PainelInferior extends JPanel{
	
	public PainelInferior() {
		this.setLayout(new BorderLayout());
		this.setBackground(Color.black);
		this.setBounds(0,90,630,530);
		this.setBorder(BorderFactory.createEtchedBorder());
		this.setVisible(true);		
	}
}
