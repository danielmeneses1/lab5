package model;

public enum TipoEnumBebida {

	SUCO("SUCO"),
	DELRIO("Delrio"),
	GOLVA("Golva"),
	GUARAVITA("Guaravita");
	
	final String name;
	final int index;
	
	TipoEnumBebida(String name){
		this.name=name;
		this.index=this.ordinal()+1;
	}

	public int getIndex() {
		return index;
	}
	
}
	