package main;

import data.SpielfeldGenerator;
import gui.MonopolyGUI;

public class Starter {

	public static void main(String[] args) {
		SpielfeldGenerator spielfeldListe = new SpielfeldGenerator();
		Spielfeld spielfeld = new Spielfeld(spielfeldListe.spielfeldGenerieren());
		MonopolyGUI gui = new MonopolyGUI();
		gui.updateGUI(spielfeld);
		
		//Bastian war hier 2022
	}

}
