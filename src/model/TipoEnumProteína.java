package model;

public enum TipoEnumProteína {

	ALCATRA("Alcatra"),
	FRANGO("Frango"),
	SALSICHA("Salsicha"),
	CARNE("Carne");
	
	final String name;
	final int index;
	
	TipoEnumProteína(String name){
		this.name=name;
		this.index=this.ordinal()+1;
	}

	public int getIndex() {
		return index;
	}
}
	

