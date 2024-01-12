package main;

public class Spieler {
	int guthaben;
	int position;
	String name;
	
	Spieler(String name) {
		this.guthaben = 6000;
		this.name = name;
		this.position = 0;
	}
	
	public int getGuthaben() {
		return this.guthaben;
	}
	
	public int setGuthaben(int ertrag) {
		this.guthaben += ertrag;
		return this.guthaben;
	}
	
	public int getPosition() {
		return this.position;
	}
	
	public int laufen(int anzahlSchritte) {
		this.position += anzahlSchritte;
		if(this.position > 15) {
			this.position -= 16;
		}
		return anzahlSchritte;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
}