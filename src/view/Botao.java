package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton {
	
	public Botao(String texto) {
		Color cor = new Color(182, 217, 196);
		setText(texto);
		setBackground(cor);
		setFocusable(false);
		setFont(new Font("arial", Font.BOLD, 13));
	}
}
