package main;

import java.util.ArrayList;

public class Spielfeld {
	ArrayList<Feld> felder;
	
	Spielfeld(ArrayList<Feld> felder) {
		this.felder = felder;
	}
	
	public Feld getFeld(int position) {
		for (Feld feld : felder) {
			if (feld.getPosition() == position) {
				return feld;
			}
		}
		return null;
	}
}