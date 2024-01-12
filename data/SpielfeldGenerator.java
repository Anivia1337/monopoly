package data;

import java.util.ArrayList;

import main.Ereignis;
import main.Feld;
import main.Grundstueck;

public class SpielfeldGenerator {
	
	public SpielfeldGenerator() {
	}
	
	public ArrayList<Feld> spielfeldGenerieren() {
		ArrayList<Feld> felder = new ArrayList<Feld>();
		
		// erstellen der Grundstücke und Ereignisfelder mit Preis
		Grundstueck grundstueck = new Grundstueck(1, 1500, 150);
		Ereignis ereignis = new Ereignis(2, 400);
		felder.add(grundstueck);
		felder.add(ereignis);
		Grundstueck grundstueck1 = new Grundstueck(3, 1500, 200);
		Ereignis ereignis1 = new Ereignis(4, -400);
		felder.add(grundstueck1);
		felder.add(ereignis1);
		Grundstueck grundstueck2 = new Grundstueck(5, 1750, 250);
		Ereignis ereignis2 = new Ereignis(6, -250);
		felder.add(grundstueck2);
		felder.add(ereignis2);
		Grundstueck grundstueck3 = new Grundstueck(7, 1800, 250);
		Ereignis ereignis3 = new Ereignis(8, -100);
		felder.add(grundstueck3);
		felder.add(ereignis3);
		Grundstueck grundstueck4 = new Grundstueck(9, 2000, 400);
		Ereignis ereignis4 = new Ereignis(10, 100);
		felder.add(grundstueck4);
		felder.add(ereignis4);
		Grundstueck grundstueck5 = new Grundstueck(11, 2000, 400);
		Ereignis ereignis5 = new Ereignis(12, -150);
		felder.add(grundstueck5);
		felder.add(ereignis5);
		Grundstueck grundstueck6 = new Grundstueck(13, 4000, 1000);
		Ereignis ereignis6 = new Ereignis(14, 100);
		felder.add(grundstueck6);
		felder.add(ereignis6);
		Grundstueck grundstueck7 = new Grundstueck(15, 5000, 1500);
		felder.add(grundstueck7);
		return felder;
	}
}