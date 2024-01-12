package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SpielerPanel extends JPanel implements ActionListener {
	private JTextField namensEingabe = new JTextField("Spieler Namen");	private JButton namenBestaetigen = new JButton("Namen Bestätigen");
	private JLabel name = new JLabel();
	private JLabel guthaben = new JLabel();
	
	SpielerPanel() {
		add(name);
		add(namenBestaetigen);
		add(guthaben);
		name.setVisible(false);
		namenBestaetigen.setVisible(false);
		guthaben.setVisible(false);
		namenBestaetigen.addActionListener(this);
		add(namensEingabe);
		add(namenBestaetigen);
		namensEingabe.setVisible(true);
		namenBestaetigen.setVisible(true);
		setBackground(Color.yellow);
	}
	// Namen setzen Knopf
	public void actionPerformed(ActionEvent e) {
		namensEingabe.setVisible(false);
		namenBestaetigen.setVisible(false);
		name.setVisible(true);
		guthaben.setVisible(true);
		name.setText(namensEingabe.getText());
	}
	
	// Guthaben setzen
	public void setGuthaben(int guthaben) {
		this.guthaben.setText(String.valueOf(guthaben));
	}
}
