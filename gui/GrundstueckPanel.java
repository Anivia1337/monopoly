package gui;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GrundstueckPanel extends JPanel{
	JLabel label = new JLabel("Grundstück");
	JLabel trennlinie = new JLabel("-----------------------------------");
	JLabel preis = new JLabel();
	JLabel besitzer = new JLabel("Besitzer: ");
	
	GrundstueckPanel() {
		add(label);
		add(trennlinie);
		add(this.preis);
		add(besitzer);
		setBackground(Color.gray);
	}
	// Preis setzen
	public void setPreis(int preis) {
		this.preis.setText("Kaufpreis: " + String.valueOf(preis));
	}
	// Besitzer setzen
	public void setBesitzer(String besitzer) {
		this.besitzer.setText("Besitzer: " + besitzer);
	}
}
