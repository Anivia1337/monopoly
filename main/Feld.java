package main;

public abstract class Feld {
	private int position;

	Feld(int position) {
		this.position = position;
	}
	
	public int getPosition() {
		return position;
	}
	
	// abstrakte Methoden für ArrayList
	public abstract int getPreis();
	public abstract int getEtrag();
	public abstract String getBesitzer();
}
