package control;

import java.util.ArrayList;

public class CachorroQuente {

	protected double valor;
	protected String proteína;
	protected String queijo;
	protected String bebida;
	protected ArrayList<String> adicionais=new ArrayList<String>();
	
	public double getValor() {
		return valor;
	}

	public void setPreco(double valor) {
		this.valor = valor;
	}

	public String getProteína() {
		return proteína;
	}

	public void setProteína(String proteína) {
		this.proteína = proteína;
	}

	public String getQueijo() {
		return queijo;
	}

	public void setQueijo(String queijo) {
		this.queijo = queijo;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public ArrayList<String> getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(ArrayList<String> adicionais) {
		this.adicionais = adicionais;
	}

	public double adicionarPreco(int proteina) {
		if(proteina==1) {
			this.valor=2;
		}
		if(proteina==2) {
			this.valor=3;
		}
		if(proteina==3) {
			this.valor=2.5;
		}
		if(proteina==4) {
			this.valor=3.5;
		}
		return this.valor;
	}
	
}
