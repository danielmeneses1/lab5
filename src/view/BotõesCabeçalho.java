package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class BotõesCabeçalho extends JButton {

	public BotõesCabeçalho(String string) {
		this.setText(string);
		this.setFont(new Font("arial", Font.BOLD,11));
		this.setPreferredSize(new Dimension(130, 30));
		this.setBackground(new Color(217, 234, 211));
		this.setVisible(true);
		this.setFocusable(false);
	}
}
