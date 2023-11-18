package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.CachorroQuente;
import model.CompraDAO;
import model.TipoEnumBebida;
import model.TipoEnumProteína;
import model.TipoEnumQueijo;

public class RealizarVenda extends JPanel{
	private PainelInferior PainelInferior = new PainelInferior();
	private JPanel textPanel = new JPanel();
	private JButton botãoDeVenda = new JButton();
	private JLabel nomeCliente;
	private JLabel Matrícula;
	private JLabel Queijo;
	private JLabel Proteína;
	private JLabel Adicionais;
	private JLabel Bebida;
	private JLabel vazio;
	private JButton realizarVenda;
	private JTextField nomeClienteCaixa;
	private JTextField matrículaCaixa;
	private JPanel adicionaisCaixa;
	private JCheckBox Maionese;
	private JCheckBox Ketchup;
	private JCheckBox Ovo;
	private JCheckBox batataPalha;
	private String Proteínas[] = { "Alcatra","Frango","Salsicha","Carne" };
	private String Queijos[] = { "Gorgonzola", "Brie", "Camembert", "Coalho" };
	private String Bebidas[] = { "Corote", "Delrio", "Golva", "Guaravita" };
	private JCheckBox[] checkboxesAdicionais = new JCheckBox[4];
	private CachorroQuente cachorroQuente;
	private CompraDAO compraDAO;
	private JComboBox<TipoEnumProteína> opçãoProteína;
	private JComboBox<TipoEnumQueijo> opçãoQueijo;
	private JComboBox<TipoEnumBebida> opçãoBebida;
	
	public RealizarVenda() {
		GridLayout grid = new GridLayout(7,2);
		grid.setVgap(40);
		setLayout(grid);
		Color color = new Color (201,218,248);
		setBackground(color);
		
		cachorroQuente = new CachorroQuente();
		compraDAO= new CompraDAO();
		
		nomeCliente = new JLabel();
		Matrícula = new JLabel();
		Queijo = new JLabel();
		Proteína = new JLabel();
		Adicionais = new JLabel();
		Bebida = new JLabel();
		vazio = new JLabel();
	
		nomeClienteCaixa = new JTextField();
		
		matrículaCaixa = new JTextField();
		opçãoProteína = new JComboBox<>(TipoEnumProteína.values());
		opçãoQueijo = new JComboBox<>(TipoEnumQueijo.values());
		opçãoBebida = new JComboBox<>(TipoEnumBebida.values());
		adicionaisCaixa = new JPanel();
		
		Maionese = new JCheckBox("Maionese");
		Maionese.setFocusable(false);
		Ketchup = new JCheckBox("Ketchup");
		Ketchup.setFocusable(false);
		Ovo = new JCheckBox("Ovo");
		Ovo.setFocusable(false);
		batataPalha = new JCheckBox("Batata Palha");
		batataPalha.setFocusable(false);
		
		checkboxesAdicionais [0] = Maionese;
		checkboxesAdicionais [1] = Ketchup;
		checkboxesAdicionais [2] = Ovo;
		checkboxesAdicionais [3] = batataPalha;
		
		
		adicionaisCaixa.setLayout(new GridLayout(2, 2));
		Maionese.setBackground(color);
		Ketchup.setBackground(color);
		Ovo.setBackground(color);
		batataPalha.setBackground(color);
		adicionaisCaixa.add(Maionese);
		adicionaisCaixa.add(Ketchup);
		adicionaisCaixa.add(Ovo);
		adicionaisCaixa.add(batataPalha);
		
		realizarVenda = new JButton ("Realizar Venda");
		realizarVenda.setFocusable(false);
		realizarVenda.addActionListener(RealizarVenda.this::actionPerformed);
			

		nomeCliente.setFont(new Font("arial", Font.BOLD, 15));
		Matrícula.setFont(new Font("arial", Font.BOLD, 15));
		Queijo.setFont(new Font("arial", Font.BOLD, 15));
		Proteína.setFont(new Font("arial", Font.BOLD, 15));
		Adicionais.setFont(new Font("arial", Font.BOLD, 15));
		Bebida.setFont(new Font("arial", Font.BOLD, 15));
		
		nomeCliente.setText("Nome Cliente:");
		Matrícula.setText("Matrícula:");
		Queijo.setText("Opção de Queijo");
		Proteína.setText("Opção de Proteína");
		Adicionais.setText("Escolha seus Adicionais:");
		Bebida.setText("Bebida:");
		vazio.setText("");
		
		
		add(nomeCliente);
		add(nomeClienteCaixa);
		add(Matrícula);
		add(matrículaCaixa);
		add(Proteína);
		add(opçãoProteína);
		add(Queijo);
		add(opçãoQueijo);
		add(Adicionais);
		add(adicionaisCaixa);
		add(Bebida);
		add(opçãoBebida);
		add(vazio);
		add(realizarVenda);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String nome = nomeClienteCaixa.getText();
		int matricula = Integer.valueOf(matrículaCaixa.getText());
		int proteina = ((TipoEnumProteína) opçãoProteína.getSelectedItem()).getIndex();
		int queijo = ((TipoEnumQueijo) opçãoQueijo.getSelectedItem()).getIndex();
		int bebida = ((TipoEnumBebida) opçãoBebida.getSelectedItem()).getIndex();
		String adicionais = "";
		double valor = cachorroQuente.adicionarPreco(proteina);
		
		for(JCheckBox jCheckBox : checkboxesAdicionais) {
			if(jCheckBox.isSelected()==true) {
				adicionais+=jCheckBox.getText().toString()+";";
			}
		}
		
		int x = compraDAO.inserirDadosNoBanco(nome, matricula, proteina, queijo, adicionais, bebida, valor);
		if(x==1) {
		JOptionPane.showMessageDialog(null, "Compra realizada com sucesso.", "Compra feita!",
				JOptionPane.INFORMATION_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(null, "Compra negada no sistema :(", "Compra negada!!",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
