package gui;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class EreignisPanel extends JPanel{
	JLabel label = new JLabel("Ereignis");
	JLabel trennlinie = new JLabel("-----------------------------------");
	JLabel ertrag = new JLabel();
	
	EreignisPanel() {
		add(label);
		add(trennlinie);
		add(this.ertrag);
		setBackground(Color.blue);	
	}
	// ertrag setzen
	public void setErtrag(int ertrag) {
		this.ertrag.setText("Ertrag: " + String.valueOf(ertrag));
	}
}
