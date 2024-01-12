package main;

public class Grundstueck extends Feld{
	String besitzer;
	int preis;
	int kosten;
	
	public Grundstueck(int position, int preis, int kosten) {
		super(position);
		this.preis = preis;
		this.kosten = kosten;
	}
	
	public void setBesitzer(String besitzer) {
		this.besitzer = besitzer;
	}
	
	public String getBesitzer() {
		return this.besitzer;
	}
	
	public int getPreis() {
		return this.preis;
	}
	
	public int getKosten() {
		return this.kosten;
	}

	@Override
	public int getEtrag() {
		return 0;
	}
}
