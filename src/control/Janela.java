package control;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.UIManager;

import view.BotõesCabeçalho;
import view.PainelDeInformações;
import view.PainelInferior;
import view.PainelSuperior;

public class Janela extends JFrame implements ActionListener {

	static {
		try {
			String str = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
			UIManager.setLookAndFeel(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	PainelSuperior PainelSuperior = new PainelSuperior();
	private PainelInferior PainelInferior = new PainelInferior();
	PainelDeInformações PainelDeInformações = new PainelDeInformações();

	private BotõesCabeçalho Botão1, Botão2, Botão3, Botão4;

	public Janela() {

		Botão1 = new BotõesCabeçalho("Realizar Venda");
		Botão2 = new BotõesCabeçalho("Listar Vendas");
		Botão3 = new BotõesCabeçalho("Mostrar Relatório");
		Botão4 = new BotõesCabeçalho("Listar Clientes");

		this.setTitle("Barraquinha cachorro quente");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setSize(630, 660);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(185, 203, 235));
		this.add(PainelSuperior);
		this.add(PainelInferior);

		Botão1.addActionListener(this);
		Botão2.addActionListener(this);
		Botão3.addActionListener(this);
		Botão4.addActionListener(this);

		PainelSuperior.add(Botão1);
		PainelSuperior.add(Botão2);
		PainelSuperior.add(Botão3);
		PainelSuperior.add(Botão4);
		PainelInferior.add(PainelDeInformações, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Botão1) {
			PainelDeInformações.RealizarVenda.setVisible(true);
			PainelDeInformações.ListarVendas.setVisible(false);
			PainelDeInformações.MostrarRelatório.setVisible(false);
			PainelDeInformações.ListarClientes.setVisible(false);
		} else if (e.getSource() == Botão2) {
			PainelDeInformações.RealizarVenda.setVisible(false);
			PainelDeInformações.ListarVendas.setVisible(true);
			PainelDeInformações.MostrarRelatório.setVisible(false);
			PainelDeInformações.ListarClientes.setVisible(false);
		} else if (e.getSource() == Botão3) {
			PainelDeInformações.RealizarVenda.setVisible(false);
			PainelDeInformações.ListarVendas.setVisible(false);
			PainelDeInformações.MostrarRelatório.setVisible(true);
			PainelDeInformações.ListarClientes.setVisible(false);
		} else if (e.getSource() == Botão4) {
			PainelDeInformações.RealizarVenda.setVisible(false);
			PainelDeInformações.ListarVendas.setVisible(false);
			PainelDeInformações.MostrarRelatório.setVisible(false);
			PainelDeInformações.ListarClientes.setVisible(true);
		}

	}

}