package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MostrarVendas extends JPanel{
	
	public MostrarVendas() {
		JLabel texto = new JLabel();
		texto.setText("Colocar aqui as tabelas com os dados das vendas");
		texto.setFont(new Font("arial", Font.BOLD,20));
		this.setBackground(new Color(201,218,248));
		add(texto);
	}
	
}
