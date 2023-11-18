package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MostrarClientes extends JPanel {
	
	public MostrarClientes() {
		JLabel texto = new JLabel();
		texto.setText("Coloque aqui os dados dos clientes");
		texto.setFont(new Font("arial", Font.BOLD,20));
		this.setBackground(new Color(201,218,248));
		add(texto);
	}
	
}