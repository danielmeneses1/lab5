package model;

public enum TipoEnumQueijo {

	GORGONZOLA("Gorgonzola"),
	MUSSARELA("Mussarela"),
	CHEDDAR("Cheddar"),
	COALHO("Coalho");
	
	final String name;
	final int index;
	
	TipoEnumQueijo(String name){
		this.name=name;
		this.index=this.ordinal()+1;
	}

	public int getIndex() {
		return index;
	}
	
}
